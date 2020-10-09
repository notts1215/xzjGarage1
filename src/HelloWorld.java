import java.util.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the row nums: ");
        int Row = in.nextInt();
        System.out.println("Input the col nums: ");
        int Col = in.nextInt();

        double[][] values = new double[Row][Col];

        for (int i = 0; i<Row; i++){
            for (int j = 0; j<Col; j++){
                values[i][j] = Math.random()*10+5;
            }
        }

        boolean cont = true;

        while (cont){
            System.out.println("Pls input the index u want: ");
            System.out.println("1: The largest num in a row\n"+
                    "2: The ave num in a row\n" +
                    "3: All the largest nums\n" +
                    "4: The largest num in a col\n");

            int oprtId = in.nextInt();
            int year = 0;
            switch (oprtId){
                case 1:
                    System.out.println("Input the row index: ");
                    year = in.nextInt() - 1;
                    if (year < 0 || year > Row){
                        System.out.println("wrong row index");
                        break;
                    }
                    int maxval = 0;
                    for (int i=0;i<values[year].length;i++){
                        if (values[year][i] > values[year][maxval]){
                            maxval = i;
                        }
                    }
                    System.out.println("Row"+(year+1)+"\'s largest num is: "+values[year][maxval]);
                    cont = false;
                    break;
                case 2:
                    System.out.println("Input the row index: ");
                    year = in.nextInt() - 1;
                    if (year < 0 || year > Row){
                        System.out.println("wrong row index");
                        break;
                    }
                    double sums = 0;
                    for (int i=0;i<values[year].length;i++){
                        sums += values[year][i];
                    }
                    System.out.println("The average is: "+sums/values[year].length);
                    cont = false;
                    break;
                case 3:
                    //List<double> largests = new ArrayList<double>();
                    for (int i=0;i<Row;i++){
                        int Maxval = 0;
                        for (int j=0; j<values[i].length;j++){
                            if (values[i][j] > values[i][Maxval]){
                                Maxval = i;
                            }
                        }
                        //largests.add(values[i][Maxval]);
                        System.out.println("The largest num of row"+i+"is: "+values[i][Maxval]);
                    }
                    cont = false;
                    break;
                case 4:
                    System.out.println("Input the Column index: ");
                    year = in.nextInt() - 1;
                    if (year < 0 || year > Col){
                        System.out.println("wrong col index");
                        break;
                    }
                    int maxval2 = 0;
                    for (int i=0;i<Row;i++){
                        if (values[maxval2][year]<values[i][year]){
                            maxval = i;
                        }
                    }
                    System.out.println("The largest num in a col: "+values[maxval2][year]);
                    cont = false;
                    break;
                default:
                    System.out.println("Wrong index!\n"+
                            "Program killed.");
                    cont = false;
                    break;
            }
        }
    }
}
