package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageGalleryAdapter2 extends RecyclerView.Adapter<examViewHolder> {

    List<examData> list;
    Context context;
    exam.ClickListiner listener;
    private int index;

    public ImageGalleryAdapter2(List<examData> list, Context context, exam.ClickListiner listener) {
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    @Override
    public examViewHolder
    onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View photoView = inflater.inflate(R.layout.exam_card, parent, false);
        examViewHolder viewHolder = new examViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void
    onBindViewHolder(final examViewHolder viewHolder, final int position) {
        index = viewHolder.getAdapterPosition();
        viewHolder.examName.setText(list.get(position).name);
        viewHolder.examDate.setText(list.get(position).date);
        viewHolder.examMessage.setText(list.get(position).message);
        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(index);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
