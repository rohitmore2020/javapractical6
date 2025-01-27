
public class pattern3 {
    public void pattern(int size){
        for(int ln = 1 ; ln <= size ; ln++){
            for(int spaces = size - ln ; spaces >0 ; spaces--){
                System.out.print(" ");
            }
            for(int sign = 1 ; sign <= 2*ln - 1 ; sign ++){
                if(sign %2 == 0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("+");
                }
            }
            System.out.print("\n");
        }
        for(int ln = size-1 ; ln >= 1 ; ln --){
            for(int spaces = size - ln ; spaces >0 ; spaces--){
                System.out.print(" ");
            }
            for(int sign = 1 ; sign <= 2*ln - 1 ; sign ++){
                if(sign %2 == 0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String a[]){
        pattern3 p = new pattern3();

        p.pattern(8);
    }
}