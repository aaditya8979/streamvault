package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class yy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ yy f97324a = new yy();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f97325b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile cz f97326c;

    public static zy a(Context context) {
        if (f97326c == null) {
            synchronized (f97325b) {
                if (f97326c == null) {
                    f97326c = new cz(ug1.a(context, "YadPreferenceFile"), new dn0(), new u7(), new p33());
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        cz czVar = f97326c;
        if (czVar != null) {
            return czVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
