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
        insort(arr);
       

        System.out.println("Smallest Value: "+ arr[0]+" and Largest Value: "+arr[arr.length-1]);
    }
    public static void insort(Integer[] a){

        for(int i=0; i<a.length; i++){

            int j = i-1;
            int key = a[i];
            
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;

            }

            a[j+1]= key;


        }


    }


}
