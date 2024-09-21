package Warnet;

public class PC {
    private String IDKomputer;
    private boolean StatusPC;

    public String getIDKomputer() {
        return IDKomputer;
    }

    public void setIDKomputer(String IDKomputer) {
        this.IDKomputer = IDKomputer;
    }

    public boolean getStatusPC() {
        return StatusPC;
    }

    public void setStatus(boolean StatusPC) {
        this.StatusPC = StatusPC;
    }

    public String getInfo() {
        String info = "";
        info += "PC ID           : " + this.IDKomputer + "\n";
        info += "SATUS PENGGUNAAN:" + this.StatusPC + "\n";
        info += "\n";
        return info;
    }
}
