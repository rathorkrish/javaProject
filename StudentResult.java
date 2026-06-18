import java.util.Scanner;

class StudentResult {
    private String studentName;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getTotalMarks() {
        return mathMarks + scienceMarks + englishMarks;
    }

    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 50)
            return "C";
        else
            return "Fail";
    }

    public void display() {
        System.out.println("\nStudent Name : " + studentName);
        System.out.println("Total Marks  : " + getTotalMarks());
        System.out.println("Average      : " + getAverage());
        System.out.println("Grade        : " + getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentResult sr = new StudentResult();

        System.out.print("Enter Student Name: ");
        sr.setStudentName(sc.nextLine());

        System.out.print("Enter Math Marks: ");
        sr.setMathMarks(sc.nextInt());

        System.out.print("Enter Science Marks: ");
        sr.setScienceMarks(sc.nextInt());

        System.out.print("Enter English Marks: ");
        sr.setEnglishMarks(sc.nextInt());

        sr.display();
    }
}
