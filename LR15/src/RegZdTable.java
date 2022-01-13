/**
 *
 * @author Лена
 */
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class RegZdTable {
        RegZdTable()
        {
        rowsNum = 0;
        }
        public void AddStr(RowRegZd tableRow)
        {
            if (rowsNum > 0) ArrResize();
            tableRows[rowsNum] = (RowRegZd)tableRow.clone();
            rowsNum++;
        }
        public void EditStr(int numberStr, RowRegZd tableRow)
        {
            tableRows[numberStr - 1] = tableRow;
        }
        public void ArrResize()
        {
            RowRegZd[] tableRows2 = new RowRegZd[rowsNum + 1];
            for (int i = 0; i < rowsNum; i++) tableRows2[i] = (RowRegZd)tableRows[i].clone();
            tableRows = tableRows2;
        }
        int GetRowsNum()
        {
            return(rowsNum);
        }
        public RowRegZd GetTableRow(int index)
        {
            return tableRows[index];
        }
        public int Putfile(String fnameRegZd)
        {
            try
            {
               File f = new File(fnameRegZd);   
               BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true), "windows-1251")); 
               if (!f.exists()) 
               f.createNewFile(); 
               for (int i = 0; i < GetRowsNum(); i++)               
               bw.write(tableRows[i].GetTaskNumber() + "\n" + tableRows[i].GetDate() + "\n" + tableRows[i].GetCustomer() + "\n" + tableRows[i].GetTask() + "\n" + tableRows[i].GetProjNumber() + "\n" + tableRows[i].GetSurname() + "\n" + tableRows[i].GetStatus() + "\n" + tableRows[i].GetNote()+ "\n");                                                                        
               bw.close();
            }
            catch(IOException e)
            {
               return 0;             
            }
        return 1;              
        }
        public int Getfile(String fnameRegZd)
        {
            File f = new File(fnameRegZd);
            if (f.exists())
            try
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "windows-1251"));
                String str;
                RowRegZd row = new RowRegZd();
                int i = 0;
                while ((str = br.readLine()) != null)
                {
                    switch (i)
                    {
                        case 0: row.SetTaskNumber(str); break;
                        case 1: row.SetDate(str); break;
                        case 2: row.SetCustomer(str); break;
                        case 3: row.SetTask(str); break;
                        case 4: row.SetProjNumber(str); break;
                        case 5: row.SetSurname(str); break;
                        case 6: row.SetStatus(str); break;
                        case 7: row.SetNote(str); AddStr(row); break; 
                    }
                    i++;
                    if (i == 8) i = 0;
                }
                br.close();                                                                                                                                         
            }
            catch(IOException e)
            {
                return 0;      
            }
            else return 0;           
            return 1;
        }
        private int rowsNum;
        private RowRegZd[] tableRows = new RowRegZd[1];   
}
