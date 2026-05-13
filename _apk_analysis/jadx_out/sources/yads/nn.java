package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public abstract class nn implements mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f92892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f92893b;

    public nn(Context context, v9 v9Var) {
        this.f92892a = context;
        this.f92893b = v9Var;
    }

    @Override // yads.mu
    public final synchronized boolean a() {
        return false;
    }

    public abstract void b();

    public void c() {
        b();
        getClass().toString();
        boolean z10 = ad1.f87661a;
    }
}
