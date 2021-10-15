package sef.FinalActivity;

class Students extends Person{
    String school;


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void introMsg(){
        System.out.println("I am studying at " + this.school);
    }

    public static void main(String[] args) {
        Students Poll = new Students();
        Poll.setSchool("TSI");
        Poll.introMsg();
    }
}
