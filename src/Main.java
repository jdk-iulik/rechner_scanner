import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double var1, var2;
        char operator;
        Scanner userInput=new Scanner(System.in);

        System.out.println("First number: ");
        var1=userInput.nextDouble();

        System.out.println("Second number: ");
        var2=userInput.nextDouble();

        System.out.println("Choose the operation: +, - , /, * : ");
        operator=userInput.next().charAt(0);

        if(operator=='+'){
            System.out.println("The sum is:"+ (var1+var2));
        } else if(operator=='-'){
            System.out.println("The result is:"+ (var1-var2));
        }else if(operator=='*') {
            System.out.println("The result ist" + (var1 * var2));
        }else if(operator=='/'){
            if(var2!=0){
                System.out.println("The result is:"+ (var1/var2));
            } else{
                System.out.println("There is no division to 0");
            }
        } else{
            System.out.println("This is a wrong operation.");
        }

    }
}