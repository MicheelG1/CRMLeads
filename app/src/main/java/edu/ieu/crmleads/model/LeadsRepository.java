package edu.ieu.crmleads.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.ieu.crmleads.R;

public class LeadsRepository {
    private static LeadsRepository respository = new LeadsRepository();
    private HashMap<String, Lead> clientes = new HashMap<>();

    public static LeadsRepository getInstance(){
        return respository;
    }

    private LeadsRepository() {
        saveLead(new Lead("Alexander Pierrot", "CEO", "Insures S.O.", R.drawable.lead_photo_1));
        saveLead(new Lead("Carlos Lopez", "Asistente", "Hospital Blue", R.drawable.lead_photo_2));
        saveLead(new Lead("Sara Bonz", "Directora de Marketing", "Electrical Parts ltd", R.drawable.lead_photo_3));
        saveLead(new Lead("Liliana Clarence", "Diseñadora de Producto", "Creativa App", R.drawable.lead_photo_4));
        saveLead(new Lead("Benito Peralta", "Supervisor de Ventas", "Neumáticos Press", R.drawable.lead_photo_5));
        saveLead(new Lead("Juan Jaramillo", "CEO", "Banco Nacional", edu.ieu.crmleads.R.drawable.lead_photo_6));
        saveLead(new Lead("Christian Steps", "CTO", "Cooperativa Verde", R.drawable.lead_photo_7));
        saveLead(new Lead("Alexa Giraldo", "Lead Programmer", "Frutisofy", R.drawable.lead_photo_1));
        saveLead(new Lead("Linda Murillo", "Directora de Marketing", "Seguros Boliver", R.drawable.lead_photo_2));
        saveLead(new Lead("Lizeth Astrada", "CEO", "Concesionario Motolox", R.drawable.lead_photo_3));
    }

    private void saveLead(Lead lead) {
        clientes.put(lead.getId(), lead);
    }

    public List<Lead> getLeads() {
        return new ArrayList<>(clientes.values());
    }
}
