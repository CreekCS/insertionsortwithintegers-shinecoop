import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class InsSortInt {
    public static void main(String args[]) throws FileNotFoundException{
        
        File file = new File("./randInts.txt");
        Scanner s = new Scanner(file);

        ArrayList<Integer> in = new ArrayList<>();

        while(s.hasNextInt()){
        
            in.add(s.nextInt());

        }
        


        Integer[] arr = new Integer[in.size()];
        in.toArray(arr);
//insertion sort
        for(int i=1; i<arr.length; i++){
            int count = i-1;
            int key=arr[i];

            while(count>=0 && arr[count]>=key){

                arr[count+1] = arr[count];
                count--;

            }

            arr[count+1]=key;        


        }

        System.out.println("Smallest Value: "+ arr[0]+" and Largest Value: "+arr[arr.length-1]);
    }



}
