package com.example.thirdrecyclereview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter  extends RecyclerView.Adapter<PersonViewHolder>{
    private ArrayList<Person> person;

    public PersonAdapter(ArrayList<Person> person) {
        this.person = person;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_person, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.bind(person.get(position));
    }

    @Override
    public int getItemCount() {
        return person.size();
    }
}
