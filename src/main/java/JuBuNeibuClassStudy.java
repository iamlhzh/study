class FuLei{
    public String name = "父类名字";
    public static String hair = "父类静态头发";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getHair() {
        return hair;
    }

    public static void setHair(String hair) {
        FuLei.hair = hair;
    }

    public void hello(){
        System.out.println("父类sayHello");
    }
    public void onlyFuLeiHello(){
        System.out.println("只有父类sayHello");
    }
}


public class JuBuNeibuClassStudy {
    private String name = "外部名字";
    private static String hair = "外部静态头发";
    private static String foot = "外部静态脚";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getHair() {
        return hair;
    }

    public static void setHair(String hair) {
        JuBuNeibuClassStudy.hair = hair;
    }

    public static String getFoot() {
        return foot;
    }

    public static void setFoot(String foot) {
        JuBuNeibuClassStudy.foot = foot;
    }

    public FuLei getJuBuNeiBuClass(){
        class JuBuNeiBuClass extends FuLei{
            private String name = "内部名字";
            private int age = 20;
            private String hair = "内部头发";
            public void hello(){
                System.out.println("内部sayHello");
            }
        }
        return  new JuBuNeiBuClass();
    }
    private void onlyWaiBuHello(){
        System.out.println("只有外部sayHello");
    }

    public static void main(String[]args){
        JuBuNeibuClassStudy juBuNeibuClassStudy = new JuBuNeibuClassStudy();
        FuLei fuLei = juBuNeibuClassStudy.getJuBuNeiBuClass();
        System.out.println(fuLei.name);
        System.out.println(fuLei.hair);
        System.out.println(fuLei.getName());
        fuLei.hello();
        fuLei.onlyFuLeiHello();
    }
}
