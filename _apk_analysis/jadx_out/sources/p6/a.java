package p6;

import f6.u;

/* JADX INFO: compiled from: ConstantBitrateSeeker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i6.d implements g {
    public a(long j10, long j11, u.a aVar, boolean z10) {
        super(j10, j11, aVar.f61554f, aVar.f61551c, z10);
    }

    @Override // p6.g
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // p6.g
    public long getTimeUs(long j10) {
        return b(j10);
    }
}
