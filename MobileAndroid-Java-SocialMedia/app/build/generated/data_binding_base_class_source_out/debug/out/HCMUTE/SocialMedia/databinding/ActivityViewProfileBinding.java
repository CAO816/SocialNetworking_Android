// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityViewProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText etCompany;

  @NonNull
  public final EditText etDescription;

  @NonNull
  public final EditText etLocation;

  @NonNull
  public final ImageButton ibBack;

  @NonNull
  public final RadioButton rbFemale;

  @NonNull
  public final RadioButton rbInARelationship;

  @NonNull
  public final RadioButton rbMale;

  @NonNull
  public final RadioButton rbSingle;

  @NonNull
  public final RadioGroup rgGender;

  @NonNull
  public final RadioGroup rgRelationship;

  @NonNull
  public final TextView tvFullName;

  private ActivityViewProfileBinding(@NonNull LinearLayout rootView, @NonNull EditText etCompany,
      @NonNull EditText etDescription, @NonNull EditText etLocation, @NonNull ImageButton ibBack,
      @NonNull RadioButton rbFemale, @NonNull RadioButton rbInARelationship,
      @NonNull RadioButton rbMale, @NonNull RadioButton rbSingle, @NonNull RadioGroup rgGender,
      @NonNull RadioGroup rgRelationship, @NonNull TextView tvFullName) {
    this.rootView = rootView;
    this.etCompany = etCompany;
    this.etDescription = etDescription;
    this.etLocation = etLocation;
    this.ibBack = ibBack;
    this.rbFemale = rbFemale;
    this.rbInARelationship = rbInARelationship;
    this.rbMale = rbMale;
    this.rbSingle = rbSingle;
    this.rgGender = rgGender;
    this.rgRelationship = rgRelationship;
    this.tvFullName = tvFullName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etCompany;
      EditText etCompany = ViewBindings.findChildViewById(rootView, id);
      if (etCompany == null) {
        break missingId;
      }

      id = R.id.etDescription;
      EditText etDescription = ViewBindings.findChildViewById(rootView, id);
      if (etDescription == null) {
        break missingId;
      }

      id = R.id.etLocation;
      EditText etLocation = ViewBindings.findChildViewById(rootView, id);
      if (etLocation == null) {
        break missingId;
      }

      id = R.id.ibBack;
      ImageButton ibBack = ViewBindings.findChildViewById(rootView, id);
      if (ibBack == null) {
        break missingId;
      }

      id = R.id.rbFemale;
      RadioButton rbFemale = ViewBindings.findChildViewById(rootView, id);
      if (rbFemale == null) {
        break missingId;
      }

      id = R.id.rbInARelationship;
      RadioButton rbInARelationship = ViewBindings.findChildViewById(rootView, id);
      if (rbInARelationship == null) {
        break missingId;
      }

      id = R.id.rbMale;
      RadioButton rbMale = ViewBindings.findChildViewById(rootView, id);
      if (rbMale == null) {
        break missingId;
      }

      id = R.id.rbSingle;
      RadioButton rbSingle = ViewBindings.findChildViewById(rootView, id);
      if (rbSingle == null) {
        break missingId;
      }

      id = R.id.rgGender;
      RadioGroup rgGender = ViewBindings.findChildViewById(rootView, id);
      if (rgGender == null) {
        break missingId;
      }

      id = R.id.rgRelationship;
      RadioGroup rgRelationship = ViewBindings.findChildViewById(rootView, id);
      if (rgRelationship == null) {
        break missingId;
      }

      id = R.id.tvFullName;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      return new ActivityViewProfileBinding((LinearLayout) rootView, etCompany, etDescription,
          etLocation, ibBack, rbFemale, rbInARelationship, rbMale, rbSingle, rgGender,
          rgRelationship, tvFullName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}