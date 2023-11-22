package ModelUnitTest;

import Model.Rider;
import org.junit.jupiter.api.*;
public class RiderUnitTest {
    static Rider r1;
    double Answer;
    @BeforeAll
    public static  void CreateRider() {
        r1=new Rider("Joy","Sri Lanka",25,78,175);
    }
    @BeforeEach
    public void SetValues(){
        Answer=r1.calBMI(r1.weight,r1.height);
    }
    @Test
    public  void TestBMI(){
        Assertions.assertEquals(0.00254,Answer,0.00001);
    }
    @AfterEach
    public void CleanRiderDetails(){
        r1.weight=0;
        r1.height=0;
        Answer=0;
    }
    @AfterAll
    public static void DeleterRider(){
        r1=null;
    }
}
