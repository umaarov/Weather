package uz.umarov.weather.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.umarov.weather.MainActivity
import uz.umarov.weather.databinding.FragmentVirtualBinding

class VirtualFragment : Fragment() {
    private lateinit var binding: FragmentVirtualBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVirtualBinding.inflate(inflater)

        binding.next.setOnClickListener {
            val homeFragment = HomeFragment()
            (activity as MainActivity).loadFragment(homeFragment)
        }

        if ((activity as MainActivity).permissions == 1) {
            binding.next.visibility = View.GONE
        } else {
            binding.next.visibility = View.VISIBLE
        }

        return binding.root
    }
}