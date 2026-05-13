package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1 f97563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw2 f97564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f97565c;

    public /* synthetic */ zg(Context context) {
        sh1 sh1Var = new sh1();
        Object obj = dw2.f89000j;
        this(context, sh1Var, cw2.a());
    }

    public zg(Context context, sh1 sh1Var, dw2 dw2Var) {
        this.f97563a = sh1Var;
        this.f97564b = dw2Var;
        this.f97565c = uz.a(context);
    }

    public final boolean a() {
        sh1 sh1Var = this.f97563a;
        Context context = this.f97565c;
        sh1Var.getClass();
        Boolean bool = (Boolean) sh1.a(context, th1.f95223i.f95226b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean b() {
        nt2 nt2VarA = this.f97564b.a(this.f97565c);
        boolean z10 = !(nt2VarA != null && nt2VarA.f92969q0);
        sh1 sh1Var = this.f97563a;
        Context context = this.f97565c;
        sh1Var.getClass();
        Boolean bool = (Boolean) sh1.a(context, th1.f95222h.f95226b);
        return a() && z10 && (bool != null ? bool.booleanValue() : true);
    }

    public final boolean c() {
        nt2 nt2VarA = this.f97564b.a(this.f97565c);
        return a() && (nt2VarA != null && nt2VarA.I);
    }
}
