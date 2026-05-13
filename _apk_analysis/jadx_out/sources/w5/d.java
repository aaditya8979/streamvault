package w5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.q0;
import e4.v0;
import e5.r;

/* JADX INFO: compiled from: TrackSelector.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f86336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public y5.c f86337b;

    /* JADX INFO: compiled from: TrackSelector.java */
    public interface a {
        void onTrackSelectionsInvalidated();
    }

    public final y5.c a() {
        return (y5.c) a6.a.e(this.f86337b);
    }

    public final void b(a aVar, y5.c cVar) {
        this.f86336a = aVar;
        this.f86337b = cVar;
    }

    public final void c() {
        a aVar = this.f86336a;
        if (aVar != null) {
            aVar.onTrackSelectionsInvalidated();
        }
    }

    public abstract void d(Object obj);

    public abstract e e(q0[] q0VarArr, TrackGroupArray trackGroupArray, r.a aVar, v0 v0Var) throws ExoPlaybackException;
}
