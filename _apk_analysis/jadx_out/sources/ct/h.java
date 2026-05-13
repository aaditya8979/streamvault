package ct;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f59446b;

    public h(a0 a0Var) {
        this.f59446b = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f59446b.C();
        this.f59446b.F.onAdClose();
    }
}
