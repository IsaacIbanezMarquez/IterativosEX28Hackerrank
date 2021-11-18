
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

// Bandera Sant Jordi:

/* Donat un nombre N enter senar a l'entrada, dibuixa un quadrat que representi la bandera de Sant Jordi.

image

Input Format

N nombre enter senar.

Constraints

No n'hi ha.

Output Format

Dibuix de la bandera de costat N

Sample Input 0

5
Sample Output 0

% % | % %
% % | % %
- - - - -
% % | % %
% % | % %

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int num = sc.nextInt();
        int filas = num;


        while (filas != 0)
        {
            int columnas = num;

            while(columnas != 0 )
            {
                if (columnas != ((num/2)+1) && (filas != ((num/2)+1)))
                {
                    System.out.print("% ");
                }
                else if (filas == columnas)
                {
                    System.out.print("- ");
                }
                else if (columnas == ((num/2)+1))
                {
                    System.out.print ("| ");
                }
                else if (filas == ((num/2)+1))
                {
                    System.out.print("- ");
                }
                else if (filas == columnas)
                {
                    System.out.print("- ");
                }

                columnas--;
            }
            filas--;

            System.out.println("");
        }


    }
}
