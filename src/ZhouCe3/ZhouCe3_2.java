package ZhouCe3;

public class ZhouCe3_2 {
    public static void main(String[] args){
       ZhouCe3_2 hello =new ZhouCe3_2();

        double avg =hello.calcAvg();
        System.out.println(avg);
    }
    public  double calcAvg(){
        double java =92.5;
        double php =83.0;
        double avg = (java +php)/2;
        return avg;
    }
}
