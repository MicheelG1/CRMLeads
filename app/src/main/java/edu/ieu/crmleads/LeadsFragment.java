package edu.ieu.crmleads;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import edu.ieu.crmleads.model.LeadsAdapter;
import edu.ieu.crmleads.model.LeadsRepository;

public class LeadsFragment extends Fragment {

    private ListView mLeadsList;
    private ArrayAdapter<String> mLeadsStringAdapter;

    private LeadsAdapter adaptadorClientes;

    private final String[] leadsNames = {
            "Alexander Pierrot",
            "Carlos Lopez",
            "Sara Bonz",
            "Liliana Clarence",
            "Benito Peralta",
            "Juan Jaramillo",
            "Christian Steps",
            "Alexa Giraldo",
            "Linda Murillo",
            "Lizeth Astrada"
    };
    public LeadsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View raiz = inflater.inflate(R.layout.fragment_leads, container, false);
        mLeadsList = raiz.findViewById(R.id.leads_Listview);
        mLeadsStringAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                leadsNames
        );

        adaptadorClientes = new LeadsAdapter(
                getActivity(),
                LeadsRepository.getInstance().getLeads()
        );

        //mLeadsList.setAdapter(mLeadsStringAdapter);
        mLeadsList.setAdapter(adaptadorClientes);
        return raiz;
    }
}