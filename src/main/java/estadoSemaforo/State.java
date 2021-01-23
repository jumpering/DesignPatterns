package estadoSemaforo;

interface State {
    
    public void cross();
        
    public void drive();
        
    public void showState();
    
    public void setSemaforoContext(SemaforoContext semaforoContext);
}
