package test;

import FirstPackage.FirstClass;
import org.testng.annotations.Test;

public class Test1  extends FirstClass {

    @Test
    public void testmethod(){

        FirstClass obj = new FirstClass();
        obj.launchBrowser();

    }
}
