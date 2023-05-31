import javax.swing.*;

public class Menu extends Gui {
    private String menuEleccion;
    private Object[] possibleValues = {"Conversor de Moneda", "Conversor de Temperatura"};
    private Double conversion;

    //Eligue la opcion del menu principal
    public void setMenuEleccion() {
        this.menuEleccion = (String)JOptionPane.showInputDialog(null, "Choose one", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                this.possibleValues, this.possibleValues[0]);
    }

    //Asigna cuanto quieres convetir
    public void setConversion() {
        this.conversion = Double.valueOf((JOptionPane.showInputDialog("Please input a value", conversion)));
    }

    public void getMenuEleccion() {
        setMenuEleccion();
        if(this.menuEleccion == possibleValues[0]){
             setConversion();
        } else if (this.menuEleccion == possibleValues[1] ) {
            JOptionPane.showInputDialog("Temperatura", conversion);
        }
    }
}

