package org.example.AccessModifiers;

public class LearnStaticKeyword {
    /*
    We will learn here that how can we calculate
    the number of object created of any class.
     */

    public static void main(String[] args){
        Student s1 = new Student("Akshay", "Panwar", 1,
                987654321, 80);

        Student s2 = new Student("Yatender", "Hudda", 2,
                987654321, 90);

        Student s3 = new Student("Shivesh", "Sharma", 3,
                987654321, 99);

        Student s4 = new Student("Nishant", "bansla", 4,
                987654321, 56);

        System.out.println("Total number of students are : " + s1.getNumberOfStudents());
    }



}
