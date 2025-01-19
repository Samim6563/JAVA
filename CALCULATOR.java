import java.util.Scanner;
class calculator{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
char op;
double num1,num2,result;
System.out.println("****What you want to perform****\nPress '+' for Addition\nPress'-' for Subtraction\nPress '/' for Division\nPress '*' for Multiplication\nPress 'Q' for quite");
while(true){
    System.out.println("Enter your choice:");
    op=input.next().charAt(0);
    if(op=='+'){
         System.out.println("**Addition mode selected**") ;
         System.out.println("Enter the frist Number:");
         num1=input.nextDouble();
         System.out.println("Enter the second Number:");
         num2=input.nextDouble();
         result=num1+num2;
         System.out.println("The Addition is:"+result);
    }
    else if (op=='-'){
        System.out.println("**Subtrction mode selected**") ;
        System.out.println("Enter the frist Number:");
        num1=input.nextDouble();
        System.out.println("Enter the second Number:");
        num2=input.nextDouble();
        result=num1-num2;
         System.out.println("The Subtraction is:"+result) ;
    }
     else if (op=='*'){
         System.out.println("**Multiplication mode selected**") ;
         System.out.println("Enter the frist Number:");
         num1=input.nextDouble();
         System.out.println("Enter the second Number:");
         num2=input.nextDouble();
         result=num1*num2;
        System.out.println("The Multiplication is:"+result) ;
    }
     else if (op=='/'){
        System.out.println("**Division mode selected**") ;
         System.out.println("Eneter the frist Number:");
        num1=input.nextDouble();
        System.out.println("Enter the second Number:");
        num2=input.nextDouble();
        result=num1/num2;
         System.out.println("The Divisionsion is:"+result) ;
     }
      else if (op=='Q'||op=='q'){
          System.out.println("Goodbye");
          break ;
      }
    else{
        System.out.println("Invalid operrator please enter valid operator\n");
    }
    
}
}
}