public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        for (int j = 0; j < a; j++) {
            for (int i = 0; i < b; i++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        int x = 6;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        int e = 15;
        int f = 1;
        int count = 0;
        int begin = e/2;
        while(f < e){
        for (int i = 0; i < e; i++){
            if(i >= begin - count && i <= begin + count){
                System.out.print(" *");
            } else {
                System.out.print("  ");
            }
        }
            System.out.print("\n");
            count++;
            f += 2;
        }


    }
}
