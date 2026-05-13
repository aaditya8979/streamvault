package a;

import android.app.Activity;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile g f3431c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3432b = "ThirdBanner";

    public static g i() {
        if (f3431c == null) {
            synchronized (g.class) {
                if (f3431c == null) {
                    f3431c = new g();
                }
            }
        }
        return f3431c;
    }

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3432b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3432b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3432b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3432b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3432b);
    }
}
