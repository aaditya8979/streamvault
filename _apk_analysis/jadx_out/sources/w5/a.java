package w5;

import a6.k0;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.TrackGroup;
import g5.l;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements com.google.android.exoplayer.trackselection.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackGroup f86325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f86327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Format[] f86328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f86329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86330f;

    /* JADX INFO: compiled from: BaseTrackSelection.java */
    public static final class b implements Comparator<Format> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Format format, Format format2) {
            return format2.f19923f - format.f19923f;
        }
    }

    public a(TrackGroup trackGroup, int... iArr) {
        int i10 = 0;
        a6.a.f(iArr.length > 0);
        this.f86325a = (TrackGroup) a6.a.e(trackGroup);
        int length = iArr.length;
        this.f86326b = length;
        this.f86328d = new Format[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f86328d[i11] = trackGroup.b(iArr[i11]);
        }
        Arrays.sort(this.f86328d, new b());
        this.f86327c = new int[this.f86326b];
        while (true) {
            int i12 = this.f86326b;
            if (i10 >= i12) {
                this.f86329e = new long[i12];
                return;
            } else {
                this.f86327c[i10] = trackGroup.c(this.f86328d[i10]);
                i10++;
            }
        }
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final int b(Format format) {
        for (int i10 = 0; i10 < this.f86326b; i10++) {
            if (this.f86328d[i10] == format) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final boolean blacklist(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zC = c(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f86326b && !zC) {
            zC = (i11 == i10 || c(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zC) {
            return false;
        }
        long[] jArr = this.f86329e;
        jArr[i10] = Math.max(jArr[i10], k0.b(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public final boolean c(int i10, long j10) {
        return this.f86329e[i10] > j10;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public void disable() {
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public void enable() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f86325a == aVar.f86325a && Arrays.equals(this.f86327c, aVar.f86327c);
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public int evaluateQueueSize(long j10, List<? extends l> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final Format getFormat(int i10) {
        return this.f86328d[i10];
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final int getIndexInTrackGroup(int i10) {
        return this.f86327c[i10];
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final Format getSelectedFormat() {
        return this.f86328d[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final int getSelectedIndexInTrackGroup() {
        return this.f86327c[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final TrackGroup getTrackGroup() {
        return this.f86325a;
    }

    public int hashCode() {
        if (this.f86330f == 0) {
            this.f86330f = (System.identityHashCode(this.f86325a) * 31) + Arrays.hashCode(this.f86327c);
        }
        return this.f86330f;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f86326b; i11++) {
            if (this.f86327c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public final int length() {
        return this.f86327c.length;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public void onPlaybackSpeed(float f10) {
    }
}
