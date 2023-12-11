package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] SumArr = {10, 45, -11, 10, 77, 10};
        int Search = 10;
        int SumTotal = 30;
        System.out.println("Result: " + result(SumArr, Search, SumTotal));
    }

public static boolean result(int[] numbers, int Search, int SumTotal){
    int tmp_sum = 0;
    for (int number : numbers) {
        if (number == Search) {
            tmp_sum += Search ;
        }
        if (tmp_sum > SumTotal) {
            break;
        }
    }
    return tmp_sum == SumTotal;


        }

    }

