public class Matriz {
    public static void main(String[] args) {
        int pot = (int) Math.pow(2, 5);
        System.out.println(Math.pow(2, 5));

        int[][] matriz = new int[11][22];

        // matriz = sectoresIterativoNormal(matriz);

        // for (int i = 0; i < matriz.length; i++) {
        // for (int j = 0; j < matriz[0].length; j++) {
        // System.out.print(matriz[i][j] + "\t");
        // }
        // System.out.println();
        // }

        matriz = sectoresIterativoNormal(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(sectoresIterativo(matriz));
    }

    public static int[][] sectoresIterativo(int[][] matriz) {
        int n = matriz.length; // calculamos las filas para hacer la relación
        boolean flag = true; // bandera para saber si llenamos la columna o no
        int e = 0; // indica la cantidad de espacios se deja al inicio y final de la columna

        for (int j = 0; j < (n * 2); j++) {
            for (int i = e; i < (n - e); i++) {
                if (j < n) { // si es la primer mitad de la matriz
                    if (flag == true) {
                        if (j == (n - 1)) {
                            matriz[i][j] = 1;
                        } else {
                            matriz[i][j] = (int) Math.pow(2, (i + e));
                        }
                    }
                } else {
                    if (flag == true) {
                        if (j == n) {
                            matriz[i][j] = 1;
                        } else {
                            matriz[i][j] = (int) Math.pow(2, (i - e));
                        }
                    }
                }

            }

            if (j == n - 1) {
                j -= 2;
            }

            if (j != (n - 1)) {
                flag = !flag;
            }

            if (j < (n - 1) && flag == true) {
                e++;
            } else if (j > n) {
                e--;
            } else {
                e = n / 2;
            }
        }

        return matriz;
    }

    public static int[][] sectores(int[][] matriz) {
        int n = matriz.length; // calculamos las filas para hacer la relación
        int e = 0; // indica la cantidad de espacios se deja al inicio y final de la columna

        for (int j = 0; j < matriz[0].length; j += 2) {
            for (int i = 0; i < n; i++) {
                if (j < n) {
                    if (j == (n - 1)) {
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = (int) Math.pow(2, (i + e));
                    }
                }
            }

            if (j < (n - 1)) {
                e++;
            } else if (j > n) {
                e--;
            } else {
                e = n / 2;
            }
        }
        return matriz;
    }

    public static int[][] sectoresIterativoNormal(int[][] matriz) {
        int n = matriz.length; // calculamos las filas para hacer la relación
        boolean flag = true; // bandera para saber si llenamos la columna o no
        int e = 0; // indica la cantidad de espacios se deja al inicio y final de la columna

        for (int j = 0; j < n; j++) {
            for (int i = e; i < (n - e); i++) {
                if (j < n) { // si es la primer mitad de la matriz
                    if (flag == true) {
                        if (j == (n - 1)) {
                            matriz[i][j] = 1;
                        } else {
                            matriz[i][j] = (int) Math.pow(2, (i + e));
                        }
                    }
                }
            }

            if (j != (n - 1)) {
                flag = !flag;
            }
            if (j < (n - 1) && flag == true) {
                e++;
            }
        }

        e = 0;
        flag = true;

        // for (int j = ((n * 2) - 1); j >= n; j--) {
        //     for (int i = (n - e); i > e; i--) {
        //         if (j == n) {
        //             matriz[i][j] = 1;
        //         } else {
        //             matriz[i][j] = (int) Math.pow(2, (i - e));
        //         }
        //     }

        //     if (j != (n - 1)) {
        //         flag = !flag;
        //     }
        //     if (flag == true) {
        //         e++;
        //     }
        // }

        // arreglar indices de matriz con ((n-1)-i) al recorrer hacia atrás para operar
        // como se debe

        // for (int j = n; j < (n * 2); j++) {
        //     for (int i = e; i < (n - e); i++) {
        //         if (j == n) {
        //             matriz[i][j] = 1;
        //         } else {
        //             matriz[i][j] = (int) Math.pow(2, (i + e));
        //         }
        //     }
        // }

        return matriz;
    }
}
