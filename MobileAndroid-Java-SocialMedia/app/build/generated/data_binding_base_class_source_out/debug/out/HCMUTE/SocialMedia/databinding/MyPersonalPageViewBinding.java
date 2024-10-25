// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MyPersonalPageViewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnEditProfile;

  @NonNull
  public final CircleImageView civAvatar;

  @NonNull
  public final CircleImageView civAvatarSmall;

  @NonNull
  public final LinearLayout clPersonalPageArea;

  @NonNull
  public final ImageButton ibImagePosting;

  @NonNull
  public final TextView ibTextPosting;

  @NonNull
  public final RecyclerView rvPostArea;

  @NonNull
  public final RecyclerView rvYourFriend;

  @NonNull
  public final TextView tvFindFriend;

  @NonNull
  public final TextView tvFriends;

  @NonNull
  public final TextView tvFullname;

  @NonNull
  public final TextView tvUsername;

  private MyPersonalPageViewBinding(@NonNull LinearLayout rootView, @NonNull Button btnEditProfile,
      @NonNull CircleImageView civAvatar, @NonNull CircleImageView civAvatarSmall,
      @NonNull LinearLayout clPersonalPageArea, @NonNull ImageButton ibImagePosting,
      @NonNull TextView ibTextPosting, @NonNull RecyclerView rvPostArea,
      @NonNull RecyclerView rvYourFriend, @NonNull TextView tvFindFriend,
      @NonNull TextView tvFriends, @NonNull TextView tvFullname, @NonNull TextView tvUsername) {
    this.rootView = rootView;
    this.btnEditProfile = btnEditProfile;
    this.civAvatar = civAvatar;
    this.civAvatarSmall = civAvatarSmall;
    this.clPersonalPageArea = clPersonalPageArea;
    this.ibImagePosting = ibImagePosting;
    this.ibTextPosting = ibTextPosting;
    this.rvPostArea = rvPostArea;
    this.rvYourFriend = rvYourFriend;
    this.tvFindFriend = tvFindFriend;
    this.tvFriends = tvFriends;
    this.tvFullname = tvFullname;
    this.tvUsername = tvUsername;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MyPersonalPageViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MyPersonalPageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.my_personal_page_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MyPersonalPageViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnEditProfile;
      Button btnEditProfile = ViewBindings.findChildViewById(rootView, id);
      if (btnEditProfile == null) {
        break missingId;
      }

      id = R.id.civAvatar;
      CircleImageView civAvatar = ViewBindings.findChildViewById(rootView, id);
      if (civAvatar == null) {
        break missingId;
      }

      id = R.id.civAvatarSmall;
      CircleImageView civAvatarSmall = ViewBindings.findChildViewById(rootView, id);
      if (civAvatarSmall == null) {
        break missingId;
      }

      LinearLayout clPersonalPageArea = (LinearLayout) rootView;

      id = R.id.ibImagePosting;
      ImageButton ibImagePosting = ViewBindings.findChildViewById(rootView, id);
      if (ibImagePosting == null) {
        break missingId;
      }

      id = R.id.ibTextPosting;
      TextView ibTextPosting = ViewBindings.findChildViewById(rootView, id);
      if (ibTextPosting == null) {
        break missingId;
      }

      id = R.id.rvPostArea;
      RecyclerView rvPostArea = ViewBindings.findChildViewById(rootView, id);
      if (rvPostArea == null) {
        break missingId;
      }

      id = R.id.rvYourFriend;
      RecyclerView rvYourFriend = ViewBindings.findChildViewById(rootView, id);
      if (rvYourFriend == null) {
        break missingId;
      }

      id = R.id.tvFindFriend;
      TextView tvFindFriend = ViewBindings.findChildViewById(rootView, id);
      if (tvFindFriend == null) {
        break missingId;
      }

      id = R.id.tvFriends;
      TextView tvFriends = ViewBindings.findChildViewById(rootView, id);
      if (tvFriends == null) {
        break missingId;
      }

      id = R.id.tvFullname;
      TextView tvFullname = ViewBindings.findChildViewById(rootView, id);
      if (tvFullname == null) {
        break missingId;
      }

      id = R.id.tvUsername;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      return new MyPersonalPageViewBinding((LinearLayout) rootView, btnEditProfile, civAvatar,
          civAvatarSmall, clPersonalPageArea, ibImagePosting, ibTextPosting, rvPostArea,
          rvYourFriend, tvFindFriend, tvFriends, tvFullname, tvUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
