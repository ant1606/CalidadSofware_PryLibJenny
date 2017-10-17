package DATOS;
public class datovendedor {
    private String nom,ape,mail,cod;
    private int num, dni;
    
    public datovendedor(){}
    
   public datovendedor(String nom,String cod, String ape,String mail,int num,int dni){
   
   this.cod=cod;
   this.nom=nom;
   this.ape=ape;
   this.mail=mail;
   this.num=num;
   this.dni=dni;
   
   }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

        public String getCod() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setCod(String Cod) {
        this.nom = nom;
    }
    
    /**
     * @return the ape
     */
    public String getApe() {
        return ape;
    }

    /**
     * @param ape the ape to set
     */
    public void setApe(String ape) {
        this.ape = ape;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
   
    
    
    
    
}
