import java.io.*;
import java.util.*;
import java.math.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int num_buildings=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> buildings=new ArrayList<Integer>();
        ArrayList<Integer> candy=new ArrayList<Integer>();
        ArrayList<Integer> travel_time=new ArrayList<Integer>();
        for(int i=0;i<num_buildings;i++){
            int temp=sc.nextInt();
            buildings.add(temp);
        }
        
        for(int j=0;j<num_buildings;j++){
            int c=(Integer)buildings.get(j);
            
            if( c == 1){
                candy.add(j);
            }
            
        }
        
        for(int x=0;x<candy.size();x++){
            
            int a=(Integer)candy.get(x);
            
            int y=x+1;
            
            if(y < candy.size()){
                
                int b=(Integer)candy.get(y);
                int tem=a+(b-a)*k;
                travel_time.add(tem);
                
            }
        }
        
        Collections.sort(travel_time);
        System.out.println(travel_time.get(0));
        
    }
}
