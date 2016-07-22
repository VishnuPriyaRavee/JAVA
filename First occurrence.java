public static char getFirstNonRepeatedChar(String str)
{ 
	Map<Character,Integer> counts = new LinkedHashMap<>(s.length());
for (char c : s.toCharArray()) 
{
	counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); 
}
for (Entry<Character,Integer> entry : counts.entrySet())
{ 
	if (entry.getValue() == 1) 

{ 
		return entry.getKey();
}
	else
	{
		System.out.println("no sunch character");
	}
} }
