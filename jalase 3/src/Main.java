public class Main {
    public static void avg(int a, int b) {
        System.out.println((a + b) / 2);
    }

    public static int square(int a) {
        return a * a;
    }

    public static void age(int birthDate) {
        System.out.println(1402 - birthDate);
    }

    public static int calcDelta(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static boolean vote(int birthDate) {
        return 1402 - birthDate >= 18;
    }

    public static void evenOrOdd(int x) {
        System.out.println((x & 1) == 1 ? "Odd" : "Even");
    }

    public static void day(int n) {
        if (n == 1) {
            System.out.println("شنبه");
        } else if (n == 2) {
            System.out.println("یک شنبه");
        } else if (n == 3) {
            System.out.println("دو شنبه");
        } else if (n == 4) {
            System.out.println("سه شنبه");
        } else if (n == 5) {
            System.out.println("چهار شنبه");
        } else if (n == 6) {
            System.out.println("پنج شنبه");
        } else if (n == 7) {
            System.out.println("جمعه");
        } else {
            System.out.println("عدد نامعتبر");
        }
    }
    public static void day2(int n) {
        switch (n){
            case 1:
                System.out.println("شنبه");
                break;
            case 2:
                System.out.println("یک شنبه");
                break;
            case 3:
                System.out.println("دو شنبه");
                break;
            case 4:
                System.out.println("سه شنبه");
                break;
            case 5:
                System.out.println("چهار شنبه");
                break;
            case 6:
                System.out.println("پنج شنبه");
                break;
            case 7:
                System.out.println("جمعه");
                break;
            default:
                System.out.println("عدد نامعتبر");
                break;
        }
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static float newAvg(int... args){
        int s = 0;
        for (int i = 0; i < args.length; i++){
            s += args[i];
        }
        return s / args.length;
    }
    public static int factorial(int x){
        if (x == 0)
            return 1;
        return x * factorial(x - 1);
    }
    public static void main(String[] args) {
        //=========== 1 =========================
        avg(2, 2);
        System.out.println("=========== 1 =========================");
        //=========== 2 =========================
        int x = square(5);
        System.out.println(String.valueOf(Math.sqrt(x)));
        System.out.println("=========== 2 =========================");
        //=========== 3 =========================
        int n = 2;
        n += 5;
        n -= 3;
        n *= 10;
        n /= 2;
        n %= 5;
        System.out.println(n);
        System.out.println("=========== 3 =========================");
        //=========== 4 =========================
        int y = 2;
        System.out.println(y == n);
        System.out.println(y < n);
        System.out.println(y <= n);
        System.out.println(y != n);
        System.out.println(y > n);
        System.out.println(y >= n);
        System.out.println("=========== 4 =========================");
        //=========== 5 =========================
        age(1377);
        int delta = calcDelta(3, 6, 2);
        System.out.println("=========== 5 =========================");
        //=========== 6 =========================
        System.out.println(vote(1377));
        evenOrOdd(25);
        System.out.println("=========== 6 =========================");
        //=========== 7 =========================
        day(5);
        System.out.println("=========== 7 =========================");
        //=========== 8 =========================
        day2(5);
        System.out.println("=========== 8 =========================");
        //=========== 9 =========================
        String[] arr = {"a", "b", "c", "d", "e"};
        int length = arr.length;
        System.out.println(length);
        System.out.println(arr[2]);
        arr[2] = "changed";
        System.out.println(arr[2]);
        System.out.println(arr[length - 1]);
        System.out.println(arr[length / 2]);
        try{
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("index out of bound exception");
        }
        System.out.println("=========== 9 =========================");
        //=========== 10 =========================
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArr(myArr);
        System.out.println(newAvg(1, 2, 3, 4, 5));
        System.out.println(factorial(0));
        System.out.println("=========== 10 =========================");
    }
}