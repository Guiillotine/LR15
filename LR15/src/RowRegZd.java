/**
 *
 * @author Лена
 */
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class RowRegZd implements Cloneable {
        public RowRegZd()
        {
        }
        public RowRegZd(String taskNumber, String date, String customer, String task, String projNumber, String surname, String status, String note)
        {
            this.taskNumber = taskNumber;
            this.date = date;
            this.customer = customer;
            this.task = task;
            this.projNumber = projNumber;
            this.surname = surname;
            this.status = status;
            this.note = note;
        }
        public void SetDate(String date)
        {
            this.date = date;
        }
        public String GetDate()
        {
            return (date);
        }
        public void SetCustomer(String customer)
        {
            this.customer = customer;
        }
        public String GetCustomer()
        {
            return (customer);
        }
                public void SetTaskNumber(String taskNumber)
        {
            this.taskNumber = taskNumber;
        }
        public String GetTaskNumber()
        {
            return (taskNumber);
        }
        public void SetSurname(String surname)
        {
            this.surname = surname;
        }
        public String GetSurname()
        {
            return (surname);
        }
        public void SetTask(String task)
        {
            this.task = task;
        }
        public String GetTask()
        {
            return (task);
        }
        public void SetProjNumber(String projNumber)
        {
            this.projNumber = projNumber;
        }
        public String GetProjNumber()
        {
            return (projNumber);
        }
        public void SetStatus(String status)
        {
            this.status = status;
        }
        public String GetStatus()
        {
            return (status);
        }
        public void SetNote(String note)
        {
            this.note = note;
        }
        public String GetNote()
        {
            return (note);
        }
        public int Putfile(String fnameRegZd)
        {                   
            try
            {
               File f = new File(fnameRegZd);   
               BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true), "windows-1251"));  
                   if (!f.exists()) 
                       f.createNewFile();             
               bw.write(taskNumber + "\n" + date + "\n" + customer + "\n" + task + "\n" + projNumber + "\n" + surname + "\n" + status + "\n" + note+ "\n");
               bw.close();
            }
            catch(IOException e)
            {
               return 0;             
            }
            return 1;
        }
        public Object clone()
        {
        try
        {
            return (RowRegZd)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
        }
        return this;
        }

        private String taskNumber;
        private String date;
        private String customer;
        private String task;
        private String projNumber;
        private String surname;
        private String status;
        private String note;
}
