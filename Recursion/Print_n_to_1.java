public class Print_n_to_1 {

    public static void printnum(int n){
        if(n>0){
            System.out.println(n);
            printnum(n-1);
        }
    }
    public static void main(String argsa[]){
        printnum(5);
    }
}
