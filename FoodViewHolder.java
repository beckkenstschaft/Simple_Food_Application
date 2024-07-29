package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView nameTextView;
    public TextView descriptionTextView;

    public FoodViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.foodImage);
        nameTextView = itemView.findViewById(R.id.foodName);
        descriptionTextView = itemView.findViewById(R.id.foodDescription);
    }

    public void bind(FoodDomain food) {
        nameTextView.setText(food.getName());
        descriptionTextView.setText(food.getDescription());
        imageView.setImageResource(food.getImageResource()); // Use getImageResource method
    }
}
