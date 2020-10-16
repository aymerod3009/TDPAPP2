package pe.exampe.sid.controllers.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_information.*
import pe.exampe.sid.R
import pe.exampe.sid.controllers.activities.HelpActivity
import pe.exampe.sid.controllers.activities.LawActivity
import pe.exampe.sid.controllers.activities.QuestionActivity

class InformationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_information, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        informationQuestionItem.setOnClickListener {
            val intent = Intent(context, QuestionActivity::class.java)
            startActivity(intent)
        }

        informationHelpItem.setOnClickListener {
            val intent = Intent(context, HelpActivity::class.java)
            startActivity(intent)
        }

        informationLawItem.setOnClickListener {
            val intent = Intent(context, LawActivity::class.java)
            startActivity(intent)
        }

    }
}