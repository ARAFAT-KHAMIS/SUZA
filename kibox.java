import javax.swing.JOptionPane;
public class kibox{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("PLESE ENTER YOU NAME");
        JOptionPane.showMessageDialog(null, "you name is :" +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR AGE"));
        JOptionPane.showMessageDialog(null,"your age" + age + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("ENTER YOUR HEIGHT"));
        JOptionPane.showMessageDialog(null,"your heiht"+height+"cm tall");
        
    }
}
