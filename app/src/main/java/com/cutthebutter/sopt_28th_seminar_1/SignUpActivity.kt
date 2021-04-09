package com.cutthebutter.sopt_28th_seminar_1

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.cutthebutter.sopt_28th_seminar_1.databinding.ActivitySignUpBinding
import java.util.zip.Inflater

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LC", "SignUp_onCreate")
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initButtonClickEvent()
    }

    private fun initButtonClickEvent() {
        binding.singupBtn.setOnClickListener {
            val signUpToSignInIntent = Intent(this, SignInActivity::class.java)
            if (binding.idEdtxt.text.toString() != "" && binding.pwEdtxt.text.toString() != "" && binding.nameEdtxt.text.toString() != "") {
                signUpToSignInIntent.putExtra("signUpId", binding.idEdtxt.text.toString())
                signUpToSignInIntent.putExtra("signUpPw", binding.pwEdtxt.text.toString())
                setResult(Activity.RESULT_OK, signUpToSignInIntent)
                finish()
            } else {
                Toast.makeText(this, "빈칸이 있는지 확인해 주세요", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("LC", "SignUp_onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LC", "SignUp_onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LC", "SignUp_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LC", "SignUp_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LC", "SignUp_onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LC", "SignUp_onDestroy")
    }

}