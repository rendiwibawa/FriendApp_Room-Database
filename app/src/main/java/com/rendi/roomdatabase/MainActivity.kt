package com.rendi.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tampilMyfriendsFragment()
    }
    private fun gantiFragment(
        fragmentManager : FragmentManager,
        fragment : Fragment , frameId : Int
    ) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId,fragment)

        transaction.commit()

    }

     fun tampilMyfriendsFragment() {
        gantiFragment(supportFragmentManager,
            MyFriendsFragment.newInstance(), R.id.contentFrame)
    }
    fun tampilMyFriendAddFragment() {
        gantiFragment(supportFragmentManager,
            MyFriendsAddFragment.newInstance(), R.id.contentFrame)
    }



}
