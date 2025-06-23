import java.util.Scanner;

public class Calculator {
int n1,n2,sum,sub,mul,div;
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
            
            System.out.println("::Enter Your Choice::");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplicaton");
            System.out.println("4.Divison");
            System.out.println("5.Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sum = n1+n2;
                    System.out.println("Sum of this Numbers is "+sum);
                    break;

                case 2:
                    sub = n1-n2;
                    System.out.println("Substraction of this Numbers is "+sub);
                    break;

                case 3:
                    mul = n1*n2;
                    System.out.println("Multiplication of this Numbers is "+mul);
                    break;

                case 4:
                    if (n2 == 0) {
                        System.out.print("Can Not Divide by ZERO!");
                    }
                    else{
                    div = n1/n2;
                    System.out.println("Sum of this Numbers is "+div);
                    }
                    break;
                case 5:
                    System.out.println("Exiting..");
                    System.exit(0);
            
                
            }
         }while(true);
    }
}

