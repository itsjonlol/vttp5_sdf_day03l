
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.Permissions;
import java.text.FieldPosition;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import service.CSVManagement;

public class App {

    public static void main(String[] args) throws IOException {

        //arg[0] arg[1] arg[2]
        //arg[0] "c:/data"
        //arg[1] myfile.text
        //c:\datamyfile.txt
        // windows: c:\data\myfile.txt
        // macOS: //data/myfile.txt

        String dirPath = args[0];
        String fileName = args[1];

        //e.g. c:\data\myfile.txt
        String dirPathFileName = dirPath + File.separator + fileName;
        System.out.println(dirPathFileName);

        //check if a directory exists
        //if directory doesnt exist, create the directory
        
        File directory = new File(dirPath);

        if (directory.exists()) {
            System.out.println("Directory " + directory.toString() + " had already been created.");
        } else {
            directory.mkdir();
        }

        //check if file exists
        //if file does not exist, create the file
        File file = new File(dirPathFileName);

        if (file.exists()) {
            System.out.println("File " + file.toString() + " already created");
        } else {
            file.createNewFile();
        }
        //Example 1 
        //Use FileWriter 
        //1. use console to read in a string of text (sentence)
        //2. use FileWriter to write the content to the file

        // Console console = System.console();
        // String keyboardInput = console.readLine("Enter/Input a sentence: ");
        
//         FileWriter fw = new FileWriter(file, true); //so i can append to the file else it would be overwritten

//        fw.write(keyboardInput);
//        fw.flush();
//        fw.close();

//        //Use FileReader to read the file

//        FileReader fr = new FileReader(file);
//        int dataRead = fr.read(); //Asci code. read the number
       
//        while(dataRead != -1) {
//         System.out.print((char) dataRead); //reads character by character
//         dataRead = fr.read();

//        }
//        fr.close();

//      Example 2
//      Use bufferedWriter to write to file
//         FileWriter fw = new FileWriter(file,true);
//         BufferedWriter bw = new BufferedWriter(fw);
//         bw.append(keyboardInput);
//         bw.flush();
//         bw.close();
// //      use BufferedReader to read the file content

       

//         try (FileReader fr = new FileReader(file)){
//             try(BufferedReader br = new BufferedReader(fr)) {
//                 String line = "";
//                 while ((line = br.readLine()) != null) { // String and not int
//                     System.out.println(line);
        
//                 }

//             }
//         }
        

        // br.close();
        // fr.close();
      

// 
        // Example 3
        //Use FileOutputStream to write to file
        // FileOutputStream fos = new FileOutputStream(file,true);
        // byte[] byteContent = keyboardInput.getBytes();
        // fos.write(byteContent);
        // fos.flush();
        // fos.close();

        // //use FileInputStream to read the file content
        // FileInputStream fis = new FileInputStream(file);
        // int contentRead = 0; //doesnt matter; will be rewrite
        // while ((contentRead = fis.read()) != -1) {
        //     System.out.print((char) contentRead);
        // }
        // fis.close();

        // //Example 4 (Decorater Pattern; can have multiple level)
        //Use FileOutputStream and DataOutputStream to write to file
      
        // FileOutputStream fos = new FileOutputStream(file);
        // GZIPOutputStream gos = new GZIPOutputStream(fos);
        // byte[] contents  = keyboardInput.getBytes();
        // gos.write(contents);
        // gos.flush();
        // gos.close();
        // fos.close();

        // //Use FileinputStream and DataInputStream to read the content
        // FileInputStream fis = new FileInputStream(file);
        // GZIPInputStream gis = new GZIPInputStream(fis);
        // int gisContent = 0;
        // while ((gisContent = gis.read()) != -1 ) {
        //     System.out.print((char) gisContent);
        // }
        // gis.close();
        // fis.close();

        CSVManagement csv = new CSVManagement();

        csv.readCSV(dirPathFileName);

        //menu
        //1. enter new person details

        // Console consoleSelection = System.console();
        // Integer selection = 0;
        // while (selection !=3) {
        //     System.out.println("1. Enter new person details");
        //     System.out.println("2. Save to new csv file");
        //     System.out.println("3. Quit program");
            
        //     selection = Integer.parseInt(consoleSelection.readLine(">>> "));

        //     switch (selection) {
        //         case 1:
        //             Console con1 = System.console();
        //             String personName = con1.readLine("Enter person name: ");
        //             String personRegion = con1.readLine("Enter region area: ");
        //             String personYOB = con1.readLine("Enter year of birth: ");

        //             Person p = new Person(personName, personRegion, Integer.parseInt(personYOB));
        //             persons.add(p);


        //     }
        // }

        //2. save to file ( prompt for new csv file name)
        //3. quit and terminate program

        



    }
}