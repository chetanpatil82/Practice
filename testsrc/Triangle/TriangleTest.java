package Triangle;
import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.Triangle.Triangle;


public class TriangleTest
{
    @Test
    public  void angle_for_equilateral()
    {
        double angle1=60;
        double angle2= 60;
        double angle3=60;
        String triangleOutput= "Equilateral";
        Assert.assertEquals(triangleOutput,Triangle.triangleTypes(angle1,angle2,angle3));
    }
    @Test
    public  void angle_for_normal()
    {
        double angle1=70;
        double angle2= 50;
        double angle3=60;
        String triangleOutput= "Normal";
        Assert.assertEquals(triangleOutput,Triangle.triangleTypes(angle1,angle2,angle3));
    }
    @Test
    public  void angle_for_not_a_triangle()
    {
        double angle1=0;
        double angle2= 90;
        double angle3=90;
        String triangleOutput= "This is not a triangle";
        Assert.assertEquals(triangleOutput,Triangle.triangleTypes(angle1,angle2,angle3));
    }
    @Test
    public  void angle_for_isosceles()
    {
        double angle1=55;
        double angle2= 55;
        double angle3=70;
        String triangleOutput= "Isosceles";
        Assert.assertEquals(triangleOutput,Triangle.triangleTypes(angle1,angle2,angle3));
    }
    @Test
    public  void angle_for_rightAngle()
    {
        double angle1=90;
        double angle2= 45;
        double angle3=45;
        String triangleOutput= "RightAngle";
        Assert.assertEquals(triangleOutput,Triangle.triangleTypes(angle1,angle2,angle3));
    }
}
