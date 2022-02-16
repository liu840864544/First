import java.util.Scanner;

public class First {
    public static void main(String[] args) {
/*   123123123
        label: for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }
*/
/*一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。
编程 找出1000以内的所有完数。（因子：除去这个数本身的其它约数）*/
/*
for(int i=1;i<=1000;i++)
{
    int sum=0;
    for(int j=1;j<i;j++) //改良j<=i\2
    {
        if(i%j==0) {
            sum += j;
        }
    }
    if(sum==i)
    {
        System.out.println(i);
        break;
    }
}
*/
//外层循环控制行数，内层循环控制列数
        /*
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <=7-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */
/*
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明 + 初始化

        int[] ids;//声明
        //1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001,1002,1003,1004};
        //1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];
        names[0]="大王";
        names[1]="大";
        names[2]="小";
        names[3]="大小王";
        names[4]="王";
        System.out.println(names.length);//5
        System.out.println(ids.length);//5
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);

        }
*/
//使用Scanner读取学生个数
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("输入学生的个数：");
        //创建数组存储学生成绩动态初始化
        int number=scan.nextInt();
        int[] scores=new int[number];
        //给当前数组赋值
        System.out.println("请输入"+number+"个成绩：");
        int maxScore=0;
        for(int i=0;i<scores.length;i++)
        {
            scores[i]=scan.nextInt();
            //获取数组中的元素最高分
            if(maxScore<scores[i])
            {
                maxScore=scores[i];
            }
        }
//根据每个学生成绩与最高分的差值划分等级
        char level;
        for(int i=0;i<scores.length;i++)
        {
            if(maxScore-scores[i]<=10)
            {
                level='A';
            }
            else if(maxScore-scores[i]<=20)
            {
                level='B';
            }
            else if(maxScore-scores[i]<=30)
            {
                level='C';
            }
            else
            {
                level='D';
            }
            System.out.println("Student"+i+"score is"+scores[i]+",grade is"+level);

        }

         */
        //遍历二维数组
        /*
        int[] arr4[] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
        for(int i = 0;i < arr4.length;i++){

            for(int j = 0;j < arr4[i].length;j++){
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }
         */
        /*
        int[][] arry = new int[4][3];
        System.out.println(arry[1]);//外层元素的初始化值为：地址值
        System.out.println(arry[1][1]);//内层元素的初始化值为：与一维数组初始化情况相同
         */
        /*
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*(99-10+1)+10);
        }
        //求数组元素的最大值
        int maxValue=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (maxValue < arr[i])
            {
                maxValue=arr[i];
            }
        }
        System.out.println("该数组的最大元素值为："+maxValue);
        //求最小值
        int minValue=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (minValue >arr[i])
            {
                minValue=arr[i];
            }
        }
        System.out.println("该数组的最小元素值为："+minValue);
        //求数组总和
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
          sum+=arr[i];
        }
        System.out.println("该数组的总和为："+sum);
        //求数组的平均值
        int avgValue=sum/arr.length;
        System.out.println("该数组元素的平均值为"+avgValue);
         */
//数组的复制  反转
        String[] arr=new String[]{"JJ","DD","BB","EE","GG","AA"};
        //数组的复制
        String[] arr1=new String[arr.length];
        for(int i=0;i<arr.length;i++) {
            arr1[i]=arr[i];
            System.out.println(arr1[i]);
        }
//数组的反转
        for(int i=0;i<arr.length/2;i++)
        {
           String temp= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
//数组查找
        //线性查找
        String dest="BB";
        boolean isFlag=true;
        for(int i=0;i<arr.length;i++)
        {
            if(dest.equals(arr[i])){
                System.out.println("找到了指定的元素位置为："+i);
                isFlag=false;
                break;
            }
        }
        if(isFlag){
            System.out.println("很遗憾，没有找到！");
        }
//二分法查找
        //前提：所要查找的数组必须有序
        int[] arr2=new int[]{-54,-33,-4,0,5,28,29,40};
        int dest1=33;
        int head=0;//初始的首索引
        int end=arr2.length-1;//初始的末索引
        boolean isFlag1=true;
        while(head<=end)
        {
            int middle=(head+end)/2;
            if(dest1==arr2[middle]){
                System.out.println("找到了指定的元素，位置为："+middle);
                isFlag1=false;
                break;
            }else if (arr2[middle]>dest1){
                end=middle-1;
            }else {
                head=middle+1;
            }
        }
        if(isFlag1){
            System.out.println("很遗憾，没有找到");
        }


        //冒泡排序
        int[] arry1=new int[]{4,3,7,16,38,-5,18};
        for(int i=0;i<arry1.length;i++){
            for(int j=0;j<arry1.length-1-i;j++)
            if(arry1[j]>arry1[j+1]){
                int temp=arry1[j];
                arry1[j]=arry1[j+1];
                arry1[j+1]=temp;
            }
        }
        for(int i=0;i<arry1.length;i++)
        {
            System.out.println(arry1[i]);
        }

    }
}

