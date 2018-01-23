package com.wsw.sort;

import java.util.Arrays;
import java.util.Date;
/**
 * 插入排序
 * 2018年1月23日 - wushanwen - 创建。
 */
public class InsertSort {
  public static void main(String[] args) {
    int[] score = SortUtils.score;
    Date begintime = new Date();
    insertSort(score);
    Date endtime = new Date();
    SortUtils.comparetime(endtime, begintime);
    System.out.println(Arrays.toString(score) + "\t");
  }

  // 排序主体
  public static void insertSort(int[] score) {
    int size = score.length, temp, j;
    for (int i = 1; i < size; i++) {
      temp = score[i];
      for (j = i; j > 0 && temp < score[j - 1]; j--)
        score[j] = score[j - 1];
      score[j] = temp;
    }
  }
}
