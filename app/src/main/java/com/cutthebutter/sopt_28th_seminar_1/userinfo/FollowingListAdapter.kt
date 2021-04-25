package com.cutthebutter.sopt_28th_seminar_1.userinfo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cutthebutter.sopt_28th_seminar_1.databinding.ItemFollowingUserBinding

class FollowingListAdapter : RecyclerView.Adapter<FollowingListAdapter.FollowingUserViewHolder> () {
    val userList = mutableListOf<FollowingUserInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FollowingUserViewHolder {
        val binding = ItemFollowingUserBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return FollowingUserViewHolder(binding)
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(
        holder: FollowingUserViewHolder,
        position: Int
    ) {
        holder.onBind(userList[position])
    }

    class FollowingUserViewHolder(
        private val binding : ItemFollowingUserBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(followingUserInfo: FollowingUserInfo){
            binding.followUserName.text = followingUserInfo.userName
        }
    }
}