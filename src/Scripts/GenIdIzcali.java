
package Scripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author urksi
 */
public class GenIdIzcali {
    
    
    
    String year;
    String month;
    String day;
    String type;
    
    String inits;
    
    public  String setIzcaliID(String name, String lname, String regCourse){
        getCurrentCourseData();
        String id= "";
        
        inits = name.charAt(0)+lname.substring(0, 2);
        id = "IZCA-"+year+day+month+"-"+type+inits+regCourse.substring(0,3);
       // JOptionPane.showMessageDialog(null, id);
        return id;
    }

    private void getCurrentCourseData() {
       File currentInfo = new File("C:/izcaliCourses/current.izd");
        try {
            FileReader fr = new FileReader(currentInfo);
            BufferedReader br = new BufferedReader(fr);
            StringTokenizer st = new StringTokenizer(br.readLine(), "*");
            type = st.nextToken();
            st.nextToken();
            String tmpDate = st.nextToken();
            st = new StringTokenizer(tmpDate, " ");
            
            day = st.nextToken();
            
            
            switch (st.nextToken()){
                case "Enero":
                    month = "01";
                    break;
                case "Febrero":
                    month = "02";
                    break;
                case "Marzo":
                    month = "03";
                    break;
                case "Abril":
                    month = "04";
                    break;
                case "Mayo":
                    month = "05";
                    break;
                case "Junio":
                    month = "06";
                    break;
                case "Julio":
                    month = "07";
                    break;
                case "Agosto":
                    month = "08";
                    break;
                case "Septiembre":
                    month = "09";
                    break;
                case "Octubre":
                    month = "10";
                    break;
                case "Noviembre":
                    month = "11";
                    break;
                case "Diciembre":
                    month = "12";
                    break;
            
            
            }
            
            year = st.nextToken().substring(2);
            br.close();
            fr.close();
            
            
            switch(type){
                /* Workshop: 201
                   Diploma:  302
                   Certificado: 403
                   Conferencia: 504*/
                case "Workshop":
                    type = "201";
                    break;
                case "Diploma":
                    type = "302";
                    break;
                case "Certificado":
                    type = "403";
                    break;
                case "Conferencia":
                    type = "504";
                    break;
                case "Curso":
                    type = "605";
                    break;
            
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not Founded");
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error in the readable sentence");
        }
    }
   
    
}
