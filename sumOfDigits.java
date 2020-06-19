import java.util.Scanner;
class digits{
    Scanner sc=new Scanner(System.in);
    int sum=0,num,temp;
    public int getNumber()
    {
        System.out.println("Enter the number:");
        num=sc.nextInt();
        temp=num;
        return num;
    }
    public int sum()
    {
      if(num!=0){
          int rem=num%10;
           sum=sum+rem;
           num=num/10;
    return sum();
      } 
      System.out.println("the sum of the number is:"+ sum);
      return 1;
    }
}
    class sumOfDigits
    {
        public static void main(String[] args) {
            digits al=new digits();
            al.getNumber();
            al.sum();
            
        }
    }
