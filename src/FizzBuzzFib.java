public class FizzBuzzFib {
    public static void main(String[] args){
        int n = 6;
        FizzBuzzPrinter(n);
    }

    //Assuming Fibonacci series starts from 1 not 0.
    private static void FizzBuzzPrinter(int n){
        int a =0, b=1, num =1;

        while(n>0){
            if(num % 15==0)
                System.out.println("FizzBuzz");
            else if(num % 5 ==0)
                System.out.println("Fizz");
            else if(num % 3 ==0)
                System.out.println("Buzz");
            else if(isPrime(num))
                System.out.println("BuzzFizz");
            else
                System.out.println(num);
            num = a+b;
            a=b;
            b=num;
            n--;
        }
    }

    private static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
