# 算法模板

## 1.递归

### 递归的三大要素

第一要素：明确你这个函数想要干什么

第二要素：寻找递归结束条件

第三要素：找出函数的等价关系式
https://www.cnblogs.com/myseries/p/10856518.html


### 递归模板


```
def recursion(level, param1, param2,...):

# 终止条件
if(level > MAX_LEVEL):
	print_result
	return

# 当前层处理逻辑
process_data(level, data...)


# 下探一层。下探一层时，一定要记得携带当前层的标记
self.recursion(level+1, p1, ...)


# 如果需要的话清除当前层状态
reverse_state(level)
```


## 2.二分法模板

```
int search(int[] array, int array){

	int left = 0;
	int right = array.length - 1;
	while(left <= right){
		int mid = left +(right-left)/2;
		if(array[mid] == target){
			break or return result;
		}else if (array[mid] < target){
			left = mid +1;
		}else {
			right = mid -1;
		}
	}

}


```


