package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class uq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x63 f95763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53 f95764b;

    public /* synthetic */ uq2(x63 x63Var) {
        this(x63Var, new u53());
    }

    public uq2(x63 x63Var, u53 u53Var) {
        this.f95763a = x63Var;
        this.f95764b = u53Var;
    }

    public final void a(View view, long j10, long j11) {
        view.setVisibility(0);
        this.f95763a.getClass();
        View viewFindViewWithTag = view.findViewWithTag("timer_value");
        TextView textView = viewFindViewWithTag instanceof TextView ? (TextView) viewFindViewWithTag : null;
        if (textView != null) {
            this.f95764b.getClass();
            textView.setText(String.valueOf((int) Math.ceil((j10 - j11) / u53.f95567a)));
        }
    }
}
