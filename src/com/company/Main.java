package com.company;

class MinMaxMain {

//    int[] firstInts = {1, 2, 3, 4, 5};
//    int[] secondInts = {2334454, 5};
//    int[] thirdInts = {1};

    public static int main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4, 5};

        int max = getMax(array);
        System.out.println("Max:" + max);

        int min = getMin(array);
        System.out.println("Min:" + min);

        public static int getMaxValue(int[] numbers) {
            int maxValue = numbers[0];
            for(int i = 1; i < numbers.length; i++) {
                if(numbers[i] > maxValue) {
                    maxValue = numbers[i];
                }
            }
            return maxValue;
        }

        public static int getMin(int[] numbers){
            int minValue = numbers[0];
            for(int i = 1; i < numbers.length; i++) {
                if(numbers[i] < minValue){
                    minValue = numbers[i];
                }
            }
            return minValue;
        }
    }

}