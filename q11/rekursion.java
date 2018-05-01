/**
 * rekursion
 */ 
public class rekursion {
    public static void main(String[] args) {
        // Rekursion
        System.out.println(add(5,25));
        System.out.println(add(-3, 32));
        System.out.println(add(7, -6));
        System.out.println(mult(2, 5));
        System.out.println(mult(-3, 7));
        System.out.println(mult(3, -8));
        System.out.println(potenz(5,2));
        System.out.println(potenz(-2,3));
        System.out.println(potenz(4, -2));
        System.out.println(fak(4));
        System.out.println(ggT(36,9));
        System.out.println(fib(8));
    }

    // Rekursion
    public static int add(int a, int b) {
        if (b<0) {
            if (b==0) {
                return a;
            } else {
                return add(--a, ++b);
            }
        } 
        else{
            if (b==0) {
                return a;
            } else {
                return add(++a, --b);
            }
        }
    }

    public static int mult(int a, int b) {
        if (b<0) {
            int c=a;
            a=b;
            b=c;
        }
        if (b==1) {
            return a;
        } else {
            return a+mult(a, --b);
        }
    }

    public static double potenz(double a, double b) {
        if (b<0) {
            if (b==0) {
                return 1;
            } else {
                return 1/a*potenz(a, ++b);
            }
        } else {
            if (b==0) {
                return 1; 
            } else {
                return a*potenz(a, --b);
            }
        }
    }

    public static int fak(int a) {
        if(a==1){
            return a;
        } else{
            return a*fak(--a);
        }
    }

    public static int ggT(int a, int b) {
        if (b>a) {
            int c=a;
            a=b;
            b=c;
        }
        if (a%b==0) {
            return b;
        } else {
            return ggT(b, a%b);
        }
    }

    public static int fib(int a) {
        if (a<=2) {
            return 1;
        } else {
          return fib(a-2)+fib(a-1);
        }
    }
}