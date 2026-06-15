public class CollinearityChecker {
    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        boolean collinearBySlope = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Points A(2,4), B(4,6), C(6,8)");
        System.out.println("Collinear by slope formula: " + collinearBySlope);
        System.out.println("Collinear by area formula: " + collinearByArea);
    }

    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeABx = x2 - x1;
        int slopeABy = y2 - y1;
        int slopeBCx = x3 - x2;
        int slopeBCy = y3 - y2;
        return slopeABx * slopeBCy == slopeABy * slopeBCx;
    }

    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area2 = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area2 == 0;
    }
}
