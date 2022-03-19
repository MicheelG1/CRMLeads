package edu.ieu.crmleads.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

import edu.ieu.crmleads.R;

public class LeadsAdapter extends ArrayAdapter<Lead> {

    public LeadsAdapter(@NonNull Context context, @NonNull List<Lead> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflador = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            convertView = inflador.inflate(R.layout.list_item_lead,
                    parent, false);
        }
        ImageView avatar = convertView.findViewById(R.id.iv_avatar);
        TextView name = convertView.findViewById(R.id.tv_name);
        TextView title = convertView.findViewById(R.id.tv_title);
        TextView company = convertView.findViewById(R.id.tv_company);

        Lead cliente = getItem(position);

        name.setText(cliente.getName());
        title.setText(cliente.getTitle());
        company.setText(cliente.getCompany());
        Glide.with(getContext())
                .load(cliente.getImage())
                .into(avatar);

        return convertView;
    }
}
