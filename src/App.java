import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        int[] fält = {1,2,2,15,7,9,6,3,8,4};
        for (int i = 0; i < fält.length; i++) {
            System.out.println(fält[i]);
        }
        System.out.println();
        skriv_ut_array(fält);
        System.out.println();
        int svar = antal_över_8(fält);
        System.out.println("Antal värden som är mer än 8: "+svar);
        System.out.print("Skriv in tal att hitta: ");
        int tal1 = tangentbord.nextInt();
        tangentbord.nextLine();
        int svar2 = hitta_tal(fält, tal1);
        System.out.println("Index för talet (om talet inte hittades = -1): "+svar2);
        System.out.print("Fyll in index där talet finns: ");
        int indexTal1 = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Fyll in index för dit talet ska flyttas: ");
        int indexTal2 = tangentbord.nextInt();
        tangentbord.nextLine();
        byta_plats(fält, indexTal1, indexTal2);
        System.out.println();
        nollställ_array(fält);
        tangentbord.close();
    }
    static void skriv_ut_array(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    static int antal_över_8(int[]array){
        int antal_värden = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j]>8) {
                antal_värden++;
            }
        }
        return antal_värden;
    }
    static int hitta_tal(int[] array, int talet){
        int index_tal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==talet) {
                index_tal = i;
            }
        }
        if (index_tal==0) {
            index_tal = -1;
        }
        return index_tal;
    }
    static void byta_plats(int[] array, int index1, int index2){
        int byte1 = array[index1];
        int byte2 = array[index2];
        array[index1] = 0;
        array[index2] = 0;
        array[index2] = byte1;
        array[index1] = byte2;
        skriv_ut_array(array);
    }
    static void nollställ_array(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        skriv_ut_array(array);
    }
}
