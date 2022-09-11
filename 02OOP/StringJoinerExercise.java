import java.util.StringJoiner;

public class StringJoinerExercise {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "Test pass" : "Test fail");
    }
    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        var sj = new StringJoiner(", ", "SELECT ", " FROM " + table);
        for (String field : fields) {
            sj.add(field);
        }
        return sj.toString();
    }

}