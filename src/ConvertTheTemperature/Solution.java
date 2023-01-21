package ConvertTheTemperature;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 21/01/23
 * Time: 14:55
 */


public class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temperatures = new double[] { celsius + 273.15, (celsius * 1.8) + 32 };

        return temperatures;
    }
}
