import java.util.List;

public class MergeTwoSortedLists {
    public static int[] mergeTwoSortedLists(int[] input1, int n, int[] input2, int m){
        int p1= n-1;
        int p2= m-1;
        int p3= input1.length - 1;
        //Time complexity: O(n)
        //Space complexity= O(1)

        //To compare and swap values using 3 pointers
        while (0<=p1 && 0<=p2){
            if(input1[p1] < input2[p2]){
                input1[p3] = input2[p2];
                p2-=1;
            }else{
                input1[p3]= input1[p1];
                p1-=1;
            }
            p3-=1;
        }
        //To copy the remaining value to the new array
        if (n!=m){
            System.arraycopy(input2,0,input1, 0, p2+1);
        }

        return input1;
    }


}
