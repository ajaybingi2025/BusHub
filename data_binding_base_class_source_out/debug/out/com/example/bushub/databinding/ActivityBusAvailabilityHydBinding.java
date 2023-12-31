// Generated by view binder compiler. Do not edit!
package com.example.bushub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bushub.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBusAvailabilityHydBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView garudaHyd;

  @NonNull
  public final ImageView hamburgerMenu;

  @NonNull
  public final TextView hello;

  @NonNull
  public final TextView superluxuryHyd;

  @NonNull
  public final TextView volvoHyd;

  private ActivityBusAvailabilityHydBinding(@NonNull LinearLayout rootView,
      @NonNull TextView garudaHyd, @NonNull ImageView hamburgerMenu, @NonNull TextView hello,
      @NonNull TextView superluxuryHyd, @NonNull TextView volvoHyd) {
    this.rootView = rootView;
    this.garudaHyd = garudaHyd;
    this.hamburgerMenu = hamburgerMenu;
    this.hello = hello;
    this.superluxuryHyd = superluxuryHyd;
    this.volvoHyd = volvoHyd;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBusAvailabilityHydBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBusAvailabilityHydBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bus_availability_hyd, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBusAvailabilityHydBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.garuda_hyd;
      TextView garudaHyd = ViewBindings.findChildViewById(rootView, id);
      if (garudaHyd == null) {
        break missingId;
      }

      id = R.id.hamburgerMenu;
      ImageView hamburgerMenu = ViewBindings.findChildViewById(rootView, id);
      if (hamburgerMenu == null) {
        break missingId;
      }

      id = R.id.hello;
      TextView hello = ViewBindings.findChildViewById(rootView, id);
      if (hello == null) {
        break missingId;
      }

      id = R.id.superluxury_hyd;
      TextView superluxuryHyd = ViewBindings.findChildViewById(rootView, id);
      if (superluxuryHyd == null) {
        break missingId;
      }

      id = R.id.volvo_hyd;
      TextView volvoHyd = ViewBindings.findChildViewById(rootView, id);
      if (volvoHyd == null) {
        break missingId;
      }

      return new ActivityBusAvailabilityHydBinding((LinearLayout) rootView, garudaHyd,
          hamburgerMenu, hello, superluxuryHyd, volvoHyd);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
