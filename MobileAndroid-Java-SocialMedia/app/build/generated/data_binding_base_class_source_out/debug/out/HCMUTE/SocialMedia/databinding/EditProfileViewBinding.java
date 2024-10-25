// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EditProfileViewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText etCompany;

  @NonNull
  public final EditText etDescription;

  @NonNull
  public final EditText etFullName;

  @NonNull
  public final EditText etLocation;

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

  private EditProfileViewBinding(@NonNull LinearLayout rootView, @NonNull EditText etCompany,
      @NonNull EditText etDescription, @NonNull EditText etFullName, @NonNull EditText etLocation,
      @NonNull RadioButton rbFemale, @NonNull RadioButton rbInARelationship,
      @NonNull RadioButton rbMale, @NonNull RadioButton rbSingle, @NonNull RadioGroup rgGender,
      @NonNull RadioGroup rgRelationship) {
    this.rootView = rootView;
    this.etCompany = etCompany;
    this.etDescription = etDescription;
    this.etFullName = etFullName;
    this.etLocation = etLocation;
    this.rbFemale = rbFemale;
    this.rbInARelationship = rbInARelationship;
    this.rbMale = rbMale;
    this.rbSingle = rbSingle;
    this.rgGender = rgGender;
    this.rgRelationship = rgRelationship;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EditProfileViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditProfileViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.edit_profile_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditProfileViewBinding bind(@NonNull View rootView) {
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

      id = R.id.etFullName;
      EditText etFullName = ViewBindings.findChildViewById(rootView, id);
      if (etFullName == null) {
        break missingId;
      }

      id = R.id.etLocation;
      EditText etLocation = ViewBindings.findChildViewById(rootView, id);
      if (etLocation == null) {
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

      return new EditProfileViewBinding((LinearLayout) rootView, etCompany, etDescription,
          etFullName, etLocation, rbFemale, rbInARelationship, rbMale, rbSingle, rgGender,
          rgRelationship);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
