package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.v;
import java.util.ArrayList;
import java.util.List;
import s7.l;

/* JADX INFO: compiled from: Player.java */
/* JADX INFO: loaded from: classes10.dex */
public interface v {

    /* JADX INFO: compiled from: Player.java */
    public static final class b implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f22919c = new a().e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f.a<b> f22920d = new f.a() { // from class: d6.q1
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return v.b.d(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s7.l f22921b;

        /* JADX INFO: compiled from: Player.java */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int[] f22922b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l.b f22923a = new l.b();

            public a a(int i10) {
                this.f22923a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f22923a.b(bVar.f22921b);
                return this;
            }

            public a c(int... iArr) {
                this.f22923a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f22923a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f22923a.e());
            }
        }

        public b(s7.l lVar) {
            this.f22921b = lVar;
        }

        public static b d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(e(0));
            if (integerArrayList == null) {
                return f22919c;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        public static String e(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean c(int i10) {
            return this.f22921b.a(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f22921b.equals(((b) obj).f22921b);
            }
            return false;
        }

        public int hashCode() {
            return this.f22921b.hashCode();
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f22921b.d(); i10++) {
                arrayList.add(Integer.valueOf(this.f22921b.c(i10)));
            }
            bundle.putIntegerArrayList(e(0), arrayList);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s7.l f22924a;

        public c(s7.l lVar) {
            this.f22924a = lVar;
        }

        public boolean a(int i10) {
            return this.f22924a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f22924a.b(iArr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f22924a.equals(((c) obj).f22924a);
            }
            return false;
        }

        public int hashCode() {
            return this.f22924a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public interface d {
        default void A(i iVar) {
        }

        default void E(d0 d0Var) {
        }

        default void G(v vVar, c cVar) {
        }

        default void I(@Nullable p pVar, int i10) {
        }

        default void c(t7.x xVar) {
        }

        default void e(Metadata metadata) {
        }

        default void f(u uVar) {
        }

        default void g(g7.f fVar) {
        }

        default void k(e eVar, e eVar2, int i10) {
        }

        default void l(c0 c0Var, int i10) {
        }

        default void m(q qVar) {
        }

        @Deprecated
        default void onCues(List<g7.b> list) {
        }

        default void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        default void onIsLoadingChanged(boolean z10) {
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z10) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onPlaybackStateChanged(int i10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i10) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i10) {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void onSkipSilenceEnabledChanged(boolean z10) {
        }

        default void onSurfaceSizeChanged(int i10, int i11) {
        }

        default void onVolumeChanged(float f10) {
        }

        default void p(@Nullable PlaybackException playbackException) {
        }

        default void q(PlaybackException playbackException) {
        }

        default void s(q7.y yVar) {
        }

        default void z(b bVar) {
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class e implements f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final f.a<e> f22925l = new f.a() { // from class: d6.r1
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return v.e.b(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Object f22926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public final int f22927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f22928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final p f22929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Object f22930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f22931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f22932h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f22933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f22934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f22935k;

        public e(@Nullable Object obj, int i10, @Nullable p pVar, @Nullable Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f22926b = obj;
            this.f22927c = i10;
            this.f22928d = i10;
            this.f22929e = pVar;
            this.f22930f = obj2;
            this.f22931g = i11;
            this.f22932h = j10;
            this.f22933i = j11;
            this.f22934j = i12;
            this.f22935k = i13;
        }

        public static e b(Bundle bundle) {
            int i10 = bundle.getInt(c(0), -1);
            Bundle bundle2 = bundle.getBundle(c(1));
            return new e(null, i10, bundle2 == null ? null : (p) p.f22031k.fromBundle(bundle2), null, bundle.getInt(c(2), -1), bundle.getLong(c(3), -9223372036854775807L), bundle.getLong(c(4), -9223372036854775807L), bundle.getInt(c(5), -1), bundle.getInt(c(6), -1));
        }

        public static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f22928d == eVar.f22928d && this.f22931g == eVar.f22931g && this.f22932h == eVar.f22932h && this.f22933i == eVar.f22933i && this.f22934j == eVar.f22934j && this.f22935k == eVar.f22935k && y7.i.a(this.f22926b, eVar.f22926b) && y7.i.a(this.f22930f, eVar.f22930f) && y7.i.a(this.f22929e, eVar.f22929e);
        }

        public int hashCode() {
            return y7.i.b(this.f22926b, Integer.valueOf(this.f22928d), this.f22929e, this.f22930f, Integer.valueOf(this.f22931g), Long.valueOf(this.f22932h), Long.valueOf(this.f22933i), Integer.valueOf(this.f22934j), Integer.valueOf(this.f22935k));
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(c(0), this.f22928d);
            if (this.f22929e != null) {
                bundle.putBundle(c(1), this.f22929e.toBundle());
            }
            bundle.putInt(c(2), this.f22931g);
            bundle.putLong(c(3), this.f22932h);
            bundle.putLong(c(4), this.f22933i);
            bundle.putInt(c(5), this.f22934j);
            bundle.putInt(c(6), this.f22935k);
            return bundle;
        }
    }

    void b(u uVar);

    void c(d dVar);

    void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void clearVideoTextureView(@Nullable TextureView textureView);

    void d(q7.y yVar);

    void e(p pVar);

    void f(d dVar);

    Looper getApplicationLooper();

    b getAvailableCommands();

    long getContentBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    g7.f getCurrentCues();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    c0 getCurrentTimeline();

    d0 getCurrentTracks();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    q getMediaMetadata();

    boolean getPlayWhenReady();

    u getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @Nullable
    PlaybackException getPlayerError();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    q7.y getTrackSelectionParameters();

    t7.x getVideoSize();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCommandAvailable(int i10);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlaying();

    boolean isPlayingAd();

    void pause();

    void play();

    void prepare();

    void release();

    void seekBack();

    void seekForward();

    void seekTo(int i10, long j10);

    void seekTo(long j10);

    void seekToNext();

    void seekToPrevious();

    void setMediaItems(List<p> list, boolean z10);

    void setPlayWhenReady(boolean z10);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f10);
}
