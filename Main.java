import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        * Write a Java program that accept three numbers from the user and print the largest number .
        * */
        System.out.print("please enter the first number : ");
        int x = input.nextInt();

        System.out.print("please enter the second number : ");
        int y = input.nextInt();

        System.out.print("please enter the third number : ");
        int z = input.nextInt();

        largest(x,y,z);

        /*
        * Write a Java program that accept a String and a number from the user,
        * then print the character in the given index .
        * */

//        System.out.print("Please enter string: ");
//        String text = input.nextLine();
//
//        System.out.print("Please enter index of any char: ");
//        int indx = input.nextInt();
//
//        if(indx>=text.length())
//            System.out.println("out of range of follwing string");
//        else
//            System.out.println(text.charAt(indx)+" located at index "+ indx);

        /*
        *
        * Write a program to enter the numbers till the user wants and at the end
        * it should display the sum entered .
         * */

//        int sum = 0 ;
//        while (true){
//            System.out.print("please enter number or -1 if exit: ");
//            int number = input.nextInt();
//            if(number == -1)
//                break;
//            sum+=number;
//        }
//
//        System.out.println("The total of all numbers: " + sum);

        /*
        * Write a Java program to find positive and negative numbers of a given array:
         * */

//        int [] arr = {10, -21 , 30, 31, -25};
//        arr_print(arr);

        /*
        *
        *Write a Java program to find a shortest word of a given array:
         * */

//        String [] arr = {"Tuwaiq", "Bootcamp" ,"Student","JAVA"};
//        print_shortest(arr);






    }


    public static void print_shortest(String [] arr){



        int counter = arr[0].length() ;
        String shortest= arr[0];

        for (String item : arr) {

            if(counter > item.length()) {
                shortest = item;
                counter = item.length();
            }
        }

        System.out.println(shortest+" is the shortest word");

    }

    public static void arr_print(int [] arr){



        for (int item : arr) {
            if(item>0)
                System.out.println(item+" is positive");
            else if (item<0)
                System.out.println(item+" is negative");
            else
                System.out.println(item+" is zero");

        }

    }


    public static void largest(int x, int y, int z){

        if(x>y && x>z)
            System.out.println(x+" is the largest number");
        else if (y>x && y>z)
            System.out.println(y+" is the largest number");
        else
            System.out.println(z+" is the largest number");



    }
}