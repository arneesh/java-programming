import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3 extends Frame{
	static int row;
	static String[][] s;
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
		Label er= new Label("                       ");
		Font font = new Font("Verdana", Font.BOLD, 12);
		er.setFont(font);
		er.setForeground(Color.RED);
		
		TextField t1 = new TextField(30);
		TextField t2 = new TextField(30);
		TextField t3 = new TextField(30);
		TextField t4 = new TextField(30);
		TextField t5 = new TextField(30);
		TextField t6 = new TextField(30);
		TextField t7 = new TextField(30);
		TextField t8 = new TextField(30);
		TextField t9 = new TextField(30);
		
		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		t8.setEditable(false);
		
		Button b = new Button(" GO ");
		Button b1 = new Button(" Exit ");
		
		try {
			FileInputStream fis = new FileInputStream("D:\\Airport2.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheetAt(0);
			row = sh.getLastRowNum()+1;
			s = new String[row][];
			for(int i=0;i<row;i++){
				s[i] = new String[10];
			}
			for(int i=0;i<row;i++){
				for(int j=0;j<10;j++){
					Row r1 = sh.getRow(i);
					s[i][j]= r1.getCell(j).getStringCellValue();
				}
			}
			
			for(int i=0;i<row;i++){
				for(int j=0;j<10;j++){
					System.out.print(s[i][j]+"\t");
				}
				System.out.print("\n");
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		class GoAction implements ActionListener{
			public void actionPerformed(ActionEvent ae) {
				String pnr = t9.getText();
				for(int i=0;i<row;i++){
					for(int j=0;j<10;j++){
						if(s[i][9].equals(pnr)){
							t1.setText(s[i][1]);
							t2.setText(s[i][2]);
							t3.setText(s[i][3]);
							t4.setText(s[i][4]);
							t5.setText(s[i][5]);
							t6.setText(s[i][6]);
							t7.setText(s[i][7]);
							t8.setText(s[i][8]);
							er.setText("                       ");
						}else{
							er.setText("Invalid PNR!");
						}
					}
					}
			}
		}
		
		class ExitAction implements ActionListener{
			public void actionPerformed(ActionEvent ae) {

                 System.exit(0);		
			}		
		}
		
		this.add(l9);
		this.add(t9);
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(l3);
		this.add(t3);
		this.add(l4);
		this.add(t4);
		this.add(l5);
		this.add(t5);
		this.add(l6);
		this.add(t6);
		this.add(l7);
		this.add(t7);
		this.add(l8);
		this.add(t8);
		this.add(er);
		this.add(b);
		this.add(b1);
		
		
		GoAction al =  new GoAction();
		ExitAction al1 =  new ExitAction();
		b.addActionListener(al);
		b1.addActionListener(al1);
		
		this.setSize(330, 350);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Display Data");
		this.setLocation(500, 200);
		
		
		
	}
}
