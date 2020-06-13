import org.junit.Test;

import static org.junit.Assert.*;

public class SILab2Test {

    @Test(testName = "test1", description = "testing purposes")
    public void getObjectTest() throws Exception {
        Object object;
        Assert.assertNotNull(object);
    }

     @Test
     public void test22() {
         assertEquals(SILab2.function(null), false);
         assertEquals(SILab2.function(!null), true);

     }
 }