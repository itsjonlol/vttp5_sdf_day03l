
package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import people.Person;

public class CSVManagement {
    

    //filename: dirPath + file separator + filename
    public List<Person> readCSV(String filename) throws IOException {
        // use BufferReader -> use readline instead of read for csv?

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        List<Person> persons = new ArrayList<>();

        String line = "";

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            //lineData[0], lineData[1],lineData[2];
            String[] lineData = line.split(",");
            //put the extracted line ddata into a Person object
            Person p = new Person(lineData[0], lineData[1], Integer.parseInt(lineData[2].trim()));
            persons.add(p);
        }
        br.close();
        fr.close();

        return persons;

        

    }

    public void writeCSV(String fullDirPathFileName,List<Person> persons) throws IOException {

        FileWriter fw = new FileWriter(fullDirPathFileName);

        BufferedWriter bw = new BufferedWriter(fw);
        
        for (Person p: persons) {
            bw.append(p.getName());
            bw.append(",");
            bw.append(p.getRegion());
            bw.append(",");
            bw.append(String.valueOf(p.getYear()));
            bw.newLine();

        }

        bw.flush();
        bw.close();
        fw.close();
        
    }
}
