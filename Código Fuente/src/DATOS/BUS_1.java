package DATOS;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BUS_1 {
    private DefaultTableModel dtm=new DefaultTableModel();
    private ArrayList <DATOCLIENTE> prof;
    private String archivo;
        
public BUS_1(String archivo){
    prof=new ArrayList <DATOCLIENTE>();
    this.archivo=archivo;
    cargar();
    }
    
public void adicionar(DATOCLIENTE d){
       prof.add(d);
}
public int tamaño(){
  return prof.size();    
}
public DATOCLIENTE obtener(int i){
    return prof.get(i);
}
public void limpiar(){
    prof.clear();
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
                                        obtener(i).getEmail()+";"+
					obtener(i).getNum()+";"+ 
                                        obtener(i).getCod()+";"+
                                        obtener(i).getCat()+";"+
                                        obtener(i).getCant()+";"+
                                        obtener(i).getCodigo()+";"+
                                        obtener(i).getVendedor();
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
				String          linea, s[], dni,nom,ape,email,codigo,vendedor,cod;
                                int             num,cant;
                                double          cat;
				
				br = new BufferedReader(new FileReader(archivo));
				while ((linea = br.readLine()) != null) {
					s = linea.split(";");//el separador!
		                                                    
                                        dni = s[0].trim();
					nom = s[1].trim();
                                        ape=s[2].trim();
                                        email=s[3].trim();
					num=Integer.parseInt(s[4].trim());  
                                        
                                        cod=s[5].trim();
                                        cat=Double.parseDouble(s[6].trim());
                                        cant=Integer.parseInt(s[7].trim());
                                        
                                        codigo=s[8].trim();
                                        vendedor=s[9].trim();
                                        
                                        
					adicionar(new DATOCLIENTE ( dni, nom, ape, email, num,
                                                                            cat,cant,codigo,vendedor,cod));
				}
				br.close();
			}
		}
		catch(Exception e) {
		}
	}
        

public void buscarnom(String nom,JTable tabla){
    dtm.setNumRows(0);
    dtm.setColumnCount(0);   
    
    dtm.addColumn("Dni");
    dtm.addColumn("Nombres");
    dtm.addColumn("Apellidos");
    dtm.addColumn("Telefono");
    dtm.addColumn("E-mail");
   
    dtm.addColumn("precio");
    dtm.addColumn("cantidad");
    
    dtm.addColumn("codigo");
    
    for(int i=0;i<tamaño();i++){
        if(nom.equalsIgnoreCase(obtener(i).getNom().toString().substring(0,nom.length()))){
            
           Object vector[]=new Object[9]; 

           
           vector[0]=obtener(i).getDni();
           vector[1]=obtener(i).getNom();
           vector[2]=obtener(i).getApe();
           vector[3]=obtener(i).getNum();
           vector[4]=obtener(i).getEmail();
        
           vector[5]=obtener(i).getCat();
           vector[6]=obtener(i).getCant();
           vector[7]=obtener(i).getCod();
           
           vector[8]=obtener(i).getCodigo();
           
             dtm.addRow(vector);
        }
   
    }
    tabla.setModel(dtm);
}

public void buscarape(String ape,JTable tabla){
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
        if(ape.equalsIgnoreCase(obtener(i).getApe().toString().substring(0,ape.length()))){
           
           Object vector[]=new Object[9]; 

           
           vector[0]=obtener(i).getDni();
           vector[1]=obtener(i).getNom();
           vector[2]=obtener(i).getApe();
           vector[3]=obtener(i).getNum();
           vector[4]=obtener(i).getEmail();
        
           vector[5]=obtener(i).getCat();
           vector[6]=obtener(i).getCant();
           vector[7]=obtener(i).getCod();
           
           vector[8]=obtener(i).getCodigo();
           
             dtm.addRow(vector);
        }
   
    }
    tabla.setModel(dtm);
}


public void buscardni(String dni, JTable tabla){
    dtm.setNumRows(0);
    dtm.setColumnCount(0);
    
       dtm.addColumn("DNI");
       dtm.addColumn("NOMBBRE");
       dtm.addColumn("APELLIDO");
       dtm.addColumn("TELEFONO");
       dtm.addColumn("E-MAIL");
       dtm.addColumn("Categoria");
       dtm.addColumn("cantidad");
       dtm.addColumn("codigo");
       dtm.addColumn("vendedor");
    
    for(int i=0;i<tamaño();i++){
        if(dni.equalsIgnoreCase(obtener(i).getDni().toString()));{
                
           Object vector[]=new Object[9];

           vector[0]=obtener(i).getDni();
           vector[1]=obtener(i).getNom();
           vector[2]=obtener(i).getApe();
           vector[3]=obtener(i).getEmail();
           vector[4]=obtener(i).getNum(); 
           
           vector[5]=obtener(i).getCat();
           vector[6]=obtener(i).getCant();
           vector[7]=obtener(i).getCod();
           
           vector[8]=obtener(i).getCodigo();
           
//           vector[9]=obtener(i).total();
        dtm.addRow(vector);           
    }          
}
tabla.setModel(dtm);

}

public void numerbolet(){
    int s=0;
    for(int i=0;i<tamaño();i++){
        s++;
    }
}



}
