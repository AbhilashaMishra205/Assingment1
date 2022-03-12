public class Fibonacci {
    
    public static void main(String[] args) {
        Fibonacci aFibonacci = new Fibonacci(); // creating a object using constructor
        aFibonacci.printFiboacciAndAverage(20);   // calling a function with argument
    }
    
    private void printFiboacciAndAverage(int n) {
        long   fb1 = 1;
        long   fb2 = 1;
        long   fbn = 0;
        long   sum = 0;
        
        if (n <= 0) {
            System.out.println("error");     // if we give  n value lessthen or equals to zero it gives error
            return;
        }
        
        System.out.println("The first "+ n +"Fibonacci numbers are:");        
        for(int i = 1; i <= n; i++) {
            switch (i) {
                case 1: fbn = fb1; break;
                case 2: fbn = fb2; break;    
                default:
                    fbn = fb1 + fb2;
                    fb1 = fb2;
                    fb2 = fbn;
            }
            sum += fbn;                 // it will calculate the sum either of that you can also write (sum=sum+fbn)
            System.out.print(fbn + " ");     //it will print all fabonacci no. from 1 to 20
        }
        System.out.println(); 
       // System.out.printf("The sum is %d \n", sum); // it will gives the sum of 20 n0.
        System.out.printf("The average is %.4f \n", (double)sum / n); // it gives the average of sum of 20 no.
    }
    
}