// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final LinearLayout clHomeArea;

  @NonNull
  public final TabLayout customTabLayout;

  @NonNull
  public final ImageButton ibMessage;

  @NonNull
  public final ImageButton ibSearch;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView;

  @NonNull
  public final ViewPager2 viewPager2;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull AppBarLayout appBar,
      @NonNull LinearLayout clHomeArea, @NonNull TabLayout customTabLayout,
      @NonNull ImageButton ibMessage, @NonNull ImageButton ibSearch, @NonNull ImageView imageView,
      @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.clHomeArea = clHomeArea;
    this.customTabLayout = customTabLayout;
    this.ibMessage = ibMessage;
    this.ibSearch = ibSearch;
    this.imageView = imageView;
    this.textView = textView;
    this.viewPager2 = viewPager2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBar;
      AppBarLayout appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      LinearLayout clHomeArea = (LinearLayout) rootView;

      id = R.id.customTabLayout;
      TabLayout customTabLayout = ViewBindings.findChildViewById(rootView, id);
      if (customTabLayout == null) {
        break missingId;
      }

      id = R.id.ibMessage;
      ImageButton ibMessage = ViewBindings.findChildViewById(rootView, id);
      if (ibMessage == null) {
        break missingId;
      }

      id = R.id.ibSearch;
      ImageButton ibSearch = ViewBindings.findChildViewById(rootView, id);
      if (ibSearch == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.viewPager2;
      ViewPager2 viewPager2 = ViewBindings.findChildViewById(rootView, id);
      if (viewPager2 == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, appBar, clHomeArea, customTabLayout,
          ibMessage, ibSearch, imageView, textView, viewPager2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}