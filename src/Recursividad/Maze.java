package Recursividad;

public class Maze {
    private final int TRIED = 3; // Valor de prueba
    private final int PATH = 7;  // Valor solución

    private int[][] grid = {
        {1, 0, 0, 0, 1, 0, 0, 0},
        {1, 0, 0, 0, 1, 0, 0, 0},
        {1, 1, 0, 0, 1, 1, 0, 0},
        {1, 1, 1, 1, 1, 0, 0, 0},
        {1, 0, 0, 0, 1, 1, 1, 1}
    };

    public boolean trasverse(int row, int column) {
        boolean done = false;

        if (valid(row, column)) {
            grid[row][column] = TRIED;
            if (row == grid.length - 1 && column == grid[0].length - 1) {
                done = true;
            } else {
                done = trasverse(row + 1, column); // Abajo
                if (!done) {
                    done = trasverse(row, column + 1); // Derecha
                    if (!done) {
                        done = trasverse(row - 1, column); // Arriba
                        if (!done) {
                            done = trasverse(row, column - 1); // Izquierda
                        }
                    }
                }
            }
            if (done) {
                grid[row][column] = PATH;
            }
        }
        return done;
    }

    private boolean valid(int row, int column) {
        boolean result = false;
        if (row >= 0 && row < grid.length && column >= 0 && column < grid[row].length) {
            if (grid[row][column] == 1) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "\n";
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                result += grid[row][column] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
