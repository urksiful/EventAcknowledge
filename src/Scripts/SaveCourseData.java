
package Scripts;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


/**
 *
 * @author urksi
 */
public class SaveCourseData {
    
    public String type = "empty";
    public String nameCourse = "empty";
    public String date = "empty";
    
    public void setDate(String day, String Month, String Year) {
        this.date = day+" "+Month+" "+Year;
    }
    
        public void saveDataCourse(){
       
        File courseDir = new File("C:/izcaliCourses/current.izd");
        try {
            FileWriter fw = new FileWriter(courseDir);
            fw.write(type+"*"+nameCourse+"*"+date);
            JOptionPane.showMessageDialog(null, "Información Guardada");
            
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "304 Cannot Write Course Data");
        }
        
    
    }
    
    
    
    
}
