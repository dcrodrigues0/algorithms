public class SimpleRecursionImplementation {

    public static void main(String[] args) {

        System.out.println("------------Recursive factorial------------");
        System.out.println(recursiveFactorial(10));
        System.out.println(recursiveFactorial(8));
        System.out.println(recursiveFactorial(6));
        System.out.println(recursiveFactorial(3));

        System.out.println("------------Iterative factorial------------");
        System.out.println(iterativeFactorial(10));
        System.out.println(iterativeFactorial(8));
        System.out.println(iterativeFactorial(6));
        System.out.println(iterativeFactorial(3));

    }

    public static int recursiveFactorial(int number){
        if(number == 1) return 1;
        return  number * recursiveFactorial(number - 1);
    }

    public static int iterativeFactorial(int number){
        int result = 1;
        for(int i = number; i != 1; i--){
            result *= i;
        }
        return result;
    }
}
