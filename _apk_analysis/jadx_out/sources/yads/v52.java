package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class v52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s52 f95954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf2 f95955c;

    public /* synthetic */ v52(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var) {
        this(context, d4Var, lu2Var, v9Var, mt2.a(context));
    }

    public v52(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, boolean z10) {
        this.f95953a = z10;
        this.f95954b = a(context.getApplicationContext(), v9Var, lu2Var, d4Var);
        this.f95955c = a();
    }

    public final qf2 a() {
        jp0 jp0Var;
        if (!this.f95953a) {
            Object obj = kp0.f91700b;
            return new t52(ip0.a());
        }
        Object obj2 = jp0.f91323b;
        jp0 jp0Var2 = jp0.f91324c;
        if (jp0Var2 == null) {
            synchronized (jp0.f91323b) {
                jp0Var = jp0.f91324c;
                if (jp0Var == null) {
                    jp0Var = new jp0();
                    jp0.f91324c = jp0Var;
                }
            }
            jp0Var2 = jp0Var;
        }
        return new u52(jp0Var2);
    }

    public final s52 a(Context context, v9 v9Var, lu2 lu2Var, d4 d4Var) {
        return this.f95953a ? new he0(context, v9Var, lu2Var, d4Var) : new ie0(context, v9Var, lu2Var, d4Var);
    }
}
