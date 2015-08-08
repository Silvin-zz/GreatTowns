package diplomado.ccm.itesm.greattowns;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Laboratorios on 8/8/15.
 */
public class TownAdapter extends BaseAdapter{

    Context     context;
    List<Town>  rowItems;


    public TownAdapter(Context context, List<Town> rowItems){

        this.context  = context;
        this.rowItems = rowItems;
    }


    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }


    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater lay = (LayoutInflater) context.getSystemService(
                    Activity.LAYOUT_INFLATER_SERVICE);

            convertView     = lay.inflate(R.layout.tonw_list, parent, false);
        }

        TextView townName   = (TextView)convertView.findViewById(R.id.title);
        TextView stateName  = (TextView)convertView.findViewById(R.id.textViewState);


        Town  r = rowItems.get(position);
        townName.setText(r.getName());
        stateName.setText(r.getState());
        return convertView;
    }
}
