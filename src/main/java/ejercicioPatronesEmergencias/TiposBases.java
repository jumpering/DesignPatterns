package ejercicioPatronesEmergencias;

public enum TiposBases {
    SERVICIO(new BaseServicioCreador(), "Servicios"),
    ADMINISTRATIVA(new BaseAdministrativaCreador(), "Administrativa");

    private BaseCreador baseCreador;
    private String tipo;

    private TiposBases(BaseCreador baseCreador, String tipo) {
        this.baseCreador = baseCreador;
        this.tipo = tipo;
    }

    public static BaseCreador valueOf( int ordinal ){
        for (TiposBases tipo : values()){
            if(tipo.ordinal() == ordinal){
              return tipo.baseCreador;
            }
        }
        return null;
    }
}
