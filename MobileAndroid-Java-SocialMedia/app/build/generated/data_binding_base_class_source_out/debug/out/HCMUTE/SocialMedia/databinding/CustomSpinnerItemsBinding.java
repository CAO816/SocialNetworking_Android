// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomSpinnerItemsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivMode;

  @NonNull
  public final TextView tvModeName;

  private CustomSpinnerItemsBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivMode,
      @NonNull TextView tvModeName) {
    this.rootView = rootView;
    this.ivMode = ivMode;
    this.tvModeName = tvModeName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomSpinnerItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomSpinnerItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_spinner_items, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomSpinnerItemsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivMode;
      ImageView ivMode = ViewBindings.findChildViewById(rootView, id);
      if (ivMode == null) {
        break missingId;
      }

      id = R.id.tvModeName;
      TextView tvModeName = ViewBindings.findChildViewById(rootView, id);
      if (tvModeName == null) {
        break missingId;
      }

      return new CustomSpinnerItemsBinding((LinearLayout) rootView, ivMode, tvModeName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
