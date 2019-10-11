# implement-strstr(实现 strStr())

[leetcode28](https://leetcode-cn.com/problems/implement-strstr/)

## 解法1

暴力法1：

思路：
假设文本：haystack，待匹配：needle

-	使用i与j,依次比较haystack与needle的每一个字符，
-	如果相等，++i，++j,不相等，j需要回溯到0，i需要回溯到在上一次交汇的下一个索引位置地方（i-j+1）
-	遍历完haystack或者needle后停止
-	判断j的大小是否与needle长度相等
-	如果相等则匹配上返回，i-j
-	否则返回-1

时间复杂度：O(n^2)

































