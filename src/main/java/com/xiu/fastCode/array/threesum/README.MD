# three-sum(三数之和)

[leetcode015]( https://leetcode-cn.com/problems/3sum/)

## 解法1（排序+双指针）

思路：

1.先对数组进行排序（快排时间复杂度O(Nlog(N)))

2.然后设置3个指针（k,i,j）。首先固定指针k，移动双指针i(K+1),j
假如 nums[k] > 0,退出，
假如k >0 && nums[k]==nums[k-1],跳出此次循环


假如nums[k]+nums[i]+nums[j]：
-	== 0,记录k,i,j,去重
-	>0,j--
-	<0,i++

时间复杂度O(N^2)