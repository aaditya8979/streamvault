package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class c31 implements d31 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f88319h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh f88320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg f88321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wg f88322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f88323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tg f88324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e31 f88325f = e31.f89078b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f88326g;

    public c31(Context context, fh fhVar, yg ygVar, wg wgVar, bj1 bj1Var) {
        this.f88320a = fhVar;
        this.f88321b = ygVar;
        this.f88322c = wgVar;
        this.f88323d = context.getApplicationContext();
        this.f88326g = bj1Var.a();
    }

    public final void a() {
        wg wgVar = this.f88322c;
        Context context = this.f88323d;
        ug ugVar = wgVar.f96373a;
        synchronized (ugVar.f95641a) {
            ugVar.f95642b.add(this);
        }
        try {
            wgVar.a(context);
        } catch (Throwable unused) {
            wgVar.c();
            boolean z10 = ad1.f87661a;
        }
    }

    public final void a(tg tgVar) {
        synchronized (f88319h) {
            this.f88321b.getClass();
            String str = tgVar.f95200a;
            String str2 = tgVar.f95201b;
            String str3 = tgVar.f95202c;
            if (!(str3 == null || str3.length() == 0)) {
                if (!(str == null || str.length() == 0)) {
                    if (!(str2 == null || str2.length() == 0)) {
                        this.f88324e = tgVar;
                    }
                }
            }
            bn.r rVar = bn.r.f5635a;
        }
    }
}
