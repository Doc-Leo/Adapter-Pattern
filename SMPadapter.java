package adapterPattern;

public class SMPadapter implements PowerOutlet {
    private SmartPhoneCharger smp;

    public SMPadapter(SmartPhoneCharger smp) {
        this.smp = smp;
    }


    @Override
    public void plugIn() {
        smp.chargePhone();
    }

    @Override
    public void unPlug() {
        smp.notCharging();
    }
}