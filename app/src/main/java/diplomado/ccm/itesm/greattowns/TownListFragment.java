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



        p.add(new Town("Tlacotalpan"                , "Tlacotalpan es una localidad y municipio del sureste del estado de Veracruz dentro de los límites de la Cuenca del Papaloapan, su nombre significa “tierra partida”. Ubicado en la costa del Golfo de México, es conocido por su tradición pesquera y por los dos festivales anuales de música jarocha y décima que patrocina, especialmente interesante por formar un vínculo cultural e histórico entre la música Andalucía, del centro-occidente de África y de las culturas nativas de Mesoamérica", "Estado: Veracruz", "típicos dulces de leche, torito y cremas de cacahuate, fresa, jobo, nanche,y demás frutas de la región los deliciosos panes horneados con leña y la riquísima nieve de coco", "tlacotalpan"));
        p.add(new Town("Xico"                       , "Su nombre proviene de las palabras náhuatl Xicotl, Xicochimalco, «Nido de jicotes». Se encuentra situado en las faldas del Cofre de Perote en la zona centro del estado de Veracruz.Se celebra la fiesta titular en la congregación de San Marcos en el mes de abril; en julio la feria titular en honor a Santa María Magdalena, famosa en la región por su xiqueñada, donde sueltan toros bravos en las calles para ser toreados por el público ", "Estado: Veracruz", "Destaca el mole, Otro platillo más endémico es el famoso \"Xonequei\", que consiste en un caldo de frijoles hervidos con las hojas de una enredadera de este nombre en forma de corazón y bolas de masa sazonadas con manteca. Se le puede agregar chile, dependiendo del gusto", "xico"));
        p.add(new Town("Real de Catorce"            , "La vida del pueblo transcurrió en medio de la actividad de los mineros que extraían la plata. Cuando las minas dejaron de producir en la cantidad acostumbrada, casi agotadas las vetas, se pensó que el poblado moriría y se convertiría en un pueblo fantasma. Sin embargo, la actividad se mantuvo gracias al culto a San Francisco, cuya estatua sedente localizada en el santuario, es meta periódica de miles de peregrinaciones", "Estado: San Luis Potosí","Después de la Revolución los emigrados catorceños empezaron, año tras año, a regresar a su viejo hogar y rendir homenaje al milagroso San Francisco de Asís, también conocido como \"Panchito\" o “El Charrito”, alimentando una tradición que se fue agrandando año tras año por cuenta exclusiva de la fe popular, hasta llegar a las colosales proporciones de su forma actual", "real_catorce"));
        p.add(new Town("San Cristóbal de las Casas" , "fue fundada en el año de 1528, como una de las primeras poblaciones españolas en el Continente Americano. Fue capital de la Provincia de Las Chiapas desde la época colonial hasta el mandato del Gobernador Emilio Rabasa", "Estado: Chiapas", "amones y Embutidos realizados al estilo de la antigua jamoneria española y alemana, Asado Chiapaneco, Mole, Chiles Rellenos, Cocido, la insustituible Sopa de Pan, Sopa de Gota, Sopa de Arroz, Sopa de Medula, Lomo Relleno, Chanfaina, Estofado de Carnero, Lengua en Azafrán, Pollo a la Cacerola, el famoso y tradicional Manchamantel, Siguamut, tamales chiapanecos", "san_cristobal"));
        p.add(new Town("Bacalar"                    , "es una población del estado mexicano de Quintana Roo, situada en el sur de su territorio a unos 40 km al norte de la capital, Chetumal. Su nombre proviene del maya Sian Ka'an Bakhalal. Sian Kaán se traduce como nacimiento del cielo y bak halal quiere decir \"cercado o rodeado de carrizos\" ", "Estado: Quintana Roo", "sobresale el platillo conocido como “rice and beans”, el cual se prepara con aceite de coco. También se cocinan tamales de xpelón, una variedad local de frijol y el sotobichay, delicioso tamal con chaya. También son muy gustados el chocolomo y el puchero. Los mucbil pollos son otra clase de tamales que se preparan los días de “Todos Santos”. Por lo demás, abundan los platillos preparados con mariscos y pescados; el pan de cazón y el típico tikinxic, así como los guisos que llevan caracol", "bacalar"));



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
