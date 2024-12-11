class Solution(object):
    def numIslands(self, grid):
        def bfs(r, c):
            queue = deque([(r, c)])
            grid[r][c] = '0'
            while queue:
                x, y = queue.popleft()
                for dr, dc in [(1, 0), (-1, 0), (0, 1), (0, -1)]:
                    nr, nc = x + dr, y + dc
                    if 0 <= nr < len(grid) and 0 <= nc < len(grid[0]) and grid[nr][nc] == '1':
                        queue.append((nr, nc))
                        grid[nr][nc] = '0'

        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == '1':
                    bfs(i, j)
                    count += 1
        return count