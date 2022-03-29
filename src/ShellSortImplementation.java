import static java.lang.Math.round;

public class ShellSortImplementation {
    public static void main(String[] args) {
        int[] arr = {15,10,5,2,-1,0};

        int gap = 1;
        int arrLength = arr.length;

        while(gap < arrLength){
            gap = gap * 3 + 1;
        }
        gap = round(gap / 3);

        while(gap > 0){
            for (int firstUnsortedGap = gap; firstUnsortedGap < arrLength; firstUnsortedGap++){

                int actualElement = arr[firstUnsortedGap];
                int i;

                for(i = firstUnsortedGap; i >= firstUnsortedGap; i = i - arrLength){
                    if(arr[i - firstUnsortedGap] > actualElement){
                        arr[i] = arr[i - firstUnsortedGap];
                    }
                }
                arr[i] = actualElement;

            }

            gap = gap / 2;
        }

        for (int element: arr){
            System.out.println(element);
        }
    }
}
