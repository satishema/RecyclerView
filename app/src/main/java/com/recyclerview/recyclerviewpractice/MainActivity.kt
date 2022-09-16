package com.recyclerview.recyclerviewpractice

import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.recyclerviewpractice.adapter.UserAdapter
import com.recyclerview.recyclerviewpractice.model.User

class MainActivity : AppCompatActivity() {

    private var userList: ArrayList<User> = ArrayList()
    lateinit var userAdapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        val userObj1 = User()
        userObj1.userImage = R.drawable.ic_person
        userObj1.userName = "Ragul"
        userObj1.designation = "Founder, CEO & IOS Developer"
        userList.add(userObj1)

        val userObj2 = User()
        userObj2.userImage = R.drawable.ic_person
        userObj2.userName = "Boopathi"
        userObj2.designation = "Co-Founder & Web Developer"
        userList.add(userObj2)

        val userObj3 = User()
        userObj3.userImage = R.drawable.ic_person
        userObj3.userName = "Satish"
        userObj3.designation = "Co-Founder & Android Developer"
        userList.add(userObj3)

        val userObj4 = User()
        userObj4.userImage = R.drawable.ic_person
        userObj4.userName = "Govarthan"
        userObj4.designation = "Co-Founder & Web Developer"
        userList.add(userObj4)

        val userObj5 = User()
        userObj5.userImage = R.drawable.ic_person
        userObj5.userName = "Radhakrishnan"
        userObj5.designation = "Co-Founder & UI/UX Designer"
        userList.add(userObj5)


        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            userAdapter= UserAdapter(this@MainActivity)
            userAdapter.setUserList(userList)
            adapter = userAdapter
        }

    }
}