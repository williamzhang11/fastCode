# 3Sum Closest(最接近的三数之和)

[leetcode015]( https://leetcode-cn.com/problems/3sum-closest/)

## 解法1（暴力法）

思路：三层迭代，每个值用一层代表，找到使value= target - nums[k]+nums[i]+nums[j]最接近target的nums[k]+nums[i]+nums[j]。

时间复杂度：O(N^3)

## 解法2（排序+双指针）

思路：
1.先对数组进行排序（快排时间复杂度O(Nlog(N)))

2.然后设置3个指针（k,i,j）。首先固定指针k，移动双指针i(K+1),j

假如k >0 && nums[k]==nums[k-1],跳出此次循环


计算 value= target - nums[k]+nums[i]+nums[j]：
-	> 0,j--
-	<0,i++
- 记录使abs(value)最小值时的nums[k]+nums[i]+nums[j]和。

时间复杂度O(N^2)