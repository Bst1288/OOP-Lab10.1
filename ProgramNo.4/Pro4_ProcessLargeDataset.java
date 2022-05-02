import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Pro4_ProcessLargeDataset {
    private final static String ASSOCIATE = "associate";
    private final static String ASSISTANT = "assistant";
    private final static String FULL = "full";

    public static void main(String[] args){
        double totalAssistant = 0; 
        double totalAssociate = 0;
        double totalFull = 0;
        int countAssociate = 0; 
        int countAssistant = 0;
        int countFull = 0;

        File file = new File("D:/file/Salary.txt");
        
        if(!file.exists()){
            System.out.println("Couldn't find Salary.txt");
            System.exit(1);
        }

        try(Scanner in = new Scanner(file)){
            while(in.hasNextLine()){
                String[] employeeRecord = in.nextLine().split("\\s+");
                if(employeeRecord[2].equals(ASSISTANT)){
                    countAssistant++;
                    totalAssistant += Double.parseDouble(employeeRecord[3]);
                }
                else if(employeeRecord[2].equals(ASSOCIATE)){
                    countAssociate++;
                    totalAssociate += Double.parseDouble(employeeRecord[3]);
                }
                else if(employeeRecord[2].equals(FULL)){
                    countFull++;
                    totalFull += Double.parseDouble(employeeRecord[3]);
                }
            }
            double totalAll = totalAssistant + totalAssociate + totalFull;

            //---Total salary---//
            System.out.println("------------------------------------------------------------------------");
            System.out.printf("Total salary for " + ASSISTANT + " professors is %.2f", totalAssistant);
            System.out.printf("\nTotal salary for " + ASSOCIATE + " professors is %.2f", totalAssociate);
            System.out.printf("\nTotal salary for " + FULL + " professors is %.2f", totalFull);
            System.out.printf("\nTotal salary for all professors is %.2f", totalAll);
            System.out.println("");
            
            //---Averages salary---//
            System.out.printf("\nAverage salary for " + ASSISTANT + " professors is %.2f", average(countAssistant, totalAssistant));
            System.out.printf("\nAverage salary for " + ASSOCIATE + " professors is %.2f", average(countAssociate, totalAssociate));
            System.out.printf("\nAverage salary for " + FULL + " professors is %.2f", average(countFull, totalFull));
            System.out.printf("\nAverage for all professors is %.2f\n", average((countAssistant + countAssociate + countFull), totalAll));
            System.out.println("------------------------------------------------------------------------");

        } catch(IOException e){
            e.printStackTrace();
            System.out.println("Scanner couldn't read Salary.txt");
        }
    }

    private static double average(int c, double t){
        return t / c;
    }

}
