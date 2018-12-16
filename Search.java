import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String csvFile = "/home/abrar/eclipse-workspace/Search/src/NCHS_-_Leading_Causes_of_Death__United_States.csv";
        String line = "";
        String cvsSplitBy = ",";
        String search = "";
        System.out.println("Enter your search here");
        search = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                if (search.equals(data[0]))
                System.out.println("Year [Year= " + data[0] + " , 113 Cause Name=" + data[1] + " , Cause Name=" + data[2] + " , State=" + data[3] + " , Deaths=" + data[4] + " , Age-Adjusted Death Rate=" + data[5] + "]");
                
                else if (search.equals(data[1])) {
                        System.out.println("Year [Year= " + data[0] + " , 113 Cause Name=" + data[1] + " , Cause Name=" + data[2] + " , State=" + data[3] + ", Deaths=" + data[4] + " ,  Age-Adjusted Death Rate=" + data[5] + "]");
                        }
                else if (search.equals(data[2])) {
                    System.out.println("Year [Year= " + data[0] + " , 113 Cause Name=" + data[1] + " , Cause Name=" + data[2] + " , State=" + data[3] +", State=" + data[4] + " , Age-Adjusted Death Rate=" + data[5] + "]");
                    }
                else if (search.equals(data[3])) {
                    System.out.println("Year [Year= " + data[0] + " , 113 Cause Name=" + data[1] + " , Cause Name=" + data[2] + " , State=" + data[3] +", State=" + data[4] + " , Age-Adjusted Death Rate=" + data[5] + "]");
                    }
                else if (search.equals(data[4])) {
                    System.out.println("Year [Year= " + data[0] + " , 113 Cause Name=" + data[1] + " , Cause Name=" + data[2] + " , State=" + data[3] +", State=" + data[4] + " , Age-Adjusted Death Rate=" + data[5] + "]");
                    }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}