import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isPathCrossing(String path) {

        List<String> s = new ArrayList<String>();
        int x = 0;
        int y = 0;
        s.add(String.valueOf(x) + "," + String.valueOf(y));

        for (int i = 0; i < path.length(); i++) {

            System.out.println(s.toString());

            if (path.charAt(i) == 'N') {
                y++;
            }
            if (path.charAt(i) == 'S') {
                y--;
            }
            if (path.charAt(i) == 'E') {
                x--;
            }
            if (path.charAt(i) == 'W') {
                x++;
            }
            if (s.contains(String.valueOf(x) + "," + String.valueOf(y))) {
                return true;
            }
            s.add(String.valueOf(x) + "," + String.valueOf(y));
        }

        return false;

    }
}