public class AvgOfNumbers{

    public static void main(String[] args) {
        double[] arr = {21, 13.89, 10.5, 150, 15.3};
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("The average is: %.3f", average);
    }
}