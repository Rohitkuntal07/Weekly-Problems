public class FloodFill {
    public void floodFill(char[][] image, int sr, int sc, char newColor) {
        int rows = image.length;
        int cols = image[0].length;
        char originalColor = image[sr][sc];

        if (originalColor == newColor) return;

        dfs(image, sr, sc, originalColor, newColor);
    }

    private void dfs(char[][] image, int row, int col, char originalColor, char newColor) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length) return;
        if (image[row][col] != originalColor) return;

        image[row][col] = newColor;

        dfs(image, row - 1, col, originalColor, newColor);
        dfs(image, row + 1, col, originalColor, newColor);
        dfs(image, row, col - 1, originalColor, newColor);
        dfs(image, row, col + 1, originalColor, newColor);
    }
}
