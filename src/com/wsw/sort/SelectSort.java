package com.wsw.sort;

import java.util.Arrays;
import java.util.Date;

public class SelectSort {
  public static void main(String[] args) {
    int[] score = SortUtils.score;
    Date begintime = new Date();
    selectSort(score);
    Date endtime = new Date();
    SortUtils.comparetime(begintime,endtime);
    System.out.println(Arrays.toString(score) + "\t");
  }

  // 排序主体
  public static void selectSort(int[] score) {
    int length = score.length, min, temp;
    for (int i = 0; i < length; i++) {
      min = i;
      for (int j = i + 1; j < length; j++) {
        if (score[j] < score[min]) {
          min = j;
        }
      }
      temp = score[min];
      score[min] = score[i];
      score[i] = temp;
    }
  }
}
