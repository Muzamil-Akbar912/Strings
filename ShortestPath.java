public class ShortestPath {
    public static float shortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            // East..
            if (dir == 'E') {
                x++;
            }
            // West...
            else if (dir == 'W') {
                x--;
            }
            // North...
            else if (dir == 'N') {
                y++;
            }
            // South...
            else {
                y--;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("The shortest path from origin to destination = " + shortestPath(path));
    }
}
