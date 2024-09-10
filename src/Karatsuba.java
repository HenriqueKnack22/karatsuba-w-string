public class Karatsuba {

    public static String karatsuba(String x, String y) {
        int n = Math.max(x.length(), y.length());
        x = padZeroes(x, n);
        y = padZeroes(y, n);

        if (n == 1) {
            return (x.equals("1") && y.equals("1")) ? "1" : "0";
        }

        int m = n / 2;
        String x1 = x.substring(0, n - m);
        String x0 = x.substring(n - m);
        String y1 = y.substring(0, n - m);
        String y0 = y.substring(n - m);

        String z0 = karatsuba(x0, y0);
        String z1 = karatsuba(addBinary(x0, x1), addBinary(y0, y1));
        String z2 = karatsuba(x1, y1);

        String result = addBinary(addBinary(shiftLeft(z2, 2 * m), shiftLeft(subtractBinary(subtractBinary(z1, z2), z0), m)), z0);
        return result.replaceFirst("^0+(?!$)", "");
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0, i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            carry += (i >= 0 ? a.charAt(i--) - '0' : 0);
            carry += (j >= 0 ? b.charAt(j--) - '0' : 0);
            result.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        return result.reverse().toString();
    }

    public static String subtractBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int borrow = 0, i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int diff = (i >= 0 ? a.charAt(i--) - '0' : 0) - (j >= 0 ? b.charAt(j--) - '0' : 0) - borrow;
            if (diff < 0) {
                diff += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.append(diff);
        }
        return result.reverse().toString().replaceFirst("^0+(?!$)", "");
    }

    public static String shiftLeft(String num, int n) {
        StringBuilder result = new StringBuilder(num);
        for (int i = 0; i < n; i++) {
            result.append('0');
        }
        return result.toString();
    }

    private static String padZeroes(String num, int n) {
        StringBuilder result = new StringBuilder(num);
        while (result.length() < n) {
            result.insert(0, '0');
        }
        return result.toString();
    }
}