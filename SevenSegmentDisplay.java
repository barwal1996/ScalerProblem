import java.util.*;
public class SevenSegmentDisplay {
    public static void main(String args[] ){

        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        
        for (int i = 0; i < t; i++) {
        
        String num = s.next();
        
        int matches = findNumberOfMatches(num); //to find the number of matches in the number
        
        System.out.println(findMaxNumber(matches)); //to find the max number that can be generated using the matches
        
        //System.out.println(matches);
        s.close();
        
        }
        
        }
        
        static int findNumberOfMatches(String num)
        
        {
        
        int sum=0;
        
        int a[] = {6,2,5,5,4,5,6,3,7,6};//array containing the number of matches for each digit.
        
        for (int i =0; i<num.length(); i++){
        
        sum = sum + a[num.charAt(i)-'0'];
        
        }
        
        return sum;
        
        }
        
        static String findMaxNumber(int matches){
        
        String sum="";
        
        if(matches%2==0){
        
        while(matches>0){
        
        sum = sum + "1";
        
        matches = matches-2;
        
        //System.out.println(sum);
        
        }
        
        }
        
        else{
        
        sum="7";
        
        while(matches>3){
        
        sum = sum + "1";
        
        matches = matches-2;
        
        }
        
        }
        
        return sum;
        
        }
        
    }
    

