public class Gui {
private String result;

    public void setResult(String result) {

        Menu menu = new Menu();
        menu.setMenuEleccion();
        menu.setConversion();
        this.result = result;
    }
}
