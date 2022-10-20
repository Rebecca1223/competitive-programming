class Solution {
    int[][] coloured;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        coloured = image;
        if (old != color) {
            colour(coloured, sr, sc, color, old, image.length, image[0].length);
        }
        return coloured;
    }
    
    void colour(int[][] image, int sr, int sc, int color, int old, int srMax, int scMax) { 
        if (image[sr][sc] == old) {
            coloured[sr][sc] = color;
            
            if (sr - 1 >= 0) {
                colour(coloured, sr - 1, sc, color, old, srMax, scMax);
            }

            if (sr + 1 < srMax) {
                colour(coloured, sr + 1, sc, color, old, srMax, scMax);
            }

            if (sc - 1 >= 0) {
                colour(coloured, sr, sc - 1, color, old, srMax, scMax);
            }

            if (sc + 1 < scMax) {
                colour(coloured, sr, sc + 1, color, old, srMax, scMax);
            }
        }
    }
}