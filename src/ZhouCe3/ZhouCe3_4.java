package ZhouCe3;

public class ZhouCe3_4 {
    public static void main(String[] args){
        ZhouCe3_4 hello = new ZhouCe3_4();
        hello.print("这是个方法");
        hello.print(123456);
        hello.print();
    }
    public void print(){
        System.out.println("无参的print方法");
    }
    public void print(String name){
        System.out.println("带有一个字符串参数的print方法，参数值是"+name);

    }
    public void print(int age){
        System.out.println("带有一个整数的print方法，参数值为"+age);
    }
}
