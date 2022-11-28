/**
* 
* @author: Amir Armion 
* 
* @version: V.01
* 
*/
public class Part2 
{

    public int howMany(String stringa, String stringb)
    {
        int startIndex = 0;
        int count      = 0;

        while(startIndex < stringb.length())
        {
            int start      = stringb.indexOf(stringa, startIndex);

            if(start == -1)
            {
                return count;
            }
            else
            {
                count++;
                startIndex = start + stringa.length();
            }
        }

        return count;
    }

    public void testHowMany()
    {
        System.out.println(howMany("GAA", "ATGAACGAATTGAATC"));

    }
}
