import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sum = new StringBuilder();
        for (int digit : digits) {
            sum.append(digit);
        }
        BigInteger kami = new BigInteger(sum.toString());
        kami = kami.add(BigInteger.ONE);
        String osairum = kami.toString();
        int[] jav = new int[osairum.length()];
        for (int i = 0; i < osairum.length(); i++) {
            jav[i] = osairum.charAt(i) - '0';
        }
        return jav;
    }
}
