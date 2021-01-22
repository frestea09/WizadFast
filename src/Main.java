
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String [] args){
        new Main();
    }
    public Main(){
        initComponent();
    }
    private void initComponent(){
        Person objPerson = new Person();

        JFrame form = new JFrame("Wizard Solver");

        JLabel labelPersonA = new JLabel("Person A : ");
        labelPersonA.setBounds(70,50,80,30);
        form.add(labelPersonA);

        JLabel labelYearDeath = new JLabel(" Age of Death");
        labelYearDeath.setBounds(135,50,150,30);
        form.add(labelYearDeath);

        JLabel labelAfterDeath = new JLabel("Year Death");
        labelAfterDeath.setBounds(255,50,150,30);
        form.add(labelAfterDeath);

        JTextField inputYearDeath = new JTextField();
        inputYearDeath.setBounds(325,50,30,25);
        form.add(inputYearDeath);

        JTextField ageDeath = new JTextField();
        ageDeath.setBounds(220,50,30,25);
        form.add(ageDeath);

        JLabel labelPersonB = new JLabel("Person B : ");
        labelPersonB.setBounds(70,70,80,30);
        form.add(labelPersonB);

        JLabel labelYearDeathB = new JLabel(" Age of Death");
        labelYearDeathB.setBounds(135,70,150,30);
        form.add(labelYearDeathB);

        JTextField inputYearDeathB = new JTextField();
        inputYearDeathB.setBounds(325,75,30,25);
        form.add(inputYearDeathB);

        JLabel labelAfterDeathB = new JLabel("Year Death");
        labelAfterDeathB.setBounds(255,70,150,30);
        form.add(labelAfterDeathB);

        JTextField ageDeathB = new JTextField();
        ageDeathB.setBounds(220,75,30,25);
        form.add(ageDeathB);

        JButton buttonSave = new JButton();
        buttonSave.setText("Calculate");
        buttonSave.setBounds(170,150,100,25);
        form.add(buttonSave);


        form.setLocationRelativeTo(null);
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(100, 100, 569, 321);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringAgeDeath = ageDeath.getText();
                int intAgeDeath = Integer.parseInt(stringAgeDeath);

                String stringYearDeath = inputYearDeath.getText();
                int intYearDeath = Integer.parseInt(stringYearDeath);

                String stringAgeDeathB = ageDeathB.getText();
                int intAgeDeathB = Integer.parseInt(stringAgeDeathB);

                String stringYearDeathB = inputYearDeathB.getText();
                int intYearDeathB = Integer.parseInt(stringYearDeathB);

                if(intAgeDeath<0 || intYearDeath<0|| intAgeDeathB<0|| intYearDeathB<0){
                    JOptionPane.showMessageDialog(null,-1);
                }else{
                    objPerson.setAgeDeath(intAgeDeath);
                    objPerson.setYearDeath(intYearDeath);
                    objPerson.getPeopleKilled();
                    objPerson.setAgeDeathB(intAgeDeathB);
                    objPerson.setYearDeathB(intYearDeathB);
                    objPerson.getPeopleKilled();
                    objPerson.generateYear(objPerson.getPeopleKilled(),objPerson.getPeopleKilledB());
                    String toPrint = "Person A born on Year = "+stringYearDeath+" - "+stringAgeDeath+"="+objPerson.getPeopleKilled()+", number of people killed on year "+objPerson.getPeopleKilled()+" is "+objPerson.getNumberKilledYear()+"\n Person B born on Year = "+stringAgeDeathB+" - "+stringAgeDeathB+"="+objPerson.getPeopleKilledB()+", number of people killed on year "+objPerson.getPeopleKilledB()+" is "+objPerson.getNumberKilledYearB()+"\n So  the Average is ("+objPerson.getNumberKilledYearB()+"+"+objPerson.getNumberKilledYear()+")"+"/"+"2"+"="+objPerson.getAverageDumpMethod();
                    JOptionPane.showMessageDialog(null,toPrint);
                }
            }
        });

    }
}
