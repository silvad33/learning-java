/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author dsilva
 */
public class Lab11 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    }
    public class Shape
    {
        private    int x, y;    // Coordinates of Shape

        // Constructor
        public Shape( int x, int y )
        {
            this.x = x;
            this.y = y;
        }

        // Set X Coordinate
        public void setX( int x )
        {
            this.x = x;
        }

        // Set Y Coordinate
        public void setY( int y )
        {
            this.y = y; 
        }

        // Get X Coordinate
        public int GetX()
        {
            return this.x;
        }

        // Get Y Coordinate
        public int GetY()
        {
            return this.y;
        }
    }
    class TwoDimensionalShape extends Shape
    {
        int   dimension1;
        int   dimension2;
        public TwoDimensionalShape( int x, int y, int d1, int d2 )
        {
            super( x, y );     // Call constructor of superclass
            this.dimension1 = d1;
            this.dimension2 = d2;
        }
        public void setDimension1( int d1 )
        {
            this.dimension1 = d1;
        }
        public void setDimension2( int d2 )
        {
            this.dimension2 = d2;
        }
        public int getDimension1()
        {
            return this.dimension1;
        }
        public int getDimension2()
        {
            return this.dimension2;
        }
    }
    class Circle extends TwoDimensionalShape
    {
        public Circle(int x, int y, int d1) 
        {
            super(x, y, d1);
        }
        public double getArea()
        {
            double area;
            int radius = getDimension1();
            
            area = Math.PI * radius * radius;         
            return area;
        }
        public void setRadius(int newRadius)
        {
            this.dimension1 = newRadius;
        }
    }
        class Rectangle extends TwoDimensionalShape
    {
        public Rectangle(int x, int y, int d1, int d2) 
        {
            super(x, y, d1, d2);
        }
        public double getArea()
        {
            double newArea;
            int radius = getDimension1();
            
            newArea = Math.PI * radius * radius;         
            return newArea;
        }
        public void setRadius(int newRadius)
        {
            this.dimension1 = newRadius;
        }
    }
    public class ShapeTest 
    {
        public void main( String[] args ) 
    {
        Circle      c = new Circle( 1, 1, 5 );
        Rectangle   r = new Rectangle( 1, 1, 4, 3 );
      
        System.out.println( "Area of the Circle is " + c.getArea());
        System.out.println( "Area of the Rectangle is " + r.getArea());
    }   
    }

}
