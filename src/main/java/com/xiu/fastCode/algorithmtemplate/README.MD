# 算法模板

## 递归

### 递归的三大要素

第一要素：明确你这个函数想要干什么

第二要素：寻找递归结束条件

第三要素：找出函数的等价关系式

### 递归模板


```
def recursion(level, param1, param2,...):

# 终止条件
if(level > MAX_LEVEL):
	print_result
	return

# 当前层处理逻辑
process_data(level, data...)


# 下探一层
self.recursion(level+1, p1, ...)


# 如果需要的话清除当前层状态
reverse_state(level)
```

https://www.cnblogs.com/myseries/p/10856518.html