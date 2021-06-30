package proyecto;

import java.util.ArrayList;

public class pantalones extends inventario
{
static ArrayList <pantalones> z3 = new ArrayList();
    public pantalones(String Color, double Precio, String Genero, String Material) {
        super(Color, Precio, Genero, Material);
    }

    public pantalones() 
    {
        pantalones pan1h= new pantalones("Azul",50000,"Hombre","Jeans");
        z3.add(pan1h);
        pantalones pan2h= new pantalones("Negro",50000,"Hombre","Drill");
        z3.add(pan2h);
        pantalones pan3h= new pantalones("Azul",50000,"Hombre","lino");
        z3.add(pan3h);
        pantalones pan1m= new pantalones("Azul",50000,"Mujer","Jeans");
        z3.add(pan1m);
        pantalones pan2m= new pantalones("Negro",50000,"Mujer","Drill");
        z3.add(pan2m);
        pantalones pan3m= new pantalones("Azul",50000,"Mujer","lino");
        z3.add(pan3m);

    }
    public void imprima()
    {for(inventario z3:z3)
        System.out.println(z3.get_can()+z3.get_color()+z3.get_precio()+z3.get_genero());
    }
    public double precios(int x)
    {
    switch (x)
    {
        case 0:
            y=z3.get(0).get_precio();
    
    case 1:
        y=z3.get(1).get_precio();
    case 2:
        y=z3.get(2).get_precio();
    case 3:
        y=z3.get(3).get_precio();
    case 4:
        y=z3.get(4).get_precio();
    case 5:
    y=z3.get(2).get_precio();
    }
    return y;
    }
    
    }
        

