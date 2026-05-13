package ct;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f59470b;

    public s(e eVar) {
        this.f59470b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f59470b.C();
        this.f59470b.G.onAdClose();
    }
}
