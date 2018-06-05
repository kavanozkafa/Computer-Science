import java.util.Scanner;

public class Stars {
    public static void main(String [] args){


        /*
         We want this

         *
         * *
         * * *
         * * * *

         */
        System.out.println("how many row do you want ?");
        System.out.println("----------------------------------");

        Scanner row=new Scanner(System.in);//user input
        int rowNumber=row.nextInt();//input to variable assignment


        //printing row
        for (int i=1;i<=rowNumber;i++){

            //printing stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            //println()=print("\n")
        }

        System.out.println("----------------------------------");


        /*
        We want this
        *****
        ****
        ***
        **
        *

        */

        //printing row
        for (int i=rowNumber;i>=1;i--){

            //printing stars
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\n");
            //println()=print("\n")
        }

        System.out.println("----------------------------------");


        /*
        We want this
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5

        so put i(for loop variable) in the print method instead  of *.
        for reverse ; make the i and j decreasing.
        */
        //printing row
        for (int i=1;i<=rowNumber;i++){

            //printing numbers
            for (int j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.print("\n");
            //println()=print("\n")
        }

        System.out.println("----------------------------------");

        /*
        We want this
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        so put j (for loop variable) in the print method instead  of *.
        for reverse ; make the i and j decreasing.
        */

        //printing row
        for (int i=1;i<=rowNumber;i++){

            //printing numbers
            for (int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.print("\n");
            //println()=print("\n")
        }

        System.out.println("----------------------------------");

        /*
        We want this

             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5

        */

        int temp = rowNumber;

        //printing row
        for(int i=1; i<=temp; i++) {

            //printing space
            for(int space=1; space<=rowNumber; space++) {

                System.out.print(" ");
            }
            //printing numbers
            for(int j=1; j<=i; j++) {

                System.out.print(i +" ");
            }
            System.out.println();
            rowNumber --;//decrasing space
        }
        System.out.println("----------------------------------");


        //We want that word or string losing its letters
        Scanner wordInput=new Scanner(System.in);
        String Word=wordInput.nextLine();

        for(int i=Word.length(); i>=0; i--) {

            String str = Word.substring(0, i);//string decreasing
            System.out.println(str);
        }

    }//end of main
}//end of class
