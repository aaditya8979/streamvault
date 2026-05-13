package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes12.dex */
public final class yk3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f97203a;

    public yk3(TextView textView) {
        this.f97203a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f97203a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
