package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ww {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zw f96543b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ww f96542a = new ww();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f96544c = new Object();

    public static xw a(Context context) {
        if (f96543b == null) {
            synchronized (f96544c) {
                if (f96543b == null) {
                    f96543b = yw.a(context);
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        zw zwVar = f96543b;
        if (zwVar != null) {
            return zwVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
