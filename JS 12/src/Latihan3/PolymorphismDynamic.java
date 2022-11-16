package Latihan3;

    class Bank {
        float sukuBunga(){
            return 0;
        }
    }

    class BRI extends Bank{
            // overriding sukuBunga method
            float sukuBunga(){
                return 5.5f;
            }
        }

    class BNI extends Bank{
            float sukuBunga(){
                // overriding sukuBunga method
                return 10.6f;
            }
        }

    class Mandiri extends Bank{
            float sukuBunga(){
                // overriding sukuBunga method
                return 9.4f;
            }
        }

    class PolymorphismDynamic{
        public static void main(String[] args) {
            // Creating Variabel Of Bank Class
            Bank B;
            B = new BRI();
            System.out.println("Tingkat Suku Bunga BRI adalah : " + B.sukuBunga());
            B = new BNI();
            System.out.println("Tingkat Suku Bunga BNI adalah : " + B.sukuBunga());
            B = new Mandiri();
            System.out.println("Tingkat Suku Bunga Mandiri adalah : " + B.sukuBunga());
        }
    }
