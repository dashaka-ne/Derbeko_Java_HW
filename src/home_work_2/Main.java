package home_work_2;

import home_work_2.arrays.ArraysTasks;
import home_work_2.arrays.ArraysUtils;
import home_work_2.loop.LoopTwo;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = SortsUtils.bubble(ArraysUtils.arrayRandom(10, 100));
        int[] arr2 = SortsUtils.shake(ArraysUtils.arrayRandom(15, 100));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
