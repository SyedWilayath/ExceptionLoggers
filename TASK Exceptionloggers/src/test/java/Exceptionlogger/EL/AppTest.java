package EL.Exceptionloggers;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

// Test for simple App.
public class AppTest 
    extends TestCase
{
     // Creating a test case
     // Parameter testName 
    public AppTest( String testName )
    {
        super( testName );
    }

   
     //  return the suite of tests getting tested
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

// Rigourous Test
    
    public void testApp()
    {
        assertTrue( true );
    }
}
