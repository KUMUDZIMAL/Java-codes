class LowTempException extends Exception {
    public LowTempException(String message) {
        super(message);
    }
}

class NormalTempException extends Exception {
    public NormalTempException(String message) {
        super(message);
    }
}

public class TempCheck 
{

    public static void main(String[] args) 
    {
        TempCheck tc = new TempCheck();

        try 
	{
            tc.checkTemp(18); 
        } 
	catch (LowTempException lte) 
	{
            System.out.println(lte.getMessage());
        } 
	catch (NormalTempException nte) 
	{
            System.out.println(nte.getMessage());
        }
    }

    public void checkTemp(int temperature) throws LowTempException, NormalTempException 
    {
        if (temperature < 20) 
	{
            throw new LowTempException("Temperature is too low!");
        } 
	else 
	{
            throw new NormalTempException("Temperature is normal.");
        }
    }
}


