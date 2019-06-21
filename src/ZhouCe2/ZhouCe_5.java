package ZhouCe2;

public class ZhouCe_5 {
    public static void main(String[] args){
        int sum =0;
        for (int i=0;i<=10;i++){
            sum=sum+i;
            if (sum>20){
                System.out.println("当前累加值为："+sum);
                break;
            }
        }
    }
}
