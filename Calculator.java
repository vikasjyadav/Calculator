import java.util.Scanner;

public class Calculator {

int n1,n2,sum,sub,mul;
float div;
Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        Calculator cl = new Calculator();
        cl.getdata();
        cl.choice();
        
    }

    void getdata(){
          
        System.out.print("Enter First Number : ");
        n1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        n2 = sc.nextInt();
    }

    void choice(){
        do{
            int choice;
            
            System.out.println("\nEnter Your Choice:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Divison");
            System.out.println("5.Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sum = n1+n2;
                    System.out.println("Sum of these Numbers is "+sum);
                    break;

                case 2:
                    sub = n1-n2;
                    System.out.println("Substraction of these Numbers is "+sub);
                    break;

                case 3:
                    mul = n1*n2;
                    System.out.println("Multiplication of these Numbers is "+mul);
                    break;

                case 4:
                    if (n2 == 0) {
                        System.out.print("\nCan Not Divide by ZERO!");
                    }
                    else{
                    div = (float)n1/n2;
                    System.out.println("Division of these Numbers is "+div);
                    }
                    break;
                case 5:
                    System.out.println("Exiting..");
                    System.exit(0);
            
                
            }
         }while(true);
    }
}

