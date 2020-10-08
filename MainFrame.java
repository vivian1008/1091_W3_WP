import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
public class MainFrame extends Frame{
    private Button btnExit = new Button("Exit");
    private Button btnAdd = new Button("Add");
    private Button btnSub = new Button("Sub");
    private int x =0;
    private int y =0;
    private Label lab = new Label("0");
public MainFrame(){
    init();
}
private void init(){
    this.setLayout(null);
    this.setLocation(100,50);
    this.setSize(400,300);
    this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
    btnExit.setBounds(100,60,120,25);
    btnAdd.setBounds(10,100,120,25);
    btnSub.setBounds(220,150,120,25);
    lab.setBounds(170,180,120,25);
    this.add(btnExit);
    this.add(btnAdd);
    this.add(btnSub);
    this.add(lab);
    this.setTitle("0");
    btnExit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            System.exit(0);
        }
    });
    btnAdd.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            //int x = Integer.parseInt(MainFrame.this.getTitle());
            //MainFrame.this.setTitle(Integer.toString(++x));
            int y = Integer.parseInt(MainFrame.this.getTitle());
            lab.setText(Integer.toString(++x));
        }
    });
    btnSub.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            int x = Integer.parseInt(MainFrame.this.getTitle());
            MainFrame.this.setTitle(Integer.toString(--x));
        }
    });
}
}