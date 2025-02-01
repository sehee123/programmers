import java.io.*;
import java.util.*;

public class Main {
    
   public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        List <People> list = new ArrayList<>();

        for(int i = 0; i< n ; i++){
            String [] arr = br.readLine().split(" ");
            People person = new People(i,Integer.parseInt(arr[0]), arr[1]);
            list.add(person);
        }

        list.sort(Comparator.comparingInt((People p ) -> p.age)
                .thenComparingInt(p -> p.join)
        );

        for (People people : list) {
            sb.append(people.age).append(" ").append(people.name).append("\n");
        }
        System.out.println(sb);
    }
    public static class People{
        int join;
        int age;
        String name;

        public People(int join, int age, String name) {
            this.join = join;
            this.age = age;
            this.name = name;
        }


    }
}