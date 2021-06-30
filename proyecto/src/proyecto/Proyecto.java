package proyecto;

import java.util.ArrayList;
import static proyecto.camisas.z;

public class Proyecto {
 static ArrayList<inventario> i= new ArrayList();
 static ArrayList<blusas>z1= new ArrayList();
  static ArrayList <camisas> z = new ArrayList();
  static ArrayList <chaquetas> z2 = new ArrayList();
  static ArrayList <faldas> z5 = new ArrayList();
  static ArrayList <pantalones> z3 = new ArrayList();
  static ArrayList <sacos> z4 = new ArrayList();
  static ArrayList <vestidos> z6 = new ArrayList();
 

static public double pre (int a)
  { double obt = 0,u; switch (a) 
      // camisas
  { case 1: obt=z.get(0).get_precio();
 // break;
    case 2:obt=z.get(1).get_precio();
    break;
    case 3: obt=z.get(2).get_precio();
    break;
    case 4: obt=z.get(3).get_precio();
    break;
    case 5: obt=z.get(4).get_precio();
    break;
    case 6: obt=z.get(5).get_precio();
    break;
    // blusas
    case 7:obt=z1.get(0).get_precio();
    break;
    case 8:obt=z1.get(1).get_precio();
    break;
    case 9: obt=z1.get(2).get_precio();
    break;
    // Chaquetas
    case 10: obt=z2.get(0).get_precio();
    break;
    case 11: obt=z2.get(1).get_precio();
    break;
    case 12: obt=z2.get(2).get_precio();
    break;
    case 13: obt=z2.get(3).get_precio();
    break;
    case 14: obt=z2.get(4).get_precio();
    break;
    case 15: obt=z2.get(5).get_precio();
    break;
    // Sacos
    case 16: obt=z4.get(0).get_precio();
    break;
    case 17: obt=z4.get(1).get_precio();
    break;
    case 18: obt=z4.get(2).get_precio();
    break;
    case 19: obt=z4.get(3).get_precio();
    break;
    case 20: obt=z4.get(4).get_precio();
    break;
    case 21: obt=z4.get(5).get_precio();
    break;
    //faldas
    case 22: obt=z5.get(0).get_precio();
    break;
    case 23: obt=z5.get(1).get_precio();
    break;
    case 24: obt=z5.get(2).get_precio();
    break;
    //Vestidos
    case 25: obt=z6.get(0).get_precio();
    break;
    case 26: obt=z6.get(1).get_precio();
    break;
    case 27: obt=z6.get(2).get_precio();
    break;
    
    case 28: obt=z3.get(0).get_precio();
    break;
    case 29: obt=z3.get(1).get_precio();
    break;
    case 30: obt=z3.get(2).get_precio();
    break;
    case 31: obt=z3.get(3).get_precio();
    break;
    case 32: obt=z3.get(4).get_precio();
    break;
    case 33: obt=z3.get(5).get_precio();
    break;
    
  }u=obt;
  return u;
  }
    public static void main(String[] args) {
 cargue();
  new Inicio().setVisible (true);
  System.out.println(z1.get(0).get_precio());
  
  
  //System.out.println(z.get(5).get_precio());
  //System.out.println(z.get(2).get_precio());
    }
  static public void cargue() 
  {
  camisas c=new camisas(); 
 blusas b=new blusas();
 chaquetas ch= new chaquetas();
 faldas f= new faldas();
 pantalones p= new pantalones();
 sacos s= new sacos();
 vestidos v= new vestidos();
 z.add(c);
 z1.add(b);
 z2.add(ch);
 z3.add(p);
 z4.add(s);
 z5.add(f);
 z6.add(v);
 
 c.imprima();
 b.imprima();
 ch.imprima();
 f.imprima();
 p.imprima();
 s.imprima();
 v.imprima();
// pre(8);
  }
  
  
}
 

        /*Funciona
  inventario 3x= new inventario();
  x.promo(0.2);
  System.out.println(x.Precio);
  x.compra();
  System.out.println(x.cantidad);
  x.compra();
  System.out.println(x.cuenta);
  x.devo();
  x.devo();
  System.out.println(x.cantidad);
*/

    
    
 // String cu;  

