public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        checkFrequency(arr);
    }

    private static void checkFrequency(int[] arr) {
        int count = 0;
        int check = 4;
        for(int i = 0; i < arr.length; i++){
            boolean numberTheSame = checkTheNumber(check, arr[i]);
            if(numberTheSame){
                String theSame = String.valueOf(arr[i]);
                String theCheck = String.valueOf(check);
                count = checkToSeeIfItIsDoubleNumber(count, theCheck, theSame);
            }
        }
        System.out.println("\nThis is count: " + count);
    }

    private static int checkToSeeIfItIsDoubleNumber(int count, String check, String theSame) {
        String[] str = theSame.split("");
        for(int i = 0; i < str.length; i++){
            if(check.equals(str[i])){
                count++;
            }
        }
        return count;
    }

    private static boolean checkTheNumber(int check, int i) {
        while(i > 0){
            if(i % 10 == check){
                return true;
            }
            i = i/10;
        }
        return false;
    }
}
