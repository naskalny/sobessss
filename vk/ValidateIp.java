package vk;
import java.util.regex.*;

public class ValidateIp {
    public String validIPAddress(String queryIP) {
        String ipv4Pattern = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
        String ipv6Pattern = "^([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4})$";
        Pattern ipv4 = Pattern.compile(ipv4Pattern);
        Pattern ipv6 = Pattern.compile(ipv6Pattern);

        Matcher matcherIPv4 = ipv4.matcher(queryIP);
        Matcher matcherIPv6 = ipv6.matcher(queryIP);

        if (matcherIPv4.matches()) {
            return "IPv4";
        } else if (matcherIPv6.matches()) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}
