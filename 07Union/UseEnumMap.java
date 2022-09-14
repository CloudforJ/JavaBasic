import java.time.DayOfWeek;
import java.util.*;

public class UseEnumMap {
    public static void main(String[] args) {
        Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "zhou yi");
        map.put(DayOfWeek.TUESDAY, "zhou er");
        map.put(DayOfWeek.WEDNESDAY, "zhou san");
        map.put(DayOfWeek.THURSDAY, "zhou si");
        map.put(DayOfWeek.FRIDAY, "zhou wu");
        map.put(DayOfWeek.SATURDAY, "zhou liu");
        map.put(DayOfWeek.SUNDAY, "zhou ri");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
    }
}