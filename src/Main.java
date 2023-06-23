import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1= {1,2,3,0,0,0,0};
        int[] nums2= {-4,2,3,9};
        int n= 3;
        int m= 4;

        MergeTwoSortedLists.mergeTwoSortedLists(nums1,n,nums2,m);
        for (int j : nums1) {
            System.out.print(j + " ");
        }
    }
}