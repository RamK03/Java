package BasicProblems;

import java.util.*;

public class SolutionFoStone
{

        public static int lastStoneWeight(int[] stones) {
            int n= stones.length-1;
            int weight=0;
            for(int i=0;i<n;i++)
            {
                Arrays.sort(stones);
                if(n==0)
                {
                    return stones[0];
                }
                else if(stones[n]==stones[n-1])
                {
                    stones[n]=0;
                    stones[n-1]=0;

                }
                else if(stones[n]>stones[n-1])
                {
                    stones[n]-=stones[n-1];
                    weight=stones[n];

                }
            }
            return stones[n];
        }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{1,2,2,34,2,21,4}));
    }

}

