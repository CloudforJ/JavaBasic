public class InsertSb {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "success" : "fail");
    }
    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        var sb = new StringBuilder(1024);
        sb.append("INSERT INTO ").append(table).append(" (");
        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i]);
            if (i< fields.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(") VALUES (");
        for (int i = 0; i < fields.length; i++) {
            sb.append("?");
            if (i < fields.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}