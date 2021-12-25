package com.etwicaksono.infomovie.ui.list

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.etwicaksono.infomovie.R
import com.etwicaksono.infomovie.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding
    private lateinit var viewModel: ListViewModel
    private lateinit var listAdapter: ListAdapter
    private lateinit var type: String


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getString(TYPE)?.let { type = it }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[ListViewModel::class.java]

            val listAdapter = ListAdapter()

            when (type) {
                resources.getString(R.string.movies) ->
                    listAdapter.setMovies(viewModel.getAllMovies(requireContext()))
                resources.getString(R.string.tv_shows) ->
                    listAdapter.setMovies(viewModel.getAllTvShows(requireContext()))
            }

            binding?.rvAcademy?.apply {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = listAdapter
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val TYPE = "type"

        @JvmStatic
        fun newInstance(type: String): ListFragment =
            ListFragment().apply { arguments = Bundle().apply { putString(TYPE, type) } }
    }
}