class creat
{
    public static void addvalue()
    {
        StringBuilder  str= new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            str.append(ch+" ");//  this function are used add the  value end of string.
        }
        System.out.println(str);
    }

  public static void main(String args[])
  {
    StringBuilder str= new StringBuilder("Welcome");// This is work with object.
    System.out.println(str.toString());// toString(). are used to  convert the string.
    addvalue();
  }
}