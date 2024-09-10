package com.example.thirdrecyclereview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thirdrecyclereview.databinding.FragmentRecycleReviewBinding;

import java.util.ArrayList;


public class RecycleReviewFragment extends Fragment {
    private FragmentRecycleReviewBinding binding;

    private ArrayList<Person> contacts = new ArrayList<>();

    private PersonAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRecycleReviewBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new PersonAdapter(contacts);
        binding.rvSecond.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        contacts.add(new Person("Johan", "working 1 year", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Person("Alex", "not work yet", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Person("Jake", "working 10 year", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Person("William", "working 5 year", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Person("James", "working 9 mouth", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Person("Liam", "working 3 mouth", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
        contacts.add(new Person("John", "working 2 week", "https://www.google.com/imgres?q=default%20avatar&imgurl=https%3A%2F%2Fst3.depositphotos.com%2F9998432%2F13335%2Fv%2F450%2Fdepositphotos_133352156-stock-illustration-default-placeholder-profile-icon.jpg&imgrefurl=https%3A%2F%2Fdepositphotos.com%2Fvectors%2Fdefault-avatar.html&docid=_GCbjDSfxSuXWM&tbnid=KfWX9yd1T3rXDM&vet=12ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA..i&w=600&h=600&hcb=2&ved=2ahUKEwiv-LaLnriIAxXCCRAIHUolBCUQM3oECF4QAA"));
    }
}