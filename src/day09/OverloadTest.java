package day09;

public class OverloadTest {
    public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOL(int i,int j){
        System.out.println(i*j);
    }
    public void mOL(String i){
        System.out.println(i);
    }
    public int max(int i,int j){
        return (i>j)?i:j;
    }
    public double max(double i,double j){
        return (i>j)?i:j;
    }
    public double max(double i,double j,double x){
        double max=(i>j)?i:j;
        return (max>x)?max:x;
    }

}
