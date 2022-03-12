import java.util.Scanner;

public class GradesAverage {
    
    private final int L_G  = 0;   // lowest grade value =0
    private final int H_G = 100;  // highest grade value =0
    
    // student's grades
    private int[] grades;
    
   
   
    public static void main(String[] args)
    {
        GradesAverage aGradesAverage = new GradesAverage(); // to create an object of class GradesAverage
        Scanner ref = new Scanner(System.in);
       

        System.out.print("Enter the number of students: ");
        int numStudents = ref.nextInt();
                
        aGradesAverage.run(numStudents);  // it will call the method run with argument is no. of student
    }
        
    
    private void run(int numStudents)
    {
        if (numStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }        
        grades = new int[numStudents];
        
        double sum = 0;
        int    i   = 0;
        while (i < numStudents)
        {
            System.out.printf("Enter the grade for student %1$d: ", (i+1));
             Scanner ref2 = new Scanner(System.in); // creating the object of scanner class
            int grade = ref2.nextInt();  // input the grades of students                                     
            
            // chek if grade is between 0 and 100
            if ((grade >= L_G) && (grade <= H_G))    // compare the grade is grater lowestgrade which is(grade<=0) because L_G=0 &&(grade<=100) because H_G=100
           {
                grades[i] = grade;
                sum      += grade; // add the all grades also you can write (sum=sum+grade)
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");  // if upper if condition is false then it will print this line
        }
        System.out.printf("The average is %1$.2f\n", (sum / numStudents)); // it will print average of grades
    }
    
}