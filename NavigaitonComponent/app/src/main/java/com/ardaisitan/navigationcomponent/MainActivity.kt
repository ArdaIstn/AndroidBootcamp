package com.ardaisitan.navigationcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ardaisitan.navigationcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment1) as NavHostFragment
        // Fragment tanimlanir ve as ile NavHostFragment'a donusturulur.

        NavigationUI.setupWithNavController(binding.bottomNavView, navHostFragment.navController)
        // bottomNav ile navHostFragment birlestirildi.
        //setupWithNavController: Bu metot,BottomNavigationView ile bir NavController'ı ilişkilendirir.
        //navHostFragment.navController: Bu, NavHostFragment'ın NavController'ını temsil eder.
        // Bu, uygulamanın gezinme grafiğini ve ekranlar arasında gezinmeyi yöneten bir denetleyicidir.
        //Kullanici uygulamada bir oge sectiginde navController araciligiyla ilgili fragmenta gecis yapilir,uygun olan ekran icerigi goruntulenir
        // Menude verdigimiz id'ler hangi fragmenti acmasini istiyorsam onun id'si ile ayni olmalidir.
    }
}