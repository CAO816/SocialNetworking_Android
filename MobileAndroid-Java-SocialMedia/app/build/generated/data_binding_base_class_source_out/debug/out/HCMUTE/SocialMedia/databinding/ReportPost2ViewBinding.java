// Generated by view binder compiler. Do not edit!
package HCMUTE.SocialMedia.databinding;

import HCMUTE.SocialMedia.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReportPost2ViewBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView tvContent;

  @NonNull
  public final TextView tvFullName;

  @NonNull
  public final TextView tvReportingTimeAt;

  private ReportPost2ViewBinding(@NonNull RelativeLayout rootView, @NonNull TextView tvContent,
      @NonNull TextView tvFullName, @NonNull TextView tvReportingTimeAt) {
    this.rootView = rootView;
    this.tvContent = tvContent;
    this.tvFullName = tvFullName;
    this.tvReportingTimeAt = tvReportingTimeAt;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReportPost2ViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReportPost2ViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.report_post_2_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReportPost2ViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvContent;
      TextView tvContent = ViewBindings.findChildViewById(rootView, id);
      if (tvContent == null) {
        break missingId;
      }

      id = R.id.tvFullName;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      id = R.id.tvReportingTimeAt;
      TextView tvReportingTimeAt = ViewBindings.findChildViewById(rootView, id);
      if (tvReportingTimeAt == null) {
        break missingId;
      }

      return new ReportPost2ViewBinding((RelativeLayout) rootView, tvContent, tvFullName,
          tvReportingTimeAt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}