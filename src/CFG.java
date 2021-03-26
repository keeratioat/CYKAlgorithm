/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keerati
 */

import java.util.Iterator;
import java.util.LinkedHashMap;

public class CFG  {
    
    public String cfg;
    LinkedHashMap <Character , String> map;
    
    public CFG() {
        map = new LinkedHashMap<>(); 
    }

    public void addRule(String cfg){ 
       if(!map.containsKey(cfg.charAt(0))){
            map.put(cfg.charAt(0), cfg.substring(3));
       }
    }
    
    public void clearData(){
        map.clear();
    }
    public void showAllRule(){
    Iterator <Character> itr = map.keySet().iterator();
        while(itr.hasNext()){
        char key = itr.next();
            System.out.println("key : " + key + " val : " + map.get(key));
        }
    }    
}