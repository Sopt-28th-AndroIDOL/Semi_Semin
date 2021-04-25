package com.cutthebutter.sopt_28th_seminar_1.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cutthebutter.sopt_28th_seminar_1.databinding.ItemRepositoryBinding

class RepositoryListAdapter : RecyclerView.Adapter<RepositoryListAdapter.RepositoryViewHolder> () {
    val repositoryList = mutableListOf<RepositoryInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RepositoryViewHolder {
        val binding = ItemRepositoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RepositoryViewHolder(binding)
    }

    override fun getItemCount(): Int = repositoryList.size

    override fun onBindViewHolder(
        holder: RepositoryViewHolder,
        position: Int
    ) {
        holder.onBind(repositoryList[position])
    }

    class RepositoryViewHolder(
        private val binding : ItemRepositoryBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(repositoryInfo: RepositoryInfo){
            binding.repositoryName.text = repositoryInfo.repositoryName
            binding.repositoryExplain.text = repositoryInfo.repositoryExplain
            binding.repositoryLanguage.text = repositoryInfo.repositoryLanguage
        }
    }
}