import java.util.*;

public class PrimitiveArrays {


    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args)
    {
        exercise_demo();   //Uncomment the line with the method you want to run.
        //exercise_1();
        //exercise_2();
        //exercise_3();
        //exercise_4();
        //exercise_5();
        //exercise_6();
    }

    public static void exercise_demo()
    {
        int numbers[] = new int[6];

        for (int i = 0; i < numbers.length ; i++)
        {
            System.out.print("Enter value : ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length ; i++)
        {
            System.out.println("value " + (i+1)  + " is: " + numbers[i]);
        }
    }


    public static void exercise_1()
    {
        int a[] = new int[6];

        for (int i = 0; i<6 ; i++)
        {
            System.out.print("Enter value :");
            a[i] = input.nextInt();
        }

        for (int i = 5; i>=0 ; i--)
        {
            System.out.println("value " + i  + " is:" + a[i]);
        }
    }

    public static void exercise_2()
    {
        int a[] = new int[6];

        for (int i = 0; i<6 ; i++)
        {
            System.out.print("Enter value :");
            a[i] = input.nextInt();
        }

        for (int i = 0; i<6 ; i++)
        {
            a[i]++ ;
        }
        for (int i = 0; i<6 ; i++)
        {
            System.out.println("value " + i  + " is:" + a[i]);
        }
    }

    public static void exercise_3()
    {
        double a[] = new double[10];

        for (int i = 0; i<10 ; i++)
        {
            System.out.print("Enter wage :");
            a[i] = input.nextDouble() ;
        }

        for (int i = 0; i<10 ; i++)
        {
            System.out.println("Wage " + i  + " is:" + a[i]);
        }
    }

    public static void exercise_4()
    {
        double a[] = new double[10];

        for (int i = 0; i<10 ; i++)
        {
            System.out.print("Enter wage (" + (i+1) + ") :");
            a[i] = input.nextDouble() ;
        }

        for (int i = 0; i<10 ; i++)
        {
            if (a[i] > 100 ) {
                System.out.println("Wage " + (i+1)  + " is:" + a[i]);
            }
        }
    }

    public static void exercise_5()
    {
        double a[] = new double[10];
        double limit = 1000.0 ;
        double reduction = 0.1 ;

        for (int i = 0; i<10 ; i++)
        {
            System.out.print("Enter wage (" + (i+1) + ") :");
            a[i] = input.nextDouble() ;
        }

        for (int i = 0; i<10 ; i++)
        {
            if (a[i] > limit ) {
                a[i] = a[i] - (a[i] * reduction ) ;
            }
        }

        for (int i = 0; i<10 ; i++)
        {
            System.out.println("Wage " + (i+1)  + " is:" + a[i]);
        }
    }

    public static void exercise_6()
    {
        int size = 10 ;
        double a[] = new double[size];
        double total = 0.0 ;

        for (int i = 0; i<size ; i++)
        {
            System.out.print("Enter wage (" + (i+1) + ") :");
            a[i] = input.nextDouble() ;
        }

        for (int i = 0; i<size ; i++)
        {
            total += a[i]  ;
        }
        System.out.println("Average Wage = " + (total / a.length) );
    }

}

