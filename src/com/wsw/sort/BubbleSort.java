package com.wsw.sort;

import java.util.Arrays;
import java.util.Date;

public class BubbleSort {

  public static void main(String[] args) {
    int[] score = SortUtils.score;
    Date begintime = new Date();
    sort(score);
    Date endtime = new Date();
    SortUtils.comparetime(begintime,endtime);
    System.out.println(Arrays.toString(score) + "\t");
  }

  // 排序主体
  public static void sort(int score[]) {
    for (int i = 0; i < score.length - 1; i++) { // n-1次排序,最多[n*(n-1)]/2次交换
      for (int j = 0; j < score.length - i - 1; j++) {
        if (score[j] < score[j + 1]) { // 把小的值交换到后面
          int temp = score[j];
          score[j] = score[j + 1];
          score[j + 1] = temp;
        }
      }
      // System.out.print("第" + (i + 1) + "次排序结果：");
      // for (int a = 0; a < score.length; a++) {
      // System.out.print(score[a] + "\t");
      // }
      // System.out.println("");
    }
    // System.out.print("最终排序结果：");
    // for (int a = 0; a < score.length; a++) {
    // System.out.print(score[a] + "\t");
    // }
  }

}
