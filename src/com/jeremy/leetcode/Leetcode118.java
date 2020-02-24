package com.jeremy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode118 {
    //给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
//
//
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。
//
// 示例:
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
// Related Topics 数组


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 1; i <= numRows; i++) {
                if (i == 1) {
                    result.add(getLine(i, null));
                } else {
                    result.add(getLine(i, result.get(i - 2)));
                }
            }
            return result;
        }

        public List<Integer> getLine(int line, List<Integer> aboveLine) {
            List<Integer> ret = new ArrayList<>();
            if (line == 1) {
                ret.add(1);
            } else {
                ret.add(1);
                for (int i = 0; i < aboveLine.size() - 1; i++) {
                    ret.add(aboveLine.get(i) + aboveLine.get(i + 1));
                }
                ret.add(1);
            }
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
