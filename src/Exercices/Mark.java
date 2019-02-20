package Exercices;

public class Mark {

    private float value;
    private String subject;

    public Mark(float value, String subject) {
        if(value>=0 && value<=20) {
            this.value = value;
            this.subject = subject;
        }
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        if(value>=0 && value<=20) {
            this.value = value;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
