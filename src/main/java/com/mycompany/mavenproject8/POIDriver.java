/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author s530464
 */
public class POIDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream FS = new FileInputStream("SampleExcel.xls");
        POIFSFileSystem b = new POIFSFileSystem(FS);
       
   //     System.out.println("data: "+ b);
        ExcelExtractor ex = new ExcelExtractor(b);
        System.out.println(ex.getText());
    }
    
}
