// Generated by view binder compiler. Do not edit!
package com.example.bushub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bushub.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LocationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AutoCompleteTextView atvLocation;

  @NonNull
  public final Button homepage;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView4;

  private LocationBinding(@NonNull ConstraintLayout rootView,
      @NonNull AutoCompleteTextView atvLocation, @NonNull Button homepage,
      @NonNull ImageView imageView, @NonNull TextInputLayout textInputLayout,
      @NonNull TextView textView1, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.atvLocation = atvLocation;
    this.homepage = homepage;
    this.imageView = imageView;
    this.textInputLayout = textInputLayout;
    this.textView1 = textView1;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.location, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.atv_location;
      AutoCompleteTextView atvLocation = ViewBindings.findChildViewById(rootView, id);
      if (atvLocation == null) {
        break missingId;
      }

      id = R.id.homepage;
      Button homepage = ViewBindings.findChildViewById(rootView, id);
      if (homepage == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new LocationBinding((ConstraintLayout) rootView, atvLocation, homepage, imageView,
          textInputLayout, textView1, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
