package a;

import android.app.Activity;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile e f3427c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3428b = "banner";

    public static e i() {
        if (f3427c == null) {
            synchronized (e.class) {
                if (f3427c == null) {
                    f3427c = new e();
                }
            }
        }
        return f3427c;
    }

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3428b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3428b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3428b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3428b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3428b);
    }
}
