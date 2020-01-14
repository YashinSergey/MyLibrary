package com.iashinsergei.mylibrary.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iashinsergei.mylibrary.R;
import com.iashinsergei.mylibrary.model.entity.Book;

import java.util.List;

public class RvHomeAdapter extends RecyclerView.Adapter<RvHomeAdapter.HomeViewHolder> {

    private List<Book> bookList;

    public RvHomeAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.bind(bookList.get(position));
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView author;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title_home);
            author = itemView.findViewById(R.id.tv_author_home);
        }

        public void bind(Book book){
            title.setText(book.getName());
            author.setText(book.getAuthor());
        }
    }
}
