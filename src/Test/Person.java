package Test;

public class Person {
    String name;
    int age;
    /**
     * sex=1为男性
     * sex=0为女性
     */
    int sex;
    public void study(){
        System.out.println("Study");
    }
    public void showAge(){
        System.out.println("Age:"+age);
    }
    public int addAge(int i){
        age+=i;
        return  age;
    }


}
