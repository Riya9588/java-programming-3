import java.util.Scanner;
class circle{
    Scanner sc=new Scanner(System.in);
    
    private double radius=1.0;
    private String color="red";
    circle(){
        
    }
    circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        System.out.println("Enter the radius of the circle:");
        radius=sc.nextInt();
        return radius;
    }
    public double getArea(){
        double area=3.14*radius*radius;
        System.out.println("the area is:" +area);
        return area;
    }
    public static void main(String[] args)
    {
        
        circle al=new circle();
        al.getRadius();
        al.getArea();
    }
}