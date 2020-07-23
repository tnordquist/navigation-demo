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
public class MainFragment extends Fragment {

  public MainFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_main, container, false);
    Button button = view.findViewById(R.id.button);

    button.setOnClickListener(
        new OnClickListener() {
          @Override
          public void onClick(View view) {
            Navigation.findNavController(view).navigate(R.id.main_to_second);
          }
        }
    );

    return view;
  }


  public interface OnFragmentInteractionListenerMain2 {
    // TODO: Update argument type and name
    void onFragmentInteraction2(Uri uri);
  }
}
