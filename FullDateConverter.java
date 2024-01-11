import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FullDateConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input (formate:YYYY-MM-DD): ");
        String shortDate = input.next();

        String[] date = shortDate.split("-");
        String nameMonth = convertToNameMonth(date[1]);
        System.out.println(nameMonth + " " + date[2] + "," + date[0]);

    }

    public static String convertToNameMonth(String numMonth) {
        HashMap<String, String> month = new HashMap<>();
        month.put("01", "January");
        month.put("02", "February");
        month.put("03", "March");
        month.put("04", "April");
        month.put("05", "May");
        month.put("06", "June");
        month.put("07", "July");
        month.put("08", "August");
        month.put("09", "September");
        month.put("10", "October");
        month.put("11", "November");
        month.put("12", "December");

        if (month.containsKey(numMonth)) {
            return month.get(numMonth);
        }
        return null;
    }
}
