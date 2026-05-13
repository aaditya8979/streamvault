package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.util.o;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a f15894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c f15895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15896c;

    public d(e eVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        this.f15896c = eVar;
        this.f15894a = aVar;
        this.f15895b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15896c.f15899c) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.f15894a;
            if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                g gVar = (g) this.f15896c.f15897a.f15907a.get(this.f15895b);
                if (gVar != null) {
                    int i10 = f.f15902a[aVar.ordinal()];
                    if (i10 == 1) {
                        gVar.f15904b++;
                    } else if (i10 == 2) {
                        gVar.f15905c++;
                    } else if (i10 == 3) {
                        gVar.f15903a++;
                    }
                }
            } else {
                this.f15896c.f15897a = new i();
            }
            try {
                o.a(o.f19548a, e.a(this.f15896c).toString().getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            this.f15896c.getClass();
        }
    }
}
