package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private final Context context;
    private final ArrayList<FoodDomain> foodList;

    public FoodAdapter(Context context, ArrayList<FoodDomain> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodDomain food = foodList.get(position);

        holder.foodImage.setImageResource(food.getImageResource()); // Assuming drawable resource ID
        holder.foodName.setText(food.getName());
        holder.foodDescription.setText(food.getDescription());

        holder.buyNowButton.setOnClickListener(v -> {
            // Handle "Buy Now" button click
            // For example, show a Toast or start a new activity
            // Toast.makeText(context, "Buying " + food.getName(), Toast.LENGTH_SHORT).show();
            // Or handle the purchase logic here
        });
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImage;
        TextView foodName;
        TextView foodDescription;
        Button buyNowButton;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.foodImage);
            foodName = itemView.findViewById(R.id.foodName);
            foodDescription = itemView.findViewById(R.id.foodDescription);
            buyNowButton = itemView.findViewById(R.id.buyNowButton);
        }
    }
}
