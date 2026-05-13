package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile uz0 f96238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f96239b = new Object();

    public static final uz0 a(Context context) {
        if (f96238a == null) {
            synchronized (f96239b) {
                if (f96238a == null) {
                    f96238a = new uz0(ug1.a(context, "YadPreferenceFile"));
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        uz0 uz0Var = f96238a;
        if (uz0Var != null) {
            return uz0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
