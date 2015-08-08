package diplomado.ccm.itesm.greattowns;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Laboratorios on 8/8/15.
 */
public class DetailFragment extends Fragment {

    TextView txtParties;
    TextView txtFood;
    TextView txtDescription;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View view       = inflater.inflate(R.layout.detail_layout, container, false);
        txtParties      = (TextView) view.findViewById(R.id.textView);
        txtFood         = (TextView) view.findViewById(R.id.textView2);

        return view;
    }
    public void setText(Town r){

        txtParties.setText(r.getDescription());
        txtFood.setText(r.getFood());

    }



}
