package com.lhzh.study.otherstream;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author 卢宏政
 * @date 2021/12/11 14:47
 */
public class OtherStreamStudy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        printWriter();
//        Split();
//        SequenceStreamDemo_1();
//        SequenceStreamDemo_2();
//        Piped();
//        writeobj();
        readobj();
    }

    public static void readobj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/data/obj.object"));
        Studen s=(Studen) ois.readObject();
        System.out.println(s);
        ois.close();
    }
    public static void writeobj() throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:/data/obj.object"));
        Studen s1=new Studen("zhangsan",20,"kr");
        oos.writeObject(s1);
        oos.close();
    }

    public static void Piped() throws IOException {
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        in.connect(out);
        Write w=new Write(out);
        Read r=new Read(in);
        Thread t1=new Thread(w);
        t1.start();
        Thread t2=new Thread(r);
        t2.start();
    }
    /*
     * 实现将一个mp4文件切割成4份；
     * 实现将四分碎片合并成一个mp4文件
     * 1使用Vector
     * 2使用ArrayList
     */
        public static void SequenceStreamDemo_2() throws IOException {
            FileInputStream fis1=new FileInputStream("D:/data/Split/1.part");
            FileInputStream fis2=new FileInputStream("D:/data/Split/2.part");
            FileInputStream fis3=new FileInputStream("D:/data/Split/3.part");
            FileInputStream fis4=new FileInputStream("D:/data/Split/4.part");
            ArrayList<FileInputStream> v=new ArrayList<FileInputStream>();
            v.add(fis1);
            v.add(fis2);
            v.add(fis3);
            v.add(fis4);
            final Iterator<FileInputStream> it=v.iterator();
            Enumeration<FileInputStream> en=new Enumeration<FileInputStream>() {

                @Override
                public boolean hasMoreElements() {
                    // TODO Auto-generated method stub
                    return it.hasNext();
                }

                @Override
                public FileInputStream nextElement() {
                    // TODO Auto-generated method stub
                    return it.next();
                }

            };
            SequenceInputStream se=new SequenceInputStream(en);
            FileOutputStream fos=new FileOutputStream("D:/data/Split/ss.mp4");
            int len;
            byte[]b=new byte[1024];
            while((len=se.read(b))!=-1) {
                fos.write(b,0,len);
                fos.flush();
            }
            se.close();
            fos.close();
        }
        public static void SequenceStreamDemo_1() throws IOException {
            FileInputStream fis1=new FileInputStream("D:/data/Split/1.part");
            FileInputStream fis2=new FileInputStream("D:/data/Split/2.part");
            FileInputStream fis3=new FileInputStream("D:/data/Split/3.part");
            FileInputStream fis4=new FileInputStream("D:/data/Split/4.part");
            Vector<FileInputStream> v=new Vector<FileInputStream>();
            v.add(fis1);
            v.add(fis2);
            v.add(fis3);
            v.add(fis4);
            Enumeration<FileInputStream>en=v.elements();
            SequenceInputStream se=new SequenceInputStream(en);
            FileOutputStream fos=new FileOutputStream("D:/data/Split/ss.mp4");
            int len;
            byte[]b=new byte[1024];
            while((len=se.read(b))!=-1) {
                fos.write(b,0,len);
                fos.flush();
            }
            se.close();
            fos.close();
        }

        public static void Split() throws IOException {
            FileInputStream fis = new FileInputStream("D:/data/ss.mp4");
            int count = 1;
            FileOutputStream fos = null;
            byte[] b = new byte[1024 * 1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos = new FileOutputStream("D:/data/Split/" +count+++ ".part");
                fos.write(b, 0, len);
                fos.close();
            }
        }

    public static void printWriter() throws IOException {
        BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(new FileWriter("D:/data/1.txt"),true);
        String line;
        while(true) {
            line=bufr.readLine();
            if(line.equals("over"))
                break;
            out.println(line.toUpperCase());
//			out.flush();
        }
        bufr.close();
        out.close();
    }
}
/*
 * �ܵ�����ʾ
 */
class Write implements Runnable {
    PipedOutputStream out;

    Write(PipedOutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            out.write("nihao,luzhongzheng".getBytes());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Read implements Runnable {
    PipedInputStream in;

    Read(PipedInputStream in) {
        this.in = in;
    }
    public void run() {
        try {
            byte[] b = new byte[1024];
            System.out.println("zuse");
            int len = in.read(b);
            System.out.println("duquwanbi");
            String s=new String(b,0,len);
            System.out.println(s);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Studen implements Serializable{//���л��ӿڣ���ǽӿڣ�
    public static final long serialVersionUID = 42L;//����ʹ������кŹ̶�����ʹ�����޸�Ҳ�ܶ�ȡ�ɵĶ���
    private String name;
    transient int age;//transient������ʹ�����䲻�ܱ����л�
    static String country="cn";//��̬���ݲ��ܱ����л�
    Studen(String name,int age,String country){
        this.name=name;
        this.age=age;
        this.country=country;
    }
    String getName(){
        return name;
    }
    int getAge() {
        return age;
    }
    public String toString() {
        return name+"::::"+age+"::::"+country;

    }
}
