# 几种常见排序算法
## 一、冒泡排序
      比较相邻的元素。如果第一个比第二个大，就交换他们两个。
      对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
      针对所有的元素重复以上的步骤，除了最后一个。
      持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
      时间复杂度：O(n^2)，最优时间复杂度：O(n)，平均时间复杂度：O(n^2)，排序次数：n-1，交换次数:[n(n-1)]/2
![img](https://github.com/BusyCowboys/SortDemo/blob/master/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F.gif)

## 一、插入排序
      从第一个元素开始，该元素可以认为已经被排序
      取出下一个元素，在已经排序的元素序列中从后向前扫描
      如果该元素（已排序）大于新元素，将该元素移到下一位置
      重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
      将新元素插入到该位置后
      重复步骤2~5
      时间复杂度：O(n^2)，最优时间复杂度：O(n),平均时间复杂度：O(n^2)
![img](https://github.com/BusyCowboys/SortDemo/blob/master/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F.gif)
