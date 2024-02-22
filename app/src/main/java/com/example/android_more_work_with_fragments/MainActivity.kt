package com.example.android_more_work_with_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.android_more_work_with_fragments.viewfragments.viewFragment1
import com.example.android_more_work_with_fragments.viewfragments.viewFragment2

                                    //Main Activity Also contains class Comm1
class MainActivity : AppCompatActivity(), Comm1 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.view1Btn)
        val btn2 = findViewById<Button>(R.id.view2Btn)

        val frag1 = viewFragment1()
        val frag2 = viewFragment2()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, frag1)
            commit()
        }

        //Button 1 listener, switches the active fragment to fragment 1
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, frag1)
                addToBackStack(null)
                commit()
            }

        }


        btn2.setOnClickListener {

            val editTextArea = findViewById<EditText>(R.id.editFragmentTxt)

            //get the
            frag2.arguments = passTheData(editTextArea.text.toString())

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, frag2)
                addToBackStack(null)
                commit()
            }

        }





    }

    override fun passTheData(PassingText: String): Bundle{
        val bundle = Bundle()

        bundle.putString("txtAtoB", PassingText) //Put in passing Text based on the key "txtAtoB"

        return bundle
    }

}