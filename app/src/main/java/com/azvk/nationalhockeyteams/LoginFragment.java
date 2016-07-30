package com.azvk.nationalhockeyteams;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends Fragment {

    Presenter presenter;

    private  static final String TAG = LoginFragment.class.getSimpleName();

    public LoginFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);
        presenter = new PresenterImpl(this);
        return view;
    }

    @OnClick(R.id.login_button)
    public void login(View view){

        Log.i(TAG, "onLoginButtonClicked");



    }

    @OnClick(R.id.signup_button_login)
    public void registration(View view){
        Log.i(TAG, "Running registration method");
        Intent intent = new Intent(getContext(), RegistrationActivity.class);
        startActivity(intent);
    }

}
