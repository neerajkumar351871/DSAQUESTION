
class compareString {

    public static void main(String args[]) {
        String s1 = "TONY";
        String s2 = "TONY";
        String s3 = new String("TONY");

        // FRIST COMPARE STRING.
        // RETRUN TRUE.
        if (s1 == s2) {
            System.out.println("STRING ARE EQUAL");
        } else {
            System.out.println("STRING ARE NOT EQUAL");
        }

        //SECOND COMPARE   DRAW BACK USE .EQUAL().
        // RETURN FALSE.
        if (s1 == s3) {
            System.out.println("STRING ARE EQUAL");
        } else {
            System.out.println("STRING ARE NOT EQUAL");
        }

        // USE EQUAL FUNCION.
        // RETURN TRUE.
        if (s1.equals(s3)) {
            System.out.println("STRING ARE EQUAL");
        } else {
            System.out.println("STRING ARE NOT EQUAL");
        }
    }
}
