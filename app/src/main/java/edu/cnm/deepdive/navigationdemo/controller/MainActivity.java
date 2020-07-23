package edu.cnm.deepdive.navigationdemo.controller;

import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import edu.cnm.deepdive.navigationdemo.R;

import edu.cnm.deepdive.navigationdemo.controller.MainFragment.OnFragmentInteractionListenerMain2;
import edu.cnm.deepdive.navigationdemo.controller.SecondFragment.OnFragmentInteractionListener;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener,
    OnFragmentInteractionListenerMain2 {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public void onFragmentInteraction(Uri uri) {

  }

  @Override
  public void onFragmentInteraction2(Uri uri) {

  }
}
