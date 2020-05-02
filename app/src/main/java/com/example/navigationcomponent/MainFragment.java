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
import android.widget.TextView;

public class MainFragment extends Fragment implements View.OnClickListener {
	NavController navController;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_main, container, false);
	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		navController = Navigation.findNavController(view);

		view.findViewById(R.id.btn_send_money).setOnClickListener(this);
		view.findViewById(R.id.btn_view_balance).setOnClickListener(this);
		view.findViewById(R.id.btn_view_transactions).setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		int id = v.getId();

		switch (id) {
			case R.id.btn_send_money:
				navController.navigate(R.id.action_mainFragment_to_chooseRecipientFragment);
				break;
			case R.id.btn_view_balance:
				navController.navigate(R.id.action_mainFragment_to_viewBalanceFragment);
				break;
			case R.id.btn_view_transactions:
				navController.navigate(R.id.action_mainFragment_to_viewTransactionFragment);
				break;

		}
	}
}
