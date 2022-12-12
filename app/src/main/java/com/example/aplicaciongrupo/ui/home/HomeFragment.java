package com.example.aplicaciongrupo.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplicaciongrupo.Api.ApiPokemon;
import com.example.aplicaciongrupo.Datos.Pokemon;
import com.example.aplicaciongrupo.Datos.Respuesta;
import com.example.aplicaciongrupo.ListaPokemon;
import com.example.aplicaciongrupo.R;
import com.example.aplicaciongrupo.databinding.ActivityMainBinding;
import com.example.aplicaciongrupo.databinding.FragmentHomeBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeFragment extends Fragment {


}
