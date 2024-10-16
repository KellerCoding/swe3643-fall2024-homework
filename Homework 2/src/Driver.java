public class Driver {
    static Exception emptyArray = new Exception("valuesList parameter cannot be null or empty");
    static Exception zeroValues = new Exception("numValues is too low (sample size must be >= 2, population size must be >= 1)");

    public static double COMPUTE_MEAN(double[] valuesList) throws Exception{
        if (valuesList==null) throw emptyArray;

        double accumulator=0;
        for (int i=0;i< valuesList.length;i++){
                accumulator+=valuesList[i];

        }
        return accumulator/valuesList.length;
    }

    public static double COMPUTE_SQUARE_OF_DIFFERENCES(double[] valuesList, double mean) throws Exception{
        if (valuesList==null) throw emptyArray;

        double squareAccumulator=0;
        for (int i=0; i< valuesList.length;i++){
            double difference=valuesList[i]-mean;
            squareAccumulator=squareAccumulator+(difference*difference);
        }
        return squareAccumulator;
    }

    public static double COMPUTE_VARIANCE(double squareOfDifferences, int numValues, boolean isPopulation) throws Exception{
        if (!isPopulation) numValues-=1;

        if (numValues<1) throw zeroValues;
        return squareOfDifferences/numValues;

    }

    public static double COMPUTE_STANDARD_DEVIATION(double[] valuesList, boolean isPopulation) throws Exception{
        if (valuesList==null) throw emptyArray;
        double mean = COMPUTE_MEAN(valuesList);
        double squareOfDifferences=COMPUTE_SQUARE_OF_DIFFERENCES(valuesList,mean);
        double variance=COMPUTE_VARIANCE(squareOfDifferences, valuesList.length, isPopulation);

        return Math.sqrt(variance);
    }

    public static double COMPUTE_POPULATION_STANDARD_DEVIATION(double[] valuesList) throws Exception{
        return COMPUTE_STANDARD_DEVIATION(valuesList,true);
    }

    public static double COMPUTE_SAMPLE_STANDARD_DEVIATION(double[] valuesList) throws Exception{
        return COMPUTE_STANDARD_DEVIATION(valuesList,false);
    }

    public static void main(String[] args){

    double[] sampleValuesList={9,6,8,5,7}, populationValuesList={9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4};
    try {
        double sampleStdDev = COMPUTE_SAMPLE_STANDARD_DEVIATION(sampleValuesList);
        System.out.println("Sample StdDev ="+sampleStdDev);
        //Writes "Sample StdDev=1.5811388300841898"

        double popStdDev = COMPUTE_POPULATION_STANDARD_DEVIATION(populationValuesList);
        System.out.println("Population StdDev ="+popStdDev);
        //Writes "Population StdDev=2.9832867780352594"


    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    }
}
