import java.util.ArrayList;
import java.util.Scanner;
public class Lab_11_Listmaker {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        ArrayList<String> customAList = new ArrayList<>();
        String resp = SafeInput.getRegExString(userIn, "A D P Q", "A", "D", "P", "Q");
        if (resp == "A") {
            String item = SafeInput.getNonZeroLenString(userIn,"Please input your addition: ");
            customAList.add(item);
        }
    }
}