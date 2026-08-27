class leetcode66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // If all digits were 9, we need a new array with leading 1
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
    public static void main(String[] args){
        
        leetcode66 obj = new leetcode66();

       int[] ans = obj.plusOne(new int[]{1,2,3,4,5});

        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}

