package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ve f96720a;

    public static final dg a(Context context) {
        ve veVar;
        ve veVar2 = f96720a;
        if (veVar2 != null) {
            return veVar2;
        }
        synchronized (ve.f96064c) {
            Context contextA = uz.a(context);
            veVar = f96720a;
            if (veVar == null) {
                te teVar = new te(contextA);
                Object obj = og1.f93212d;
                veVar = new ve(teVar, ng1.a().a());
                f96720a = veVar;
            }
        }
        return veVar;
    }
}
