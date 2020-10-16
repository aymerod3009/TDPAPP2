package pe.exampe.sid.controllers.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import pe.exampe.sid.R
import pe.exampe.sid.controllers.activities.MainActivity
import pe.exampe.sid.controllers.activities.TestimonyActivity


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val reportFragment = ReportFragment()

        val fragmentActivity= FragmentActivity()

        val bottomNavigationView= view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        homeCardReport.setOnClickListener {

            /*val intent= Intent(context,MainActivity::class.java)
            intent.putExtra("fragment",1)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)*/

            //bottomNavigationView.selectedItemId=R.id.reportFragment

            val fragmentTransaction:FragmentTransaction=fragmentManager!!.beginTransaction()

            fragmentTransaction.replace(R.id.mainFragment,ReportFragment())

            fragmentTransaction.commit()



        }

        homeCardHelp.setOnClickListener {

        }

        homeCardMap.setOnClickListener {
        }

        homeCardTestimony.setOnClickListener {
            val intent = Intent(context,TestimonyActivity::class.java)
            startActivity(intent)
        }


    }


}