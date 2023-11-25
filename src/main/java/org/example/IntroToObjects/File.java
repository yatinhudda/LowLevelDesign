package org.example.IntroToObjects;

import java.util.Date;

public class File {
    private String absolutePath;
    private double size;
    private Date dateOfCreation;
    private String content;

    public File(String absolutePath){
        this.absolutePath = absolutePath;
        this.size = 0;
        this.dateOfCreation = new Date();
        this.content = "";
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public double getSize() {
        return size;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public String getContent() {
        return content;
    }

    public void rename(){
        /*
        Rename Logic
         */
    }

    public void delete(){
        /*
        Delete Logic
         */
    }

    public void copy(String path){
        if(this.size > 10){
            System.out.println("Cannot Copy!");
        }else{
            System.out.println("Copy Successful!!");
        }
    }

    public void addContent(String content){
        this.content += content;
        this.size += content.length();
    }
}
