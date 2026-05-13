package q7;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import d6.u1;
import e7.i0;

/* JADX INFO: compiled from: TrackSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f78024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public r7.d f78025b;

    /* JADX INFO: compiled from: TrackSelector.java */
    public interface a {
        void onTrackSelectionsInvalidated();
    }

    public final r7.d a() {
        return (r7.d) s7.a.i(this.f78025b);
    }

    public y b() {
        return y.B;
    }

    @CallSuper
    public void c(a aVar, r7.d dVar) {
        this.f78024a = aVar;
        this.f78025b = dVar;
    }

    public final void d() {
        a aVar = this.f78024a;
        if (aVar != null) {
            aVar.onTrackSelectionsInvalidated();
        }
    }

    public boolean e() {
        return false;
    }

    public abstract void f(@Nullable Object obj);

    @CallSuper
    public void g() {
        this.f78024a = null;
        this.f78025b = null;
    }

    public abstract b0 h(u1[] u1VarArr, i0 i0Var, i.b bVar, c0 c0Var) throws ExoPlaybackException;

    public void i(com.google.android.exoplayer2.audio.a aVar) {
    }

    public void j(y yVar) {
    }
}
