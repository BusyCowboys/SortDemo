# 几种常见排序算法
## 一、冒泡排序
      比较相邻的元素。如果第一个比第二个大，就交换他们两个。
      对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
      针对所有的元素重复以上的步骤，除了最后一个。
      持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
      时间复杂度：O(n^2)，最优时间复杂度：O(n)，平均时间复杂度：O(n^2)，排序次数：n-1，交换次数:[n(n-1)]/2
![img](https://github.com/BusyCowboys/SortDemo/blob/master/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F.gif)

## 二、插入排序
      从第一个元素开始，该元素可以认为已经被排序
      取出下一个元素，在已经排序的元素序列中从后向前扫描
      如果该元素（已排序）大于新元素，将该元素移到下一位置
      重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
      将新元素插入到该位置后
      重复步骤2~5
      时间复杂度：O(n^2)，最优时间复杂度：O(n),平均时间复杂度：O(n^2)
![img](https://github.com/BusyCowboys/SortDemo/blob/master/插入排序.gif)

## 三、选择排序
      首先在未排序序列中找到最小元素，存放到排序序列的起始位置
      然后，再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列的末尾。
      时间复杂度：O(n^2)，最优时间复杂度：O(n^2),平均时间复杂度：O(n^2)
![img](https://github.com/BusyCowboys/SortDemo/blob/master/选择排序.gif)

## 四、希尔排序
      希尔排序通过将比较的全部元素分为几个区域来提升插入排序的性能。这样可以让一个元素可以一次性地朝最终位置前进一大步。
      然后算法再取越来越小的步长进行排序，算法的最后一步就是普通的插入排序，但是到了这步，需排序的数据几乎是已排好的了（此时插入排序较快）。
      时间复杂度：根据步长而不同，最优时间复杂度：O(n),平均时间复杂度：根据步长而不同
![img](https://github.com/BusyCowboys/SortDemo/blob/master/希尔排序.png)

## 五、桶排序
      对于N个待排数据，M个桶，平均每个桶[N/M]个数据的桶排序平均时间复杂度为：
      O(N)+O(M*(N/M)*log(N/M))=O(N+N*(logN-logM))=O(N+N*logN-N*logM)
![img](https://github.com/BusyCowboys/SortDemo/blob/master/桶排序.png)

# 六、快速排序
      [点击此处查看排序原理](http://www.cnblogs.com/ahalei/p/3568434.html) 
      
## 七、排序算法时间复杂度
![img](https://github.com/BusyCowboys/SortDemo/blob/master/排序算法时间复杂度.jpg)
