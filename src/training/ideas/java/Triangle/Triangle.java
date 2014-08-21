package training.ideas.java.Triangle;
public class Triangle
{
    public static String triangleTypes(double angle1, double angle2, double angle3)
    {

        String output = "";
        if (angle1 + angle2 + angle3 < 180 || angle1==0 || angle2==0 ||angle3==0 )
        {
            return output = "This is not a triangle";
        }
        if (angle1 != angle2 && angle2 != angle3 && angle1!=angle3)
        {
            return output = "Normal";
        }
        if (angle1 == angle2 || angle2 == angle3 || angle1==angle3)
        {
            if (angle1 == angle2 && angle2 == angle3 && angle1==angle3)
            {
                return output = "Equilateral";
            }
            if(angle1==90 || angle2==90 || angle3==90){
                return output="RightAngle";
            }
            return output = "Isosceles";
        }
        return output;
    }
}




































