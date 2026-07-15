class power
{  public static int Ispower(int base , int power)
{
  if(power==0)
  {
    return 1;
   
  }
    return base*Ispower(base, power-1);
}
    public static void main(String args[])
    {
        int base=2;
        int powers=10;
        System.out.println(Ispower(base,powers));
    }
}