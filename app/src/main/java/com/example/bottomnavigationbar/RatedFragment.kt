package com.example.bottomnavigationbar


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_rated.*

@SuppressLint("SetTextI18n")
class RatedFragment : Fragment() {

    private val args: RatedFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rated, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rating = args.rating

        var plural = "star"

        if (rating >= 2 || rating == 0f) {
            plural += "s"
        }

        if (rating % 1 == 0f) {
            tvThankYou.text = "Thank you for rating us with ${rating.toInt()} $plural"
        } else {
            tvThankYou.text = "Thank you for rating us with $rating $plural"
        }
    }
}

