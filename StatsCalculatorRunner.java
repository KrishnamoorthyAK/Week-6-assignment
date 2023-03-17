public class StatsCalculatorRunner {

        // Main method
        public static void main(String[] args) {
            double[] data = {1, 2, 3, 4, 5, 6};
            StatsCalculator myCalculator = new StatsCalculator(data);
            myCalculator.print();
            myCalculator.sortData();
            myCalculator.printSorted();
            myCalculator.printFiveNumberSummary();
            System.out.println("\nThe mean is " + myCalculator.calculateMean());
        }



    }
