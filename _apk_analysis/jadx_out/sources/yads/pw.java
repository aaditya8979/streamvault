package yads;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public final class pw implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kz f93807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f93808b;

    public pw(kz kzVar, z30 z30Var) {
        this.f93807a = kzVar;
        this.f93808b = z30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f93807a.e();
        this.f93808b.a(y30.f96980c);
    }
}
