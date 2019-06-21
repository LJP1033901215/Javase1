package ZhouCe2;

public class ZhouCe_3 {
    public static void main(String[] args){
        int sum = 0 ;
        int num = 2 ;
        do {
            sum=+sum;
            num = num + 2;
        }while (num>1 && num<50);
        System.out.println("50以内的偶数和为："+sum);
    }
}
