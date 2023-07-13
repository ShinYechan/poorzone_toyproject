package com.example.poorzone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.poorzone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    fun init(){
        val nav = binding.bnvMain

        nav.run {
            setOnItemSelectedListener {
                when(it.itemId){
                    R.id.first->{
                        val moneyTipFragment = MoneyTipFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container, moneyTipFragment).commit()
                    }
                    R.id.second->{
                        val homeFragment = HomeFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container, homeFragment).commit()
                    }
                    R.id.third->{
                        val mypageFragment = MypageFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container, mypageFragment).commit()
                    }
                }
                true
            }
            selectedItemId = R.id.second
        }
    }
}