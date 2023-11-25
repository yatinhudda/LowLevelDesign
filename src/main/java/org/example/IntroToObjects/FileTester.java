package org.example.IntroToObjects;

public class FileTester {
    public static void main(String[] args){
        File myFile = new File("/home/yatin/learning");
        System.out.println(myFile.getDateOfCreation() + " " + myFile.getAbsolutePath());
        myFile.copy("/home/yatin/java");
        myFile.addContent("This is my first file here");
        System.out.println(myFile.getContent());
        System.out.println(myFile.getSize());
    }
}
