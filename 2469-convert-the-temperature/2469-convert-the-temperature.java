class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temp = {celsius+273.15, (celsius*9/5)+32};
        return temp;
    }
}