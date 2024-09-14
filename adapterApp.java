package adapterPattern;
public class adapterApp{

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop) ;
        Refregirator ref = new Refregirator();
        PowerOutlet refOutlet = new RefregiratorAdaptor(ref);
        SmartPhoneCharger spc = new SmartPhoneCharger();
        PowerOutlet spcOutlet = new SMPadapter(spc);

       laptopOutlet.plugIn();
       laptopOutlet.unPlug();

       refOutlet.plugIn();
       refOutlet.unPlug();

       spcOutlet.plugIn();
        spcOutlet.unPlug();




    }
}