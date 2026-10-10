class Solution {
    public int alternateDigitSum(int n) {
        List<Integer> digitsum = new ArrayList<>();
        int sum = 0;
        boolean decision = true;
        while (n > 0) {
            int a = n % 10;
            n /= 10;
            digitsum.add(a);
        }
        for (int i = digitsum.size()-1; i >=0 ; i--) {
            if (decision) {
                sum += digitsum.get(i);
                decision = false;
            } else {
                sum -=  digitsum.get(i);
                decision = true;
            }
        }
        return sum;
    }
}