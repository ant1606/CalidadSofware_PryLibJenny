package DATOS;
public class DATOCLIENTE {
    private String dni,nom,ape,email;
    private int num;
    //prenda
    private double cat;
    private int cant ;
    private String codigo,vendedor,cod;
  
    
public DATOCLIENTE(){}
    
    public DATOCLIENTE(String dni,String nom,String ape,String email,int num,
           double cat, int cant,String codigo, String vendedor,String cod)
                        {
        this.cod=cod;       
        this.dni=dni;
        this.nom=nom;
        this.ape=ape;
        this.num=num;
        this.email=email;
        this.cat=cat;
        this.cant=cant;
        this.codigo=codigo;
        this.vendedor=vendedor;
        
    }
    public String getDni() {
        return dni;
    }

  
    public void setDni(String dni) {
        this.dni = dni;
    }
  
    public String getCod() {
        return cod;
    }

  
    public void setCod(String Cod) {
        this.cod = cod;
    }

  
    public String getNom() {
        return nom;
    }

  
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public String getApe() {
        return ape;
    }

  
    public void setApe(String ape) {
        this.ape = ape;
    }

    
    public String getEmail() {
        return email;
    }

  
    public void setEmail(String email) {
        this.email = email;
    }

    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the cat
     */
    public double getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(double cat) {
        this.cat = cat;
    }

    /**
     * @return the cant
     */
    public int getCant() {
        return cant;
    }

    /**
     * @param cant the cant to set
     */
    public void setCant(int cant) {
        this.cant = cant;
    }

 public double total(){
 return this.getCant()*this.getCat();

 }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
 
 


 
 
}
