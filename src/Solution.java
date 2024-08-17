import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers=new int[100];
        for(int i=0;i<100;i++) {
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));

        int[] oddNumbers=new int[50];
        int[] evenNumbers=new int[50];

        int oddIndex=0;
        int evenIndex=0;

        for(int i=0;i<100;i++) {
            if(numbers[i]%2==0){
                evenNumbers[evenIndex]=numbers[i];
                evenIndex++;
            } else{
                oddNumbers[oddIndex]=numbers[i];
                oddIndex++;
            }

        }
        System.out.println("even numbers are:"+Arrays.toString(evenNumbers));
        System.out.println("Odd Numbers are:"+Arrays.toString(oddNumbers));
        boolean isPrime;
        for(int i=0;i<50;i++) {
            if(isPrime(oddNumbers[i])) {
                System.out.println(oddNumbers[i]+ " ");
            }
        }
    }
}