// Generated by view binder compiler. Do not edit!
package com.example.bushub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class TotalPriceBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView Total;

  @NonNull
  public final TextView selectionText1;

  private TotalPriceBinding(@NonNull LinearLayout rootView, @NonNull TextView Total,
      @NonNull TextView selectionText1) {
    this.rootView = rootView;
    this.Total = Total;
    this.selectionText1 = selectionText1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TotalPriceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TotalPriceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.total_price, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TotalPriceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Total;
      TextView Total = ViewBindings.findChildViewById(rootView, id);
      if (Total == null) {
        break missingId;
      }

      id = R.id.selectionText1;
      TextView selectionText1 = ViewBindings.findChildViewById(rootView, id);
      if (selectionText1 == null) {
        break missingId;
      }

      return new TotalPriceBinding((LinearLayout) rootView, Total, selectionText1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
