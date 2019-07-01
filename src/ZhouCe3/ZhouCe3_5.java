package ZhouCe3;

public class ZhouCe3_5 {
    static int score1 = 86;
    static int score2 = 92;
    public static int sum(int a,int b){
        int c = 0;
        c = a+b;
        return c;
    }
    public static void main(String[] args){
    int allScore =sum(ZhouCe3_5.score1,ZhouCe3_5.score2);
        System.out.println("总分："+allScore);
    }
}
