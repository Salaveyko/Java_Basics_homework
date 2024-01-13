public class MachineMathmatics {
    public static void main(String[] args) {

        //TASK 1
        double pi = Math.PI;
        double ei = Math.E;

        System.out.println("Task 1:\n" + pi + "\n" + ei);

        //TASK 2
        String str1 = "\n\'From the next line\'";
        String str2 = "\t\'String tabulation\'";
        //String c = "\a\'Unsupported string\'";  - ERROR

        System.out.println("\nTask 2:" + str1 + str2);

        //ADDITIONAL TASK
        char a = '\u0041';
        char l = '\u006c';
        char e = '\u0065';
        char x = '\u0078';

        System.out.println(
                String.format("\nAdditional task:\n%c%c%c%c", a, l, e, x)
        );
    }
}
