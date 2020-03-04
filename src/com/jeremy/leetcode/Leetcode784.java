package com.jeremy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode784 {
    //给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
//
//
//示例:
//输入: S = "a1b2"
//输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
//
//输入: S = "3z4"
//输出: ["3z4", "3Z4"]
//
//输入: S = "12345"
//输出: ["12345"]
//
//
// 注意：
//
//
// S 的长度不超过12。
// S 仅由数字和字母组成。
//
// Related Topics 位运算 回溯算法


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> letterCasePermutation(String S) {
            List<StringBuilder> result = new ArrayList<>();
            result.add(new StringBuilder());

            for (char c : S.toCharArray()) {
                int size = result.size();
                if (Character.isLetter(c)) {
                    for (int j = 0; j < size; j++) {
                        result.add(new StringBuilder(result.get(j)));
                        result.get(j).append(Character.toLowerCase(c));
                        result.get(j + size).append(Character.toUpperCase(c));
                    }

                } else {
                    for (int j = 0; j < size; j++) {
                        result.get(j).append(c);
                    }
                }
            }

            List<String> rtn = new ArrayList<>();
            for (StringBuilder sb : result) {
                rtn.add(sb.toString());
            }
            return rtn;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
