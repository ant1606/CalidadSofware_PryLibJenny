package DATOS;
public class DATOPRENDA {
       private String tp,col,cod;
    private int cant;

public DATOPRENDA(){}

public DATOPRENDA(String cod,String tp,String col,int cant){

    this.cod=cod;
    this.col=col;    
    this.tp=tp;
    this.cant=cant;

}
 


    public String getTp() {
        return tp;
    }


    public void setTp(String tp) {
        this.tp = tp;
    }


    public String getCol() {
        return col;
    }


    public void setCol(String col) {
        this.col = col;
    }



    public String getCod() {
        return cod;
    }

   
    public void setCod(String cod) {
        this.cod = cod;
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


               
}
