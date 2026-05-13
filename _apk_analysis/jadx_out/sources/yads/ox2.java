package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class ox2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz f93354a;

    public /* synthetic */ ox2() {
        this(new dz());
    }

    public ox2(dz dzVar) {
        this.f93354a = dzVar;
    }

    public static boolean a(Context context) {
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        return nt2VarA == null || nt2VarA.f92954j;
    }

    public final boolean b(Context context) {
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || !nt2VarA.f92952i || a(context)) {
            return true;
        }
        this.f93354a.getClass();
        return (tn.p.f(cw2.a().b(), nt2VarA.M) ^ true) && tn.p.f(cw2.a().b(), Boolean.TRUE);
    }
}
