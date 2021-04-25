package com.cutthebutter.sopt_28th_seminar_1.userinfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cutthebutter.sopt_28th_seminar_1.databinding.FragmentFollowingListBinding


class FollowingListFragment : Fragment() {

    private var _binding: FragmentFollowingListBinding? = null
    private val binding get() = _binding ?: error("View를 참조하기위해 binding이 초기화되지 않았습니다.")

    private lateinit var followingListAdapter: FollowingListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFollowingListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        followingListAdapter = FollowingListAdapter()
        binding.userList.adapter = followingListAdapter

        followingListAdapter.userList.addAll(
            listOf<FollowingUserInfo>(
                FollowingUserInfo(
                    userImage = "",
                    userName = "a"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "b"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "c"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "d"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "e"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "f"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "g"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "h"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "a"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "b"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "c"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "d"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "e"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "f"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "g"
                ), FollowingUserInfo(
                    userImage = "",
                    userName = "h"
                )
            )
        )
        followingListAdapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}