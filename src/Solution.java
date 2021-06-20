import java.util.*;

public class Solution {

    public static void main(String args[]) {
        int arr[] = {9, 4, 6, 1, 2, 3, 8};
        System.out.println("OUTPUT : "+countTriplets(arr, 7, 3, 14));
    }

    static int countTriplets(int Arr[], int N, int L, int R) {
        Arrays.sort(Arr);
        int count = 0;
        for (int i = 0; i < N - 1; i++){
            int min = i + 1;
            int max = N - 1;
            int c = 2;
            while (min < N-1){
                int sum = Arr[i] + Arr[min] + Arr[max];

                System.out.print(Arr[i]+", "+Arr[min]+", "+Arr[max]);
                System.out.println(" | Sum : "+sum);

                if (sum < L)
                    min++;
                else if (sum > R)
                    max--;
                else {
                    count++;
                    min++;
                }

                if (min == max){
                    min = i + c;
                    max = N - 1;
                    c++;
                }
            }
        }
        return count;
    }
}
