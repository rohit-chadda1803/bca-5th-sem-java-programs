import java.util.Scanner;

// created by Rohit Chadda 
// input - output , program-7 ->(Enter the short integer from user using scanner class)
// short  - it takes integer form -32,768 to 32,767


class inp_short_int {
    public static void main(String[] args){

        // write your code
        System.out.println("taking short integer input from the user");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ente any value from -32,768 to 32,767");

        float a = sc.nextShort();

        System.out.println("the entered short integer value is - "+a);


        sc.close();


    }

    



}
