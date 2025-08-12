package leetCode.top150IQ.QN68TextJustification;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> fullJustify(String[] words, int maxWidth){
        List<String> list = new ArrayList<>();
        if(words.length == 0) return list;
        String currentLine = words[0];
        int currentLen = words[0].length();
        for(int i = 1; i < words.length; i++){
            String str = words[i];
            if(currentLen + 1 + str.length() <= maxWidth){
                currentLine += " " + str;
                currentLen += 1 + str.length();
            }
            else{
                list.add(currentLine);
                currentLine = str;
                currentLen = str.length();
            }
            }
        list.add(currentLine);
        List<String> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            String line = list.get(i);
            String[] parts = line.split("\\s");
            if(i == list.size() - 1 || parts.length == 1){
                StringBuilder sb = new StringBuilder(line);
               // sb.append(line);
                while(sb.length() < maxWidth) sb.append(" ");
                result.add(sb.toString());
            }
            else{
                int totalChars = 0;
                for(String w: parts) totalChars += w.length();
                int totalSpaces = maxWidth - totalChars;
                int gaps = parts.length - 1;
                int basicSpaces = totalSpaces / gaps;
                int extra = totalSpaces % gaps;
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < parts.length; j++){
                    sb.append(parts[j]);
                    if(j < parts.length - 1){
                        int count = basicSpaces + (extra-- > 0 ? 1 : 0);
                        for(int k = 0; k < count; k++) sb.append(" ");
                    }
                }
                result.add(sb.toString());
            }
        }
        return result;
        }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> output = fullJustify(words, 16);
        for(String str: output) System.out.println(str);

    }
}
//This is an
//example of text
//justification.
/*
Example 1:

Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
Example 2:

Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
Output:
[
  "What   must   be",
  "acknowledgment  ",
  "shall be        "
]
Explanation: Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
Note that the second line is also left-justified because it contains only one word.
Example 3:

Input: words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"], maxWidth = 20
Output:
[
  "Science  is  what we",
  "understand      well",
  "enough to explain to",
  "a  computer.  Art is",
  "everything  else  we",
  "do                  "
]


Constraints:

1 <= words.length <= 300
1 <= words[i].length <= 20
words[i] consists of only English letters and symbols.
1 <= maxWidth <= 100
words[i].length <= maxWidth
 */
