package com.cutthebutter.sopt_28th_seminar_1.userinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cutthebutter.sopt_28th_seminar_1.R
import com.cutthebutter.sopt_28th_seminar_1.databinding.ActivityUserInfoBinding

class UserInfoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val followingListFragment = FollowingListFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.following_list_fragment, followingListFragment)
        transaction.commit()
    }
}