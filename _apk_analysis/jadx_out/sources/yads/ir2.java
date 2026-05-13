package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class ir2 implements kz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f90958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ow f90959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f90960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f90961d;

    public ir2(Context context, ei0 ei0Var, kz kzVar) {
        this.f90958a = context;
        this.f90959b = ei0Var;
        this.f90960c = kzVar;
    }

    @Override // yads.kz
    public final void e() {
        if (this.f90961d) {
            this.f90960c.e();
            return;
        }
        ((ei0) this.f90959b).a(this.f90958a);
    }
}
