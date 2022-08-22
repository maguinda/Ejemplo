/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

/**
 *
 * @author lenovo
 */
public class prueba2 {
    public int a(int[] statues){
        int[] m = new int[2];
        m = minNum(statues);
        int large=m[1]-m[0]+1;
        return large-statues.length;
        
    }

    private int[] minNum(int[] array) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     int[] m = new int[2];
        m[0]=array[0];
        m[1]=array[1];
        for (int i = 1; i < array.length; i++) {
            if (m[0]>array[i]) 
                m[0]=array[i];
            if(m[1]<array[i])
                m[1]=array[i];
            
        }
        return m;
    }
    
}
