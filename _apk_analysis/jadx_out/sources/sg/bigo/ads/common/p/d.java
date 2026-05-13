package sg.bigo.ads.common.p;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends sg.bigo.ads.common.p.a {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f82360a = new d(0);
    }

    private d() {
        this.f82293b = new sg.bigo.ads.common.h.a.a();
    }

    public /* synthetic */ d(byte b10) {
        this();
    }

    @Override // sg.bigo.ads.common.p.a
    public final String a() {
        return "IconLoader";
    }

    @Override // sg.bigo.ads.common.p.a
    public final sg.bigo.ads.common.c a(Context context, String str) {
        return c.a(context).f82356c.get(str);
    }

    @Override // sg.bigo.ads.common.p.a
    public final void a(Context context) {
        c.a(context).f82356c.evictAll();
    }

    @Override // sg.bigo.ads.common.p.a
    public final void a(Context context, String str, sg.bigo.ads.common.c cVar) {
        c cVarA = c.a(context);
        if (cVar.f81978a.isRecycled()) {
            return;
        }
        cVarA.f82356c.put(str, cVar);
        sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "The left cache size: " + (c.f82354a.get() - cVarA.f82355b.size()));
    }

    @Override // sg.bigo.ads.common.p.a
    public final int b() {
        sg.bigo.ads.common.h.a.a aVar = this.f82293b;
        if (aVar.f82165b == 0) {
            return Integer.MAX_VALUE;
        }
        return aVar.f82166c;
    }

    @Override // sg.bigo.ads.common.p.a
    public final String b(Context context) {
        return o.f(context);
    }

    @Override // sg.bigo.ads.common.p.a
    public final void b(Context context, String str) {
        c.a(context).f82356c.remove(str);
    }

    @Override // sg.bigo.ads.common.p.a
    public final String c(Context context, String str) {
        return o.f(context) + File.separator + str;
    }
}
