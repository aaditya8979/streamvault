package yads;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class yc implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f97062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke1 f97063b;

    public yc(Dialog dialog, ke1 ke1Var) {
        this.f97062a = dialog;
        this.f97063b = ke1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f97063b.getClass();
        ke1.a(view);
        ng0.a(this.f97062a);
    }
}
