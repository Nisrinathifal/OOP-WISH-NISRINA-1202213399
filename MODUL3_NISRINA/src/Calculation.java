public class Calculation implements Runnable {
    double radius;
    double side;
    double area;
    double phi = 3.14;
  
    public double getRadius() {
      return radius;
    }
    public void setRadius(double radius) {
      this.radius = radius;
    }
    public double getSide() {
      return side;
    }
    public void setSide(double side) {
      this.side = side;
    }
    public double getArea() {
      return area;
    }
    public void setArea(double area) {
      this.area = area;
    }
    public double getPhi() {
      return phi;
    }

    public void setSquare(double side) throws IllegalArgumentException {
      if (side < 1) {
        throw new IllegalArgumentException("Side nmust be higher than or equal to 1 (>=1)");
      }
      this.area = side * side;
    }

    public double getSquare() {
      return this.area;
    }
  
    public void setCircle(double radius) throws IllegalArgumentException {
      if (radius < 1) {
        throw new IllegalArgumentException("Radius must be >=1");
      }
      this.area = phi*radius*radius;
    }
    public double getCircle() {
      return this.area;
    }
  
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
      if (a < 1 || b < 1 || t < 1) {
        throw new IllegalArgumentException("Sides and height must be greater than orr equal to");
      }
      this.area = ((a+b)*t)/2;
    }
    public double getTrapezoid() {
      return this.area;
    }
  
    @Override
    public void run() {
      System.out.println("\n==========Your Program Result==========");
      for (int i = 3; i > 0; i--) {
        try {
          System.out.println("Result show in "+i);
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println("Error");
        }
      }
    }
  }