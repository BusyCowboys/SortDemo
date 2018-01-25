package com.wsw.sort;

import java.util.Arrays;
import java.util.Date;

/**
 * 快速排序 2018年1月23日 
 * @author wushanwen - 创建。
 */
public class QuickSort {
  public static void main(String[] args) {
    int[] score = SortUtils.score;
    Date begintime = new Date();
    quickSort(score);
    Date endtime = new Date();
    SortUtils.comparetime(begintime, endtime);
    System.out.println(Arrays.toString(score) + "\t");
  }

  // 排序主体
  public static void quickSort(int[] score) {
    quickSort(score, 0, score.length - 1);
  }

  public static void quickSort(int[] arr, int low, int high) {
    int i, j, temp, t;
    if (low > high) {
      return;
    }
    i = low;
    j = high;
    // temp就是基准位
    temp = arr[low];

    while (i < j) {
      // 先看右边，依次往左递减
      while (temp <= arr[j] && i < j) {
        j--;
      }
      // 再看左边，依次往右递增
      while (temp >= arr[i] && i < j) {
        i++;
      }
      // 如果满足条件则交换
      if (i < j) {
        t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
      }

    }
    // 最后将基准为与i和j相等位置的数字交换
    arr[low] = arr[i];
    arr[i] = temp;
    // 递归调用左半数组
    quickSort(arr, low, j - 1);
    // 递归调用右半数组
    quickSort(arr, j + 1, high);
  }

}
