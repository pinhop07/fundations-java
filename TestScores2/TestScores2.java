public class TestScores2
{
    double[] testScores;





    public TestScores(double[] scores)
    {
        testScores = new double[scores.length];


        for (int index = 0; index < scores.length; index++)
        scores[index] = scores[index];


    }

    public double getTotal()
    {
        double total = 0.0;

        for (double value : testScores)
        total += value;

        return total;
    }

    public double getAverage()
    {
        return getTotal() / testScores.length;
    }




}