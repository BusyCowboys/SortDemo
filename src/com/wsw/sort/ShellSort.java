package com.wsw.sort;

import java.util.Arrays;
import java.util.Date;

public class ShellSort {
  public static void main(String[] args) {
    int[] score = SortUtils.score;
    Date begintime = new Date();
    shellSort(score);
    Date endtime = new Date();
    SortUtils.comparetime(begintime,endtime);
    System.out.println(Arrays.toString(score) + "\t");
  }

  // 排序主体
  public static void shellSort(int[] score) {
    int length = score.length;
    int h = 1;
    int temp;
    while (h < length / 3) {
      h = 3 * h + 1;
    }
    while (h >= 1) {
      for (int i = h; i < length; i++) {
        for (int j = i; j >= h && score[j] < score[j - h]; j -= h) {
          temp = score[j];
          score[j] = score[j - h];
          score[j - h] = temp;
        }
      }
      h /= 3;
    }
  }

}
