package com.wsw.sort;

import java.util.Arrays;
import java.util.Date;

public class BucketSort {
  public static void main(String[] args) {
    int[] score = SortUtils.score;
    Date begintime = new Date();
    bucketSort(score);
    Date endtime = new Date();
    SortUtils.comparetime(begintime, endtime);
    System.out.println(Arrays.toString(score) + "\t");
  }

  // 排序主体
  public static void bucketSort(int[] a) {
    int max = a.length;
    int[] buckets;
    // 创建一个容量为max的数组buckets，并且将buckets中的所有数据都初始化为0。
    buckets = new int[max];

    // 1. 计数
    for (int i = 0; i < a.length; i++)
      buckets[a[i]]++;

    // 2. 排序
    for (int i = 0, j = 0; i < max; i++) {
      while ((buckets[i]--) > 0) {
        a[j++] = i;
      }
    }

    buckets = null;
  }

}
