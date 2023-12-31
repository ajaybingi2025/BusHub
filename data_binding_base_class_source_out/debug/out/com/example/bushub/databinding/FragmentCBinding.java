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

public final class FragmentCBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView historyBan;

  @NonNull
  public final TextView historyGoa;

  @NonNull
  public final TextView historyWar;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView offers;

  private FragmentCBinding(@NonNull LinearLayout rootView, @NonNull TextView historyBan,
      @NonNull TextView historyGoa, @NonNull TextView historyWar, @NonNull TextView name,
      @NonNull TextView offers) {
    this.rootView = rootView;
    this.historyBan = historyBan;
    this.historyGoa = historyGoa;
    this.historyWar = historyWar;
    this.name = name;
    this.offers = offers;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_c, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.history_ban;
      TextView historyBan = ViewBindings.findChildViewById(rootView, id);
      if (historyBan == null) {
        break missingId;
      }

      id = R.id.history_goa;
      TextView historyGoa = ViewBindings.findChildViewById(rootView, id);
      if (historyGoa == null) {
        break missingId;
      }

      id = R.id.history_war;
      TextView historyWar = ViewBindings.findChildViewById(rootView, id);
      if (historyWar == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.offers;
      TextView offers = ViewBindings.findChildViewById(rootView, id);
      if (offers == null) {
        break missingId;
      }

      return new FragmentCBinding((LinearLayout) rootView, historyBan, historyGoa, historyWar, name,
          offers);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
