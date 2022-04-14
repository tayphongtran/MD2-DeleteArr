package max.arr;

public class MaxArr {
    public static void main(String[] args) {
        double[] numberArr = { 12.3, -4, 10, 4.24, 2, 71, -2, -6 };
        double max = numberArr[0];
        for(double i : numberArr){
            System.out.print(i + ", ");
        }
        for (double num: numberArr) {
            if(max < num)
                max = num;
        }
        System.out.printf(" \n--so lon nhat: %.2f" , max);
    }
}
