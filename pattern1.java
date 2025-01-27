
public class pattern1 {
    public void pattern(int size){
        for(int ln = 1 ; ln <= size ; ln++){
            for(int spaces = size - ln ; spaces >0 ; spaces--){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= 2*ln - 1 ; star ++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int ln = size-1 ; ln >= 1 ; ln --){
            for(int spaces = size - ln ; spaces >0 ; spaces--){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= 2*ln - 1 ; star ++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String a[]){
        pattern1 p = new pattern1();

        p.pattern(5);
    }
}
