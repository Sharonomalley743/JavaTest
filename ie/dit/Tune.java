package ie.dit;


public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	public Tune()
    {
     //   ();
	//	();
	//	();
    }
	
	public String getNotation()
	{
	}
	
	public String toString()
    	{
        	StringBuffer sb = new StringBuffer();
        	for(String word:x)
        	{
            		sb.append(word + ", ");
					for(String wordd:title)
						{
							sb.append(word + ", ");
						}
					for(String worddd:altTitle)
						{
							if(worddd != null)
							{
								sb.append(word + ", ");
							}
						}
			}

 	       	return sb.toString();
	}
}