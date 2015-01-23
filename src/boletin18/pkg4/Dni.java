
package boletin18.pkg4;

import javax.swing.JOptionPane;

public class Dni {
    char [] letras={'A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
    int  [] valores={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
public void introduceNum(){
    int re;
    String r=JOptionPane.showInputDialog("introduce num DNI");
    re=Integer.parseInt(r);
    int p;
    p=re%23;
    for (int i=0;i<valores.length;i++)
        if(p==valores[i])
    JOptionPane.showMessageDialog(null,"Letra:"+letras[i]);
    
}


}
