
class oddEven {

    public static void checkevenodd(int n)
    { int bitmask=1;
      if((n&bitmask) ==0)
      {
        System.out.println("EVEN");
      }
      else
      {
        System.out.println("ODD");
      }
    }

    public static void main(String args[]) {
        checkevenodd(9);

    }
}
