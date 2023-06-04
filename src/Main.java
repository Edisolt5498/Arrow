import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner size = new Scanner(System.in);
        //System.out.print("Input a number of lines of arrow: ");
        //int n = size.nextInt();  //the size of arrow just deleted Scanner and now it has just only 12 lines
        int n = 15;


        Scanner InputSpaceKey = new Scanner(System.in);
        Scanner InputSymbolKey = new Scanner(System.in);


        System.out.print("Input a space: ");
        String InputSpace = InputSpaceKey.nextLine();

        System.out.print("Input a symbol: ");
        String InputSymbol = InputSymbolKey.nextLine();


        char symbol = InputSymbol.charAt(0);
        char space = InputSpace.charAt(0);


        //n = 12; //the size of arrow

        int last = n*2-1; // num of symbols at last line
        int scale = n/2; // for correct size for arrow

        /*char symbol = '+';
        char space = ' ';*/


        for (int i = 1; i <= n; i++)  //num of lines
        {

            for (int b = 0; b < n-i; b++)
            {
                System.out.print(space);    //main 'space'
            }
            for (int d = 0; d < i; d++)
            {
                System.out.print(symbol);   //main 'symbol'
            }
            for (int e = 0; e < i-1; e++)
            {
                System.out.print(symbol);   //add 'symbol'
            }
            for (int c = 0; c < n-i; c++)
            {
                System.out.print(space);   //add 'space'
            }

            System.out.println();
        }

        for (int i = 0; i < n-scale; i++)  //line under arrow (num of lines)
        {
            for (int j = 0; j < scale; j++)  //num of space
            {
                System.out.print(space);
            }
            for (int j = 0; j < last-scale*2; j++)  //num of symbols
            {
                System.out.print(symbol);
            }
            for (int j = 0; j < scale; j++)  //num of space
            {
                System.out.print(space);
            }
            System.out.println();
        }

    }
}