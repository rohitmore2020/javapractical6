

public class pattern2 {
    
    public void pattern(int size){
        for(int ln = 1 ; ln <= size ; ln++){
            for(int spaces = size - ln ; spaces >0 ; spaces--){
                System.out.print(" ");
            }
            for(int sign = 1 ; sign <= 2*ln - 1 ; sign++){
                if((sign + ln ) %2 == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print("+");
                }

            }
            System.out.print("\n");
        }
        for(int ln = size; ln >= 1 ; ln --){
            for(int spaces = size - ln ; spaces >0 ; spaces--){
                System.out.print(" ");
            }

            for(int sign = 1 ; sign <= 2*ln - 1 ; sign++){
                if((sign + ln )%2 == 0){
                    System.out.print("+");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String a[]){
        pattern2 p = new pattern2();

        p.pattern(5);
    }
}
