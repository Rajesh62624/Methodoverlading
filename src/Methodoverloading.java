public class Methodoverloading {
    static int multiple(int a, int b){
        return a*b;
    }
    static int multiple(int a,int b, int c){
        return a*b*c;
    }
    static double multiple(double a,double b,int c){
        return a+b*c;
    }
    public static void main(String[] args){
        System.out.println(multiple(12,2));
        System.out.println(multiple(12,2,12));
        System.out.println(multiple(12.33,12.77,2));
    }
}
