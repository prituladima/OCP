package module1;

import java.io.IOException;

public class Enums {

    public enum Season {
        WINTER, SPRING, SUMMER, FALL;

        Season() {//may be public mya be package private
            //but can be initialized
        }
    }

    public enum Season2 {
        WINTER {

//            public static void p (){}//will not compile
            public void printHours() {


                System.out.println("9am-3pm");
            }
        }, SPRING {
            public void printHours() {
                System.out.println("9am-5pm");
            }
        }, SUMMER {
            public void printHours() {
                System.out.println("9am-7pm");
            }
        }, FALL {
            public void printHours(){
                System.out.println("9am-5pm");
            }
        };

        public abstract void printHours() ;
    }

    public enum Season3 {
        WINTER {
            public void printHours() { System.out.println("short hours"); }
        }, SUMMER {
            public void printHours() { System.out.println("long hours"); }
        }, SPRING, FALL;
        public void printHours() { System.out.println("default hours"); }
    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

//        new Season();ERROR

        Season s1 = Season.valueOf("SUMMER");
//        Season s2 = Season.valueOf("SUMME");

        Season2.FALL.printHours();
    }

}
