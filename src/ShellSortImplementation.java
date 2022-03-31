import static java.lang.Math.round;

public class ShellSortImplementation {
    public static void main(String[] args) {
        int[] arr = {15,10,5,2,-1,0};

        int gap = 1;

        while(gap < arr.length){
            gap = gap * 3 + 1;
        }

        gap = round(gap / 3);

        while(gap > 0){
            for (int i = gap; i < arr.length; i++){

                int actualElement = arr[i];
                int actualElementPosition = i;

                while(actualElementPosition >= gap && arr[i] < arr[i - gap]){
                    arr[i] = arr[i - gap];
                    actualElementPosition -= gap;
                }
                arr[actualElementPosition] = actualElement;
            }
            gap /= 2;
        }

        for (int element: arr){
            System.out.println(element);
        }
    }
}
