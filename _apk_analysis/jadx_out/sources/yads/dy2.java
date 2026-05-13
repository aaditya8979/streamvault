package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class dy2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile fy2 f89029b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ dy2 f89028a = new dy2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f89030c = new Object();

    public static ey2 a(Context context) {
        if (f89029b == null) {
            synchronized (f89030c) {
                if (f89029b == null) {
                    f89029b = new fy2(ug1.a(context, "YadPreferenceFile"));
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        fy2 fy2Var = f89029b;
        if (fy2Var != null) {
            return fy2Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
