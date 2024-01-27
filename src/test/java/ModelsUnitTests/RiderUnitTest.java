package ModelsUnitTests;
import Models.Rider;
import org.junit.jupiter.api.*;
public class RiderUnitTest
{
    static Rider r1;
    double answer;
    @BeforeAll
    public static void CreateRider()
    {
        r1=new Rider("Sam","Sri Lanka",25,75.26,173);
    }
    @BeforeEach
    public void SetData()
    {
        answer=r1.calBMI();
    }
    @Test
    public void TestBMI()
    {
        Assertions.assertEquals(75.26,answer);
    }
    @AfterEach
    public void CleanData()
    {
        answer=0;
    }
    @AfterAll
    public static void DeleteRider()
    {
        r1=null;
    }
}
