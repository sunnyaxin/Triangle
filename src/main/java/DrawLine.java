class DrawLine {
    DrawLine() {
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
}