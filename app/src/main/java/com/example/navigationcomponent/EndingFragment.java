   package com.example.navigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


   /**
 * A simple {@link Fragment} subclass.
 */
public class EndingFragment extends Fragment {

	public EndingFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_ending, container, false);
	}

	   @Override
	   public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		   super.onViewCreated(view, savedInstanceState);

		   final NavController navController = Navigation.findNavController(view);

		   Button button = view.findViewById(R.id.restart_GameButton);
		   button.setOnClickListener((v) -> {
			   navController.navigate(R.id.action_endingFragment_to_startFragment);

		   });
	   }
}
