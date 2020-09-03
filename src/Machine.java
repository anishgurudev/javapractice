public class Machine implements Info {
    protected String name = "Machine Type 1";
    private int id = 7;

    public void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");
    }

    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }

}