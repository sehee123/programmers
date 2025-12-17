class Solution {
    public String solution(String polynomial) {
      
         int[] result = {0, 0};
        String[] arr = polynomial.split(" ");

        for (String str : arr) {
            if (str.equals("+")) continue;

            if (str.contains("x")) {
                if (str.equals("x")) result[0]++;
                else result[0] += Integer.parseInt(str.substring(0, str.length() - 1));
            } else {
                result[1] += Integer.parseInt(str);
            }
        }

        String xPart = (result[0] == 1) ? "x" : result[0] + "x";

        if (result[0] == 0) return String.valueOf(result[1]);
        if (result[1] == 0) return xPart;
        return xPart + " + " + result[1];
    }
}