import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//this is java program to take input from file and display it.

class inp_file {
    public static void main(String[]args){

        // created file using this code.

       //File myFile = new File("input_9_file.txt");

      // try {
            
       //    myFile.createNewFile();
        
      // } catch (Exception e) {
        
      //  System.out.println("unable to greate file");


      // }


    // * to read file -

    File myFile = new File("input_9_file.txt");

    try {
        
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();

    } catch (FileNotFoundException e) {
        // this is handle if any file input problem occurs.
        
        e.printStackTrace();

    }

    }
}
