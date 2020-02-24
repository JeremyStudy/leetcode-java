package com.jeremy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode119 {
    //给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
//
//
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。
//
// 示例:
//
// 输入: 3
//输出: [1,3,3,1]
//
//
// 进阶：
//
// 你可以优化你的算法到 O(k) 空间复杂度吗？
// Related Topics 数组


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> result = new ArrayList<>();
            if (rowIndex == 0) {
                result.add(1);
            } else {
                List<Integer> aboveRow = getRow(rowIndex - 1);
                result.add(1);
                for (int i = 0; i < aboveRow.size() - 1; i++) {
                    result.add(aboveRow.get(i) + aboveRow.get(i + 1));
                }
                result.add(1);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
