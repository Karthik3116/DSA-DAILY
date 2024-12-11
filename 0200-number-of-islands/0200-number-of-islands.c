
void bfs(char** grid, int gridSize, int gridColSize, int row, int col) {
    int directions[4][2] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int queue[gridSize * gridColSize][2];
    int front = 0, rear = 0;

    queue[rear][0] = row;
    queue[rear][1] = col;
    rear++;
    grid[row][col] = '0';

    while (front < rear) {
        int currentRow = queue[front][0];
        int currentCol = queue[front][1];
        front++;

        for (int i = 0; i < 4; i++) {
            int newRow = currentRow + directions[i][0];
            int newCol = currentCol + directions[i][1];

            if (newRow >= 0 && newRow < gridSize && newCol >= 0 && newCol < gridColSize && grid[newRow][newCol] == '1') {
                queue[rear][0] = newRow;
                queue[rear][1] = newCol;
                rear++;
                grid[newRow][newCol] = '0';
            }
        }
    }
}

int numIslands(char** grid, int gridSize, int* gridColSize) {
    int count = 0;

    for (int i = 0; i < gridSize; i++) {
        for (int j = 0; j < gridColSize[i]; j++) {
            if (grid[i][j] == '1') {
                bfs(grid, gridSize, gridColSize[i], i, j);
                count++;
            }
        }
    }

    return count;
}
