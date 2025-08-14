import java.util.Scanner;

class Student {
    String name;
    int marks[];

    Student(String name, int numSub) {
        marks = new int[numSub];
        this.name = name;
    }

    void inputMarks(int numSub, Scanner sc) {
        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }
        System.out.println("Thank you!");
    }

    int getTotal() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    int getAverage(int sum, int numSub) {
        return sum / numSub;
    }

    String getGrade(int avg) {
        if (avg > 90) return "Grade A";
        else if (avg > 80) return "Grade B";
        else if (avg > 70) return "Grade C";
        else if (avg > 60) return "Grade D";
        else return "Fail";
    }

    void displayResult() {
        System.out.println("\n-------------------------- Student Result --------------------------");
        System.out.println("Name : " + name);

        int total = getTotal();
        int avg = getAverage(total, marks.length);

        System.out.println("Total Marks : " + total);
        System.out.println("Average : " + avg);
        System.out.println("Grade : " + getGrade(avg));
    }
}

class StudentGradeClaculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name : ");
        String name = sc.next();

        System.out.print("Enter number of subject : ");
        int sub = sc.nextInt();

        Student s = new Student(name, sub);
        s.inputMarks(sub, sc);
        s.displayResult();
    }
    
    
}
