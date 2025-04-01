package domain;

public class Degree {
    private String code;
    private String name;

    public Degree(String code) {
        this.code = code;
        setDegreeName(code);
    }

    private void setDegreeName(String code) {
        switch(code) {
            case "BSCS":
                name = "BS Computer Science";
            break;
            case "BSIE":
                name = "BS Industrial Engineering";
            break;
            case "BSCE":
                name = "BS Civil Engineering";
            break;
            case "BSECE":
                name = "BS Electronics Engineering";
            break;
            default:
                name = "Unknown Degree";
        }
    }
    public String getDegreeCode() {
        return code;
    }
    public String getDegreeName() {
        return name;
    }
    public void setDegreeCode(String code) {
        this.code = code;
    }
}
