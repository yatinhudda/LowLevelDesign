package org.example.AccessModifiers;

public class Student {

    private String firstName;
    private String lastname;
    private int studentID;
    private double mobileNumber;
    private int studentMarks;

    private static int numberOfStudents = 0;

    public Student(String firstName, String lastname, int studentID, double mobileNumber, int studentMarks) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.studentID = studentID;
        this.mobileNumber = mobileNumber;
        this.studentMarks = studentMarks;
        numberOfStudents++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setMobileNumber(double mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getMobileNumber() {
        return mobileNumber;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public static int getNumberOfStudents(){
        return numberOfStudents;
    }
}
