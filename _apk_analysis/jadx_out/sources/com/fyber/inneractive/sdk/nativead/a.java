package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.player.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f16934a;

    public a(b bVar) {
        this.f16934a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = b.a(this.f16934a);
        if (fileA != null) {
            try {
                IAlog.a("NativeCache opening the cache in directory - %s", fileA);
                this.f16934a.f16937b = g.a(fileA, 41943040L);
                g gVar = this.f16934a.f16937b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f17110a);
                this.f16934a.f16937b = g.a(fileA, 41943040L);
                g gVar2 = this.f16934a.f16937b;
                synchronized (gVar2) {
                    j10 = gVar2.f17117h;
                }
                IAlog.a("NativeCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                b bVar = this.f16934a;
                bVar.f16937b.f17121l = bVar;
                bVar.f16938c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
