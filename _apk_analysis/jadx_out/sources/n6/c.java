package n6;

import i6.l;
import i6.u;

/* JADX INFO: compiled from: StartOffsetExtractorInput.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f75175b;

    public c(l lVar, long j10) {
        super(lVar);
        s7.a.a(lVar.getPosition() >= j10);
        this.f75175b = j10;
    }

    @Override // i6.u, i6.l
    public long getLength() {
        return super.getLength() - this.f75175b;
    }

    @Override // i6.u, i6.l
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f75175b;
    }

    @Override // i6.u, i6.l
    public long getPosition() {
        return super.getPosition() - this.f75175b;
    }
}
