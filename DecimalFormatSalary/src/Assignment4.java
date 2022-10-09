import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int hours;
        double rate;
        System.out.println("How many hours worked");
        hours=keyboard.nextInt();
        System.out.println();
        System.out.println("How much was the rate");
        rate=keyboard.nextDouble();
        double salary= hours*rate;
        System.out.println();

        DecimalFormat df=new DecimalFormat("$#,##00.00");
        System.out.println("Hours "+hours+"		Rate "+rate+"	salary "+df.format(salary));


    }
}

