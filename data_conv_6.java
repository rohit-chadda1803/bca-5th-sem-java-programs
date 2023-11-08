import java.util.Scanner;
//this is a java code that converts the float value to a string value.

class data_conv_6{
    public static void main(String[]args){

        // taking float 
        System.out.println("taking float input from the user");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter no. -");
        float a = sc.nextFloat();

    //    System.out.println("the entered float value is - "+a);





    //    float floatValue = 3.14f;
        String stringValue = String.valueOf(a); //This method takes a float value as input and returns a string representation of that value.
        System.out.println("Float value: " + a);
        System.out.println("String value: " + stringValue);

        
        sc.close();

    }
}