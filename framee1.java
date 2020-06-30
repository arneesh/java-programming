import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends Frame {
	
	public static void main(String args[]){
		Frame1 f = new Frame1();
		FlowLayout FL = new FlowLayout();
		f.setLayout(FL);
		Label l= new Label("  AIRPORT  ");
		Label l2= new Label("   DATA   ");
		Label l3= new Label(" MANAGEMENT");
		Font font = new Font("Verdana", Font.BOLD, 30);
		l.setFont(font);
		l.setForeground(Color.BLUE);
		l2.setFont(font);
		l2.setForeground(Color.BLUE);
		l3.setFont(font);
		l3.setForeground(Color.BLUE);
		Button b1 = new Button("     Insert     ");
		Button b2 = new Button("     Display    ");
		Button b3 = new Button("     Exit       ");
		
		
		class B1Action implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				Frame2 f1 = new Frame2();
				f.setVisible(false);
				f1.main();
			}	
		}
		
        class B2Action implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				Frame3 f2 = new Frame3();
				f.setVisible(false);
				f2.main();
			}	
		}
        
        class ExitAction implements ActionListener{
			public void actionPerformed(ActionEvent ae) {

                 System.exit(0);		
			}		
		}
		
        f.add(l);
        f.add(l2);
        f.add(l3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		b1.addActionListener(new B1Action());
		b2.addActionListener(new B2Action());
		b3.addActionListener(new ExitAction());
		
		f.setSize(235, 320);
		f.setResizable(false);
		f.setVisible(true);
		
		f.setTitle("MENU");
		f.setLocation(500, 200);
	}
}
