package com.company;

/**
 * Created by summer on 2017/4/8.
 */
public class KMP {
    String s, t;
    private KMP(String s, String t){
        this.s = s;
        this.t = t;
    }
    public boolean compare(){
        boolean res = false;
        int[] pos = pos_gen();
        int i = 0, j = 0;
        while (i < this.s.length() && j < this.t.length()){
            if (pos[j] == -1 && this.s.charAt(i) != this.t.charAt(j)){
                i++;
            }
            else if (pos[j] != -1 && this.s.charAt(i) != this.t.charAt(j)){
                if(this.s.charAt(i) != this.t.charAt(pos[j])){
                    j = pos[pos[j]];
                }
                else {
                    j = pos[j];
                }
            }else {
                i++;
                j++;
            }

        }
        if (j == t.length()){
            res = true;
        }
        return res;
    }

    private int[] pos_gen(){
        int[] pos = new int[this.t.length()];
        pos[0] = -1;
        for (int i = 1; i < this.t.length(); i++){
            String suffix = "";
            String prefix = "";
            int len = 0;
            String str = this.t.substring(0, i);
            for (int j = 0; j <= str.length() - 1; j++){
                prefix = prefix + str.charAt(i);
                suffix = suffix + str.charAt(str.length() - i - 1);
                if (suffix.equals(prefix)){
                    len = prefix.length();
                }
            pos[i] = len;
            }
        }
        return pos;
    }

}
