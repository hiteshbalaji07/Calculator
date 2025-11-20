import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {

      JTextField t1,t2,result;
      JButton addbtn,subbtn,mulbtn,divbtn;

      public Calculator(){
        setTitle("Mini calculator");
        setSize(300,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        t1=new JTextField(10);
        t2=new JTextField(10);
        result=new JTextField(12);
        result.setEditable(false);

        add(new JLabel("Enter number 1"));
        add(t1);

        add(new JLabel("Enter number 2"));
        add(t2);

        addbtn=new JButton("Addition");
        subbtn=new JButton("Subtraction");
        mulbtn=new JButton("Multiplication");
        divbtn=new JButton("Division");

        addbtn.addActionListener(this);
        subbtn.addActionListener(this);
        mulbtn.addActionListener(this);
        divbtn.addActionListener(this);

        add(addbtn);
        add(subbtn);
        add(mulbtn);
        add(divbtn);

        add(new JLabel("Result"));
        add(result);
        setVisible(true);
      }
      public void actionPerformed(ActionEvent e){
        try{
            double n1=Double.parseDouble(t1.getText());
            double n2=Double.parseDouble(t2.getText());
            double ans=0;

            if(e.getSource()==addbtn) ans=n1+n2;
            else if(e.getSource()==subbtn)ans=n1-n2;
            else if(e.getSource()==mulbtn) ans=n1*n2;
            else if(e.getSource()==divbtn) {
                if(n2==0){
                    result.setText("error");
                    return;
                }
                ans=n1/n2;
            }
            result.setText(String.valueOf(ans));
        }
        catch(Exception ex){
            result.setText("Invalid");
        }
      }
      public static void main(String[] args) {
        new Calculator();
      }
}

