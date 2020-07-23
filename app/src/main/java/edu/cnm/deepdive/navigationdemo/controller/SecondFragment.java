package edu.cnm.deepdive.navigationdemo.controller;

import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation;
import edu.cnm.deepdive.navigationdemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment{

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_second, container, false);
    Button button = view.findViewById(R.id.button2);

    button.setOnClickListener(
        new OnClickListener() {
          @Override
          public void onClick(View view) {
            Navigation.findNavController(view).navigate(R.id.second_to_main);
          }
        }
    );

    return view;
  }

  public interface OnFragmentInteractionListener {
    // TODO: Update argument type and name
    void onFragmentInteraction(Uri uri);
  }
}
