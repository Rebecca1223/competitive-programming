class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        if (old != color) {
            colour(image, sr, sc, color, old, image.length, image[0].length);
        }
        return image;
    }
    
    void colour(int[][] image, int sr, int sc, int color, int old, int srMax, int scMax) { 
        if (image[sr][sc] == old) {
            image[sr][sc] = color;
            
            if (sr - 1 >= 0) {
                colour(image, sr - 1, sc, color, old, srMax, scMax);
            }

            if (sr + 1 < srMax) {
                colour(image, sr + 1, sc, color, old, srMax, scMax);
            }

            if (sc - 1 >= 0) {
                colour(image, sr, sc - 1, color, old, srMax, scMax);
            }

            if (sc + 1 < scMax) {
                colour(image, sr, sc + 1, color, old, srMax, scMax);
            }
        }
    }
}