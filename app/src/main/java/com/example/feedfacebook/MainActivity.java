package com.example.feedfacebook;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static class PostViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewUser;
        private TextView textViewTime;
        private TextView textViewUserName;
        private TextView textViewContent;
        private ImageView imageViewPost;
        private TextView textViewTitle;
        private TextView textViewSubTitle;


        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewUser.findViewById(R.id.image_view_user);
            textViewTime.findViewById(R.id.text_view_time);
            textViewUserName.findViewById(R.id.text_view_username);
            textViewContent.findViewById(R.id.text_view_content);
            imageViewPost.findViewById(R.id.image_view_post);
            textViewTitle.findViewById(R.id.text_view_post_title);
            textViewSubTitle.findViewById(R.id.text_view_post_subtitle);
        }
    }

    private class Post {

        private int ImageViewUser;
        private String textViewTime;
        private String textViewUserName;
        private String textViewContent;
        private int imageViewPost;
        private String textViewTitle;
        private String textViewSubTiltle;

        public int getImageViewUser() {
            return ImageViewUser;
        }

        public void setImageViewUser(int imageViewUser) {
            ImageViewUser = imageViewUser;
        }

        public String getTextViewTime() {
            return textViewTime;
        }

        public void setTextViewTime(String textViewTime) {
            this.textViewTime = textViewTime;
        }

        public String getTextViewUserName() {
            return textViewUserName;
        }

        public void setTextViewUserName(String textViewUserName) {
            this.textViewUserName = textViewUserName;
        }

        public String getTextViewContent() {
            return textViewContent;
        }

        public void setTextViewContent(String textViewContent) {
            this.textViewContent = textViewContent;
        }

        public int getImageViewPost() {
            return imageViewPost;
        }

        public void setImageViewPost(int imageViewPost) {
            this.imageViewPost = imageViewPost;
        }

        public String getTextViewTitle() {
            return textViewTitle;
        }

        public void setTextViewTitle(String textViewTitle) {
            this.textViewTitle = textViewTitle;
        }

        public String getTextViewSubTiltle() {
            return textViewSubTiltle;
        }

        public void setTextViewSubTiltle(String textViewSubTiltle) {
            this.textViewSubTiltle = textViewSubTiltle;
        }
    }
}
