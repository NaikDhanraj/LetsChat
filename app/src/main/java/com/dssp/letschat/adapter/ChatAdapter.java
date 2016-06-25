package com.dssp.letschat.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dssp.letschat.R;
import com.dssp.letschat.model.MessageModel;

import java.util.List;

/**
 * Created by dhanrajnaik522 on 6/25/2016.
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {

    private Context context;
    private List<MessageModel> messageList;
    private LayoutInflater inflater = null;
    private static final int CURRENT_USER_TYPE = 1;
    private static final int OTHER_USER_TYPE = 2;

    public ChatAdapter(Context context, List<MessageModel> messageList) {
        this.context = context;
        this.messageList = messageList;
        inflater = LayoutInflater.from(context);
    }



/*    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView currentUser;

        public MyViewHolder(View view) {
            super(view);
            currentUser = (TextView) view.findViewById(R.id.tv_currentuser);
        }
    }*/

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View view) {
            super(view);
        }
    }

    public class CurrentUserVH extends MyViewHolder{
       private TextView currentUser;
        public CurrentUserVH(View view) {
            super(view);
            currentUser = (TextView) view.findViewById(R.id.tv_currentuser);
        }
    }

    public class OtherUserVH extends MyViewHolder{
        private TextView otherUser;
        public OtherUserVH(View view) {
            super(view);
            otherUser = (TextView) view.findViewById(R.id.tv_otheruser);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      /*  View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,parent,false);
        return new MyViewHolder(itemView);*/
        View view;
        if(viewType == CURRENT_USER_TYPE){
//            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,parent,false);
            view = inflater.inflate(R.layout.item_chat,parent,false);
            return new CurrentUserVH(view);

        }else if(viewType == OTHER_USER_TYPE){
//            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat2,parent,false);
            view = inflater.inflate(R.layout.item_chat2,parent,false);
            return new OtherUserVH(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

     /*   MessageModel messages = messageList.get(position);
        holder.currentUser.setText(messages.getMsg());*/

        MessageModel messages = messageList.get(position);
        if( holder.getItemViewType() == CURRENT_USER_TYPE ){
            CurrentUserVH currentUserVH = (CurrentUserVH) holder;
            currentUserVH.currentUser.setText(messages.getMsg());

        }else if(holder.getItemViewType() == OTHER_USER_TYPE){
            OtherUserVH otherUserVH = (OtherUserVH) holder;
            otherUserVH.otherUser.setText(messages.getMsg());
        }

    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return messageList.get(position).getUserType();
    }
}
