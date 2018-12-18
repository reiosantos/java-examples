class ReverseInteger {

    int reverseInteger(int number) {
        int sign = Integer.signum(number);
        number = number * sign;

        String num =Integer.toString(number);
        StringBuilder output = new StringBuilder();
        for (int i = num.length()-1; i >= 0; i--) {
            output.append(num.charAt(i));
        }
        return sign * Integer.parseInt(output.toString());
    }
}
