package e6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.r2;
import e6.b;
import e6.r1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: compiled from: MediaMetricsListener.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(31)
public final class q1 implements e6.b, r1.a {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f60759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f60760c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f60766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public PlaybackMetrics.Builder f60767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f60768k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public PlaybackException f60771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public b f60772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public b f60773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public b f60774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.m f60775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.m f60776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.m f60777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f60778u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f60779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f60780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f60781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f60782y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f60783z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0.d f60762e = new c0.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0.b f60763f = new c0.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, Long> f60765h = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<String, Long> f60764g = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60761d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f60769l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f60770m = 0;

    /* JADX INFO: compiled from: MediaMetricsListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60785b;

        public a(int i10, int i11) {
            this.f60784a = i10;
            this.f60785b = i11;
        }
    }

    /* JADX INFO: compiled from: MediaMetricsListener.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.m f60786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60788c;

        public b(com.google.android.exoplayer2.m mVar, int i10, String str) {
            this.f60786a = mVar;
            this.f60787b = i10;
            this.f60788c = str;
        }
    }

    public q1(Context context, PlaybackSession playbackSession) {
        this.f60758a = context.getApplicationContext();
        this.f60760c = playbackSession;
        p1 p1Var = new p1();
        this.f60759b = p1Var;
        p1Var.e(this);
    }

    @Nullable
    public static q1 A0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new q1(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    public static int C0(int i10) {
        switch (s7.m0.P(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    public static DrmInitData D0(ImmutableList<d0.a> immutableList) {
        DrmInitData drmInitData;
        r2<d0.a> it = immutableList.iterator();
        while (it.hasNext()) {
            d0.a next = it.next();
            for (int i10 = 0; i10 < next.f21424b; i10++) {
                if (next.f(i10) && (drmInitData = next.c(i10).f21754p) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    public static int E0(DrmInitData drmInitData) {
        for (int i10 = 0; i10 < drmInitData.f21512e; i10++) {
            UUID uuid = drmInitData.d(i10).f21514c;
            if (uuid.equals(d6.c.f59584d)) {
                return 3;
            }
            if (uuid.equals(d6.c.f59585e)) {
                return 2;
            }
            if (uuid.equals(d6.c.f59583c)) {
                return 6;
            }
        }
        return 1;
    }

    public static a F0(PlaybackException playbackException, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (playbackException.errorCode == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z11 = exoPlaybackException.type == 1;
            i10 = exoPlaybackException.rendererFormatSupport;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) s7.a.e(playbackException.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new a(13, s7.m0.Q(((MediaCodecRenderer.DecoderInitializationException) th2).diagnosticInfo));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new a(14, s7.m0.Q(((MediaCodecDecoderException) th2).diagnosticInfo));
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th2).audioTrackState);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th2).errorCode);
            }
            if (s7.m0.f79487a < 16 || !(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(C0(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th2).responseCode);
        }
        if ((th2 instanceof HttpDataSource$InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new a(z10 ? 10 : 11, 0);
        }
        if ((th2 instanceof HttpDataSource$HttpDataSourceException) || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (s7.x.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : ((th2 instanceof HttpDataSource$HttpDataSourceException) && ((HttpDataSource$HttpDataSourceException) th2).type == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new a(21, 0);
        }
        if (!(th2 instanceof DrmSession.DrmSessionException)) {
            if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) s7.a.e(th2.getCause())).getCause();
            return (s7.m0.f79487a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th3 = (Throwable) s7.a.e(th2.getCause());
        int i11 = s7.m0.f79487a;
        if (i11 < 21 || !(th3 instanceof MediaDrm.MediaDrmStateException)) {
            return (i11 < 23 || !(th3 instanceof MediaDrmResetException)) ? (i11 < 18 || !(th3 instanceof NotProvisionedException)) ? (i11 < 18 || !(th3 instanceof DeniedByServerException)) ? th3 instanceof UnsupportedDrmException ? new a(23, 0) : th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
        }
        int iQ = s7.m0.Q(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
        return new a(C0(iQ), iQ);
    }

    public static Pair<String, String> G0(String str) {
        String[] strArrH0 = s7.m0.H0(str, "-");
        return Pair.create(strArrH0[0], strArrH0.length >= 2 ? strArrH0[1] : null);
    }

    public static int I0(Context context) {
        switch (s7.x.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int J0(com.google.android.exoplayer2.p pVar) {
        p.h hVar = pVar.f22033c;
        if (hVar == null) {
            return 0;
        }
        int iK0 = s7.m0.k0(hVar.f22096a, hVar.f22097b);
        if (iK0 == 0) {
            return 3;
        }
        if (iK0 != 1) {
            return iK0 != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int K0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    public final void B0() {
        PlaybackMetrics.Builder builder = this.f60767j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f60783z);
            this.f60767j.setVideoFramesDropped(this.f60781x);
            this.f60767j.setVideoFramesPlayed(this.f60782y);
            Long l10 = this.f60764g.get(this.f60766i);
            this.f60767j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f60765h.get(this.f60766i);
            this.f60767j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f60767j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f60760c.reportPlaybackMetrics(this.f60767j.build());
        }
        this.f60767j = null;
        this.f60766i = null;
        this.f60783z = 0;
        this.f60781x = 0;
        this.f60782y = 0;
        this.f60775r = null;
        this.f60776s = null;
        this.f60777t = null;
        this.A = false;
    }

    public LogSessionId H0() {
        return this.f60760c.getSessionId();
    }

    @Override // e6.r1.a
    public void J(b.a aVar, String str, String str2) {
    }

    public final void L0(b.C0740b c0740b) {
        for (int i10 = 0; i10 < c0740b.d(); i10++) {
            int iB = c0740b.b(i10);
            b.a aVarC = c0740b.c(iB);
            if (iB == 0) {
                this.f60759b.c(aVarC);
            } else if (iB == 11) {
                this.f60759b.d(aVarC, this.f60768k);
            } else {
                this.f60759b.b(aVarC);
            }
        }
    }

    public final void M0(long j10) {
        int iI0 = I0(this.f60758a);
        if (iI0 != this.f60770m) {
            this.f60770m = iI0;
            this.f60760c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(iI0).setTimeSinceCreatedMillis(j10 - this.f60761d).build());
        }
    }

    public final void N0(long j10) {
        PlaybackException playbackException = this.f60771n;
        if (playbackException == null) {
            return;
        }
        a aVarF0 = F0(playbackException, this.f60758a, this.f60779v == 4);
        this.f60760c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f60761d).setErrorCode(aVarF0.f60784a).setSubErrorCode(aVarF0.f60785b).setException(playbackException).build());
        this.A = true;
        this.f60771n = null;
    }

    @Override // e6.b
    public void O(b.a aVar, t7.x xVar) {
        b bVar = this.f60772o;
        if (bVar != null) {
            com.google.android.exoplayer2.m mVar = bVar.f60786a;
            if (mVar.f21757s == -1) {
                this.f60772o = new b(mVar.b().j0(xVar.f85196b).Q(xVar.f85197c).E(), bVar.f60787b, bVar.f60788c);
            }
        }
    }

    public final void O0(com.google.android.exoplayer2.v vVar, b.C0740b c0740b, long j10) {
        if (vVar.getPlaybackState() != 2) {
            this.f60778u = false;
        }
        if (vVar.getPlayerError() == null) {
            this.f60780w = false;
        } else if (c0740b.a(10)) {
            this.f60780w = true;
        }
        int iW0 = W0(vVar);
        if (this.f60769l != iW0) {
            this.f60769l = iW0;
            this.A = true;
            this.f60760c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f60769l).setTimeSinceCreatedMillis(j10 - this.f60761d).build());
        }
    }

    @Override // e6.r1.a
    public void P(b.a aVar, String str) {
        i.b bVar = aVar.f60625d;
        if (bVar == null || !bVar.b()) {
            B0();
            this.f60766i = str;
            this.f60767j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.2");
            T0(aVar.f60623b, aVar.f60625d);
        }
    }

    public final void P0(com.google.android.exoplayer2.v vVar, b.C0740b c0740b, long j10) {
        if (c0740b.a(2)) {
            com.google.android.exoplayer2.d0 currentTracks = vVar.getCurrentTracks();
            boolean zD = currentTracks.d(2);
            boolean zD2 = currentTracks.d(1);
            boolean zD3 = currentTracks.d(3);
            if (zD || zD2 || zD3) {
                if (!zD) {
                    U0(j10, null, 0);
                }
                if (!zD2) {
                    Q0(j10, null, 0);
                }
                if (!zD3) {
                    S0(j10, null, 0);
                }
            }
        }
        if (z0(this.f60772o)) {
            b bVar = this.f60772o;
            com.google.android.exoplayer2.m mVar = bVar.f60786a;
            if (mVar.f21757s != -1) {
                U0(j10, mVar, bVar.f60787b);
                this.f60772o = null;
            }
        }
        if (z0(this.f60773p)) {
            b bVar2 = this.f60773p;
            Q0(j10, bVar2.f60786a, bVar2.f60787b);
            this.f60773p = null;
        }
        if (z0(this.f60774q)) {
            b bVar3 = this.f60774q;
            S0(j10, bVar3.f60786a, bVar3.f60787b);
            this.f60774q = null;
        }
    }

    public final void Q0(long j10, @Nullable com.google.android.exoplayer2.m mVar, int i10) {
        if (s7.m0.c(this.f60776s, mVar)) {
            return;
        }
        if (this.f60776s == null && i10 == 0) {
            i10 = 1;
        }
        this.f60776s = mVar;
        V0(0, j10, mVar, i10);
    }

    @Override // e6.b
    public void R(b.a aVar, e7.o oVar) {
        if (aVar.f60625d == null) {
            return;
        }
        b bVar = new b((com.google.android.exoplayer2.m) s7.a.e(oVar.f60894c), oVar.f60895d, this.f60759b.f(aVar.f60623b, (i.b) s7.a.e(aVar.f60625d)));
        int i10 = oVar.f60893b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f60773p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f60774q = bVar;
                return;
            }
        }
        this.f60772o = bVar;
    }

    public final void R0(com.google.android.exoplayer2.v vVar, b.C0740b c0740b) {
        DrmInitData drmInitDataD0;
        if (c0740b.a(0)) {
            b.a aVarC = c0740b.c(0);
            if (this.f60767j != null) {
                T0(aVarC.f60623b, aVarC.f60625d);
            }
        }
        if (c0740b.a(2) && this.f60767j != null && (drmInitDataD0 = D0(vVar.getCurrentTracks().b())) != null) {
            ((PlaybackMetrics.Builder) s7.m0.j(this.f60767j)).setDrmType(E0(drmInitDataD0));
        }
        if (c0740b.a(1011)) {
            this.f60783z++;
        }
    }

    public final void S0(long j10, @Nullable com.google.android.exoplayer2.m mVar, int i10) {
        if (s7.m0.c(this.f60777t, mVar)) {
            return;
        }
        if (this.f60777t == null && i10 == 0) {
            i10 = 1;
        }
        this.f60777t = mVar;
        V0(2, j10, mVar, i10);
    }

    public final void T0(com.google.android.exoplayer2.c0 c0Var, @Nullable i.b bVar) {
        int iF;
        PlaybackMetrics.Builder builder = this.f60767j;
        if (bVar == null || (iF = c0Var.f(bVar.f60899a)) == -1) {
            return;
        }
        c0Var.j(iF, this.f60763f);
        c0Var.r(this.f60763f.f21389d, this.f60762e);
        builder.setStreamType(J0(this.f60762e.f21404d));
        c0.d dVar = this.f60762e;
        if (dVar.f21415o != -9223372036854775807L && !dVar.f21413m && !dVar.f21410j && !dVar.i()) {
            builder.setMediaDurationMillis(this.f60762e.g());
        }
        builder.setPlaybackType(this.f60762e.i() ? 2 : 1);
        this.A = true;
    }

    public final void U0(long j10, @Nullable com.google.android.exoplayer2.m mVar, int i10) {
        if (s7.m0.c(this.f60775r, mVar)) {
            return;
        }
        if (this.f60775r == null && i10 == 0) {
            i10 = 1;
        }
        this.f60775r = mVar;
        V0(1, j10, mVar, i10);
    }

    @Override // e6.b
    public void V(b.a aVar, int i10, long j10, long j11) {
        i.b bVar = aVar.f60625d;
        if (bVar != null) {
            String strF = this.f60759b.f(aVar.f60623b, (i.b) s7.a.e(bVar));
            Long l10 = this.f60765h.get(strF);
            Long l11 = this.f60764g.get(strF);
            this.f60765h.put(strF, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f60764g.put(strF, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    public final void V0(int i10, long j10, @Nullable com.google.android.exoplayer2.m mVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f60761d);
        if (mVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(K0(i11));
            String str = mVar.f21750l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = mVar.f21751m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = mVar.f21748j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = mVar.f21747i;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = mVar.f21756r;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = mVar.f21757s;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = mVar.f21764z;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = mVar.A;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = mVar.f21742d;
            if (str4 != null) {
                Pair<String, String> pairG0 = G0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairG0.first);
                Object obj = pairG0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = mVar.f21758t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f60760c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    public final int W0(com.google.android.exoplayer2.v vVar) {
        int playbackState = vVar.getPlaybackState();
        if (this.f60778u) {
            return 5;
        }
        if (this.f60780w) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i10 = this.f60769l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (vVar.getPlayWhenReady()) {
                return vVar.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (vVar.getPlayWhenReady()) {
                return vVar.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f60769l == 0) {
            return this.f60769l;
        }
        return 12;
    }

    @Override // e6.b
    public void c(b.a aVar, PlaybackException playbackException) {
        this.f60771n = playbackException;
    }

    @Override // e6.b
    public void c0(b.a aVar, v.e eVar, v.e eVar2, int i10) {
        if (i10 == 1) {
            this.f60778u = true;
        }
        this.f60768k = i10;
    }

    @Override // e6.r1.a
    public void h(b.a aVar, String str) {
    }

    @Override // e6.b
    public void n0(b.a aVar, g6.e eVar) {
        this.f60781x += eVar.f62102g;
        this.f60782y += eVar.f62100e;
    }

    @Override // e6.b
    public void p0(b.a aVar, e7.n nVar, e7.o oVar, IOException iOException, boolean z10) {
        this.f60779v = oVar.f60892a;
    }

    @Override // e6.r1.a
    public void u(b.a aVar, String str, boolean z10) {
        i.b bVar = aVar.f60625d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f60766i)) {
            B0();
        }
        this.f60764g.remove(str);
        this.f60765h.remove(str);
    }

    @Override // e6.b
    public void w(com.google.android.exoplayer2.v vVar, b.C0740b c0740b) {
        if (c0740b.d() == 0) {
            return;
        }
        L0(c0740b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        R0(vVar, c0740b);
        N0(jElapsedRealtime);
        P0(vVar, c0740b, jElapsedRealtime);
        M0(jElapsedRealtime);
        O0(vVar, c0740b, jElapsedRealtime);
        if (c0740b.a(1028)) {
            this.f60759b.a(c0740b.c(1028));
        }
    }

    public final boolean z0(@Nullable b bVar) {
        return bVar != null && bVar.f60788c.equals(this.f60759b.getActiveSessionId());
    }
}
