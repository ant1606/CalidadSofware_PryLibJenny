package DATOS;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class bus_3 {
    private DefaultTableModel dtm=new DefaultTableModel();
    private ArrayList <datovendedor> vend;
    private String archivo;
    
 public bus_3(String archivo){
    vend=new ArrayList <datovendedor>();
    this.archivo=archivo;
    cargar();
    }    
    
public void adicionar(datovendedor d){
       vend.add(d);
}
public int tamaño(){
  return vend.size();    
}
public datovendedor obtener(int i){
    return vend.get(i);
}
public void limpiar(){
    vend.clear();
}  

 public void grabar() {
    /*Cargar los datos del ArrayList al archivo de texto!*/
		try {
			PrintWriter  pw;
			String       linea;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i=0; i<tamaño(); i++) {
				linea =   
                                        obtener(i).getDni()+ ";" +
                                        obtener(i).getNom() + ";" +
					obtener(i).getApe() + ";" +
                                        obtener(i).getMail()+";"+
					obtener(i).getNum()+";"+  
                                        obtener(i).getCod();
                                      
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
				String          linea, s[], nom,ape,mail,cod;
                                int             num,dni;
                              
				
				br = new BufferedReader(new FileReader(archivo));
				while ((linea = br.readLine()) != null) {
					s = linea.split(";");//el separador!
		                                                    
                                        dni = Integer.parseInt(s[0].trim());
					nom = s[1].trim();
                                        ape=s[2].trim();
                                        mail=s[3].trim();
					num=Integer.parseInt(s[4].trim()); 
                                        cod=s[5].trim();
                                       
                                        
					adicionar(new datovendedor(nom,cod,ape,mail,num,dni));
				}
				br.close();
			}
		}
		catch(Exception e) {
		}
	}
        
public void buscarnomven(String nom,JTable tabla){
    dtm.setNumRows(0);
    dtm.setColumnCount(0);   
    
    dtm.addColumn("Dni");
    dtm.addColumn("Nombres");
    dtm.addColumn("Apellidos");
    dtm.addColumn("Telefono");
    dtm.addColumn("E-mail");
   
    dtm.addColumn("codigo");
    dtm.addColumn("precio");
    dtm.addColumn("cantidad");
    
    dtm.addColumn("codigo");
    
    for(int i=0;i<tamaño();i++){
        if(nom.equalsIgnoreCase(obtener(i).getNom().toString().substring(0,nom.length()))){
            
           Object vector[]=new Object[6]; 

           
           vector[0]=obtener(i).getDni();
           vector[1]=obtener(i).getNom();
           vector[2]=obtener(i).getApe();
           vector[3]=obtener(i).getNum();
           vector[4]=obtener(i).getMail();
           
           vector[5]=obtener(i).getCod();
           
             dtm.addRow(vector);
        }
   
    }
    tabla.setModel(dtm);
}

public void buscarapeven(String ape,JTable tabla){
    dtm.setNumRows(0);
    dtm.setColumnCount(0);
    
    dtm.addColumn("Dni");
    dtm.addColumn("Nombres");
    dtm.addColumn("Apellidos");
    dtm.addColumn("Telefono");
    dtm.addColumn("E-mail");
    
    dtm.addColumn("codigo");
    
    for(int i=0;i<tamaño();i++){
        if(ape.equalsIgnoreCase(obtener(i).getApe().toString().substring(0,ape.length()))){
           
           Object vector[]=new Object[6]; 

           
     
      vector[0]=obtener(i).getDni();
           vector[1]=obtener(i).getNom();
           vector[2]=obtener(i).getApe();
           vector[3]=obtener(i).getNum();
           vector[4]=obtener(i).getMail();

           
           vector[5]=obtener(i).getCod();
           
             dtm.addRow(vector);
        }
   
    }
    tabla.setModel(dtm);
}

public void buscardniven(String cod,JTable tabla){
    dtm.setNumRows(0);
    dtm.setColumnCount(0);
    
    dtm.addColumn("Dni");
    dtm.addColumn("Nombres");
    dtm.addColumn("Apellidos");
    dtm.addColumn("Telefono");
    dtm.addColumn("E-mail");
    
    dtm.addColumn("codigo");
    
    for(int i=0;i<tamaño();i++){
        if(cod.equalsIgnoreCase(obtener(i).getCod().toString())){
           
           Object vector[]=new Object[6]; 
            
           vector[0]=obtener(i).getDni();
           vector[1]=obtener(i).getNom();
           vector[2]=obtener(i).getApe();
           vector[3]=obtener(i).getNum();
           vector[4]=obtener(i).getMail();

           
           vector[5]=obtener(i).getCod();
           
             dtm.addRow(vector);
        }
   
    }
    tabla.setModel(dtm);
}






}

