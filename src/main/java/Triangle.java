import java.util.ArrayList;

class Triangle {
    Triangle() {
    }

    String drawEasiest() {
        return "*";
    }

    String drawLine(int n, String type) {
        String content = getContent(type);
        StringBuilder stringBuilder = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            stringBuilder.append(content);
        }
        return stringBuilder.toString();
    }

    private String getContent(String type) {
        if (type.equals("H"))
            return "*";
        return "*/n";
    }

    ArrayList<String> drawTriangle(int n) {
        ArrayList<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(drawLine(i, "H"));
        }
        return list;
    }
}