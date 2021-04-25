package com.cutthebutter.sopt_28th_seminar_1.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cutthebutter.sopt_28th_seminar_1.R
import com.cutthebutter.sopt_28th_seminar_1.databinding.ActivityHomeBinding
import com.cutthebutter.sopt_28th_seminar_1.userinfo.UserInfoActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initMoreBtnClickEvent()

        val repositoryListFragment = RepositoryListFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.repository_list_frag, repositoryListFragment)
        transaction.commit()

    }

    private fun initMoreBtnClickEvent() {
        binding.moreBtn.setOnClickListener {
            val homeToUserInfoIntent = Intent(this, UserInfoActivity::class.java)
            startActivity(homeToUserInfoIntent)
            finish()
        }

    }
}