
/**
 * Write a description of class NumerationSystemMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class NumerationSystemMain
{
    
    /**
     * Constructor for objects of class NumerationSystemMain
     */
    public NumerationSystemMain()
    {
    }

    public static int [] convertToBinaryManual(int decimalNumber)
    {
        int binaryMode [] = new int []{0};
        return binaryMode;
    }
    
    public static int [] convertToBinary(int decimalNumber)
    {
        int binaryMode [] = new int [getSizeOfBinaryArray(decimalNumber)];
        int decNum = decimalNumber;
        for(int i = 0; i < binaryMode.length; i++){
            binaryMode[i] = decNum%2;
            decNum /= 2;
        }
        System.out.println("decimal: " + decimalNumber + "\nbinary in reverse: " + Arrays.toString(binaryMode));
        return binaryMode;
    }
    
    //private static void [] getReverseOfBinaryArray (int decimalNumber)
    //{
   // }
    
    public static int getSizeOfBinaryArray(int decimalNumber)
    {
        int decNum = decimalNumber;
        int SizeOfBinaryArray = 0;
        while(decNum!=0){
            SizeOfBinaryArray++;
            decNum /= 2;
        }
        return SizeOfBinaryArray;
    }
}
