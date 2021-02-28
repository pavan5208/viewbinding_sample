package com.sample.view.binding.view.binding.sample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.sample.view.binding.view.binding.sample.databinding.FragmentSampleBinding

class SampleFragment : Fragment(R.layout.fragment_sample)  {

    // Scoped to the lifecycle of the fragment's view (between onCreateView and onDestroyView)
    private var fragmentBlankBinding: FragmentSampleBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentSampleBinding.bind(view)
        fragmentBlankBinding = binding
        binding.txtFragmentSample.text = "Hai Sample"
    }

    override fun onDestroyView() {
        // Do not store the binding instance in a field, if not required.
        fragmentBlankBinding = null
        super.onDestroyView()
    }

}