public class Minimum_and_maximum {
    public static void main(String[] args) {
        int arr[] = {10,20,39,48,50};
        int largest = arr[0]; // Initialize largest with the first element of the array
        for(int i = 0; i < arr.length; i++) {
            if(largest < arr[i]) { // Change the condition to find the largest element
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
