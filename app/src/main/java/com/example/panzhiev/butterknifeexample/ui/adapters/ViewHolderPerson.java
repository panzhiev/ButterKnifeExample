package com.example.panzhiev.butterknifeexample.ui.adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.panzhiev.butterknifeexample.R2;
import com.example.panzhiev.butterknifeexample.ui.activities.DetailActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Tim on 22.01.2017.
 */

public class ViewHolderPerson extends RecyclerView.ViewHolder {

    @BindView(R2.id.profile_image) CircleImageView mCircleImageView;
    @BindView(R2.id.text_view_name) TextView mTextView;

    public ViewHolderPerson(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @OnClick(R2.id.card_view_person)
    public void clickOnItem(View view) {
        Intent i = new Intent(view.getContext(), DetailActivity.class);
        view.getContext().startActivity(i);
    }
}
