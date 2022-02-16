package Test;

public class StudentTest {
    public static void main(String[] args){
        Student[] stu=new Student[20];
        for(int i=0;i<stu.length;i++){
            //给数组元素赋值
            stu[i]=new Student();
            stu[i].number=(i+1);
            //年级，【1，6】
            stu[i].state=(int)(Math.random()*(6-1+1)+1);
            //成绩，【0，100】
            stu[i].score=(int)(Math.random()*(100-0+1));
        }
        StudentTest stud=new StudentTest();
        stud.print(stu);
        System.out.println("***********");
        stud.Bubble(stu);
        stud.print(stu);
        System.out.println("***********");
        stud.State(stu,3);
        System.out.println("***********");
    }
    /**
     * 遍历所有数组元素
     */
    private void print(Student[] stu) {
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].Print());
        }
    }
    /**
     * 查询年级state的学生信息
     */
    public void State(Student stu[],int state){
        for(int i=0;i<stu.length;i++){
            if(stu[i].state==state){
                System.out.println(stu[i].Print());
            }
        }
    }
    /**
     * 冒泡排序
     */
    public void Bubble(Student[] stu){
        for(int i=0;i<stu.length-1;i++){
            for(int j=0;j<stu.length-i-1;j++){
                if(stu[j].score>stu[j+1].score) {
                    Student temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }

    }
}
class Student{
    int number;
    int state;
    int score;
    public String Print(){
        return "学生的学号为"+number+",年级"+state+",成绩"+score ;
    }
}
