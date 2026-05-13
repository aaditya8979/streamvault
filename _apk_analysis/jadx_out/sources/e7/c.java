package e7;

/* JADX INFO: compiled from: CompositeSequenceableLoader.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements com.google.android.exoplayer2.source.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.q[] f60840b;

    public c(com.google.android.exoplayer2.source.q[] qVarArr) {
        this.f60840b = qVarArr;
    }

    @Override // com.google.android.exoplayer2.source.q
    public boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (com.google.android.exoplayer2.source.q qVar : this.f60840b) {
                long nextLoadPositionUs2 = qVar.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= qVar.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // com.google.android.exoplayer2.source.q
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.q qVar : this.f60840b) {
            long bufferedPositionUs = qVar.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.q
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.q qVar : this.f60840b) {
            long nextLoadPositionUs = qVar.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.q
    public boolean isLoading() {
        for (com.google.android.exoplayer2.source.q qVar : this.f60840b) {
            if (qVar.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.q
    public final void reevaluateBuffer(long j10) {
        for (com.google.android.exoplayer2.source.q qVar : this.f60840b) {
            qVar.reevaluateBuffer(j10);
        }
    }
}
