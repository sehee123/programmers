import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args )throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double total = 0.0 ;
        Double sum = 0.0;
        Map<String , Double> gradeMap = new HashMap<>();
        gradeMap.put("A+",4.5);
        gradeMap.put("A0",4.0);
        gradeMap.put("B+",3.5);
        gradeMap.put("B0",3.0);
        gradeMap.put("C+",2.5);
        gradeMap.put("C0",2.0);
        gradeMap.put("D+",1.5);
        gradeMap.put("D0",1.0);
        gradeMap.put("F",0.0);

        for(int i = 0; i< 20; i++){
            String [] infoArr = br.readLine().split(" ");
            String grade = infoArr[2];
            if(!grade.equals("P")){
                double mark = Double.parseDouble(infoArr[1]);
                total +=mark;
                sum += mark* gradeMap.get(grade);
            }
        }
        System.out.println(sum/total);
    }
}
