import java.io.*;
import java.lang.String;
import java.util.*;

import javax.swing.plaf.synth.Region;

import org.json.simple.JSONObject;

public class BFSK {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void Insert() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Warning: *** Don't give spaces in between the values ***\n");
        System.out.println("Enter the Employee_Name: ");
        String Name = in.next();
        System.out.println("Enter the Employee_Salary: ");
        String Salary = in.next();
        System.out.println("Enter the Employee_Location: ");
        String Region = in.next();
        System.out.println("Enter the Employee_Company name : ");
        String Company = in.next();
        System.out.println("Want to delete a key/value ?\n");
        System.out.println("0.Don't remove\n1.Name\n2.Salary\n3.Region\n4.Compnay");
        System.out.println("Enter the record value to delete\n");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        JSONObject obj = new JSONObject();
        obj.put("Employee Name", Name);
        obj.put("Employee_Salary", Salary);
        obj.put("Region", Region);
        obj.put("Company", Company);
        if (input == 1) {
            obj.remove("Employee Name", Name);
            System.out.println("'Employee name' Removed and remaining values not modified\n");
        }
        if (input == 2) {
            obj.remove("Employee_Salary", Salary);
            System.out.println("'Employee Salary' Removed and remaining values not modified\n");
        }
        if (input == 3) {
            obj.remove("Region", Region);
            System.out.println("'Region' Removed and remaining values not modified\n");
        }
        if (input == 4) {
            obj.remove("Company", Company);
            System.out.println("Company name' Removed and remaining values not modified\n");
        }
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Text.txt", true)));
        pw.print(obj);
        System.out.println("Details added successfully. You can open the file 'Text.txt' to read the data added.\n");
        pw.close();

    }

    public static void main(String args[]) throws IOException {
        BFSK in = new BFSK();
        in.Insert();
    }

}