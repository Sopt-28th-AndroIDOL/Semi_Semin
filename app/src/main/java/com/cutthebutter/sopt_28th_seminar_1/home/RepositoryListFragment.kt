package com.cutthebutter.sopt_28th_seminar_1.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cutthebutter.sopt_28th_seminar_1.databinding.FragmentRepositoryListBinding


class RepositoryListFragment  : Fragment() {
    private var _binding: FragmentRepositoryListBinding? = null
    private val binding get() = _binding ?: error("View를 참조하기위해 binding이 초기화되지 않았습니다.")

    private lateinit var repositoryListAdapter: RepositoryListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRepositoryListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        repositoryListAdapter = RepositoryListAdapter()
        binding.repositoryList.adapter = repositoryListAdapter

        repositoryListAdapter.repositoryList.addAll(
            listOf<RepositoryInfo>(
                RepositoryInfo(
                    repositoryName = "a",
                    repositoryExplain = "aa",
                    repositoryLanguage = "aaa"
                ),
                RepositoryInfo(
                    repositoryName = "b",
                    repositoryExplain = "bb",
                    repositoryLanguage = "bbb"
                ),
                RepositoryInfo(
                    repositoryName = "c",
                    repositoryExplain = "cc",
                    repositoryLanguage = "ccc"
                ),
                RepositoryInfo(
                    repositoryName = "d",
                    repositoryExplain = "d",
                    repositoryLanguage = "ddd"
                ),
                RepositoryInfo(
                    repositoryName = "e",
                    repositoryExplain = "ee",
                    repositoryLanguage = "eee"
                ),
                RepositoryInfo(
                    repositoryName = "f",
                    repositoryExplain = "ff",
                    repositoryLanguage = "fff"
                ),
                RepositoryInfo(
                    repositoryName = "a",
                    repositoryExplain = "aa",
                    repositoryLanguage = "aaa"
                ),
                RepositoryInfo(
                    repositoryName = "b",
                    repositoryExplain = "bb",
                    repositoryLanguage = "bbb"
                ),
                RepositoryInfo(
                    repositoryName = "c",
                    repositoryExplain = "cc",
                    repositoryLanguage = "ccc"
                ),
                RepositoryInfo(
                    repositoryName = "d",
                    repositoryExplain = "d",
                    repositoryLanguage = "ddd"
                ),
                RepositoryInfo(
                    repositoryName = "e",
                    repositoryExplain = "ee",
                    repositoryLanguage = "eee"
                )

            )
        )
        repositoryListAdapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}
