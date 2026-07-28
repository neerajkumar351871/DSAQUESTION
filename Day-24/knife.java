
class knife {

    public static void hafpattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void fullpy(int n) {
        for (int i = 0; i < n; i++) {
            // str.
            for (int str = 0; str <= i; str++) {
                System.out.print("*");
            }
            // space.
            for (int spc = 0; spc <= 2 * (n - i); spc++) {
                System.out.print(" ");
            }
            // str.
            for (int str = 0; str <= i; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patterns(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void star(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hafpr(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void charpattern(int n) {
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();

        }
    }
// inverted half pyramid.

    public static void half(int n) {
        for (int i = 0; i < n; i++) {
            // print space.
            for (int sp = 0; sp < (n - i - 1); sp++) {
                System.out.print(" ");
            }
            // print star.
            for (int st = 0; st <= i; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberpry(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void numberprys(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void zeroone(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
    
    public static void stars( int n)
    {
        for(int i=1;i<=n;i++)
        {
            //str.
            for(int str=1;str<=i;str++)
            {
                System.out.print("*");
            }
            // spc;
            for(int spc=1;spc<=(2*(n-i));spc++)
            {
                System.out.print(" ");
            }
              //str.
            for(int str=1;str<=i;str++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


         for(int i=n;i>=1;i--)
        {
            //str.
            for(int str=1;str<=i;str++)
            {
                System.out.print("*");
            }
            // spc;
            for(int spc=1;spc<=(2*(n-i));spc++)
            {
                System.out.print(" ");
            }
              //str.
            for(int str=1;str<=i;str++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static  void solidRombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
             // spc.
             for(int sp=1;sp<=(n-i);sp++)
             {
                System.out.print(" ");
             }
             // str.
             for(int str =1;str<=n;str++)
             {
                System.out.print("*");
             }
             System.out.println();
        
        }
    }
    public static void Dimondpattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // spc.
            for(int sp=1;sp<=(n-i);sp++)
            {
                System.out.print(" ");
            }
            // str.
            for(int str=1;str<=(i+i-1);str++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // Reverse pattern
         for(int i=n;i>=1;i--)
        {
            // spc.
            for(int sp=1;sp<=(n-i);sp++)
            {
                System.out.print(" ");
            }
            // str.
            for(int str=1;str<=(i+i-1);str++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
//hafpattern(5);
// fullpy(10);
//patterns(5);
//star(5);
//hafpr(4);
        //charpattern(4);
        // half(5);
        //numberpry(5);
        //numberprys(5);
//zeroone(5);
//stars(5);
//solidRombus(5);
Dimondpattern(4);
    }
}
