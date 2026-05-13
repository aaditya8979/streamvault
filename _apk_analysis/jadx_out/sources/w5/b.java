package w5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.source.TrackGroup;
import g5.l;
import g5.m;
import java.util.List;

/* JADX INFO: compiled from: FixedTrackSelection.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f86331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Object f86332h;

    public b(TrackGroup trackGroup, int i10, int i11, @Nullable Object obj) {
        super(trackGroup, i10);
        this.f86331g = i11;
        this.f86332h = obj;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public void a(long j10, long j11, long j12, List<? extends l> list, m[] mVarArr) {
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public int getSelectedIndex() {
        return 0;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    @Nullable
    public Object getSelectionData() {
        return this.f86332h;
    }

    @Override // com.google.android.exoplayer.trackselection.c
    public int getSelectionReason() {
        return this.f86331g;
    }
}
