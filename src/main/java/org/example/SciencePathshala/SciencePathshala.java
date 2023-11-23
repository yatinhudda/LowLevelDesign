package org.example.SciencePathshala;

public class SciencePathshala {
    public static void main(String[] args){
        String userName = "yatin123@yahoo.com", userPassword = "hudda@123";
        UserCredentialsValidator userCredentialsValidator =
                new UserCredentialsValidator(userName, userPassword);
        CourseModules courseModules = new CourseModules();
        if(userCredentialsValidator.validateUser()){
            System.out.println(courseModules.getModules(userName));
        }else{
            System.out.println("Invalid User");
        }
    }
}
