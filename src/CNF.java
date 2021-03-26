/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keerati
 */
import java.util.LinkedHashMap;
import java.util.Iterator;

public class CNF {

    public CFG cfg;
    public LinkedHashMap <Character, String> map;
    private int count = 0;

    public CNF(CFG cfg) {
        this.cfg = cfg;
        this.map = cfg.map;
    }

    public boolean checkCNF() {
        Iterator<Character> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            char key = itr.next();
            count = 0;
            String str = map.get(key);
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isLowerCase(c)) {
                    count += 2;
                    if (count > 2) {
                        return false;
                    }
                } else {
                    if (str.charAt(i) == '|') {
                        count = 0;
                    } else {
                        count += 1;
                        if (count > 2) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
