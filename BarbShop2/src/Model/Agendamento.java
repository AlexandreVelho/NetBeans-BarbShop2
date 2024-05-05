package Model;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Agendamento {

    private int id;
    private Cliente cliente; // relacionamento entre classes
    private Servico serviço; // relacionamento entre classes
    private float valor;
    private Date data; //import Date;

    private String observação;

    public Agendamento(int id, Cliente cliente, Servico serviço, int valor, String data, String string1, String cliente_vai_atrasar) {
        this.id = id;
        this.cliente = cliente;
        this.serviço = serviço;
        this.valor = valor;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            this.data = dateFormat.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServiço() {
        return serviço;
    }

    public void setServiço(Servico serviço) {
        this.serviço = serviço;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

}
