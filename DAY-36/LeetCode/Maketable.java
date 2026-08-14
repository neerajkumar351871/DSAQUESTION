
class Maketable {

    public static void addTableData(
            int srno,
            String name,
            int age,
            String city,
            String course,
            float marks,
            String id) {

        System.out.printf(
                "| %-5d | %-15s | %-5d | %-15s | %-10s | %-8.2f | %-8s |%n",
                srno, name, age, city, course, marks, id
        );
    }

    public static void main(String[] args) {

        // Table Heading
        System.out.println("+-------+-----------------+-------+-----------------+------------+----------+----------+");
        System.out.println("| SrNo  | Name            | Age   | City            | Course     | Marks    | ID       |");
        System.out.println("+-------+-----------------+-------+-----------------+------------+----------+----------+");

        // Data
        addTableData(1, "Neeraj", 23, "Noida", "MCA", 99.9f, "101");
        addTableData(2, "Rahul Kumar", 22, "Delhi", "BCA", 85.5f, "102");
        addTableData(3, "Amit", 24, "Ghaziabad", "MCA", 91.25f, "103");
        addTableData(4, "Rohit Singh", 23, "Meerut", "BCA", 78.6f, "104");
        addTableData(5, "Sumit", 21, "Noida", "MCA", 88.4f, "105");
         addTableData(6, "Harshika", 21, "Noida utter pradesh", "BED COUR", 88.4f, "105");

        System.out.println("+-------+-----------------+-------+-----------------+------------+----------+----------+");
    }
}
