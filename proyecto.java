import java.util.Scanner;

import javax.swing.plaf.synth.SynthRootPaneUI;
public class proyecto{
public static void main(String args []){
Scanner leer = new Scanner(System.in);
int a, b;    
System.out.println("Primer numero");
a=leer.nextInt();
System.out.println("Segundo numero");
b=leer.nextInt();
System.out.println(a+b);
}
}