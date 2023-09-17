package String;

public class ZeroMatriz {
    public void zeroMatrizSolution(int[][] matriz){
        boolean firstRowHasZero = hasFirstRowAnyZeroes(matriz);
        boolean firstColHasZero = hasFirstColAnyZeroes(matriz);

        checkForZeroes(matriz);

        processToZeroRow(matriz);
        processToZeroCol(matriz);

        if(firstRowHasZero){
            setZeroToRow(matriz, 0);
        }

        if(firstColHasZero){
            setZeroToCol(matriz,0);
        }

    }

    public boolean hasFirstRowAnyZeroes(int[][] matriz){
        for(int col = 0; col < matriz[0].length; col++){
            if(matriz[0][col] == 0){
                return true;
            }
        }

        return false;
    }

    public boolean hasFirstColAnyZeroes(int[][] matriz){
        for(int row = 0; row < matriz.length; row++){
            if(matriz[row][0] == 0){
                return true;
            }
        }

        return false;
    }

    public void checkForZeroes(int[][] matriz){
        for(int row = 1; row < matriz.length; row++){
            for(int col = 1; col < matriz[0].length; col++){
                if(matriz[row][col] == 0){
                    matriz[row][0] = 0;
                    matriz[0][col] = 0;
                }
            }
        }
    }

    public void processToZeroRow(int[][] matriz){
        for(int row = 0; row < matriz.length; row++){
            if(matriz[row][0] == 0){
                setZeroToRow(matriz, row);
            }
        }
    }

    private void setZeroToRow(int[][] matriz, int row){
        for (int col = 0; col < matriz[0].length; col++){
            matriz[row][col] = 0;
        }
    }

    public void processToZeroCol(int[][] matriz){
        for(int col = 0; col < matriz[0].length; col++){
            if(matriz[0][col] == 0){
                setZeroToCol(matriz, col);
            }
        }
    }

    private void setZeroToCol(int[][] matriz, int col) {
        for(int row = 0; row < matriz.length; row++){
            matriz[row][col] = 0;
        }
    }


}
