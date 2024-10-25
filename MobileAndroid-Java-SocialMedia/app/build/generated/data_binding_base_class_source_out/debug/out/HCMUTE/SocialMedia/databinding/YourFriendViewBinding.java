// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class YourFriendViewBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btSendMessage;

  @NonNull
  public final Button btViewProfile;

  @NonNull
  public final CircleImageView ivAvatar;

  @NonNull
  public final TextView tvFullName;

  private YourFriendViewBinding(@NonNull RelativeLayout rootView, @NonNull Button btSendMessage,
      @NonNull Button btViewProfile, @NonNull CircleImageView ivAvatar,
      @NonNull TextView tvFullName) {
    this.rootView = rootView;
    this.btSendMessage = btSendMessage;
    this.btViewProfile = btViewProfile;
    this.ivAvatar = ivAvatar;
    this.tvFullName = tvFullName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static YourFriendViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static YourFriendViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.your_friend_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static YourFriendViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btSendMessage;
      Button btSendMessage = ViewBindings.findChildViewById(rootView, id);
      if (btSendMessage == null) {
        break missingId;
      }

      id = R.id.btViewProfile;
      Button btViewProfile = ViewBindings.findChildViewById(rootView, id);
      if (btViewProfile == null) {
        break missingId;
      }

      id = R.id.ivAvatar;
      CircleImageView ivAvatar = ViewBindings.findChildViewById(rootView, id);
      if (ivAvatar == null) {
        break missingId;
      }

      id = R.id.tvFullName;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      return new YourFriendViewBinding((RelativeLayout) rootView, btSendMessage, btViewProfile,
          ivAvatar, tvFullName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}