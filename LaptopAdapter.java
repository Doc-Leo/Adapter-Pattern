package adapterPattern;

class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;

    LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void plugIn() {
        laptop.charge();
    }
    @Override
    public void unPlug() {
        laptop.isnotCharging();
    }



}