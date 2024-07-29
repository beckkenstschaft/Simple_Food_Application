package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Pizza                                        $4.99", "Delicious cheese pizza", R.drawable.pizza));
        foodList.add(new FoodDomain("Burger                                     $3.99", "Juicy beef burger", R.drawable.burger));
        foodList.add(new FoodDomain("Pasta                                       $5.99", "Spicy cheesy pasta", R.drawable.pasta));
        foodList.add(new FoodDomain("Noodles                                   $5.99", "Sweet and sour Hakka Noodles", R.drawable.noodle));
        foodList.add(new FoodDomain("Fried Chicken                          $9.99", "Spicy crispy Chicken Legs", R.drawable.fried_chicken));
        foodList.add(new FoodDomain("Chicken Sub                            $7.99", "Cheesy Chicken Sub", R.drawable.subs));
        foodList.add(new FoodDomain("Mojito                                      $2.99", "Fresh and refreshing Mojito", R.drawable.mojito));

        FoodAdapter adapter = new FoodAdapter(this, foodList);
        recyclerView.setAdapter(adapter);
    }
}
