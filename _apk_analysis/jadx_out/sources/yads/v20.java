package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class v20 implements gl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckBox f95907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f95908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f95909c;

    public v20(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.f95907a = checkBox;
        this.f95908b = progressBar;
        this.f95909c = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return tn.p.f(this.f95907a, v20Var.f95907a) && tn.p.f(this.f95908b, v20Var.f95908b) && tn.p.f(this.f95909c, v20Var.f95909c);
    }

    @Override // yads.gl1
    public final TextView getCountDownProgress() {
        return this.f95909c;
    }

    @Override // yads.gl1
    public final CheckBox getMuteControl() {
        return this.f95907a;
    }

    @Override // yads.gl1
    public final ProgressBar getVideoProgress() {
        return this.f95908b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.f95907a;
        int iHashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.f95908b;
        int iHashCode2 = (iHashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.f95909c;
        return iHashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.f95907a + ", videoProgress=" + this.f95908b + ", countDownProgress=" + this.f95909c + ")";
    }
}
