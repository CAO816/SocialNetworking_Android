// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityForgetAccountBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnFindAccount;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final TextView tvEmailAdress;

  @NonNull
  public final TextView tvFindYourAccount;

  private ActivityForgetAccountBinding(@NonNull LinearLayout rootView,
      @NonNull Button btnFindAccount, @NonNull EditText etEmail, @NonNull ImageView ivBack,
      @NonNull TextView tvEmailAdress, @NonNull TextView tvFindYourAccount) {
    this.rootView = rootView;
    this.btnFindAccount = btnFindAccount;
    this.etEmail = etEmail;
    this.ivBack = ivBack;
    this.tvEmailAdress = tvEmailAdress;
    this.tvFindYourAccount = tvFindYourAccount;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgetAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgetAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forget_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgetAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnFindAccount;
      Button btnFindAccount = ViewBindings.findChildViewById(rootView, id);
      if (btnFindAccount == null) {
        break missingId;
      }

      id = R.id.etEmail;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.tvEmailAdress;
      TextView tvEmailAdress = ViewBindings.findChildViewById(rootView, id);
      if (tvEmailAdress == null) {
        break missingId;
      }

      id = R.id.tvFindYourAccount;
      TextView tvFindYourAccount = ViewBindings.findChildViewById(rootView, id);
      if (tvFindYourAccount == null) {
        break missingId;
      }

      return new ActivityForgetAccountBinding((LinearLayout) rootView, btnFindAccount, etEmail,
          ivBack, tvEmailAdress, tvFindYourAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
