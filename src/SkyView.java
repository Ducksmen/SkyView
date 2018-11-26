public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        double[][]view = new double[numRows][numCols];
        int count = 0;
        for(int i=0;i<numRows;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<numCols;j++)
                {
                    view[i][j]=scanned[count];
                    count++;
                }
            }
            if(i%2==1)
            {
                for(int k=numCols-1;k>=0;k--)
                {
                    view[i][k] = scanned[count];
                    count++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double num = 0.0;
        int tNum = 0;
        for(int i=0;i<endRow+1;i++)
        {
            for(int j=0;j<endCol;j++)
            {
                num+=view[startRow+i][startCol+j];
                tNum++;
            }
        }
        return num/tNum;
    }
}
