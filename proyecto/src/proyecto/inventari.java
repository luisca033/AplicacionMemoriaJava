package proyecto;

public class inventari 
        {
                    protected String Nombre;
                    protected String apellido;
                    protected String edad;
                    protected String sexo;
                    protected String usuario;
                    protected String clave;
                    protected int id;
                    protected int pago;
                    public String comunicacion;

    public inventari(String comunicacion) {
        this.comunicacion = comunicacion;
    }

            public inventari(String Nombre, String apellido, String edad, String sexo, String usuario, String clave, int id, int pago) 
            {
                this.Nombre = Nombre;
                this.apellido = apellido;
                this.edad = edad;
                this.sexo = sexo;
                this.usuario = usuario;
                this.clave = clave;
                this.id = id;
                this.pago = pago;
            }

    inventari(String nombre, String apelli, String edad, String sexo, String usuario, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                public String Nombre()
                {
                    return Nombre;
                }
                public String apellido()
                {
                    return apellido;
                }
                public String edad()
                {
                    return edad;
                }
                public String sexo()
                {
                    return sexo;
                }
                public String usuario()
                {
                    return usuario;
                }
                public String clave()
                {
                    return clave;
                }
                public int id()
                {
                    
                    return id;
                }
                public int pago()
                {
                return pago;
                }
                
                public String comunicacion()
                {
                return comunicacion;
                }
        }

