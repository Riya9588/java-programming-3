import java.util.Scanner;

public class pattern1 {
    boolean temp=true;
    boolean temp1=true;
   public static int tempvalue;
    int printSequence(int num,int key) {
        System.out.println(num);
       if(temp||num!=tempvalue)
       {
           temp=false;
           if(num<=0&&temp1)
           {
               temp1=false;
               return printSequence(num+key, key);
           }
               
           else if(num>0&&temp1)
               return printSequence(num-key, key);
           else
               return printSequence(num+key, key);
               
       }
      return 1 ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number n:");
        int n= sc.nextInt();
        System.out.print("enter a number k:");
        int k= sc.nextInt();
        tempvalue=n;
        
        pattern1 pt=new pattern1();
     if(n>k)
        pt.printSequence(n,k);
     else
            System.out.println("N value should be grater than K");

    }
}