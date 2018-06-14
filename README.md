# MavenWorkshop
Reading data from excel

##Maven Repository Link:
https://mvnrepository.com/

##Reading data from excel(Driver class):

        public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream FS = new FileInputStream("SampleExcel.xls");
        POIFSFileSystem b = new POIFSFileSystem(FS);
       
        //System.out.println("data: "+ b);
        ExcelExtractor ex = new ExcelExtractor(b);
        System.out.println(ex.getText());
        }
