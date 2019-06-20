public class das {
    public static void main(String[] args){
        System.out.println("这是啥啊!,这是九九乘法表");
        for (int i=1; i<=9;i++){
            System.out.println();
            for (int t=1 ; t<=i;t++){
                System.out.print(i+"*"+t+"="+(i*t)+" ");
            }
        }
    }

}
