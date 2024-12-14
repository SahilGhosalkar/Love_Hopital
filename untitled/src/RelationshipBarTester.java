public class RelationshipBarTester {
    public static void main(String[] args) {
        RelationshipBar rb = new RelationshipBar(50);
        RedFlag red1 = new RedFlag("ghosting",-5);
        red1.setMagnitude(-5);
        RedFlag red2 = new RedFlag("no flowers",-20);
        red2.setMagnitude(-20);

        rb.addFlagImpact(red1);
        System.out.println(rb);
        rb.addFlagImpact(red2);
        System.out.println(rb);

    }
}
