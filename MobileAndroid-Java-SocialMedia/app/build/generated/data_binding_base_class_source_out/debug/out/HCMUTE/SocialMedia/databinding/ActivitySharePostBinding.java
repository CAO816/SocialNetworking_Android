// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySharePostBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btSharePost;

  @NonNull
  public final EditText etShare;

  @NonNull
  public final CircleImageView ivAvatar;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final Spinner spModePost;

  @NonNull
  public final TextView tvFullName;

  @NonNull
  public final TextView tvSharePost;

  private ActivitySharePostBinding(@NonNull RelativeLayout rootView, @NonNull Button btSharePost,
      @NonNull EditText etShare, @NonNull CircleImageView ivAvatar, @NonNull ImageView ivBack,
      @NonNull Spinner spModePost, @NonNull TextView tvFullName, @NonNull TextView tvSharePost) {
    this.rootView = rootView;
    this.btSharePost = btSharePost;
    this.etShare = etShare;
    this.ivAvatar = ivAvatar;
    this.ivBack = ivBack;
    this.spModePost = spModePost;
    this.tvFullName = tvFullName;
    this.tvSharePost = tvSharePost;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySharePostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySharePostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_share_post, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySharePostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btSharePost;
      Button btSharePost = ViewBindings.findChildViewById(rootView, id);
      if (btSharePost == null) {
        break missingId;
      }

      id = R.id.etShare;
      EditText etShare = ViewBindings.findChildViewById(rootView, id);
      if (etShare == null) {
        break missingId;
      }

      id = R.id.ivAvatar;
      CircleImageView ivAvatar = ViewBindings.findChildViewById(rootView, id);
      if (ivAvatar == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.spModePost;
      Spinner spModePost = ViewBindings.findChildViewById(rootView, id);
      if (spModePost == null) {
        break missingId;
      }

      id = R.id.tvFullName;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      id = R.id.tvSharePost;
      TextView tvSharePost = ViewBindings.findChildViewById(rootView, id);
      if (tvSharePost == null) {
        break missingId;
      }

      return new ActivitySharePostBinding((RelativeLayout) rootView, btSharePost, etShare, ivAvatar,
          ivBack, spModePost, tvFullName, tvSharePost);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}