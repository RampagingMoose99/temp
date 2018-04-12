import junit.framework.TestCase;
import org.junit.Assert;

public class BidirectionalMapTest extends TestCase {

    public void testRemove() {
         BidirectionalMap<String,String> test = new BidirectionalMap<>();
         test.put("a", "999");
         test.remove("a");
         Assert.assertNull(test.getKey("999"));
         Assert.assertNull(test.get("a"));
    }

    public void testRemove1() {
        BidirectionalMap<String,String> test = new BidirectionalMap<>();
        test.put("a", "999");
        test.remove("a","999");
        Assert.assertNull(test.getKey("999"));
        Assert.assertNull(test.get("a"));

    }

    public void testReplace() {
        BidirectionalMap<String,String> test = new BidirectionalMap<>();
        test.put("a", "999");
        test.replace("a", "56");
        Assert.assertNull(test.getKey("999"));
        Assert.assertEquals(test.get("a"),"56");
    }

    public void testReplace1() {
        BidirectionalMap<String,String> test = new BidirectionalMap<>();
        test.put("a", "999");
        test.replace("a","999" ,"56");
        Assert.assertNull(test.getKey("999"));
        Assert.assertEquals(test.get("a"),"56");
    }

    public void testPut() {
        BidirectionalMap<String,String> test = new BidirectionalMap<>();
        test.put("a", "999");
        Assert.assertEquals(test.get("a"),"999");
        Assert.assertEquals(test.getKey("999"),"a");
    }

    public void testGetKey() {
        BidirectionalMap<String,String> test = new BidirectionalMap<>();
        test.put("a", "999");
        Assert.assertEquals(test.getKey("999"),"a");
    }
}