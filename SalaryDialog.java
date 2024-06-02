import javax.swing.JOptionPane;
public class SalaryDialog
{
 public static void main(String[] args)
 {
 String wageString, dependentsString;
 double wage, weeklyPay;
 final double HOURS_IN_WEEK = 40;
 wageString = JOptionPane.showInputDialog(null,
 "Ποια είναι η ωριαία αμοιβή", "Salary dialog 1",
 JOptionPane.INFORMATION_MESSAGE);
 weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
 JOptionPane.showMessageDialog(null, " Η αμοιβή για μία εβδομάδα είναι: " +
 weeklyPay);
 }
}
