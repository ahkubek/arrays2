import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
//task4();


    }

    //task1
    private static void task1() {
        System.out.println("Задача1");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum=0;
        for (int i = 0; i < payments.length; i++) {
            sum=sum+payments[i];
            System.out.println("сумма затра за месяц"+sum+"рублей");

        }

    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static void task2(){
        System.out.println("Задача2");
        int[] payments= generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int min= payments[0];
        int max =payments[0];
        for (int i = 0; i <payments.length ; i++) {
            if(payments[i]>max){
                max=payments[i];
            }
            if(payments[i]<min){
                min=payments[i];
            }


        }
        System.out.print("минимальная сумма"+min+"рублей Максимальная"+max+"рублей");
    }

    private static int[] generatetRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 200_000;
        }
        return arr;

    }
    //task3
    private static void task3() {
        System.out.println();
        System.out.println("Задача3");
        int[] payments= generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum=0;
        for (int i = 0; i < payments.length; i++) {
            sum=sum+payments[i];


        }
        System.out.printf("средняя сумма трат за месяц составила%.2f рублей",(double) sum/payments.length);


    }
    //task4
    private static void task4() {
        System.out.println("Задача4");
    }

}
