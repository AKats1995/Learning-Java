import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        String name = javax.swing.JOptionPane.showInputDialog("Enter your name");
        

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you"));
        


        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you"));


        JOptionPane.showMessageDialog(null,"Hello "+name+"You are "+age + " years old"+"Your height is "+ height+ " cm");



    
    
    }
}
