package diplomado.ccm.itesm.greattowns;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Laboratorios on 8/8/15.
 */
public class TownListFragment extends ListFragment {
    private TownAdapter adapter;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        ArrayList<Town> p =new ArrayList<Town>();

        p.add(new Town("Tlacotalpan", "Tlacotalpan es una localidad y municipio del sureste del estado de Veracruz dentro de los límites de la Cuenca del Papaloapan, en México, su nombre significa “tierra partida”. Ubicado en la costa del Golfo de México, es conocido por su tradición pesquera y por los dos festivales anuales de música jarocha y décima que patrocina, especialmente interesante por formar un vínculo cultural e histórico entre la música Andalucía, del centro-occidente de África y de las culturas nativas de Mesoamérica", "Veracruz", "Rica Comida", "tlalcotalpan.jpg"));
        p.add(new Town("Pueblo 1", "descripcion de pueblo 1", "Veracruz", "Rica Comida", "http://www.mascotarios.org/wp-content/gallery/australian-silky-terrier/australian-silky-terrier3.jpg"));
        p.add(new Town("Pueblo 1", "descripcion de pueblo 1", "Veracruz", "Rica Comida", "http://www.mascotarios.org/wp-content/gallery/australian-silky-terrier/australian-silky-terrier3.jpg"));
        p.add(new Town("Pueblo 1", "descripcion de pueblo 1", "Veracruz", "Rica Comida", "http://www.mascotarios.org/wp-content/gallery/australian-silky-terrier/australian-silky-terrier3.jpg"));
        p.add(new Town("Pueblo 1", "descripcion de pueblo 1", "Veracruz", "Rica Comida", "http://www.mascotarios.org/wp-content/gallery/australian-silky-terrier/australian-silky-terrier3.jpg"));



        adapter = new TownAdapter(getActivity(),p);
        setListAdapter(adapter);

        //Copiar C�digo
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Town r              =  (Town) getListAdapter().getItem(position);
        DetailFragment df   = (DetailFragment) this.getFragmentManager().findFragmentById(R.id.fragment2);
        if (df!=null && df.isInLayout()){
            df.setText(r);
        }


    }
}
