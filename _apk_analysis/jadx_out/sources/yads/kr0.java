package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class kr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr0 f91707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za f91708b;

    public /* synthetic */ kr0(Context context, d4 d4Var, lu2 lu2Var, dr0 dr0Var) {
        this(dr0Var, new za(context, lu2Var, d4Var));
    }

    public kr0(dr0 dr0Var, za zaVar) {
        this.f91707a = dr0Var;
        this.f91708b = zaVar;
    }

    public final void a(long j10) {
        dr0 dr0Var = this.f91707a;
        if (j10 <= dr0Var.f88960c) {
            za.a(this.f91708b, dr0Var.f88959b, k83.f91514e);
        }
    }
}
