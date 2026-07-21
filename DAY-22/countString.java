class countString
{   
    public static int counterString(String str, int i)
{  int counter=0;
 // BASE CASE.
 if(str.charAt(i) ==' ')
{
    return 0;
} 
return 1+counterString(str,i+1);

}
    public static void main(String args[])
    {
        String ch="NEERAJ ";
        System.out.println(counterString(ch,0));

    }
}