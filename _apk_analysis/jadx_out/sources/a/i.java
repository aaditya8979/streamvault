package a;

import android.app.Activity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile i f3435c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3436b = BrandSafetyUtils.f51658o;

    public static i i() {
        if (f3435c == null) {
            synchronized (i.class) {
                if (f3435c == null) {
                    f3435c = new i();
                }
            }
        }
        return f3435c;
    }

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3436b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3436b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3436b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3436b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3436b);
    }
}
