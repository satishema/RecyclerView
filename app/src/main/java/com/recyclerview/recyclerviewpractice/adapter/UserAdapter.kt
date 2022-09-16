package com.recyclerview.recyclerviewpractice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.recyclerviewpractice.R
import com.recyclerview.recyclerviewpractice.model.User

/**
 * Created by Mazhar Ali on 1/23/2022.
 * Company :infini8ai
 * Email : mazhar.qurbaniapp@gmail.com
 */
class UserAdapter(val mContext: Context) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private var userList: List<User> = ArrayList()

    fun setUserList(userList: ArrayList<User>) {
        this@UserAdapter.userList = userList
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        val View = LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_row_leeloo_members, parent, false)
        return ViewHolder(View)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        val user: User = userList[position]
        holder.userName.text = user.userName
        user.userImage?.let { holder.userImage.setImageResource(it) }
        holder.userDesignation.text = user.designation
    }


    override fun getItemCount(): Int {
        return userList.size
    }


    class ViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val userImage = itemView.findViewById<ImageView>(R.id.user_image)
        val userName = itemView.findViewById<TextView>(R.id.user_name)
        val userDesignation = itemView.findViewById<TextView>(R.id.user_designation)

    }


}