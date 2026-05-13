package p4;

import k4.q;

/* JADX INFO: compiled from: ConstantBitrateSeeker.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends k4.c implements f {
    public a(long j10, long j11, q qVar) {
        super(j10, j11, qVar.f72916f, qVar.f72913c);
    }

    @Override // p4.f
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // p4.f
    public long getTimeUs(long j10) {
        return b(j10);
    }
}
