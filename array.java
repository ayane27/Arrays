
/**
 * Write a description of class array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array
{
    public static void main(String[] args) 
    {
        String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (int i=0; i < strArray.length; i++) 
        {
             System.out.println(strArray[i]); 
        }
        for (String array : strArray) 
        {
             System.out.print(array);
        }
        System.out.println("");
        for (int i=0; i < strArray.length; i++) 
        {
            System.out.print(strArray[i]);
            if ( i != strArray.length-1) 
            {
               System.out.print("-");
            }
        }
    }
}
        


