package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f17133a;

    public m(n nVar) {
        this.f17133a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = n.a(this.f17133a.f17135a, "fyb.vamp.vid.cache");
        if (fileA != null) {
            try {
                IAlog.a("VideoCache opening the cache in directory - %s", fileA);
                this.f17133a.f17136b = g.a(fileA, 52428800L);
                g gVar = this.f17133a.f17136b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f17110a);
                this.f17133a.f17136b = g.a(fileA, 52428800L);
                g gVar2 = this.f17133a.f17136b;
                synchronized (gVar2) {
                    j10 = gVar2.f17117h;
                }
                IAlog.a("VideoCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                n nVar = this.f17133a;
                nVar.f17136b.f17121l = nVar;
                nVar.f17137c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
