package practice.core.leetcode.amazon;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDataLogs {

    public String[] reorderLogFiles(String[] logs) {

        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int s1SpaceIndex = s1.indexOf(' ');
                int s2SpaceIndex = s2.indexOf(' ');
                char s1FirstCharacter = s1.charAt(s1SpaceIndex+1);
                char s2FirstCharacter = s2.charAt(s2SpaceIndex+1);

                if (s1FirstCharacter <= '9') {
                    if (s2FirstCharacter <= '9') return 0;
                    else return 1;
                }
                if (s2FirstCharacter <= '9') return -1;

                int preCompute = s1.substring(s1SpaceIndex+1).compareTo(s2.substring(s2SpaceIndex+1));
                if (preCompute == 0) return s1.substring(0,s1SpaceIndex).compareTo(s2.substring(0,s2SpaceIndex));
                return preCompute;
            }
        };

        Arrays.sort(logs, myComp);
        return logs;
    }

    public String[] reorderLogFiles1(String[] logs){
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int s1SpaceIndex = s1.indexOf(" ");
                int s2SpaceIndex = s2.indexOf(" ");
                char s1FirstChar = s1.charAt(s1SpaceIndex+1);
                char s2FirstChar = s2.charAt(s2SpaceIndex+1);

                if(s1FirstChar<='9'){
                    if(s2FirstChar<='9') return 0;
                    else return 1;
                }
                if(s2FirstChar <= '9') return -1;

                int preCompute = s1.substring(s1SpaceIndex+1).compareTo(s2.substring(s2SpaceIndex+1));
                if(preCompute == 0) return s1.substring(0,s1SpaceIndex).compareTo(s2.substring(0,s2SpaceIndex));
                return preCompute;
            }
        };

        Arrays.sort(logs, comp);
        return logs;

    }

    @Test
    public void test1(){
        String[]  logs = new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        reorderLogFiles(logs);
    }
}
