package kd;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: CacheManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f73069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f73070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f73071c;

    public b(Context context) {
        this.f73070b = context;
        this.f73071c = a.c(context);
        if (TextUtils.isEmpty(this.f73069a)) {
            this.f73069a = ld.d.d(context);
        }
    }

    public final md.d<Object> a() {
        md.d<Object> dVarB = a.b(this.f73069a, this.f73070b);
        if (dVarB != null) {
            return dVarB;
        }
        throw new IllegalArgumentException("Unknown type obj . can't be save or nonsupport this type cache!");
    }

    public synchronized <D> List<D> b(String str, Class<D> cls) {
        return (List<D>) a().a(str, cls);
    }

    public b c(String str) {
        this.f73069a = str;
        return this;
    }

    public synchronized <D> boolean d(String str, D d10) {
        ld.d.e(d10, "cache data can't be null");
        return a().b(str, d10);
    }
}
