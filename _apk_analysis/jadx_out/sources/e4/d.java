package e4;

import androidx.annotation.Nullable;
import e4.n0;
import e4.v0;

/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.c f60051a = new v0.c();

    /* JADX INFO: compiled from: BasePlayer.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0.b f60052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f60053b;

        public a(n0.b bVar) {
            this.f60052a = bVar;
        }

        public void a(b bVar) {
            if (this.f60053b) {
                return;
            }
            bVar.a(this.f60052a);
        }

        public void b() {
            this.f60053b = true;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.f60052a.equals(((a) obj).f60052a);
        }

        public int hashCode() {
            return this.f60052a.hashCode();
        }
    }

    /* JADX INFO: compiled from: BasePlayer.java */
    public interface b {
        void a(n0.b bVar);
    }

    public final int g() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return a6.k0.q((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // e4.n0
    public final int getNextWindowIndex() {
        v0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        return currentTimeline.e(getCurrentWindowIndex(), i(), getShuffleModeEnabled());
    }

    @Override // e4.n0
    public final int getPreviousWindowIndex() {
        v0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        return currentTimeline.l(getCurrentWindowIndex(), i(), getShuffleModeEnabled());
    }

    public final long h() {
        v0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -9223372036854775807L;
        }
        return currentTimeline.n(getCurrentWindowIndex(), this.f60051a).c();
    }

    public final int i() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public final boolean j() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    public final void k(long j10) {
        seekTo(getCurrentWindowIndex(), j10);
    }

    public final void l(int i10) {
        seekTo(i10, -9223372036854775807L);
    }

    public final void m() {
        stop(false);
    }

    @Override // e4.n0
    public final void next() {
        int nextWindowIndex = getNextWindowIndex();
        if (nextWindowIndex != -1) {
            l(nextWindowIndex);
        }
    }

    @Override // e4.n0
    public final void previous() {
        int previousWindowIndex = getPreviousWindowIndex();
        if (previousWindowIndex != -1) {
            l(previousWindowIndex);
        }
    }
}
