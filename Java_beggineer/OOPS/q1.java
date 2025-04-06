
class car {

    private String make;
    private int modelno;

    public car(String make, int modelno) {
        this.make = make;
        this.modelno = modelno;

    }

    public String getMake() {
        return make;

    }

    public void setMake(String value) {
        this.make =make;

    }
    public int getModelno() {
        return modelno;

    }

    public void setModelno(int modelno) {
        this.modelno =modelno;

    }
    void disp(){
        System.out.println("Make: " + make + ", Model: " + modelno);

    }
}

class q1 {

    public static void main(String[] args) {
        car mycar1 = new car("toyota", 2022);
        car mycar2 = new car(null, 0);

        System.out.println("intial details");
        mycar1.disp();
        mycar2.disp();

        mycar2.setMake("Honda");
        mycar2.setModelno(2024);

        // Printing updated details
        System.out.println("\nUpdated Details of myCar2:");
        mycar2.disp();

   

    }
}
