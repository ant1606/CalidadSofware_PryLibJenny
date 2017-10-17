package DATOS;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BUS_2 {
    private DefaultTableModel dtm=new DefaultTableModel();
    private ArrayList <DATOPRENDA> dpren;
    private String archivo;

public BUS_2(String archivo){
    dpren=new ArrayList <DATOPRENDA>();
    this.archivo=archivo;
    cargar();
    }
    
public void adicionar(DATOPRENDA d){
       dpren.add(d);
}
public int tamaño(){
  return dpren.size();    
}
public DATOPRENDA obtener(int i){
    return dpren.get(i);
}
public void limpiar(){
    dpren.clear();
}   
    
 public void grabar() {
    /*Cargar los datos del ArrayList al archivo de texto!*/
		try {
			PrintWriter  pw;
			String       linea;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i=0; i<tamaño(); i++) {
				linea =                                 
                                        
                                        obtener(i).getCod()+ ";" +
                                        obtener(i).getTp()+";"+                                       
                                        obtener(i).getCol()+";"+
                                        obtener(i).getCant();
                                        
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e) {
		}
	}

	public void cargar() {
		try {
			File  f = new File(archivo);//obtengo el archivo
			if(f.exists()) {//si existe
 				BufferedReader  br;
				String          linea, s[], cod,tp,col;
				int             cant;
				br = new BufferedReader(new FileReader(archivo));
				while ((linea = br.readLine()) != null) {
					s = linea.split(";");//el separador!

                                        cod=s[0].trim();
                                        tp=s[1].trim();
                                        col=s[2].trim();
                                        cant=Integer.parseInt(s[3].trim());
                                                    
                                        
                                        
				adicionar(new DATOPRENDA (cod,tp,col,cant));
				}
				br.close();
			}
		}
		catch(Exception e) {
		}
	}

   public void busTIPO(String TP,JTable tabla){
    dtm.setNumRows(0);
    dtm.setColumnCount(0);
    
   dtm.addColumn("CODIGO");
    dtm.addColumn("TIPO DE PRENDA");
    dtm.addColumn("COLOR");
  
    
    for(int i=0;i<tamaño();i++){
        if(TP.equalsIgnoreCase(obtener(i).getTp().toString())){
           
           Object vector[]=new Object[3];
            
           vector[0]= obtener(i).getCod();
           vector[1]= obtener(i).getTp();
           vector[2]= obtener(i).getCol();
           
           
             dtm.addRow(vector);
        }
   
    }
    tabla.setModel(dtm);
}

   public void busCOLOR(String col,JTable tabla){
    dtm.setNumRows(0);
    dtm.setColumnCount(0);
    
   dtm.addColumn("CODIGO");
    dtm.addColumn("TIPO DE PRENDA");
    dtm.addColumn("COLOR");
 
    
    for(int i=0;i<tamaño();i++){
        if(col.equalsIgnoreCase(obtener(i).getCol().toString())){
           
           Object vector[]=new Object[3];
            
           vector[0]= obtener(i).getCod();
           vector[1]= obtener(i).getTp();
           vector[2]= obtener(i).getCol();
          
           
             dtm.addRow(vector);
        }
   
    }
    tabla.setModel(dtm);
}





}
