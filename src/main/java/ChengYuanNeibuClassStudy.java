import java.util.ArrayList;
import java.util.List;

public class ChengYuanNeibuClassStudy {
    private String name = "外部名字";
    private static String hair = "外部静态头发";
    private static String foot = "外部静态脚";
    private void hello(){
        System.out.println("外部sayHello");
    }
    private void onlyWaiBuHello(){
        System.out.println("只有外部sayHello");
    }
    private class ChengYuanNeiBuClass{
        private String name = "内部名字";
        private int age = 20;
        private String hair = "内部头发";
        private void hello(){
            System.out.println("内部sayHello");
        }
        private void shuchu(){
            hello();
            onlyWaiBuHello();
            System.out.println(name);
            System.out.println(hair);
            System.out.println(foot);
            System.out.println(ChengYuanNeibuClassStudy.this.name);
            ChengYuanNeibuClassStudy.this.hello();
            System.out.println(age);
        }
    }
    public static void main(String[]args){
        new ChengYuanNeibuClassStudy().new ChengYuanNeiBuClass().shuchu();
        ChengYuanNeibuClassStudy chengYuanNeibuClassStudy = new ChengYuanNeibuClassStudy();
        ChengYuanNeibuClassStudy.ChengYuanNeiBuClass chengYuanNeiBuClass =chengYuanNeibuClassStudy.new ChengYuanNeiBuClass();
        List<String> list =  new ArrayList<String>();
        list.contains("");
        list.isEmpty();

    }
}
