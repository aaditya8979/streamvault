package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class dp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f88946c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile dp0 f88947d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo0 f88948a = new zo0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vy2 f88949b;

    public final nr a(Context context) {
        vy2 vy2VarA;
        synchronized (f88946c) {
            vy2VarA = this.f88949b;
            if (vy2VarA == null) {
                vy2VarA = this.f88948a.a(context);
                this.f88949b = vy2VarA;
            }
        }
        return vy2VarA;
    }
}
