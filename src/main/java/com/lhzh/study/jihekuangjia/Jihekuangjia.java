package com.lhzh.study.jihekuangjia;


import java.util.*;
import org.apache.commons.codec.binary.Base64;

public class Jihekuangjia {
    public static void MyHashSet(){
        HashSet hs = new HashSet();
        hs.add("1");
        hs.add("4");
        hs.add("2");
        hs.add("3");
        System.out.println(hs);
    }
    public static void MyLinkedHashSet(){
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("1");
        lhs.add("4");
        lhs.add("2");
        lhs.add("3");
        System.out.println(lhs);
    }
    public static void MyTreeSet(){
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return Integer.parseInt(o2.toString())-Integer.parseInt(o1.toString());
            }
        });
        ts.add("1");
        ts.add("4");
        ts.add("2");
        ts.add("3");
        System.out.println(ts);

        TreeSet ts2= new TreeSet();
        Comparator comparator = ts2.comparator();
        Comparator comparator1 = ts.comparator();
        System.out.println(11);
    }
    public static void MyRetainAll(){
        ArrayList<String> a=new ArrayList<>();
        ArrayList<String>b=new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        b.add("2");
        b.add("3");
        b.add("4");
        System.out.println(a);
        boolean b1 = a.retainAll(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b1);
    }
    public static void MyAdd(){
        ArrayList a=new ArrayList<>();
        boolean add = a.add("1");
        boolean add2 = a.add(new Object());
        System.out.println(a);
    }

    public static void MyRemove(){
        ArrayList<String>a=new ArrayList<>();
        ArrayList<String>b=new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        b.add("2");
        b.add("3");
        b.add("4");
        boolean b1 = a.removeAll(b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void MyContains(){
        ArrayList<String>a=new ArrayList<>();
        ArrayList<String>b=new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        b.add("2");
        b.add("3");
        b.add("4");
        boolean b1 = a.containsAll(b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void MyToArray(){
        ArrayList<String>a=new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        Object[] objects = a.toArray();
        System.out.println(objects);
        List<Object> b = Arrays.asList(objects);


        List<String> userIdList = new ArrayList<>();
        userIdList.add("1");
        userIdList.add("2");
//        userIdList.add("3");
//        userIdList.add("4");
//        userIdList.add("5");
//        userIdList.add("6");
//        userIdList.add("7");
        int size = userIdList.size();
        for(int i=0;size>i*2;i++) {
            List<String> subList = new ArrayList<>();
            if (size > (i + 1) * 2) {
                subList = userIdList.subList(i * 2, (i + 1) * 2);
            } else {
                subList = userIdList.subList(i * 2, size);
            }
            System.out.println(subList);
            String[] strings = subList.toArray(new String[subList.size()]);
            System.out.println(strings.toString());
            System.out.println();
        }











    }
    public static void main(String[] args) {
//        MyHashSet();
//        MyLinkedHashSet();
//        MyTreeSet();
//        MyRetainAll();

//        MyAdd();
//        MyRemove();
//        MyContains();
//        MyToArray();

//        try{
////            String aa =Base64.encodeBase64String(UUID.randomUUID().toString().replaceAll("-","").getBytes());
////            System.out.println(aa);
////        }catch (Exception w){
////
////        }

        Date no = new Date(1633937371000l);
        Calendar instance = Calendar.getInstance();
        System.out.println(no);
        System.out.println(System.currentTimeMillis());


    }

}
