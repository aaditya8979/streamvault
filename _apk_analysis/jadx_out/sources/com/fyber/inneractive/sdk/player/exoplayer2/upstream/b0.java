package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f18603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f18604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f18605c;

    public b0(String str) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f18822a;
        this.f18603a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        y yVar = this.f18604b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.f18603a.execute(kVar);
        }
        this.f18603a.shutdown();
    }

    public final boolean a() {
        return this.f18604b != null;
    }

    public final void b() throws IOException {
        IOException iOException = this.f18605c;
        if (iOException != null) {
            throw iOException;
        }
        y yVar = this.f18604b;
        if (yVar != null) {
            int i10 = yVar.f18753c;
            IOException iOException2 = yVar.f18755e;
            if (iOException2 != null && yVar.f18756f > i10) {
                throw iOException2;
            }
        }
    }
}
