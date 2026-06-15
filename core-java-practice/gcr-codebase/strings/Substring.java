import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int st = sc.nextInt();
        int end = sc.nextInt();
        String sb = "";
        for (int i = st; i < end; i++) {
            sb += s.charAt(i);
        }
        String sb2 = s.substring(st, end);
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb.equals(sb2));
        sc.close();
    }
}
