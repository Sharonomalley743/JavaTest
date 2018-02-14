package ie.dit;

import java.util.ArrayList;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();
	
	public TuneBook()
	{
		
	}
	
	public void loadtune()
	{
		BufferedReader inputStream = null;

        	try {
            		inputStream = new BufferedReader(new FileReader("words.txt"));
            
            		String l;
            		while ((l = inputStream.readLine()) != null) 
			{
                		words.add(l);
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
	
}