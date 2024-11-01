import java.util.Scanner;

public class Main {
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int i;

    if(x % 2 == 0){
        for(i=1 ; i!=x+1 ; i=i+2){
            System.out.printf("%d%n", i);
        }
    }else{
        for(i=1 ; i!=x ; i=i+2){
              System.out.printf("%d%n", i);
        }
        System.out.printf("%d%n", i);
    }
    sc.close();
  }
}
