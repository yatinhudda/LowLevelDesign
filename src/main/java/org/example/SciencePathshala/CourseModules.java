package org.example.SciencePathshala;

import java.util.ArrayList;
import java.util.List;

public class CourseModules {

    private final List<String> subscribeModules = new ArrayList<String>();
    private final List<String> freeModules = new ArrayList<String>();

    CourseModules(){
        subscribeModules.add("Organic Chemistry");
        subscribeModules.add("Inorganic Chemistry");
        subscribeModules.add("Physical Chemistry");
        freeModules.add("Mole Concept");
        freeModules.add("Intro to Chemistry");
    }

    public List<String> getModules(String userName){
        if(isUserPresentInSubscriberTable(userName)){
            return subscribeModules;
        }else{
            return freeModules;
        }
    }

    public Boolean isUserPresentInSubscriberTable(String userName){
        /*Logic to query DB
        in subscribeUser Table
         */
        return true;
    }
}
