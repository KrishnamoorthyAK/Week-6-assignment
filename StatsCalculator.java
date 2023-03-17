import java.util.Arrays;
public class StatsCalculator {
    private double[] data;

    // Constructor
    public StatsCalculator(double[] data) {
        this.data = data;
    }

    // Print the data
    public void print() {
        System.out.print("Your data: ");
        for (double d : data) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    // Sort the data
    public void sortData() {
        Arrays.sort(data);
    }

    // Print the sorted data
    public void printSorted() {
        System.out.print("Your Sorted data: ");
        for (double d : data) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    // Calculate and return the mean of the data
    public double calculateMean() {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }

    // Calculate and return the median of the data
    public double calculateMedian() {
        Arrays.sort(data);
        int middle = data.length / 2;
        if (data.length % 2 == 1) {
            return data[middle];
        } else {
            return (data[middle - 1] + data[middle]) / 2;
        }
    }

    // Calculate and return the first quartile of the data
    public double calculateFirstQuartile() {
        int middle = data.length / 2;
        if (data.length % 2 == 1) {
            return median(Arrays.copyOfRange(data, 0, middle));
        } else {
            return median(Arrays.copyOfRange(data, 0, middle));
        }
    }

    // Calculate and return the third quartile of the data
    public double calculateThirdQuartile() {
        int middle = data.length / 2;
        if (data.length % 2 == 1) {
            return median(Arrays.copyOfRange(data, middle + 1, data.length));
        } else {
            return median(Arrays.copyOfRange(data, middle, data.length));
        }
    }
    // Calculate and return the median of an array of doubles
    private double median(double[] values) {
        Arrays.sort(values);
        int middle = values.length / 2;
        if (values.length % 2 == 1) {
            return values[middle];
        } else {
            return (values[middle - 1] + values[middle]) / 2;
        }
    }

    // Calculate and return the minimum value of the data
    public double calculateMinimum() {
        return data[0];
    }

    // Calculate and return the maximum value of the data
    public double calculateMaximum() {
        return data[data.length - 1];
    }

    // Calculate and print the five-number summary of the data
    public void printFiveNumberSummary() {
        System.out.println("The five number summary is:");
        System.out.println("Minimum: " + calculateMinimum());
        System.out.println("First quartile: " + calculateFirstQuartile());
        System.out.println("Median: " + calculateMedian());
        System.out.println("Third quartile: " + calculateThirdQuartile());
        System.out.println("Maximum: " + calculateMaximum());
    }
}
