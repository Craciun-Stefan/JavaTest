package Streams;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
//parcugerea unui excel si extragerea datelor din fiecare celula

public class PrintExcel {

    public static void main(String[] args) {

       String filePath = "C:\\Users\\Ralu\\Downloads\\File1.xlsx";
       String cuvant = "example";
        try{

            FileInputStream newFile = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(newFile);
            int nrsheeturi = workbook.getNumberOfSheets();
            for(int i=0; i < nrsheeturi; i++){
                XSSFSheet sheet = workbook.getSheetAt(i);
                //Optiunea 2, prima optiune e ce era in comentariu
                DataFormatter dataFormatter = new DataFormatter();
                    for (Row row : sheet) { //parcurgerea intregului excel
                        for (Cell cell : row) {
                            String cellValue = dataFormatter.formatCellValue(cell);
                            //int cellnr = cell.getRowIndex(); ia indexul randului
                            if (cellValue.equals(cuvant)) {
                                CellType cellType = cell.getCellType();
                                switch (cellType) { //switch case pentru tipul de data pe care il avem in celula
                                    case STRING:
                                        System.out.println(cell.getStringCellValue() + "\n");
                                        break;
                                    case NUMERIC:
                                        System.out.println(cell.getNumericCellValue() + "\n");
                                        break;
                                    case FORMULA:
                                        System.out.println(cell.getCellFormula() + "\n");
                                        break;
                                    default:
                                        System.out.println("\n");
                                }
                            } else return;


                        }
                    }
                }
                workbook.close();
                newFile.close();

        } catch (Exception e){
            e.printStackTrace();

        }


    }
}
