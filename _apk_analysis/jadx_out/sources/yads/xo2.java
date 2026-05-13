package yads;

import android.content.Context;
import yads.po2;
import yads.xo2;

/* JADX INFO: loaded from: classes3.dex */
public final class xo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f96843a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile xo2 f96844b;

    public static void a(Context context, final Object obj) {
        r82.a(context).a(new bp2() { // from class: bt.qc
            @Override // yads.bp2
            public final boolean a(po2 po2Var) {
                return xo2.a(obj, po2Var);
            }
        });
    }

    public static final boolean a(Object obj, po2 po2Var) {
        return tn.p.f(obj, po2Var.f93684q);
    }
}
