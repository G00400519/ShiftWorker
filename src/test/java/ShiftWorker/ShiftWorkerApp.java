package ShiftWorker;

public class ShiftWorkerApp {
    private String name;
    private String gender;
    private String shift;
    private String age;

    public ShiftWorkerApp(String name, String gender, String shift, String age) {
        this.name = name;
        this.gender = gender;
        this.shift = shift;
        this.age = age;
    }

    public ShiftWorkerApp(String name) {
        this.name = name;
    }

    public ShiftWorkerApp() {

    }
}
