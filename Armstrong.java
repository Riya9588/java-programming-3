import java.util.Scanner;
class Number{
    Scanner sc= new Scanner(System.in);
    int temp,num,sum,rem,number;
    
    public void getNumber()
    {
        System.out.println("Enter the number :");
        temp=sc.nextInt();
        num=temp;
        
    }
    public void checknum()
            
    {while(num!=0){
        rem=num%10;
        sum=sum+ rem*rem*rem;
        num=num/10;
    }  
        
        
        if(temp==sum)
        {
            System.out.println("armstrong number");
            
        }
        else{
            System.out.println("not an armstrong number");
            
        }
        
    }
}
    public class Armstrong{
        public static void main( String[] args)
        {
            Number al=new Number();
            al.getNumber();
            al.checknum();
        }
    }
