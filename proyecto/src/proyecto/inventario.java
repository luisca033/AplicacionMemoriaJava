package proyecto;

import javax.swing.JOptionPane;

import static proyecto.Proyecto.z1;
import static proyecto.camisas.z;
import static proyecto.chaquetas.z2;
import static proyecto.faldas.z5;
import static proyecto.pantalones.z3;
import static proyecto.sacos.z4;
import static proyecto.vestidos.z6;

public class inventario 
{
    
     String Color;
        double Precio;
        String Genero="";
        String Material="";
        int cantidad=5;
        double cuenta=0;
        double nueprec=Precio;
        double y;
        double obt;

    public inventario(String Color, double Precio, String Genero, String Material) {
        this.Color = Color;
        this.Precio = Precio;
        this.Genero = Genero;
        this.Material = Material;
        
        
    }

    public inventario(String Color, double Precio, String Material) {
        this.Color = Color;
        this.Precio = Precio;
        this.Material = Material;
    }
    
    int x;
    double y1=0;
   

public inventario(){}

        public void compra()
        {
            cantidad--;
            cuenta=cuenta+Precio;
        }
        public void devo()
        {
            cantidad++;
            
        }
        public void promo(double x)
        {
            if (x==0){
        Precio=Precio-(x*Precio);
        }
        
        }
    public String get_color() {
       return this.Color;
    }
    public String get_genero() {
       return this.Genero;
    }
    public double get_precio()
    {
    return this.Precio;
    }
    public double get_can()
    {
    return this.cantidad;
    }
     public double obtengaval(int a,int b)
   { double obt=0;
       if(a==0){obt=z1.get(0).precios(b);}// blusas
       if(a==1){obt=z.get(0).precios(b);}// camisas
       if(a==2){obt=z2.get(0).precios(b);}// chaquetas
       if(a==3){obt=z5.get(0).precios(b);}// faldas
       if(a==4){obt=z3.get(0).precios(b);}// pantalones
       if(a==5){obt=z4.get(0).precios(b);}// sacos
       if(a==6){obt=z6.get(0).precios(b);}// vestidos*/
      return obt; 
   }
   /*switch (a) 
      // camisas
  { case 1:obt=z.get(0).get_precio();
  break;
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
    
  }
       return obt;
   }
     /*
     public double pre (int a)
  
     {double obt=0; switch (a) 
      // camisas
         
  { case 1:obt=z.get(0).get_precio();
  break;
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
    
  }
  return obt;
  }
     /*public double obtengaval(int a, int b)
     {
         switch(a)
         {
             case 1:
                 obt=z.get(0).precios(b);
                 break;
             case 2:
                 obt=z1.get(0).precios(b);
                 break;
             case 3:
                 obt=z2.get(0).precios(b);
                 break;
             case 4:
                 obt=z3.get(0).precios(b);
                 break;
             case 5:
                 obt=z4.get(0).precios(b);
                 break;
             case 6:
                 obt=z5.get(0).precios(b);
                 break;
             case 7:
                 obt=z6.get(0).precios(b);
                 break;
         }
     return obt;
     }
*/
}

