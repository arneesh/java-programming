import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Frame2 extends Frame{
	
	static FileOutputStream fos ;
	static XSSFWorkbook wb ;
	static XSSFSheet sheet ;
	static XSSFRow r ,r1;
	static int row = 0;
	
	public void main(){
		
		FlowLayout FL = new FlowLayout();
		this.setLayout(FL);
		Label l1= new Label("Name :");
		Label l2= new Label("Airline :");
		Label l3= new Label("From :");
		Label l4= new Label("To :");
		Label l5= new Label("Gender :");
		Label l6= new Label("DOB :");
		Label l7= new Label("Date :");
		Label l8= new Label("Time :");
		Label l9= new Label("PNR :");
		Checkbox cb1 = new Checkbox("Male");
		Checkbox cb2 = new Checkbox("Female");
		CheckboxGroup cbg = new CheckboxGroup();
		cb1.setCheckboxGroup(cbg);
		cb2.setCheckboxGroup(cbg);
		
		TextField t1 = new TextField(20);
		TextField t2 = new TextField(20);
		TextField t3 = new TextField(20);
		TextField t4 = new TextField(20);
		TextField t6 = new TextField(20);
		TextField t7 = new TextField(20);
		TextField t8 = new TextField(20);
		TextField t9 = new TextField(20);
		
		Button b = new Button(" GO ");
		Button b1 = new Button(" Exit ");
		b1.setLocation(100, 100);
		
		try {
			fos = new FileOutputStream("D:\\Airport2.xlsx");
			wb = new XSSFWorkbook();
			sheet = wb.createSheet();
			
			 r = sheet.createRow(0);
				r.createCell(0).setCellValue("SRNO");
				r.createCell(1).setCellValue("NAME");
				r.createCell(2).setCellValue("AIR");
				r.createCell(3).setCellValue("FROM");
				r.createCell(4).setCellValue("TO");
				r.createCell(5).setCellValue("GENDER");
				r.createCell(6).setCellValue("DOB");
				r.createCell(7).setCellValue("DATE");
				r.createCell(8).setCellValue("TIME");
				r.createCell(9).setCellValue("PNR");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		   
		
		class GoAction implements ActionListener{
			public void actionPerformed(ActionEvent ae) {
				String name = t1.getText();
				String air = t2.getText();
				String from = t3.getText();
				String to = t4.getText();
				String gen = "";
				if(cb1.getState()==true)
					gen = "Male";
				else if(cb2.getState()==true)
					gen = "Female";
				String dob = t6.getText();
				String date = t7.getText();
				String time = t8.getText();	
				String pnr = t9.getText();
				row++;
				r1 = sheet.createRow(row);
				r1.createCell(0).setCellValue(row+"");
				r1.createCell(1).setCellValue(name);
				r1.createCell(2).setCellValue(air);
				r1.createCell(3).setCellValue(from);
				r1.createCell(4).setCellValue(to);
				r1.createCell(5).setCellValue(gen);
				r1.createCell(6).setCellValue(dob);
				r1.createCell(7).setCellValue(date);
				r1.createCell(8).setCellValue(time);
				r1.createCell(9).setCellValue(pnr);
								
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
			}
			
		}
		
		class ExitAction implements ActionListener{
			public void actionPerformed(ActionEvent ae) {

				try {
					wb.write(fos);
				} catch (IOException e) {
					e.printStackTrace();
				}
                 System.exit(0);		
			}		
		}

	
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(l3);
		this.add(t3);
		this.add(l4);
		this.add(t4);
		this.add(l5);
		this.add(cb1);
		this.add(cb2);
		this.add(l6);
		this.add(t6);
		this.add(l7);
		this.add(t7);
		this.add(l8);
		this.add(t8);
		this.add(l9);
		this.add(t9);
		this.add(b);
		this.add(b1);
		
		GoAction al =  new GoAction();
		ExitAction al1 =  new ExitAction();
		b.addActionListener(al);
		b1.addActionListener(al1);
		
		this.setSize(235, 320);
		this.setResizable(false);
		this.setVisible(true);
		
		this.setTitle("Insert Data");
		this.setLocation(500, 200);
		

	}
	
}
