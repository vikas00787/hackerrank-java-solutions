class Result {

    public static long aVeryBigSum(List<Long> ar) {
        
        long sum = 0;

        for(int i = 0; i < ar.size(); i++){
            sum = sum + ar.get(i);
        }

        return sum;
    }

}
//second Soluation 
class Result {

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        for(long num : ar){
            sum += num;
        }

        return sum;
    }

}

//third Soluation
class Result {

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        for(Long num : ar){
            sum = sum + num;
        }

        return sum;
    }

}
