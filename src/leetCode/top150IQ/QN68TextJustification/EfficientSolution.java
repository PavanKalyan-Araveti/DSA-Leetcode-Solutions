package leetCode.top150IQ.QN68TextJustification;

import java.util.ArrayList;
import java.util.List;
    public class EfficientSolution {
        public static List<String> fullJustify(String[] words, int maxWidth) {
            List<String> result = new ArrayList<>();
            int n = words.length;
            int i = 0;

            while (i < n) {
                // 1) Determine which words fit on this line:
                int lineLen = words[i].length();
                int j = i + 1;
                while (j < n && lineLen + 1 + words[j].length() <= maxWidth) {
                    // +1 for the space before words[j]
                    lineLen += 1 + words[j].length();
                    j++;
                }

                // words from i..j-1 go on this line
                int wordCount = j - i;
                StringBuilder line = new StringBuilder();

                // 2) If last line or only one word: left-justify
                if (j == n || wordCount == 1) {
                    for (int k = i; k < j; k++) {
                        line.append(words[k]);
                        if (k < j - 1) {
                            line.append(' ');
                        }
                    }
                    // pad the end with spaces
                    int remaining = maxWidth - line.length();
                    for (int s = 0; s < remaining; s++) {
                        line.append(' ');
                    }
                } else {
                    // 3) Fully justify
                    // total spaces to distribute
                    int totalSpaces = maxWidth;
                    for (int k = i; k < j; k++) {
                        totalSpaces -= words[k].length();
                    }
                    int slots = wordCount - 1;          // gaps between words
                    int spacePerSlot = totalSpaces / slots;
                    int extraSpaces = totalSpaces % slots; // leftmost gaps get +1

                    for (int k = i; k < j; k++) {
                        line.append(words[k]);
                        if (k < j - 1) {
                            // compute spaces for this gap
                            int thisGap = spacePerSlot + (extraSpaces-- > 0 ? 1 : 0);
                            for (int s = 0; s < thisGap; s++) {
                                line.append(' ');
                            }
                        }
                    }
                }

                result.add(line.toString());
                i = j; // move to next line
            }

            return result;
        }

        public static void main(String[] args) {
            String[] words = {
                    "This", "is", "an", "example", "of", "text", "justification."
            };
            List<String> output = fullJustify(words, 16);
            for (String str : output) {
                System.out.println('|' + str + '|');
            }
        }
    }

