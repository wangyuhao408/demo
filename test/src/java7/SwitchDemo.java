package java7;

public class SwitchDemo {
    public String generate(String name, String gender) {
        String title = "";
        switch (gender) {
            case "��":
                title = name + " ����";
                break;
            case "Ů":
                title = name + " Ůʿ";
                break;
            default:
                title = name;
        }
        return title;
    }
}
