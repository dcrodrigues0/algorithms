public class InsertionSortImplementation {

    public static void main(String[] args) {

        int[] arr = {10,3,2};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){

            int actualElement = arr[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0; i--){
                if(arr[i - 1] > actualElement){
                    arr[i] = arr[i - 1];
                }
            }

            //putting the actualElement on the correct position, after shift one position
            arr[i] = actualElement;
        }

        for (int element:arr) {
            System.out.println(element);
        }
    }

}
