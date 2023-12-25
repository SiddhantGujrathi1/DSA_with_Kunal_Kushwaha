/*
* 1672. Richest Customer Wealth

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.
* Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
* The richest customer is the customer that has the maximum wealth.


Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
E
*
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
* */




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(richCustWealth(accounts));
        
        ArrayList<Integer> res = new ArrayList<>();

        for (int[] a : accounts) {
            int p = 0;
            for (int num : a)
                p += num;
            res.add(p);
        }

        System.out.println(max(res));

    }

    static int max(ArrayList<Integer>a){
        int max = Integer.MIN_VALUE;
        for (int num:a) {
            if(num>max)
                max = num;
        }
        return max;
    }

    static int richCustWealth(int[][] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr[i].length; j++) {
                temp += arr[i][j];
            }
            res = Math.max(res,temp);
        }
        return res;
    }

}
