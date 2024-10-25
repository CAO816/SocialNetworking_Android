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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class YourPersonalPageViewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDetail;

  @NonNull
  public final CircleImageView civAvatar;

  @NonNull
  public final LinearLayout clPersonalPageArea;

  @NonNull
  public final ImageView ivFriend;

  @NonNull
  public final LinearLayout llFriend;

  @NonNull
  public final LinearLayout llMessage;

  @NonNull
  public final RecyclerView rvPostArea;

  @NonNull
  public final RecyclerView rvYourFriend;

  @NonNull
  public final TextView tvChat;

  @NonNull
  public final TextView tvFriend;

  @NonNull
  public final TextView tvFriends;

  @NonNull
  public final TextView tvFullname;

  @NonNull
  public final TextView tvSeeAll;

  @NonNull
  public final TextView tvUsername;

  private YourPersonalPageViewBinding(@NonNull LinearLayout rootView, @NonNull Button btnDetail,
      @NonNull CircleImageView civAvatar, @NonNull LinearLayout clPersonalPageArea,
      @NonNull ImageView ivFriend, @NonNull LinearLayout llFriend, @NonNull LinearLayout llMessage,
      @NonNull RecyclerView rvPostArea, @NonNull RecyclerView rvYourFriend,
      @NonNull TextView tvChat, @NonNull TextView tvFriend, @NonNull TextView tvFriends,
      @NonNull TextView tvFullname, @NonNull TextView tvSeeAll, @NonNull TextView tvUsername) {
    this.rootView = rootView;
    this.btnDetail = btnDetail;
    this.civAvatar = civAvatar;
    this.clPersonalPageArea = clPersonalPageArea;
    this.ivFriend = ivFriend;
    this.llFriend = llFriend;
    this.llMessage = llMessage;
    this.rvPostArea = rvPostArea;
    this.rvYourFriend = rvYourFriend;
    this.tvChat = tvChat;
    this.tvFriend = tvFriend;
    this.tvFriends = tvFriends;
    this.tvFullname = tvFullname;
    this.tvSeeAll = tvSeeAll;
    this.tvUsername = tvUsername;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static YourPersonalPageViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static YourPersonalPageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.your_personal_page_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static YourPersonalPageViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDetail;
      Button btnDetail = ViewBindings.findChildViewById(rootView, id);
      if (btnDetail == null) {
        break missingId;
      }

      id = R.id.civAvatar;
      CircleImageView civAvatar = ViewBindings.findChildViewById(rootView, id);
      if (civAvatar == null) {
        break missingId;
      }

      LinearLayout clPersonalPageArea = (LinearLayout) rootView;

      id = R.id.ivFriend;
      ImageView ivFriend = ViewBindings.findChildViewById(rootView, id);
      if (ivFriend == null) {
        break missingId;
      }

      id = R.id.llFriend;
      LinearLayout llFriend = ViewBindings.findChildViewById(rootView, id);
      if (llFriend == null) {
        break missingId;
      }

      id = R.id.llMessage;
      LinearLayout llMessage = ViewBindings.findChildViewById(rootView, id);
      if (llMessage == null) {
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

      id = R.id.tvChat;
      TextView tvChat = ViewBindings.findChildViewById(rootView, id);
      if (tvChat == null) {
        break missingId;
      }

      id = R.id.tvFriend;
      TextView tvFriend = ViewBindings.findChildViewById(rootView, id);
      if (tvFriend == null) {
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

      id = R.id.tvSeeAll;
      TextView tvSeeAll = ViewBindings.findChildViewById(rootView, id);
      if (tvSeeAll == null) {
        break missingId;
      }

      id = R.id.tvUsername;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      return new YourPersonalPageViewBinding((LinearLayout) rootView, btnDetail, civAvatar,
          clPersonalPageArea, ivFriend, llFriend, llMessage, rvPostArea, rvYourFriend, tvChat,
          tvFriend, tvFriends, tvFullname, tvSeeAll, tvUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}