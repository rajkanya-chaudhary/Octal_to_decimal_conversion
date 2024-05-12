public class Largest_and_smallest {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int largest = arr[0];
        int smallest = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < largest)
            {
                largest = arr[i];
            }
            if(arr[i] > smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
