package One;
public class Test {

	public static void main(String[] args)
	{
	
		  Test t = new Test();
		 System.out.println( t.gene_search("CATTGA", "CAT"));
	}
	
	//KMP Algorithm Used
	public boolean gene_search(String genome, String Pattern)
	{
	  char[] genomeArray=genome.toCharArray();
	  char[] patternArray=Pattern.toCharArray();
	  int[] logic=logicMaper(patternArray);
	  int i=0,j=0;
	  while(i<genomeArray.length)
	  {
	    if(genomeArray[i]==patternArray[j])
	    { 
	      if(j==patternArray.length-1)
	        return true;
	      else
	      {
	        i++;
	        j++;
	      }
	    }
	    else if(j>0)
	      j=logic[j-1];
	      else
	      i++;
	    System.out.println("from while loop"+i);
	    }
	  return false;
	}

	public int[] logicMaper(char[] pattern)
	{
	  int len=pattern.length;
	  int[] logic=new int[len];
	  int i=1,j=0;
	  logic[0]=0;
	  while(i<len)
	  {
	    if(pattern[i]==pattern[j])
	    {
	      logic[i]=j+1;
	      i++;
	      j++;
	    }
	    else if(j>0)
	      j=logic[j-1];
	      else
	    {
	      logic[i]=0;
	      i++;
	    }
	  }
	  System.out.println("Done with logic");
	  return logic;
	}

}
