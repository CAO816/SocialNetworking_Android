// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFindAccountBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnContinue;

  @NonNull
  public final CircleImageView civAvatar;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final TextView tvNotify;

  @NonNull
  public final TextView tvUsername;

  private ActivityFindAccountBinding(@NonNull LinearLayout rootView, @NonNull Button btnContinue,
      @NonNull CircleImageView civAvatar, @NonNull ImageView ivBack, @NonNull TextView tvNotify,
      @NonNull TextView tvUsername) {
    this.rootView = rootView;
    this.btnContinue = btnContinue;
    this.civAvatar = civAvatar;
    this.ivBack = ivBack;
    this.tvNotify = tvNotify;
    this.tvUsername = tvUsername;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFindAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFindAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_find_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFindAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnContinue;
      Button btnContinue = ViewBindings.findChildViewById(rootView, id);
      if (btnContinue == null) {
        break missingId;
      }

      id = R.id.civAvatar;
      CircleImageView civAvatar = ViewBindings.findChildViewById(rootView, id);
      if (civAvatar == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.tvNotify;
      TextView tvNotify = ViewBindings.findChildViewById(rootView, id);
      if (tvNotify == null) {
        break missingId;
      }

      id = R.id.tvUsername;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      return new ActivityFindAccountBinding((LinearLayout) rootView, btnContinue, civAvatar, ivBack,
          tvNotify, tvUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
