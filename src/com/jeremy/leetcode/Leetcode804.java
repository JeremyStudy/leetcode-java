package com.jeremy.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode804 {
    //国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c
//" 对应 "-.-.", 等等。
//
// 为了方便，所有26个英文字母对应摩尔斯密码表如下：
//
// [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","-
//-","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--
//.."]
//
// 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..."
// + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
//
// 返回我们可以获得所有词不同单词翻译的数量。
//
// 例如:
//输入: words = ["gin", "zen", "gig", "msg"]
//输出: 2
//解释:
//各单词翻译如下:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//
//共有 2 种不同翻译, "--...-." 和 "--...--.".
//
//
//
//
// 注意:
//
//
// 单词列表words 的长度不会超过 100。
// 每个单词 words[i]的长度范围为 [1, 12]。
// 每个单词 words[i]只包含小写字母。
//
// Related Topics 字符串


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            Set<String> resultSet = new HashSet<>();
            for (String word : words) {
                resultSet.add(translate2Morse(word));
            }
            return resultSet.size();
        }

        public String translate2Morse(String word) {
            StringBuffer sb = new StringBuffer();
            for (char c : word.toCharArray()) {
                sb.append(getMorse4Char(c));
            }
            return sb.toString();
        }

        public String getMorse4Char(char c) {
            switch (c) {
                case 'a':
                    return ".-";
                case 'b':
                    return "-...";
                case 'c':
                    return "-.-.";
                case 'd':
                    return "-..";
                case 'e':
                    return ".";
                case 'f':
                    return "..-.";
                case 'g':
                    return "--.";
                case 'h':
                    return "....";
                case 'i':
                    return "..";
                case 'j':
                    return ".---";
                case 'k':
                    return "-.-";
                case 'l':
                    return ".-..";
                case 'm':
                    return "--";
                case 'n':
                    return "-.";
                case 'o':
                    return "---";
                case 'p':
                    return ".--.";
                case 'q':
                    return "--.-";
                case 'r':
                    return ".-.";
                case 's':
                    return "...";
                case 't':
                    return "-";
                case 'u':
                    return "..-";
                case 'v':
                    return "...-";
                case 'w':
                    return ".--";
                case 'x':
                    return "-..-";
                case 'y':
                    return "-.--";
                case 'z':
                    return "--..";
                default:
                    return "";
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
