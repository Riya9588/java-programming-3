import java.util.Scanner;
class Training2
{
    Scanner sc=new Scanner(System.in);
    double length;
    double breadth;
    double area;

   public void setDim()
    {
        System.out.println("Enter the length of the rectangle:");
        length=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        breadth=sc.nextInt();
    }

    public double getArea()
    {
        
        area= length * breadth;
        System.out.println("area is:"+area);
        return area;
        
    }
}

 class Training1
    {
    public static void main(String[] args)
    {
        Training2 al= new Training2();
        al.setDim();
       al.getArea();
    }
}