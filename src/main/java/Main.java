public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        checkFrequency(arr);
    }

    private static void checkFrequency(int[] arr) {
        int check = 4;
        for(int i = 0; i < arr.length; i++){
            boolean numberTheSame = checkTheNumber(check, arr[i]);
            if(numberTheSame){
                System.out.print(arr[i] + " ");
            }
        }
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
