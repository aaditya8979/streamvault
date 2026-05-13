package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public abstract class y01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f96963a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile xy0 f96964b;

    public static final xy0 a(Context context) {
        if (f96964b == null) {
            synchronized (f96963a) {
                if (f96964b == null) {
                    f96964b = new xy0(context, "com.huawei.hms.location.LocationServices");
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        xy0 xy0Var = f96964b;
        if (xy0Var != null) {
            return xy0Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
