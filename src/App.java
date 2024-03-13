public class App {
    public static void main(String[] args) throws Exception {
        int[] fält = {1,2,2,15,7,9,6,3,8,4};
        for (int i = 0; i < fält.length; i++) {
            System.out.println(fält[i]);
        }
        System.out.println();
        skriv_ut_array(fält);
    }
    static void skriv_ut_array(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
