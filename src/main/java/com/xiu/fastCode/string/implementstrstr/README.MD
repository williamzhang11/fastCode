# implement-strstr(实现 strStr())

[leetcode28](https://leetcode-cn.com/problems/implement-strstr/)

## 解法1

暴力法：

二层迭代，第一层迭代中找到第一个与待匹配字符串的第一个字符,位置index，第二层迭代中比对原始字符串[index]与待匹配字符串[0].
若完全匹配则返回true