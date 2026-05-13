package n5;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends i4.f implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public e f75144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f75145c;

    public void a(long j10, e eVar, long j11) {
        this.timeUs = j10;
        this.f75144b = eVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f75145c = j10;
    }

    @Override // i4.a
    public void clear() {
        super.clear();
        this.f75144b = null;
    }

    @Override // n5.e
    public List<b> getCues(long j10) {
        return ((e) a6.a.e(this.f75144b)).getCues(j10 - this.f75145c);
    }

    @Override // n5.e
    public long getEventTime(int i10) {
        return ((e) a6.a.e(this.f75144b)).getEventTime(i10) + this.f75145c;
    }

    @Override // n5.e
    public int getEventTimeCount() {
        return ((e) a6.a.e(this.f75144b)).getEventTimeCount();
    }

    @Override // n5.e
    public int getNextEventTimeIndex(long j10) {
        return ((e) a6.a.e(this.f75144b)).getNextEventTimeIndex(j10 - this.f75145c);
    }

    @Override // i4.f
    public abstract void release();
}
