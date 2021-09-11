import java.util.ArrayList;

public class z {
	
	static public ArrayList<Integer> sort(ArrayList<Integer> array)
	{
		//ArrayList<Integer> newArray = new ArrayList<Integer>(array.size());
		
		for(int x = array.size() - 1; x > 0; x--)
		{
			for(int m = 0; m < array.size()-1; m++)
			{
				if(array.get(m) < array.get(m+1))
				{
					int temp = array.get(m);
					array.remove(m);
					array.add(m+1, temp);
					
				}
			}
		}
		
		return array;
	}
	
	static public boolean checkIfInt(String x)
	{//negatives are not ints; useful for this proj but not others
		x = x.trim();
		for(int s = 0; s < x.length(); s++)
		{
			if (x.substring(s,s+1).contains("0") || x.substring(s,s+1).contains("1") || x.substring(s,s+1).contains("2") || x.substring(s,s+1).contains("3") || x.substring(s,s+1).contains("4") 
					|| x.substring(s,s+1).contains("5") || x.substring(s,s+1).contains("6") || x.substring(s,s+1).contains("7") || x.substring(s,s+1).contains("8") || x.substring(s,s+1).contains("9"))
			{
				
			}
			else
				return false;
		}
		return true;
	}
	
	static public String toTitleCase(String x)
	{
		x.trim().toLowerCase();
		String temp = "";
		for(int ch = 0; ch < x.length(); ch++)
		{
			if(ch == 0 || x.substring(ch-1,ch).equals(" "))
				temp += x.substring(ch, ch+1).toUpperCase();
			else
				temp += x.substring(ch, ch+1);
		}
		return temp;
	}
	
	static public int d6()
	{
		return (int)(Math.random()*6+1);
	}
	static public int d8()
	{
		return (int)(Math.random()*8+1);
	}
	static public int d10()
	{
		return (int)(Math.random()*10+1);
	}
	static public int d12()
	{
		return (int)(Math.random()*12+1);
	}
	static public int d20()
	{
		return (int)(Math.random()*20+1);
	}
	static public int d100()
	{
		return (int)(Math.random()*100+1);
	}
	static public String toInt(String s){
		String out = "";
		if(s.contains("+"))
			out = s.substring(1, s.length());
		else
			out = s;
		return out;
	}
}
