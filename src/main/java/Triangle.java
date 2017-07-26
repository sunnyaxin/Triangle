import java.util.ArrayList;

class Triangle {
    private final DrawLine drawLine = new DrawLine();

    Triangle() {
    }

    ArrayList<String> drawTriangle(int n) {
        ArrayList<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(drawLine.drawLine(i, "H"));
        }
        return list;
    }
}