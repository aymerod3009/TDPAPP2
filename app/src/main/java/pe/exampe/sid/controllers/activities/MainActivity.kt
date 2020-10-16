package pe.exampe.sid.controllers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import pe.exampe.sid.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valueFragment = intent.getIntExtra("fragment",4)


        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.mainFragment)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.reportFragment,
            R.id.informationFragment,
            R.id.homeFragment,
            R.id.mapFragment,
            R.id.profileFragment
        ))

        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)
        //bottomNavigationView.selectedItemId=R.id.reportFragment

        when(valueFragment){
            1 ->{
                bottomNavigationView.selectedItemId=R.id.reportFragment
            }
            2->{
                bottomNavigationView.selectedItemId=R.id.mapFragment
            }
            3->{
                bottomNavigationView.selectedItemId=R.id.informationFragment
            }
            else ->{
                bottomNavigationView.selectedItemId=R.id.homeFragment
            }
        }

    }

}