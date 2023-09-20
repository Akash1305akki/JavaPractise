package Prep;

public class StringCompressor {

    public static void main(String[] Ak) {
        //         I-P: AAABCCCCCDD
        //         O-P: A3B1C5D2

        // My Method---
        String s1 = "AAABCCCCCDD";
        String s2 = "";

        int start = 0;

        while (start < s1.length()) {
            int tStart = start;
            int count = 1;

            while (start + 1 < s1.length() && s1.charAt(start) == s1.charAt(start + 1)) {
                start++;
                count++;
            }

            s2 += s1.charAt(tStart);
            s2 += count;

            start++;
        }

        System.out.println(s2);
        
    }
}
