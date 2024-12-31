
    package Strings;
    
    public class validAnagram242 {
    
        public static void main(String[] args) {
            String s = "abjd";
            String t = "bacd";

            System.out.println(isAnagram(s, t));
        }

        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            int[] freq = new int[26];

            int indexS =0;
            int indexT =0;
            
            int len = s.length();

            while (indexS < len && indexT < len) {
                char charS = s.charAt(indexS);
                int freqS = charS - 97;
                freq[freqS] += 1;

                char charT = t.charAt(indexT);
                int freqT = charT - 97;
                freq[freqT] -= 1;

                indexS++;
                indexT++;
            }

            for (int i = 0; i < freq.length; i++) {
                if (freq[i] != 0) {
                    return false;
                }
            }
            return  true;
        }
       
    }

