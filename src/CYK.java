
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keerati
 */
public class CYK {

    CFG cfg;
    String[][] cykTable;
    String w;
    public LinkedHashMap<Character, String> map;
    ArrayList<String> arr;

    public CYK(CFG cfg, String w) {
        this.cfg = cfg;
        this.w = w;
        this.map = cfg.map;
        cykTable = new String[w.length() + 1][w.length() + 1];
        arr = new ArrayList<>();
    }

    private void initializeData() {
        for (int i = 0; i < w.length() + 1; i++) {
            for (int j = 0; j < w.length() + 1; j++) {
                cykTable[i][j] = "0";
            }
        }
    }

    private void removeDataInArrayList() {
        for (int m = 0; m < arr.size(); m++) {
            arr.remove(m);
        }
    }

    private void calFirstRow() {
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            Iterator<Character> itr = map.keySet().iterator();
            while (itr.hasNext()) {
                char key = itr.next();
                String val = map.get(key);
                for (int j = 0; j < val.length(); j++) {
                    char cc = val.charAt(j);
                    if (c == cc) {
                        if (cykTable[i][i].equals("0")) {
                            cykTable[i][i] = Character.toString(key);
                        } else {
                            cykTable[i][i] += Character.toString(key);
                        }
                        //System.out.print(cykTable[0][i]);
                    }
                }
            }
        }
    }

    private void calSecondToNRow() {
        for (int l = 1; l <= w.length(); l++) {
            for (int i = 0; i <= w.length() - l + 1; i++) {
                int j = i + l - 1;
                for (int k = i; k <= j - 1; k++) {
                    if (k + 1 == w.length() + 1 || j == w.length()) {
                        break;
                    }

                    String s = cykTable[i][k];
                    String ss = cykTable[k + 1][j];
                    //System.out.println(s.length() + " " + ss.length());
                    //Calculate Cartesian Product
                    if ((s + ss).length() > 2) {
                        for (int m = 0; m < s.length(); m++) {
                            for (int n = 0; n < ss.length(); n++) {
                                char c1 = s.charAt(m);
                                char c2 = ss.charAt(n);
                                arr.add(Character.toString(c1) + Character.toString(c2));
                            }
                        }
                    }
                    //System.out.println(s + ss + " ");
                    Iterator<Character> itr = map.keySet().iterator();

                    while (itr.hasNext()) {
                        char key = itr.next();
                        String value = map.get(key);
                        ArrayList<String> list = new ArrayList<>();

                        for (String listval : value.split("\\|")) {
                            list.add(listval);
                        }

                        if ((s + ss).length() > 2) {
                            for (int m = 0; m < arr.size(); m++) {
                                String strarr = arr.get(m);
                                if (list.contains(strarr)) {
                                    if (cykTable[i][j].equals("0")) {
                                        cykTable[i][j] = Character.toString(key);
                                    } else {
                                        cykTable[i][j] += Character.toString(key);
                                    }
                                }

                            }
                        } else {
                            if (list.contains(s + ss)) {
                                if (cykTable[i][j].equals("0")) {
                                    cykTable[i][j] = Character.toString(key);
                                } else {
                                    cykTable[i][j] += Character.toString(key);
                                }
                            }
                        }

                    }
                    removeDataInArrayList();
                }
            }
        }
    }

    public String[][] calculateCYK() {
        initializeData();
        //1st row
        calFirstRow();
        //2nd to n-Row  
        calSecondToNRow();
        return cykTable;
    }
}
