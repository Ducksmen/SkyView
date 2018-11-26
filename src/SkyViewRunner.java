public class SkyViewRunner
{
    public static void main(String[] args)
    {
        double[] scan = {.3,.7,.8,.4,1.4,1.1,.2,.5,.2,1.6,.6,.9};
        double[] scan2 = {.3,.7,.8,.4,1.4,1.1};

        SkyView sv1 = new SkyView(4,3, scan);
        SkyView sv2 = new SkyView(3, 2, scan2);

        System.out.println(sv1);
        System.out.println(sv2);

        System.out.println("Average 1: " + sv1.getAverage(1,3,0,2));
        System.out.println("Average 2: " + sv2.getAverage(0,1,0,1));

    }
}
