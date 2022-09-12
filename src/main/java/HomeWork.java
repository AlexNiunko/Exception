import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextInt();
        b= scanner.nextInt();
        try{
            System.out.println(a/b);
        } catch (ArithmeticException arithmeticException){
            System.out.println("Вы пытаетесь разделить на нуль");
        } catch(Exception exception){
            System.out.println("Некорректный ввоод");
        }
        finally{
            System.out.println("1");
        }
    }
}
