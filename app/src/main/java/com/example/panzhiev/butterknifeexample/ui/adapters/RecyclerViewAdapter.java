package com.example.panzhiev.butterknifeexample.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.panzhiev.butterknifeexample.R;
import com.example.panzhiev.butterknifeexample.model.Person;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolderPerson> {

    private Context mContext;
    private List<Person> persons;

    public RecyclerViewAdapter(Context mContext, ArrayList persons) {
        this.mContext = mContext;
        this.persons = persons;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ViewHolderPerson onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);
        ViewHolderPerson holder = new ViewHolderPerson(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolderPerson holder, int position) {

        final Person person = (Person) persons.get(position);

        holder.mTextView.setText(person.getmName());
        Picasso.with(holder.mCircleImageView.getContext())
                .load(person.getmPhoto())
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.mCircleImageView);
    }

    public void resetData (ArrayList al)
    {
        persons = al;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}
