package HCMUTE.SocialMedia.Holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import HCMUTE.SocialMedia.R;

public class NotifyWithTimeHolder extends RecyclerView.ViewHolder {
    public TextView notifyTime;

    public NotifyWithTimeHolder(@NonNull View itemView) {
        super(itemView);
        this.notifyTime = itemView.findViewById(R.id.tvNotifyTime);
    }
}
