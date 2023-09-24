public class Ejercicio45 {
    public static void main(String[] args) {
        int[][] matriz = new int[9][7];

        matriz = rellenarMatrizUnos(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static int[][] rellenarMatrizUnos(int[][] matriz){
        int n = matriz.length;
        int a = 0;
        for(int j = 0; j < (n-2); j++){
            for(int i = 0; i < n; i++){
                if(j == 0 || j == (n-3)){
                    matriz[i][j] = 1;
                }
                else if(i >= (n-6-a) && i < (6+a)){
                    matriz[i][j] = 0;
                }
                else{
                   matriz[i][j] = 1;
                }
            }
            if(j >= (matriz[0].length/2)){
                a--;
            }
            else if(j != 0 ){
                a++;
            }
        }

        return matriz;
    }
}
