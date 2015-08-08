package diplomado.ccm.itesm.greattowns;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Laboratorios on 8/8/15.
 */
public class DetailFragment extends Fragment {

    TextView txtParties;
    TextView txtFood;
    TextView txtDescription;
    ImageView imgView;
    Bitmap bitmap;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View view       = inflater.inflate(R.layout.detail_layout, container, false);
        txtParties      = (TextView)  view.findViewById(R.id.textView);
        txtFood         = (TextView)  view.findViewById(R.id.textView2);
        imgView         = (ImageView) view.findViewById(R.id.imageView2);

        return view;
    }
    public void setText(Town r){

        txtParties.setText(r.getDescription());
        txtFood.setText(r.getFood());
        InputStream is = getClass().getClassLoader().getResourceAsStream("images/tlalcotalpan.jpg");
        Bitmap bitmap = BitmapFactory.decodeStream(is);
        imgView.setImageBitmap(bitmap);
    }



}
