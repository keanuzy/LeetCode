package 0733-Flood-Fill;

public class flood_fill {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if(color != newColor)
            dfs(image,sr,sc,color,newColor);
        return image;
    }
    //Depth First Search
    private void dfs(int[][] image, int r, int c, int color, int newColor){
        if(image[r][c] == color) {// if the color as same as the original color{
            image[r][c] = newColor;
        
            if( r >= 1) dfs(image,r - 1,c,color,newColor);
            if(c >= 1) dfs(image,r,c-1,color,newColor);
            if(r+1<image.length) dfs(image,r+1,c, color,newColor);
            if(c+1 <image[0].length) dfs(image, r,c +1, color, newColor);
        }
    }
}
