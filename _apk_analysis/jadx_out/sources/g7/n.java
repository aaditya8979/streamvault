package g7;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class n extends g6.f implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public i f62198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f62199f;

    @Override // g6.a
    public void b() {
        super.b();
        this.f62198e = null;
    }

    @Override // g7.i
    public List<b> getCues(long j10) {
        return ((i) s7.a.e(this.f62198e)).getCues(j10 - this.f62199f);
    }

    @Override // g7.i
    public long getEventTime(int i10) {
        return ((i) s7.a.e(this.f62198e)).getEventTime(i10) + this.f62199f;
    }

    @Override // g7.i
    public int getEventTimeCount() {
        return ((i) s7.a.e(this.f62198e)).getEventTimeCount();
    }

    @Override // g7.i
    public int getNextEventTimeIndex(long j10) {
        return ((i) s7.a.e(this.f62198e)).getNextEventTimeIndex(j10 - this.f62199f);
    }

    public void m(long j10, i iVar, long j11) {
        this.f62108c = j10;
        this.f62198e = iVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f62199f = j10;
    }
}
