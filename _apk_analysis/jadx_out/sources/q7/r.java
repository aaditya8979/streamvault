package q7;

import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import e7.g0;

/* JADX INFO: compiled from: ExoTrackSelection.java */
/* JADX INFO: loaded from: classes7.dex */
public interface r extends u {

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g0 f78112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f78113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f78114c;

        public a(g0 g0Var, int... iArr) {
            this(g0Var, iArr, 0);
        }

        public a(g0 g0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                s7.q.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f78112a = g0Var;
            this.f78113b = iArr;
            this.f78114c = i10;
        }
    }

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public interface b {
        r[] a(a[] aVarArr, r7.d dVar, i.b bVar, c0 c0Var);
    }

    void disable();

    void enable();

    com.google.android.exoplayer2.m getSelectedFormat();

    int getSelectedIndex();

    @Override // q7.u
    /* synthetic */ int getType();

    default void onDiscontinuity() {
    }

    default void onPlayWhenReadyChanged(boolean z10) {
    }

    void onPlaybackSpeed(float f10);

    default void onRebuffer() {
    }
}
