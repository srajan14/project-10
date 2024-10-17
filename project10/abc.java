import java.util.Scanner;
class abc{
    public static void main(String[] args) {
        Scanner sc=new scanner(System.in);
        try{
            System.out.println("enter two numbers");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
            System.out.println("x divided by y equals to"+z);
        }
        catch(ArithmeticException ex ){
            System.out.println("catch block");
        }
        finally{
            System.out.println("finally block");
            System.out.println("i will execute every time");
        }
    }
}