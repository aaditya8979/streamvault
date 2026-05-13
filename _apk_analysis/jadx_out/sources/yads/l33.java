package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes11.dex */
public final class l33 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f91876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf f91877c;

    public l33(TextView textView, gf gfVar) {
        this.f91876b = textView;
        this.f91877c = gfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f91877c.a(this.f91876b);
    }
}
