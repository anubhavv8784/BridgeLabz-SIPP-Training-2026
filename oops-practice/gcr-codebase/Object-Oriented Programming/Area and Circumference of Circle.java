class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println("Area = " + c.calculateArea());
        System.out.println("Circumference = " + c.calculateCircumference());
    }
}