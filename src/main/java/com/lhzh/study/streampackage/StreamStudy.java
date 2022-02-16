package com.lhzh.study.streampackage;

import org.apache.commons.io.FileUtils;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.net.URL;
import java.util.UUID;

/**
 * @author 卢宏政
 * @date 2021/12/5 12:45
 */
public class StreamStudy {
    public static void tempFile() throws IOException {
        File tmp = File.createTempFile("tmp", ".txt");
        tmp.deleteOnExit();
    }
    public static void getPath() throws IOException {
        File file = new File("E:\\myProjects\\myStudy\\study\\a.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.lastModified());
        System.out.println(file.length());
    }
    public static void getList() throws IOException {
        File file = new File("E:\\myProjects\\myStudy\\study");
//        String[] list = file.list();
//        for (String string : list) {
//            System.out.println(string);
//        }
        String[] list2 = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".xml");
            }
        });
        for (String string : list2) {
            System.out.println(string);
        }
    }
    public static void main(String[] args) throws Exception {
//        InToOut();
////        InToFile2();
//        File file = new File("https://obs-touguan.obs.cn-north-1.myhwclouds.com:443/touguan%2F8252e9782a844e11af8ea384ee5dc1b1.mp4");
//        System.out.println(file.getName());
//        System.out.println(file.length());
//        FileInputStream fileInputStream = new FileInputStream(file);
//        System.out.println(fileInputStream.available());

        String url ="https://obs-touguan.obs.cn-north-1.myhwclouds.com:443/touguan%2F8252e9782a844e11af8ea384ee5dc1b1.mp4";
        File f = null;
        String suffix = url.substring(url.lastIndexOf("."));
        URL httpurl = new URL(url);
        f = new File("touguantemp" , UUID.randomUUID().toString()+suffix);
        FileUtils.copyURLToFile(httpurl, f);

    }

    public static void inputStreamRead() throws IOException {
        File file = new File("E:\\myProjects\\myStudy\\study\\a.txt");
        FileReader fr = new FileReader(file);
        char[]b=new char[1];
        fr.read(b);
        System.out.println(b);
//        while (fr.read()!=-1){
//            System
//        }
    }

    private static void InToOut() throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        PrintStream ps=System.out;
        String line=null;
        while((line=br.readLine())!=null){
            if("over".equals(line))
                break;
            ps.println(line);
        }

    }

    /*
     * 按照指定编码表将录入数据保存到文件中
     *
     */
    private static void InToFile2() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\myProjects\\myStudy\\study\\a.txt"),"GBK"));
        String line=null;
        while((line=br.readLine())!=null){
            if("over".equals(line))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();

    }

}
