import java.util.*;
public class Sort {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
