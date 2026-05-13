package ct;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f59436b;

    public b(m0 m0Var) {
        this.f59436b = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f59436b.C();
        this.f59436b.G.onAdClose();
    }
}
