
public class Main {
    public static void main(String args[]) {

        BidirectionalMap<String, String> testBi = new BidirectionalMap<>();

        testBi.put("a", "3");
        testBi.put("b", "8");
        testBi.put("c", "35");
        testBi.put("d", "79");


        System.out.println(testBi.toString());
        System.out.println(testBi.getKey("8"));

        testBi.remove("b", "8");
        System.out.println(testBi.toString() + testBi.inverseMapToString());

        testBi.remove("a");
        System.out.println(testBi.toString() + testBi.inverseMapToString());

        testBi.replace("c", "999");
        System.out.println(testBi.toString() + testBi.inverseMapToString());


    }
}
