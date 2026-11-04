package labs.lab07;

public class Lab7 {

    public void start() {
        int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
        arrayWork(numbers);
        sort(numbers);
}

    public void arrayWork(int[] numbers) {

        int sum = 0;
        double avg = 0;
        int min = numbers[0];
        int max = numbers[0];
        int index = -1;


        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            if(numbers[i] < min)
                min = numbers[i];
            if(numbers[i] > max)
                max = numbers[i];
            if(numbers[i] == 0)
               index = i;
        }
        
        avg = (double)sum / numbers.length;
        
        System.out.println("Total : " + sum);
        System.out.println("Average : " + avg);
        System.out.println("Minimum : " + min);
        System.out.println("Maximum :" + max);
        System.out.println("Index of 0 : " + index);

        }

    
    public void sort(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = 0; j < numbers.length - 1 - i; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }    
    
        System.out.println("Sorted array: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }





}
