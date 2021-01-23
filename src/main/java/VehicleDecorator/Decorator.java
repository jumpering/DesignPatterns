package VehicleDecorator;

public abstract class Decorator extends Component{

    protected Component component;

    private Decorator decorator;

    private Decorator(){
        //avoid empty constructor
    }

    public Decorator(Component component){

        this.component = component;

    }
}
