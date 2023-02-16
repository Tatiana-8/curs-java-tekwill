import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int sum=0;
        int poz=0;
        int neg=0;


        do{ number = sc.nextInt();

            sum=sum+number;
            if (number>0)
            {
                 poz=poz+1;}
            else if(number<0)
                neg=neg+1;

        }
            while (number!=0);


            System.out.println("SUM:"+ sum);

            System.out.println("poz:"+ poz);
            System.out.println("neg:"+ neg);
        }
}