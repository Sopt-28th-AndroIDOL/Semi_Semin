package com.cutthebutter.sopt_28th_seminar_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.cutthebutter.sopt_28th_seminar_1.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private val signUpActivityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LC", "SignIn_onCreate")
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initButtonClickEvent()

        }


    private fun initButtonClickEvent() {


        binding.loginBtn.setOnClickListener {
            val signInToHomeIntent = Intent(this@SignInActivity, HomeActivity::class.java)
            if (binding.idEdtxt.text.toString() != "" && binding.pwEdtxt.text.toString() != "") {
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
                startActivity(signInToHomeIntent)
            } else {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.signupBtn.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            signUpActivityLauncher.launch(intent)
        }
    }




    override fun onStart() {
        super.onStart()
        Log.d("LC", "SignIn_onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LC", "SignIn_onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LC", "SignIn_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LC", "SignIn_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LC", "SignIn_onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LC", "SignIn_onDestroy")
    }

}

