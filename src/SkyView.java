public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int count = 0;
        for(int i=0;i<numRows;i++)
        {
            if(i%2==1)
            {
                for(int k=numCols-1;k>=0;k--)
                {
                    view[i][k] = scanned[count];
                    count++;
                }
            }
            else
            {
                for(int j=0;j<numCols;j++)
                {
                    view[i][j]=scanned[count];
                    count++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double num = 0.0;
        int tNum = 0;
        for(int i=startRow;i<=endRow;i++)
        {
            for(int j=startCol;j<=endCol;j++)
            {
                num += view[i][j];
                tNum++;
            }
        }
        return num/tNum;
    }

    public String toString()
    {
        String s = "";
        for(int i = 0;i<view.length;i++)
        {

            for(int j=0;j<view[i].length;j++)
            {

                s += view[i][j] + " ";

            }
            s+= "\n";
        }
        return s;
    }
}
