// Generated by view binder compiler. Do not edit!
package com.example.bushub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
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

public final class BusSeatsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView bangalore;

  @NonNull
  public final Button confirm;

  @NonNull
  public final ImageView hamburgerMenu;

  @NonNull
  public final CheckBox seat1;

  @NonNull
  public final CheckBox seat10;

  @NonNull
  public final CheckBox seat11;

  @NonNull
  public final CheckBox seat12;

  @NonNull
  public final CheckBox seat13;

  @NonNull
  public final CheckBox seat14;

  @NonNull
  public final CheckBox seat15;

  @NonNull
  public final CheckBox seat16;

  @NonNull
  public final CheckBox seat17;

  @NonNull
  public final CheckBox seat18;

  @NonNull
  public final CheckBox seat19;

  @NonNull
  public final CheckBox seat2;

  @NonNull
  public final CheckBox seat20;

  @NonNull
  public final CheckBox seat3;

  @NonNull
  public final CheckBox seat4;

  @NonNull
  public final CheckBox seat5;

  @NonNull
  public final CheckBox seat6;

  @NonNull
  public final CheckBox seat7;

  @NonNull
  public final CheckBox seat8;

  @NonNull
  public final CheckBox seat9;

  @NonNull
  public final TextView timings1;

  private BusSeatsBinding(@NonNull LinearLayout rootView, @NonNull TextView bangalore,
      @NonNull Button confirm, @NonNull ImageView hamburgerMenu, @NonNull CheckBox seat1,
      @NonNull CheckBox seat10, @NonNull CheckBox seat11, @NonNull CheckBox seat12,
      @NonNull CheckBox seat13, @NonNull CheckBox seat14, @NonNull CheckBox seat15,
      @NonNull CheckBox seat16, @NonNull CheckBox seat17, @NonNull CheckBox seat18,
      @NonNull CheckBox seat19, @NonNull CheckBox seat2, @NonNull CheckBox seat20,
      @NonNull CheckBox seat3, @NonNull CheckBox seat4, @NonNull CheckBox seat5,
      @NonNull CheckBox seat6, @NonNull CheckBox seat7, @NonNull CheckBox seat8,
      @NonNull CheckBox seat9, @NonNull TextView timings1) {
    this.rootView = rootView;
    this.bangalore = bangalore;
    this.confirm = confirm;
    this.hamburgerMenu = hamburgerMenu;
    this.seat1 = seat1;
    this.seat10 = seat10;
    this.seat11 = seat11;
    this.seat12 = seat12;
    this.seat13 = seat13;
    this.seat14 = seat14;
    this.seat15 = seat15;
    this.seat16 = seat16;
    this.seat17 = seat17;
    this.seat18 = seat18;
    this.seat19 = seat19;
    this.seat2 = seat2;
    this.seat20 = seat20;
    this.seat3 = seat3;
    this.seat4 = seat4;
    this.seat5 = seat5;
    this.seat6 = seat6;
    this.seat7 = seat7;
    this.seat8 = seat8;
    this.seat9 = seat9;
    this.timings1 = timings1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BusSeatsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BusSeatsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bus_seats, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BusSeatsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bangalore;
      TextView bangalore = ViewBindings.findChildViewById(rootView, id);
      if (bangalore == null) {
        break missingId;
      }

      id = R.id.confirm_;
      Button confirm = ViewBindings.findChildViewById(rootView, id);
      if (confirm == null) {
        break missingId;
      }

      id = R.id.hamburgerMenu;
      ImageView hamburgerMenu = ViewBindings.findChildViewById(rootView, id);
      if (hamburgerMenu == null) {
        break missingId;
      }

      id = R.id.seat1_;
      CheckBox seat1 = ViewBindings.findChildViewById(rootView, id);
      if (seat1 == null) {
        break missingId;
      }

      id = R.id.seat10_;
      CheckBox seat10 = ViewBindings.findChildViewById(rootView, id);
      if (seat10 == null) {
        break missingId;
      }

      id = R.id.seat11_;
      CheckBox seat11 = ViewBindings.findChildViewById(rootView, id);
      if (seat11 == null) {
        break missingId;
      }

      id = R.id.seat12_;
      CheckBox seat12 = ViewBindings.findChildViewById(rootView, id);
      if (seat12 == null) {
        break missingId;
      }

      id = R.id.seat13_;
      CheckBox seat13 = ViewBindings.findChildViewById(rootView, id);
      if (seat13 == null) {
        break missingId;
      }

      id = R.id.seat14_;
      CheckBox seat14 = ViewBindings.findChildViewById(rootView, id);
      if (seat14 == null) {
        break missingId;
      }

      id = R.id.seat15_;
      CheckBox seat15 = ViewBindings.findChildViewById(rootView, id);
      if (seat15 == null) {
        break missingId;
      }

      id = R.id.seat16_;
      CheckBox seat16 = ViewBindings.findChildViewById(rootView, id);
      if (seat16 == null) {
        break missingId;
      }

      id = R.id.seat17_;
      CheckBox seat17 = ViewBindings.findChildViewById(rootView, id);
      if (seat17 == null) {
        break missingId;
      }

      id = R.id.seat18_;
      CheckBox seat18 = ViewBindings.findChildViewById(rootView, id);
      if (seat18 == null) {
        break missingId;
      }

      id = R.id.seat19_;
      CheckBox seat19 = ViewBindings.findChildViewById(rootView, id);
      if (seat19 == null) {
        break missingId;
      }

      id = R.id.seat2_;
      CheckBox seat2 = ViewBindings.findChildViewById(rootView, id);
      if (seat2 == null) {
        break missingId;
      }

      id = R.id.seat20_;
      CheckBox seat20 = ViewBindings.findChildViewById(rootView, id);
      if (seat20 == null) {
        break missingId;
      }

      id = R.id.seat3_;
      CheckBox seat3 = ViewBindings.findChildViewById(rootView, id);
      if (seat3 == null) {
        break missingId;
      }

      id = R.id.seat4_;
      CheckBox seat4 = ViewBindings.findChildViewById(rootView, id);
      if (seat4 == null) {
        break missingId;
      }

      id = R.id.seat5_;
      CheckBox seat5 = ViewBindings.findChildViewById(rootView, id);
      if (seat5 == null) {
        break missingId;
      }

      id = R.id.seat6_;
      CheckBox seat6 = ViewBindings.findChildViewById(rootView, id);
      if (seat6 == null) {
        break missingId;
      }

      id = R.id.seat7_;
      CheckBox seat7 = ViewBindings.findChildViewById(rootView, id);
      if (seat7 == null) {
        break missingId;
      }

      id = R.id.seat8_;
      CheckBox seat8 = ViewBindings.findChildViewById(rootView, id);
      if (seat8 == null) {
        break missingId;
      }

      id = R.id.seat9_;
      CheckBox seat9 = ViewBindings.findChildViewById(rootView, id);
      if (seat9 == null) {
        break missingId;
      }

      id = R.id.timings1;
      TextView timings1 = ViewBindings.findChildViewById(rootView, id);
      if (timings1 == null) {
        break missingId;
      }

      return new BusSeatsBinding((LinearLayout) rootView, bangalore, confirm, hamburgerMenu, seat1,
          seat10, seat11, seat12, seat13, seat14, seat15, seat16, seat17, seat18, seat19, seat2,
          seat20, seat3, seat4, seat5, seat6, seat7, seat8, seat9, timings1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
