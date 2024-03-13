public class App {
    public static void main(String[] args) throws Exception {
        int[] fält = {1,2,2,15,7,9,6,3,8,4};
        for (int i = 0; i < fält.length; i++) {
            System.out.println(fält[i]);
        }
        System.out.println();
        skriv_ut_array(fält);
        System.out.println();
        antal_över_8(fält);
    }
    static void skriv_ut_array(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    static void antal_över_8(int[]arrayen){
        for (int j = 0; j < arrayen.length; j++) {
            if (arrayen[j]>8) {
                System.out.println(arrayen[j]);
            }
        }
    }
}
