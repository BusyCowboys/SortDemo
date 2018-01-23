package com.wsw.sort;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
public class BubbleSort {
  public static void sort(int score[]) {
    System.out.println(score.length);
    for (int i = 0; i < score.length - 1; i++) { // n-1次排序,最多[n*(n-1)]/2次交换
      for (int j = 0; j < score.length - i - 1; j++) { // 对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
        if (score[j] < score[j + 1]) { // 把小的值交换到后面
          int temp = score[j];
          score[j] = score[j + 1];
          score[j + 1] = temp;
        }
      }
       System.out.print("第" + (i + 1) + "次排序结果：");
       for (int a = 0; a < score.length; a++) {
       System.out.print(score[a] + "\t");
       }
       System.out.println("");
    }
     System.out.print("最终排序结果：");
     for (int a = 0; a < score.length; a++) {
     System.out.print(score[a] + "\t");
     }
  }

  // 比较时间
  public static void comparetime(Date begintime, Date endtime) {
    try {
      SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
      Date begin = time.parse(time.format(begintime));
      Date end = time.parse(time.format(endtime));
      long interval = (end.getTime() - begin.getTime());
      System.out.println("两个时间相差" + interval + "豪秒");
      System.out
          .println("开始时间:" + time.format(begintime) + "====" + "结束时间:" + time.format(endtime));

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    int score[] = {
        1, 64, 54, 131, 75, 81, 62, 91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69,
        127, 80, 12, 108, 107, 24, 0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14,
        88, 22, 38, 111, 19, 43, 76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130,
        82, 53, 65, 104, 138, 133, 33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101,
        71, 3, 7, 15, 78, 102, 63, 143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34,
        98, 60, 10, 99, 106, 79, 128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144,
        44, 103, 142, 95, 117, 150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64,
        54, 131, 75, 81, 62, 91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127,
        80, 12, 108, 107, 24, 0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88,
        22, 38, 111, 19, 43, 76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82,
        53, 65, 104, 138, 133, 33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71,
        3, 7, 15, 78, 102, 63, 143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98,
        60, 10, 99, 106, 79, 128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44,
        103, 142, 95, 117, 150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54,
        131, 75, 81, 62, 91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80,
        12, 108, 107, 24, 0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22,
        38, 111, 19, 43, 76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53,
        65, 104, 138, 133, 33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7,
        15, 78, 102, 63, 143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60,
        10, 99, 106, 79, 128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103,
        142, 95, 117, 150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131,
        75, 81, 62, 91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12,
        108, 107, 24, 0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38,
        111, 19, 43, 76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65,
        104, 138, 133, 33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15,
        78, 102, 63, 143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10,
        99, 106, 79, 128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142,
        95, 117, 150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75,
        81, 62, 91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108,
        107, 24, 0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111,
        19, 43, 76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104,
        138, 133, 33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78,
        102, 63, 143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99,
        106, 79, 128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95,
        117, 150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81,
        62, 91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107,
        24, 0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19,
        43, 76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138,
        133, 33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102,
        63, 143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106,
        79, 128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16, 114, 144, 44, 103, 142, 95, 117,
        150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62,
        91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24,
        0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43,
        76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133,
        33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63,
        143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79,
        128, 127, 80, 12, 108, 107, 24, 0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57,
        46, 14, 88, 22, 38, 111, 19, 43, 76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90, 72,
        130, 82, 53, 65, 104, 138, 133, 33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148, 94,
        101, 71, 3, 7, 15, 78, 102, 63, 143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30, 123,
        31, 34, 98, 60, 10, 99, 106, 79, 128, 49, 58, 67, 27, 149, 42, 145, 137, 51, 56, 39, 16,
        114, 144, 44, 103, 142, 95, 117, 150, 113, 100, 73, 126, 37, 112, 61, 93, 125, 118, 2, 55,
        4, 136, 64, 54, 131, 75, 81, 62, 91, 134, 115, 48, 6, 116, 35, 36, 47, 96, 70, 141, 135,
        110, 69, 127, 80, 12, 108, 107, 24, 0, 84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74,
        57, 46, 14, 88, 22, 38, 111, 19, 43, 76, 132, 23, 41, 119, 87, 25, 11, 68, 13, 121, 105, 90,
        72, 130, 82, 53, 65, 104, 138, 133, 33, 9, 97, 50, 129, 147, 124, 83, 139, 8, 85, 32, 148,
        94, 101, 71, 3, 7, 15, 78, 102, 63, 143, 29, 21, 77, 66, 89, 28, 45, 5, 86, 20, 122, 30,
        123, 31, 34, 98, 60, 10, 99, 106, 79, 128, 142, 95, 117, 150, 113, 100, 73, 126, 37, 112,
        61, 93, 125, 118, 2, 55, 4, 136, 64, 54, 131, 75, 81, 62, 91, 134, 115, 48, 6, 116, 35, 36,
        47, 96, 70, 141, 135, 110, 69, 127, 80, 12, 108, 107, 24, 0, 84, 26, 59, 140, 18, 40, 146,
        17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43, 76, 132, 23, 41, 119, 87, 25, 11,
        68, 13, 121, 105, 90, 72, 130, 82, 53, 65, 104, 138, 133, 33, 9, 97, 50, 129, 147, 124, 83,
        139, 8, 85, 32, 148, 94, 101, 71, 3, 7, 15, 78, 102, 63, 143, 29, 21, 77, 66, 89, 28, 45, 5,
        86, 20, 122, 30, 123, 31, 34, 98, 60, 10, 99, 106, 79, 128, 127, 80, 12, 108, 107, 24, 0,
        84, 26, 59, 140, 18, 40, 146, 17, 52, 109, 92, 74, 57, 46, 14, 88, 22, 38, 111, 19, 43 };

    Date begintime = new Date();
    sort(score);
    Date endtime = new Date();
    comparetime(endtime, begintime);
    System.out.println(Arrays.toString(score));
  }
}
