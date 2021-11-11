// You have to find the solution to the Tower of Hanoi problem.
// You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
// In each row, there should be 3 integers (disk, start, end), where:

// disk - number of disk being moved
// start - number of the tower from which the disk is being moved
// stop - number of the tower to which the disk is being moved
// Output:Return a 2D array with dimensions M x 3 as mentioned above in the description.
// [1, 1, 3]
// [2, 1, 2]
// [1, 3, 2]
// [3, 1, 3]
// [1, 2, 1]
// [2, 2, 3]
// [1, 1, 3]
// We can see that this the only unique path with minimal moves to move all disks from the first
// to the third tower.
//The minimum number of moves to solve the problem with A disks is 2^A - 1.

import java.util.*;
public class TowerOfHanoiUsingArrayRecursive {

        public static void main(String[] args) {
            int n =3;
            towerOfHanoi(n);
        }

        private static void moveDisks(int n, int toRod, int fromRod, ArrayList < ArrayList<Integer>> moves) 
        {
            
            if(n==0) return ;
            //    If there is only one disk move that disk
            
    
            //    Value of rem rod can be calculated by simply xoring number of each rod and toRod and fromRod.
            int aux = 1 ^ 2 ^ 3 ^ toRod ^ fromRod;

           //Another approach: int helper= 6-toRod-fromRod;
    
            //    Move the top n-1 to the rem rod.
           moveDisks(n - 1, toRod, aux,moves);
    
    
            //    Move the n'th disk to toRod.
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(n);
            ans.add(toRod);
            ans.add(fromRod);
           // ans.add(moves);
           moves.add(ans);
    
    
            moveDisks(n-1,aux,fromRod,moves);
            // ans.add(toRod);
            // moves.add(ans);
    
            //    Move the n-1 disks from rem rod to toRod.
           // moveDisks(n - 1, toRod, rem, moves);
        }
    
        public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
        {
            //    For storing the moves.
            ArrayList < ArrayList<Integer>> moves = new ArrayList<ArrayList<Integer>>();
    
            //moveDisks(n,2,1,moves);
            moveDisks(n,1,3,moves);
            for(int i=0;i<moves.size();i++){
                System.out.println(moves.get(i));
            }
            //    Return the stored moves.
            return moves;
        
    }
}
