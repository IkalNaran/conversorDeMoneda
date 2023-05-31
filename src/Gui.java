public class Gui {
private String result;

    public void setResult(String result) {

        try{
            Menu menu = new Menu();
            menu.setMenuEleccion();
            menu.setConversion();
        }catch (MyException exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        this.result = result;
    }
}
