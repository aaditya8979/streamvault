package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f18517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f18518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f18519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f18520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.o f18521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f18522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f18526j;

    public m(p pVar, Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar) {
        this.f18526j = pVar;
        uri.getClass();
        this.f18517a = uri;
        hVar.getClass();
        this.f18518b = hVar;
        nVar.getClass();
        this.f18519c = nVar;
        this.f18520d = eVar;
        this.f18521e = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.o();
        this.f18523g = true;
        this.f18525i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f18522f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f18522f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() throws Throwable {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar;
        int iA = 0;
        while (iA == 0 && !this.f18522f) {
            try {
                long j10 = this.f18521e.f17970a;
                long jA = this.f18518b.a(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(this.f18517a, j10, j10, -1L, this.f18526j.f18539h, 0));
                this.f18525i = jA;
                if (jA != -1) {
                    this.f18525i = jA + j10;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f18518b;
                bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, j10, this.f18525i);
                try {
                    n nVar = this.f18519c;
                    hVar.a();
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVarA = nVar.a(bVar);
                    if (this.f18523g) {
                        iVarA.a(j10, this.f18524h);
                        this.f18523g = false;
                    }
                    long j11 = j10;
                    while (iA == 0 && !this.f18522f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f18520d;
                        synchronized (eVar) {
                            while (!eVar.f18767a) {
                                eVar.wait();
                            }
                        }
                        iA = iVarA.a(bVar, this.f18521e);
                        long j12 = bVar.f17401c;
                        if (j12 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j11) {
                            this.f18520d.a();
                            p pVar = this.f18526j;
                            pVar.f18545n.post(pVar.f18544m);
                            j11 = j12;
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else {
                        this.f18521e.f17970a = bVar.f17401c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f18518b);
                } catch (Throwable th2) {
                    th = th2;
                    if (iA != 1 && bVar != null) {
                        this.f18521e.f17970a = bVar.f17401c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f18518b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
            }
        }
    }
}
