package ct;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f59467b;

    public r(i0 i0Var) {
        this.f59467b = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f59467b.C();
        this.f59467b.F.onAdClose();
    }
}
