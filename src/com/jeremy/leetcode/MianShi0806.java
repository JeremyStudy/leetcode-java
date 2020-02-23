package com.jeremy.leetcode;

import java.util.List;

public class MianShi0806 {
//在经典汉诺塔问题中，有 3 根柱子及 N 个不同大小的穿孔圆盘，盘子可以滑入任意一根柱子。一开始，所有盘子自上而下按升序依次套在第一根柱子上(即每一个盘子只
//能放在更大的盘子上面)。移动圆盘时受到以下限制:
//(1) 每次只能移动一个盘子;
//(2) 盘子只能从柱子顶端滑出移到下一根柱子;
//(3) 盘子只能叠在比它大的盘子上。
//
// 请编写程序，用栈将所有盘子从第一根柱子移到最后一根柱子。
//
// 你需要原地修改栈。
//
// 示例1:
//
//  输入：A = [2, 1, 0], B = [], C = []
// 输出：C = [2, 1, 0]
//
//
// 示例2:
//
//  输入：A = [1, 0], B = [], C = []
// 输出：C = [1, 0]
//
//
// 提示:
//
//
// A中盘子的数目不大于14个。
//
// Related Topics 递归


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
            move(A.size(), A, B, C);
        }

        public void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
            if (n == 1) {
                C.add(A.get(A.size() - 1));
                A.remove(A.size() - 1);
                return;
            } else {
                move(n - 1, A, C, B); // 将A上面n-1个通过C移到B
                C.add(A.get(A.size() - 1)); // 将A最后一个移到C
                A.remove(A.size() - 1); // 这时，A空了
                move(n - 1, B, A, C); // 将B上面n-1个通过空的A移到C
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}