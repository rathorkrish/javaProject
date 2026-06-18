import java.util.Scanner;

class CourseStudent {
    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getFinalFee() {
        return courseFee - (courseFee * discountPercent / 100);
    }

    public void display() {
        System.out.println("\nStudent Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Final Fee    : " + getFinalFee());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CourseStudent cs = new CourseStudent();

        System.out.print("Enter Student Name: ");
        cs.setStudentName(sc.nextLine());

        System.out.print("Enter Course Name: ");
        cs.setCourseName(sc.nextLine());

        System.out.print("Enter Course Fee: ");
        cs.setCourseFee(sc.nextDouble());

        System.out.print("Enter Discount Percent: ");
        cs.setDiscountPercent(sc.nextDouble());

        cs.display();
    }
}
