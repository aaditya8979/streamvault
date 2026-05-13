package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.c;
import com.google.android.exoplayer2.audio.f;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.u;
import e6.s1;
import f6.r;
import f6.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import s7.m0;
import s7.q;

/* JADX INFO: loaded from: classes8.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static boolean f21197e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Object f21198f0 = new Object();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @Nullable
    @GuardedBy("releaseExecutorLock")
    public static ExecutorService f21199g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @GuardedBy("releaseExecutorLock")
    public static int f21200h0;

    @Nullable
    public ByteBuffer A;
    public int B;
    public long C;
    public long D;
    public long E;
    public long F;
    public int G;
    public boolean H;
    public boolean I;
    public long J;
    public float K;
    public AudioProcessor[] L;
    public ByteBuffer[] M;

    @Nullable
    public ByteBuffer N;
    public int O;

    @Nullable
    public ByteBuffer P;
    public byte[] Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public r Y;

    @Nullable
    public d Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6.e f21201a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f21202a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6.f f21203b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f21204b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21205c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f21206c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.e f21207d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f21208d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.l f21209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AudioProcessor[] f21210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AudioProcessor[] f21211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s7.g f21212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.c f21213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque<i> f21214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f21216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f21217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j<AudioSink.InitializationException> f21218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j<AudioSink.WriteException> f21219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f21220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final j.a f21221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public s1 f21222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public AudioSink.a f21223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public g f21224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f21225u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public AudioTrack f21226v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.a f21227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public i f21228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f21229y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public u f21230z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    @RequiresApi(23)
    public static final class b {
        @DoNotInline
        public static void a(AudioTrack audioTrack, @Nullable d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f21231a);
        }
    }

    @RequiresApi(31)
    public static final class c {
        @DoNotInline
        public static void a(AudioTrack audioTrack, s1 s1Var) {
            LogSessionId logSessionIdA = s1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    @RequiresApi(23)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f21231a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f21231a = audioDeviceInfo;
        }
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f21232a = new f.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, double d10);
    }

    public static final class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public f6.f f21234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f21235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21236d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public j.a f21239g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f6.e f21233a = f6.e.f61493c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21237e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e f21238f = e.f21232a;

        public DefaultAudioSink f() {
            if (this.f21234b == null) {
                this.f21234b = new h(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        public f g(f6.e eVar) {
            s7.a.e(eVar);
            this.f21233a = eVar;
            return this;
        }

        public f h(boolean z10) {
            this.f21236d = z10;
            return this;
        }

        public f i(boolean z10) {
            this.f21235c = z10;
            return this;
        }

        public f j(int i10) {
            this.f21237e = i10;
            return this;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f21240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f21243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f21244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f21245f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f21246g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f21247h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AudioProcessor[] f21248i;

        public g(m mVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, AudioProcessor[] audioProcessorArr) {
            this.f21240a = mVar;
            this.f21241b = i10;
            this.f21242c = i11;
            this.f21243d = i12;
            this.f21244e = i13;
            this.f21245f = i14;
            this.f21246g = i15;
            this.f21247h = i16;
            this.f21248i = audioProcessorArr;
        }

        @RequiresApi(21)
        public static AudioAttributes i(com.google.android.exoplayer2.audio.a aVar, boolean z10) {
            return z10 ? j() : aVar.b().f21273a;
        }

        @RequiresApi(21)
        public static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, com.google.android.exoplayer2.audio.a aVar, int i10) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackD = d(z10, aVar, i10);
                int state = audioTrackD.getState();
                if (state == 1) {
                    return audioTrackD;
                }
                try {
                    audioTrackD.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f21244e, this.f21245f, this.f21247h, this.f21240a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.f21244e, this.f21245f, this.f21247h, this.f21240a, l(), e10);
            }
        }

        public boolean b(g gVar) {
            return gVar.f21242c == this.f21242c && gVar.f21246g == this.f21246g && gVar.f21244e == this.f21244e && gVar.f21245f == this.f21245f && gVar.f21243d == this.f21243d;
        }

        public g c(int i10) {
            return new g(this.f21240a, this.f21241b, this.f21242c, this.f21243d, this.f21244e, this.f21245f, this.f21246g, i10, this.f21248i);
        }

        public final AudioTrack d(boolean z10, com.google.android.exoplayer2.audio.a aVar, int i10) {
            int i11 = m0.f79487a;
            return i11 >= 29 ? f(z10, aVar, i10) : i11 >= 21 ? e(z10, aVar, i10) : g(aVar, i10);
        }

        @RequiresApi(21)
        public final AudioTrack e(boolean z10, com.google.android.exoplayer2.audio.a aVar, int i10) {
            return new AudioTrack(i(aVar, z10), DefaultAudioSink.y(this.f21244e, this.f21245f, this.f21246g), this.f21247h, 1, i10);
        }

        @RequiresApi(29)
        public final AudioTrack f(boolean z10, com.google.android.exoplayer2.audio.a aVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(i(aVar, z10)).setAudioFormat(DefaultAudioSink.y(this.f21244e, this.f21245f, this.f21246g)).setTransferMode(1).setBufferSizeInBytes(this.f21247h).setSessionId(i10).setOffloadedPlayback(this.f21242c == 1).build();
        }

        public final AudioTrack g(com.google.android.exoplayer2.audio.a aVar, int i10) {
            int iA0 = m0.a0(aVar.f21269d);
            return i10 == 0 ? new AudioTrack(iA0, this.f21244e, this.f21245f, this.f21246g, this.f21247h, 1) : new AudioTrack(iA0, this.f21244e, this.f21245f, this.f21246g, this.f21247h, 1, i10);
        }

        public long h(long j10) {
            return (j10 * 1000000) / ((long) this.f21244e);
        }

        public long k(long j10) {
            return (j10 * 1000000) / ((long) this.f21240a.A);
        }

        public boolean l() {
            return this.f21242c == 1;
        }
    }

    public static class h implements f6.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f21249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.j f21250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.k f21251c;

        public h(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new com.google.android.exoplayer2.audio.j(), new com.google.android.exoplayer2.audio.k());
        }

        public h(AudioProcessor[] audioProcessorArr, com.google.android.exoplayer2.audio.j jVar, com.google.android.exoplayer2.audio.k kVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f21249a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f21250b = jVar;
            this.f21251c = kVar;
            audioProcessorArr2[audioProcessorArr.length] = jVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = kVar;
        }

        @Override // f6.f
        public u a(u uVar) {
            this.f21251c.d(uVar.f22486b);
            this.f21251c.c(uVar.f22487c);
            return uVar;
        }

        @Override // f6.f
        public boolean applySkipSilenceEnabled(boolean z10) {
            this.f21250b.q(z10);
            return z10;
        }

        @Override // f6.f
        public AudioProcessor[] getAudioProcessors() {
            return this.f21249a;
        }

        @Override // f6.f
        public long getMediaDuration(long j10) {
            return this.f21251c.b(j10);
        }

        @Override // f6.f
        public long getSkippedOutputFrameCount() {
            return this.f21250b.k();
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f21252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f21254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f21255d;

        public i(u uVar, boolean z10, long j10, long j11) {
            this.f21252a = uVar;
            this.f21253b = z10;
            this.f21254c = j10;
            this.f21255d = j11;
        }
    }

    public static final class j<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public T f21257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f21258c;

        public j(long j10) {
            this.f21256a = j10;
        }

        public void a() {
            this.f21257b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void b(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f21257b == null) {
                this.f21257b = t10;
                this.f21258c = this.f21256a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f21258c) {
                T t11 = this.f21257b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f21257b;
                a();
                throw t12;
            }
        }
    }

    public final class k implements c.a {
        public k() {
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void onInvalidLatency(long j10) {
            q.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void onPositionAdvancing(long j10) {
            if (DefaultAudioSink.this.f21223s != null) {
                DefaultAudioSink.this.f21223s.onPositionAdvancing(j10);
            }
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.F() + ", " + DefaultAudioSink.this.G();
            if (DefaultAudioSink.f21197e0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            q.i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.F() + ", " + DefaultAudioSink.this.G();
            if (DefaultAudioSink.f21197e0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            q.i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void onUnderrun(int i10, long j10) {
            if (DefaultAudioSink.this.f21223s != null) {
                DefaultAudioSink.this.f21223s.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f21204b0);
            }
        }
    }

    @RequiresApi(29)
    public final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f21260a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f21261b;

        public class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DefaultAudioSink f21263a;

            public a(DefaultAudioSink defaultAudioSink) {
                this.f21263a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(DefaultAudioSink.this.f21226v) && DefaultAudioSink.this.f21223s != null && DefaultAudioSink.this.V) {
                    DefaultAudioSink.this.f21223s.onOffloadBufferEmptying();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f21226v) && DefaultAudioSink.this.f21223s != null && DefaultAudioSink.this.V) {
                    DefaultAudioSink.this.f21223s.onOffloadBufferEmptying();
                }
            }
        }

        public l() {
            this.f21261b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f21260a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.b(handler), this.f21261b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f21261b);
            this.f21260a.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(f fVar) {
        this.f21201a = fVar.f21233a;
        f6.f fVar2 = fVar.f21234b;
        this.f21203b = fVar2;
        int i10 = m0.f79487a;
        this.f21205c = i10 >= 21 && fVar.f21235c;
        this.f21215k = i10 >= 23 && fVar.f21236d;
        this.f21216l = i10 >= 29 ? fVar.f21237e : 0;
        this.f21220p = fVar.f21238f;
        s7.g gVar = new s7.g(s7.d.f79450a);
        this.f21212h = gVar;
        gVar.e();
        this.f21213i = new com.google.android.exoplayer2.audio.c(new k());
        com.google.android.exoplayer2.audio.e eVar = new com.google.android.exoplayer2.audio.e();
        this.f21207d = eVar;
        com.google.android.exoplayer2.audio.l lVar = new com.google.android.exoplayer2.audio.l();
        this.f21209e = lVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.i(), eVar, lVar);
        Collections.addAll(arrayList, fVar2.getAudioProcessors());
        this.f21210f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f21211g = new AudioProcessor[]{new com.google.android.exoplayer2.audio.g()};
        this.K = 1.0f;
        this.f21227w = com.google.android.exoplayer2.audio.a.f21265h;
        this.X = 0;
        this.Y = new r(0, 0.0f);
        u uVar = u.f22484e;
        this.f21229y = new i(uVar, false, 0L, 0L);
        this.f21230z = uVar;
        this.S = -1;
        this.L = new AudioProcessor[0];
        this.M = new ByteBuffer[0];
        this.f21214j = new ArrayDeque<>();
        this.f21218n = new j<>(100L);
        this.f21219o = new j<>(100L);
        this.f21221q = fVar.f21239g;
    }

    public static int A(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        s7.a.g(minBufferSize != -2);
        return minBufferSize;
    }

    public static int B(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return f6.b.d(byteBuffer);
            case 7:
            case 8:
                return t.e(byteBuffer);
            case 9:
                int iM = f6.u.m(m0.F(byteBuffer, byteBuffer.position()));
                if (iM != -1) {
                    return iM;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int iA = f6.b.a(byteBuffer);
                if (iA == -1) {
                    return 0;
                }
                return f6.b.h(byteBuffer, iA) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return f6.c.c(byteBuffer);
        }
    }

    public static boolean I(int i10) {
        return (m0.f79487a >= 24 && i10 == -6) || i10 == -32;
    }

    public static boolean K(AudioTrack audioTrack) {
        return m0.f79487a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static /* synthetic */ void L(AudioTrack audioTrack, s7.g gVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            gVar.e();
            synchronized (f21198f0) {
                int i10 = f21200h0 - 1;
                f21200h0 = i10;
                if (i10 == 0) {
                    f21199g0.shutdown();
                    f21199g0 = null;
                }
            }
        } catch (Throwable th2) {
            gVar.e();
            synchronized (f21198f0) {
                int i11 = f21200h0 - 1;
                f21200h0 = i11;
                if (i11 == 0) {
                    f21199g0.shutdown();
                    f21199g0 = null;
                }
                throw th2;
            }
        }
    }

    public static void Q(final AudioTrack audioTrack, final s7.g gVar) {
        gVar.c();
        synchronized (f21198f0) {
            if (f21199g0 == null) {
                f21199g0 = m0.x0("ExoPlayer:AudioTrackReleaseThread");
            }
            f21200h0++;
            f21199g0.execute(new Runnable() { // from class: f6.s
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAudioSink.L(audioTrack, gVar);
                }
            });
        }
    }

    @RequiresApi(21)
    public static void V(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    public static void W(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    @RequiresApi(21)
    public static int c0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    @RequiresApi(21)
    public static AudioFormat y(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public final i C() {
        i iVar = this.f21228x;
        return iVar != null ? iVar : !this.f21214j.isEmpty() ? this.f21214j.getLast() : this.f21229y;
    }

    @RequiresApi(29)
    @SuppressLint({"InlinedApi"})
    public final int D(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = m0.f79487a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && m0.f79490d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    public boolean E() {
        return C().f21253b;
    }

    public final long F() {
        g gVar = this.f21225u;
        return gVar.f21242c == 0 ? this.C / ((long) gVar.f21241b) : this.D;
    }

    public final long G() {
        g gVar = this.f21225u;
        return gVar.f21242c == 0 ? this.E / ((long) gVar.f21243d) : this.F;
    }

    public final boolean H() throws AudioSink.InitializationException {
        s1 s1Var;
        if (!this.f21212h.d()) {
            return false;
        }
        AudioTrack audioTrackV = v();
        this.f21226v = audioTrackV;
        if (K(audioTrackV)) {
            P(this.f21226v);
            if (this.f21216l != 3) {
                AudioTrack audioTrack = this.f21226v;
                m mVar = this.f21225u.f21240a;
                audioTrack.setOffloadDelayPadding(mVar.C, mVar.D);
            }
        }
        int i10 = m0.f79487a;
        if (i10 >= 31 && (s1Var = this.f21222r) != null) {
            c.a(this.f21226v, s1Var);
        }
        this.X = this.f21226v.getAudioSessionId();
        com.google.android.exoplayer2.audio.c cVar = this.f21213i;
        AudioTrack audioTrack2 = this.f21226v;
        g gVar = this.f21225u;
        cVar.s(audioTrack2, gVar.f21242c == 2, gVar.f21246g, gVar.f21243d, gVar.f21247h);
        U();
        int i11 = this.Y.f61535a;
        if (i11 != 0) {
            this.f21226v.attachAuxEffect(i11);
            this.f21226v.setAuxEffectSendLevel(this.Y.f61536b);
        }
        d dVar = this.Z;
        if (dVar != null && i10 >= 23) {
            b.a(this.f21226v, dVar);
        }
        this.I = true;
        return true;
    }

    public final boolean J() {
        return this.f21226v != null;
    }

    public final void M() {
        if (this.f21225u.l()) {
            this.f21206c0 = true;
        }
    }

    public final void N() {
        if (this.U) {
            return;
        }
        this.U = true;
        this.f21213i.g(G());
        this.f21226v.stop();
        this.B = 0;
    }

    public final void O(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.L.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.M[i10 - 1];
            } else {
                byteBuffer = this.N;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f21191a;
                }
            }
            if (i10 == length) {
                b0(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.L[i10];
                if (i10 > this.S) {
                    audioProcessor.queueInput(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.M[i10] = output;
                if (output.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    @RequiresApi(29)
    public final void P(AudioTrack audioTrack) {
        if (this.f21217m == null) {
            this.f21217m = new l();
        }
        this.f21217m.a(audioTrack);
    }

    public final void R() {
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.f21208d0 = false;
        this.G = 0;
        this.f21229y = new i(z(), E(), 0L, 0L);
        this.J = 0L;
        this.f21228x = null;
        this.f21214j.clear();
        this.N = null;
        this.O = 0;
        this.P = null;
        this.U = false;
        this.T = false;
        this.S = -1;
        this.A = null;
        this.B = 0;
        this.f21209e.i();
        x();
    }

    public final void S(u uVar, boolean z10) {
        i iVarC = C();
        if (uVar.equals(iVarC.f21252a) && z10 == iVarC.f21253b) {
            return;
        }
        i iVar = new i(uVar, z10, -9223372036854775807L, -9223372036854775807L);
        if (J()) {
            this.f21228x = iVar;
        } else {
            this.f21229y = iVar;
        }
    }

    @RequiresApi(23)
    public final void T(u uVar) {
        if (J()) {
            try {
                this.f21226v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(uVar.f22486b).setPitch(uVar.f22487c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                q.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            uVar = new u(this.f21226v.getPlaybackParams().getSpeed(), this.f21226v.getPlaybackParams().getPitch());
            this.f21213i.t(uVar.f22486b);
        }
        this.f21230z = uVar;
    }

    public final void U() {
        if (J()) {
            if (m0.f79487a >= 21) {
                V(this.f21226v, this.K);
            } else {
                W(this.f21226v, this.K);
            }
        }
    }

    public final void X() {
        AudioProcessor[] audioProcessorArr = this.f21225u.f21248i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.L = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.M = new ByteBuffer[size];
        x();
    }

    public final boolean Y() {
        return (this.f21202a0 || !"audio/raw".equals(this.f21225u.f21240a.f21751m) || Z(this.f21225u.f21240a.B)) ? false : true;
    }

    public final boolean Z(int i10) {
        return this.f21205c && m0.n0(i10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean a(m mVar) {
        return g(mVar) != 0;
    }

    public final boolean a0(m mVar, com.google.android.exoplayer2.audio.a aVar) {
        int iD;
        int iD2;
        int iD3;
        if (m0.f79487a < 29 || this.f21216l == 0 || (iD = s7.u.d((String) s7.a.e(mVar.f21751m), mVar.f21748j)) == 0 || (iD2 = m0.D(mVar.f21764z)) == 0 || (iD3 = D(y(mVar.A, iD2, iD), aVar.b().f21273a)) == 0) {
            return false;
        }
        if (iD3 == 1) {
            return ((mVar.C != 0 || mVar.D != 0) && (this.f21216l == 1)) ? false : true;
        }
        if (iD3 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void b(u uVar) {
        u uVar2 = new u(m0.o(uVar.f22486b, 0.1f, 8.0f), m0.o(uVar.f22487c, 0.1f, 8.0f));
        if (!this.f21215k || m0.f79487a < 23) {
            S(uVar2, E());
        } else {
            T(uVar2);
        }
    }

    public final void b0(ByteBuffer byteBuffer, long j10) throws Exception {
        int iC0;
        AudioSink.a aVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.P;
            if (byteBuffer2 != null) {
                s7.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.P = byteBuffer;
                if (m0.f79487a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.Q;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.Q = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.Q, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.R = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (m0.f79487a < 21) {
                int iC = this.f21213i.c(this.E);
                if (iC > 0) {
                    iC0 = this.f21226v.write(this.Q, this.R, Math.min(iRemaining2, iC));
                    if (iC0 > 0) {
                        this.R += iC0;
                        byteBuffer.position(byteBuffer.position() + iC0);
                    }
                } else {
                    iC0 = 0;
                }
            } else if (this.f21202a0) {
                s7.a.g(j10 != -9223372036854775807L);
                iC0 = d0(this.f21226v, byteBuffer, iRemaining2, j10);
            } else {
                iC0 = c0(this.f21226v, byteBuffer, iRemaining2);
            }
            this.f21204b0 = SystemClock.elapsedRealtime();
            if (iC0 < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iC0, this.f21225u.f21240a, I(iC0) && this.F > 0);
                AudioSink.a aVar2 = this.f21223s;
                if (aVar2 != null) {
                    aVar2.onAudioSinkError(writeException);
                }
                if (writeException.isRecoverable) {
                    throw writeException;
                }
                this.f21219o.b(writeException);
                return;
            }
            this.f21219o.a();
            if (K(this.f21226v)) {
                if (this.F > 0) {
                    this.f21208d0 = false;
                }
                if (this.V && (aVar = this.f21223s) != null && iC0 < iRemaining2 && !this.f21208d0) {
                    aVar.onOffloadBufferFull();
                }
            }
            int i10 = this.f21225u.f21242c;
            if (i10 == 0) {
                this.E += (long) iC0;
            }
            if (iC0 == iRemaining2) {
                if (i10 != 0) {
                    s7.a.g(byteBuffer == this.N);
                    this.F += ((long) this.G) * ((long) this.O);
                }
                this.P = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void c(com.google.android.exoplayer2.audio.a aVar) {
        if (this.f21227w.equals(aVar)) {
            return;
        }
        this.f21227w = aVar;
        if (this.f21202a0) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void d() {
        if (m0.f79487a < 25) {
            flush();
            return;
        }
        this.f21219o.a();
        this.f21218n.a();
        if (J()) {
            R();
            if (this.f21213i.i()) {
                this.f21226v.pause();
            }
            this.f21226v.flush();
            this.f21213i.q();
            com.google.android.exoplayer2.audio.c cVar = this.f21213i;
            AudioTrack audioTrack = this.f21226v;
            g gVar = this.f21225u;
            cVar.s(audioTrack, gVar.f21242c == 2, gVar.f21246g, gVar.f21243d, gVar.f21247h);
            this.I = true;
        }
    }

    @RequiresApi(21)
    public final int d0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (m0.f79487a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.A == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.A = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.A.putInt(1431633921);
        }
        if (this.B == 0) {
            this.A.putInt(4, i10);
            this.A.putLong(8, j10 * 1000);
            this.A.position(0);
            this.B = i10;
        }
        int iRemaining = this.A.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.A, iRemaining, 1);
            if (iWrite < 0) {
                this.B = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iC0 = c0(audioTrack, byteBuffer, i10);
        if (iC0 < 0) {
            this.B = 0;
            return iC0;
        }
        this.B -= iC0;
        return iC0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.f21202a0) {
            this.f21202a0 = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void e(r rVar) {
        if (this.Y.equals(rVar)) {
            return;
        }
        int i10 = rVar.f61535a;
        float f10 = rVar.f61536b;
        AudioTrack audioTrack = this.f21226v;
        if (audioTrack != null) {
            if (this.Y.f61535a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f21226v.setAuxEffectSendLevel(f10);
            }
        }
        this.Y = rVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
        s7.a.g(m0.f79487a >= 21);
        s7.a.g(this.W);
        if (this.f21202a0) {
            return;
        }
        this.f21202a0 = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void f(AudioSink.a aVar) {
        this.f21223s = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (J()) {
            R();
            if (this.f21213i.i()) {
                this.f21226v.pause();
            }
            if (K(this.f21226v)) {
                ((l) s7.a.e(this.f21217m)).b(this.f21226v);
            }
            if (m0.f79487a < 21 && !this.W) {
                this.X = 0;
            }
            g gVar = this.f21224t;
            if (gVar != null) {
                this.f21225u = gVar;
                this.f21224t = null;
            }
            this.f21213i.q();
            Q(this.f21226v, this.f21212h);
            this.f21226v = null;
        }
        this.f21219o.a();
        this.f21218n.a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int g(m mVar) {
        if (!"audio/raw".equals(mVar.f21751m)) {
            return ((this.f21206c0 || !a0(mVar, this.f21227w)) && !this.f21201a.h(mVar)) ? 0 : 2;
        }
        if (m0.o0(mVar.B)) {
            int i10 = mVar.B;
            return (i10 == 2 || (this.f21205c && i10 == 4)) ? 2 : 1;
        }
        q.i("DefaultAudioSink", "Invalid PCM encoding: " + mVar.B);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z10) {
        if (!J() || this.I) {
            return Long.MIN_VALUE;
        }
        return t(s(Math.min(this.f21213i.d(z10), this.f21225u.h(G()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public u getPlaybackParameters() {
        return this.f21215k ? this.f21230z : z();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h(m mVar, int i10, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessor[] audioProcessorArr;
        int iY;
        int iY2;
        int i11;
        int i12;
        int iIntValue;
        int iD;
        int i13;
        int iA;
        int[] iArr2;
        if ("audio/raw".equals(mVar.f21751m)) {
            s7.a.a(m0.o0(mVar.B));
            iY = m0.Y(mVar.B, mVar.f21764z);
            AudioProcessor[] audioProcessorArr2 = Z(mVar.B) ? this.f21211g : this.f21210f;
            this.f21209e.j(mVar.C, mVar.D);
            if (m0.f79487a < 21 && mVar.f21764z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i14 = 0; i14 < 6; i14++) {
                    iArr2[i14] = i14;
                }
            } else {
                iArr2 = iArr;
            }
            this.f21207d.h(iArr2);
            AudioProcessor.a aVar = new AudioProcessor.a(mVar.A, mVar.f21764z, mVar.B);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.a aVarA = audioProcessor.a(aVar);
                    if (audioProcessor.isActive()) {
                        aVar = aVarA;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                    throw new AudioSink.ConfigurationException(e10, mVar);
                }
            }
            int i15 = aVar.f21195c;
            int i16 = aVar.f21193a;
            int iD2 = m0.D(aVar.f21194b);
            audioProcessorArr = audioProcessorArr2;
            i12 = 0;
            iY2 = m0.Y(i15, aVar.f21194b);
            iD = i15;
            i11 = i16;
            iIntValue = iD2;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i17 = mVar.A;
            if (a0(mVar, this.f21227w)) {
                audioProcessorArr = audioProcessorArr3;
                iY = -1;
                iY2 = -1;
                i11 = i17;
                iD = s7.u.d((String) s7.a.e(mVar.f21751m), mVar.f21748j);
                iIntValue = m0.D(mVar.f21764z);
                i12 = 1;
            } else {
                Pair<Integer, Integer> pairF = this.f21201a.f(mVar);
                if (pairF == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + mVar, mVar);
                }
                int iIntValue2 = ((Integer) pairF.first).intValue();
                audioProcessorArr = audioProcessorArr3;
                iY = -1;
                iY2 = -1;
                i11 = i17;
                i12 = 2;
                iIntValue = ((Integer) pairF.second).intValue();
                iD = iIntValue2;
            }
        }
        if (iD == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i12 + ") for: " + mVar, mVar);
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i12 + ") for: " + mVar, mVar);
        }
        if (i10 != 0) {
            iA = i10;
            i13 = iD;
        } else {
            i13 = iD;
            iA = this.f21220p.a(A(i11, iIntValue, iD), iD, i12, iY2, i11, this.f21215k ? 8.0d : 1.0d);
        }
        this.f21206c0 = false;
        g gVar = new g(mVar, iY, i12, iY2, i11, iIntValue, i13, iA, audioProcessorArr);
        if (J()) {
            this.f21224t = gVar;
        } else {
            this.f21225u = gVar;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.N;
        s7.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f21224t != null) {
            if (!w()) {
                return false;
            }
            if (this.f21224t.b(this.f21225u)) {
                this.f21225u = this.f21224t;
                this.f21224t = null;
                if (K(this.f21226v) && this.f21216l != 3) {
                    if (this.f21226v.getPlayState() == 3) {
                        this.f21226v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f21226v;
                    m mVar = this.f21225u.f21240a;
                    audioTrack.setOffloadDelayPadding(mVar.C, mVar.D);
                    this.f21208d0 = true;
                }
            } else {
                N();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            r(j10);
        }
        if (!J()) {
            try {
                if (!H()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.isRecoverable) {
                    throw e10;
                }
                this.f21218n.b(e10);
                return false;
            }
        }
        this.f21218n.a();
        if (this.I) {
            this.J = Math.max(0L, j10);
            this.H = false;
            this.I = false;
            if (this.f21215k && m0.f79487a >= 23) {
                T(this.f21230z);
            }
            r(j10);
            if (this.V) {
                play();
            }
        }
        if (!this.f21213i.k(G())) {
            return false;
        }
        if (this.N == null) {
            s7.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f21225u;
            if (gVar.f21242c != 0 && this.G == 0) {
                int iB = B(gVar.f21246g, byteBuffer);
                this.G = iB;
                if (iB == 0) {
                    return true;
                }
            }
            if (this.f21228x != null) {
                if (!w()) {
                    return false;
                }
                r(j10);
                this.f21228x = null;
            }
            long jK = this.J + this.f21225u.k(F() - this.f21209e.h());
            if (!this.H && Math.abs(jK - j10) > 200000) {
                this.f21223s.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j10, jK));
                this.H = true;
            }
            if (this.H) {
                if (!w()) {
                    return false;
                }
                long j11 = j10 - jK;
                this.J += j11;
                this.H = false;
                r(j10);
                AudioSink.a aVar = this.f21223s;
                if (aVar != null && j11 != 0) {
                    aVar.onPositionDiscontinuity();
                }
            }
            if (this.f21225u.f21242c == 0) {
                this.C += (long) byteBuffer.remaining();
            } else {
                this.D += ((long) this.G) * ((long) i10);
            }
            this.N = byteBuffer;
            this.O = i10;
        }
        O(j10);
        if (!this.N.hasRemaining()) {
            this.N = null;
            this.O = 0;
            return true;
        }
        if (!this.f21213i.j(G())) {
            return false;
        }
        q.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.H = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        return J() && this.f21213i.h(G());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void i(@Nullable s1 s1Var) {
        this.f21222r = s1Var;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        return !J() || (this.T && !hasPendingData());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.V = false;
        if (J() && this.f21213i.p()) {
            this.f21226v.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.V = true;
        if (J()) {
            this.f21213i.u();
            this.f21226v.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.T && J() && w()) {
            N();
            this.T = true;
        }
    }

    public final void r(long j10) {
        u uVarA = Y() ? this.f21203b.a(z()) : u.f22484e;
        boolean zApplySkipSilenceEnabled = Y() ? this.f21203b.applySkipSilenceEnabled(E()) : false;
        this.f21214j.add(new i(uVarA, zApplySkipSilenceEnabled, Math.max(0L, j10), this.f21225u.h(G())));
        X();
        AudioSink.a aVar = this.f21223s;
        if (aVar != null) {
            aVar.onSkipSilenceEnabledChanged(zApplySkipSilenceEnabled);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.f21210f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f21211g) {
            audioProcessor2.reset();
        }
        this.V = false;
        this.f21206c0 = false;
    }

    public final long s(long j10) {
        while (!this.f21214j.isEmpty() && j10 >= this.f21214j.getFirst().f21255d) {
            this.f21229y = this.f21214j.remove();
        }
        i iVar = this.f21229y;
        long j11 = j10 - iVar.f21255d;
        if (iVar.f21252a.equals(u.f22484e)) {
            return this.f21229y.f21254c + j11;
        }
        if (this.f21214j.isEmpty()) {
            return this.f21229y.f21254c + this.f21203b.getMediaDuration(j11);
        }
        i first = this.f21214j.getFirst();
        return first.f21254c - m0.U(first.f21255d - j10, this.f21229y.f21252a.f22486b);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i10) {
        if (this.X != i10) {
            this.X = i10;
            this.W = i10 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.Z = dVar;
        AudioTrack audioTrack = this.f21226v;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z10) {
        S(z(), z10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f10) {
        if (this.K != f10) {
            this.K = f10;
            U();
        }
    }

    public final long t(long j10) {
        return j10 + this.f21225u.h(this.f21203b.getSkippedOutputFrameCount());
    }

    public final AudioTrack u(g gVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = gVar.a(this.f21202a0, this.f21227w, this.X);
            j.a aVar = this.f21221q;
            if (aVar != null) {
                aVar.l(K(audioTrackA));
            }
            return audioTrackA;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.a aVar2 = this.f21223s;
            if (aVar2 != null) {
                aVar2.onAudioSinkError(e10);
            }
            throw e10;
        }
    }

    public final AudioTrack v() throws AudioSink.InitializationException {
        try {
            return u((g) s7.a.e(this.f21225u));
        } catch (AudioSink.InitializationException e10) {
            g gVar = this.f21225u;
            if (gVar.f21247h > 1000000) {
                g gVarC = gVar.c(1000000);
                try {
                    AudioTrack audioTrackU = u(gVarC);
                    this.f21225u = gVarC;
                    return audioTrackU;
                } catch (AudioSink.InitializationException e11) {
                    e10.addSuppressed(e11);
                    M();
                    throw e10;
                }
            }
            M();
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.S
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.S = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.S
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.L
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.O(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.S
            int r0 = r0 + r2
            r9.S = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            r9.b0(r0, r7)
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.S = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.w():boolean");
    }

    public final void x() {
        int i10 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.L;
            if (i10 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i10];
            audioProcessor.flush();
            this.M[i10] = audioProcessor.getOutput();
            i10++;
        }
    }

    public final u z() {
        return C().f21252a;
    }
}
