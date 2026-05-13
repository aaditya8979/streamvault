package i;

import android.view.View;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f63636b = -1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1 f63637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f63638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f63639e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Double.compare(((b) obj).f63636b, this.f63636b);
    }

    public final String toString() {
        return "AdCacheData{revenue=" + this.f63636b + ", adLoader=" + this.f63637c + ", sliceLoader=" + this.f63638d + ", view=" + this.f63639e + '}';
    }
}
