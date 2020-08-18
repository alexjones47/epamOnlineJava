package by.javaonline.module1;

/*
   Даны два угла треугольника (в градусах). Определить, существует ли такой
   треугольник, и если да, то будет ли он прямоугольный.
*/

public class ConditionTask1 {
    public static void main(String[] args) {

        double firstAngle;
        double secondAngle;
        boolean isTriangleExist;
        boolean isTriangleRight;

        firstAngle = 137.8;
        secondAngle = 37.3;
        isTriangleExist = false;
        isTriangleRight = false;

        if ((firstAngle + secondAngle) < 180) {
            isTriangleExist = true;
            if ((firstAngle + secondAngle) == 90 || firstAngle == 90 || secondAngle == 90 ) {
                isTriangleRight = true;
            }
        }

        System.out.println("Is this triangle exist " + isTriangleExist);
        System.out.println("Is this triangle right " + isTriangleRight);
    }
}
