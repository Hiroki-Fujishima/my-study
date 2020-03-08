class VarargsSample {
    int getMax(int... nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                max = nums[0];
            }
            if(max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        VarargsSample vt = new VarargsSample();
        System.out.println("(2, 5, 7, 1) 最大値:" + vt.getMax(2,5,7,0,1));
        System.out.println("(100, 54, 1) 最大値:" + vt.getMax(100,54,1));
        System.out.println("(10)         最大値" + vt.getMax(10));
    }
}