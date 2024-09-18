import java.util.*;
public class GradeCalculator {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print("Subject "+ i + " mark: ");
            sum+=sc.nextInt();
        }
        float percentage=(float)sum/n;
        char Grade;
        if(percentage>=90)
        {
            Grade='O';
        }
        else if(percentage>=80)
        {
            Grade='A';
        }
        else if(percentage>=70){
            Grade='B';
        }
        else if(percentage>=60)
        {
            Grade='C';
        }
        else if(percentage>=50)
        {
            Grade='D';
        }
        else if(percentage>=40)
        {
            Grade='E';
        }
        else
        {
            Grade='F';
        }
        System.out.println("Total marks : "+ sum);
        System.out.println("Average Percentage : "+ percentage);
        System.out.println("Grade : "+Grade);
    }
}