package com.dssp.letschat.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.dssp.letschat.R;
import com.dssp.letschat.adapter.ChatAdapter;
import com.dssp.letschat.model.MessageModel;
import com.dssp.letschat.util.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String LOG_TAG = MainActivity.class.getSimpleName();
    private Context context = MainActivity.this;
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<MessageModel> messageList;
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * defining layouts
         */
        viewsTypcasting();

        /**
         * initializing list
         */
        messageList = new ArrayList<>();

        /**
         * setting adaper to recyclerview
         */
        setRecyclerView();

        /**
         *adding data to list
         */
        messagingData();





    }

    private void setRecyclerView() {
        layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        chatAdapter = new ChatAdapter(context,messageList);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(context,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(chatAdapter);
    }

    private void messagingData() {

        messageList.add(new MessageModel("this is test message 1",1));
        messageList.add(new MessageModel("this is test message 2",2));
        messageList.add(new MessageModel("this is test message 3",1));
        messageList.add(new MessageModel("this is test message 4",2));
        messageList.add(new MessageModel("this is test message 5",2));
        messageList.add(new MessageModel("this is test message 6",1));
        messageList.add(new MessageModel("this is test message 7",2));
        messageList.add(new MessageModel("this is test message 8",2));
        messageList.add(new MessageModel("this is test message 9",1));
        messageList.add(new MessageModel("this is test message 10",1));
        messageList.add(new MessageModel("this is test message 11",2));
        messageList.add(new MessageModel("this is test message 12",1));
        messageList.add(new MessageModel("this is test message 1",1));
        messageList.add(new MessageModel("this is test message 2",2));
        messageList.add(new MessageModel("this is test message 3",1));
        messageList.add(new MessageModel("this is test message 4",2));
        messageList.add(new MessageModel("this is test message 5",2));
        messageList.add(new MessageModel("this is test message 6",1));
        messageList.add(new MessageModel("this is test message 7",2));
        messageList.add(new MessageModel("this is test message 8",2));
        messageList.add(new MessageModel("this is test message 9",1));
        messageList.add(new MessageModel("this is test message 10",1));
        messageList.add(new MessageModel("this is test message 11",2));
        messageList.add(new MessageModel("this is test message 12",1));
        messageList.add(new MessageModel("this is test message 1",1));
        messageList.add(new MessageModel("this is test message 2",2));
        messageList.add(new MessageModel("this is test message 3",1));
        messageList.add(new MessageModel("this is test message 4",2));
        messageList.add(new MessageModel("this is test message 5",2));
        messageList.add(new MessageModel("this is test message 6",1));
        messageList.add(new MessageModel("this is test message 7",2));
        messageList.add(new MessageModel("this is test message 8",2));
        messageList.add(new MessageModel("this is test message 9",1));
        messageList.add(new MessageModel("this is test message 10",1));
        messageList.add(new MessageModel("this is test message 11",2));
        messageList.add(new MessageModel("this is test message 12",1));
        messageList.add(new MessageModel("this is test message 1",1));
        messageList.add(new MessageModel("this is test message 2",2));
        messageList.add(new MessageModel("this is test message 3",1));
        messageList.add(new MessageModel("this is test message 4",2));
        messageList.add(new MessageModel("this is test message 5",2));
        messageList.add(new MessageModel("this is test message 6",1));
        messageList.add(new MessageModel("this is test message 7",2));
        messageList.add(new MessageModel("this is test message 8",2));
        messageList.add(new MessageModel("this is test message 9",1));
        messageList.add(new MessageModel("this is test message 10",1));
        messageList.add(new MessageModel("this is test message 11",2));
        messageList.add(new MessageModel("this is test message 12",1));

        /**
         * notify recyclerview adapetr when new data is found
         */
        chatAdapter.notifyDataSetChanged();


    }

    private void viewsTypcasting() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }
}
