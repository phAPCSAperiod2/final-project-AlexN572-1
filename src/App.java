public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Assignment math = new Assignment("Mini Quiz", 5, 4, 5, 2);
        Assignment CSP = new Assignment("CSP FRQ", 5, 4, 5, 2);
        Assignment apes = new Assignment("Unit 7 Test", 5, 4, 5, 2);

        Day april5th = new Day("4/5");
        april5th.addAssignment(math);
        april5th.addAssignment(CSP);
        april5th.addAssignment(apes);

        System.out.println(april5th.toString());
    }
}
