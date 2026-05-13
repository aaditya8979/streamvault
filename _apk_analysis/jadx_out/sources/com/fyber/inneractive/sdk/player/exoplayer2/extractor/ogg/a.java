package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f17971a;

    public a(b bVar) {
        this.f17971a = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (j10 == 0) {
            return this.f17971a.f17973b;
        }
        b bVar = this.f17971a;
        long j11 = (((long) bVar.f17975d.f18018i) * j10) / 1000000;
        long j12 = bVar.f17973b;
        long j13 = bVar.f17974c;
        long j14 = ((((j13 - j12) * j11) / bVar.f17977f) - 30000) + j12;
        if (j14 >= j12) {
            j12 = j14;
        }
        return j12 >= j13 ? j13 - 1 : j12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f17971a;
        return (bVar.f17977f * 1000000) / ((long) bVar.f17975d.f18018i);
    }
}
