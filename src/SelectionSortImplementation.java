public class SelectionSortImplementation {

    public static void main(String[] args) {
        int[] arr = {5,3,10,7,45};


        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(arr[i] > arr[largest]) largest = i;
            }

            swap(arr, largest, lastUnsortedIndex);
        }

        for(int number: arr) System.out.println(number);
    }

    public static void swap(int[] arr, int i, int j){
        if(i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
