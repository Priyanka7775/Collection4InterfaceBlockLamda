public class FactorialMain {
    public static void main(String[] args) {
        Factorial factorial=number ->{
            int fact=1;
            for (int i = 1; i <number ; i++) {
                fact=fact*i;
            }
            return fact;
        };

        System.out.println( factorial.findFactorial(10));
    }
}
