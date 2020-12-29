package practice.core.gaurov.interview;

import java.util.*;

public class AiloZombieInfectionCount {

    public static void main(String[] args) {
        int gridSize = 4;
        int[] zoombie = {2, 1};
        int[][] creatures = {
                {0, 1},
                {1, 2},
                {3, 1}
        };
        String zombieMoves = "DLUURR";

        //printGrid(createGrid(gridSize));

        System.out.println(
                traverseGrid(
                        gridSize,
                        zoombie,
                        creatures,
                        zombieMoves
                )
        );

    }


    static int traverseGrid(int gridSize, int[] zombiePosition, int[][] creatures, String zombieMoves) {
        int[][] grid = placeZombiesAndCreatures(gridSize,zombiePosition, creatures);
        printGrid(grid);

        int zombieCount = 0;
        List zombieList = new ArrayList();


        Map<Character, int[]> directionMap = new HashMap<>();
        directionMap.put('D', new int[]{0, 1});
        directionMap.put('U', new int[]{0, -1});
        directionMap.put('L', new int[]{-1, 0});
        directionMap.put('R', new int[]{1, 0});

        Queue<int[]> zombieQueue = new LinkedList();
        zombieQueue.add(zombiePosition);

        while (!zombieQueue.isEmpty()) {
            int[] currentZombiePos = zombieQueue.poll();
            for (char move : zombieMoves.toCharArray()) {
                int[] direction = directionMap.get(move);
                // check edge movement index condition
                int ni = edgeMovementIndex(currentZombiePos[0] + direction[0], gridSize);
                int nj = edgeMovementIndex(currentZombiePos[1] + direction[1], gridSize);

                //found a creature
                if (grid[ni][nj] == 2) {
                    //turn creature into zombie and increase zombie count.
                    zombieCount++;
                    grid[ni][nj] = 1;
                    //add in the queue
                    zombieQueue.add(new int[]{ni, nj});
                }
                //update zombie current position w.r.t movement
                currentZombiePos[0] = ni;
                currentZombiePos[1] = nj;
            }
            System.out.println(currentZombiePos[0] + "::" + currentZombiePos[1]);
            zombieList.add(new int[]{currentZombiePos[0], currentZombiePos[1]});
        }

        printGrid(grid);
        return zombieCount;
    }

    static int edgeMovementIndex(int index, int gridSize) {
        return index < 0 ? gridSize - 1 : index == gridSize ? 0 : index;
    }

    static int[][] placeZombiesAndCreatures(int size, int[] zoombie, int[][] creatures) {
        int[][] grid = new int[size][size];
        grid[zoombie[0]][zoombie[1]] = 1;
        for (int[] creature : creatures) {
            grid[creature[0]][creature[1]] = 2;
        }
        return grid;
    }


    static void printGrid(int[][] grid) {
        int m = grid.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("***************");
    }
}
