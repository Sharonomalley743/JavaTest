package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();
	
	public void tune()
	{
		Tune t = new Tune();
	}

	public TuneBook(String name)
	{
		BufferedReader inputStream = null;

        	try {
            		inputStream = new BufferedReader(new FileReader(name));
            
            		String l;
            		while ((l = inputStream.readLine()) != null) 
			{
                		System.out.println(l);
            	   	}
                    }
        	catch (IOException e)
        	{
            		e.printStackTrace();
        	} 
        	finally 
        	{
            		if (inputStream != null) 
			{
                		try
                		{
                    			inputStream.close();
                		}
                		catch(Exception e)
                		{
                    			e.printStackTrace();
                		}
			}
		}    
    }
	
	public String toString()
    {
        	StringBuffer sb = new StringBuffer();
        	for(String tune:tunes)
        	{
            		sb.append(tune + ",\n ");
        	}

 	       	return sb.toString();
	}
	
	public Tune findTune(String title)
	{
		String s = title;
		//if (s.equalsIgnoreCase(tunes))
		//{
		//	System.out.println("Same");
		//}
		//else
		//{
		//	System.out.println("Different");
		//}
		
		
}
	
	public static void main(String[] args)
    	{
        	TuneBook tb = new TuneBook("hnj0.abc");
        	System.out.println(tb);

	        Tune t = tb.findTune("Scotsman over the Border");
        	t.play();
    	}
	
}