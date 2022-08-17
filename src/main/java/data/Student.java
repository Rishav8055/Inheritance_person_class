package data;

public class Student extends person{
    private int rollNo;
    private int classNo;
    private String section;
    private String enrollNumber;

    public void show(){
        display();
        System.out.println("rollNo = " + rollNo);
        System.out.println("classNo = " + classNo);
        System.out.println("section = " + section);
        System.out.println("enrollNumber = " + enrollNumber);


    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getEnrollNumber() {
        return enrollNumber;
    }

    public void setEnrollNumber(String enrollNumber) {
        this.enrollNumber = enrollNumber;
    }
}
