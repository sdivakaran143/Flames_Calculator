import flames.*;
import java.util.*;
public class prgmspcl {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        find_flames obj=new find_flames();
        System.out.print("Enter your Name : ");
        String str1 = in.nextLine();
        System.out.print("Enter her/him Name : ");
        String str2 = in.nextLine();
        System.out.println();
        String newstr = obj.getstring(str1, str2);
        int len = newstr.length();
        obj.output(len);
        System.out.println();

    }
}
