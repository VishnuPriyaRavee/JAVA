class CommonPrefix
{
public static String longestCommonPrefix(String[] strings) {
    if (strings.length == 0)
    {
        return "";  
    }

    for (int prefixLen = 0; prefixLen < strings[0].length(); prefixLen++) 
    {
        char c = strings[0].charAt(prefixLen);
        for (int i = 1; i < strings.length; i++) 
        {
            if ( prefixLen >= strings[i].length() ||
                 strings[i].charAt(prefixLen) != c )
                 {
          
                return strings[i].substring(0, prefixLen);
            }
        }
    }
    return strings[0];
public ststic void main(String args[]
{
CommonPrefix c=new CommonPrefix();
c.longestCommonPrefix{"addsfsdf","qdthfh","abbbbbbbb","qwert","abbbbbbbb"};
}}
