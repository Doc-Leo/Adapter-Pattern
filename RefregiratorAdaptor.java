package adapterPattern;


public class RefregiratorAdaptor implements PowerOutlet {
   private Refregirator ref;

   RefregiratorAdaptor(Refregirator ref){
       this.ref =ref;
   }

    @Override
    public void plugIn() {
        ref.cooling();
    }
    @Override
    public void unPlug() {
        ref.isNotcooling();
    }
}
