enum level {LOW, MEDIUM, HIGH;}

public class Enum1 {

    Enum1 enum1 = new Enum1();

    public static void main(String[] args) {



            level l = level.LOW;
            level m = level.MEDIUM;
            level h = level.HIGH;
            System.out.println(l);

            switch (l) {
                case LOW:
                    if (select1() <= 11) {
                        System.out.println("Low Level");
                    } else {
                        System.out.println("The level went up!");
                    }
                    break;
            }
            switch (m) {
                case MEDIUM:
                    if (select2(10, 15) >= 30) {
                        System.out.println("Medium Level");
                    } else {
                        System.out.println("The level is not Medium!");
                    }
                    break;
            }
            switch (h) {
                case HIGH:
                    if (select3(10, 20, 30) >= 50) {
                        System.out.println(" High Level");
                    } else {
                        System.out.println("The level is lower than High!");
                    }
                    break;
            }

        }
        public static int select1 () {
            int a = 5;
            int b = 6;
            int c;
            return c = a + b;

        }
        public static int select2 ( int a, int b){
            return a - b;
        }
        public static int select3 ( int a, int b, int c){
            return a + b - c;
        }

    }


