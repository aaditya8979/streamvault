package com.google.android.exoplayer.audio;

import a6.k0;
import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.audio.AudioProcessor;
import com.google.android.exoplayer.audio.AudioSink;
import com.google.android.exoplayer.audio.b;
import com.ironsource.C3978d4;
import e4.l0;
import g4.m;
import g4.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import k4.q;

/* JADX INFO: loaded from: classes8.dex */
public final class DefaultAudioSink implements AudioSink {
    public static boolean S;
    public static boolean T;
    public int A;
    public int B;
    public long C;
    public float D;
    public AudioProcessor[] E;
    public ByteBuffer[] F;

    @Nullable
    public ByteBuffer G;

    @Nullable
    public ByteBuffer H;
    public byte[] I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public m P;
    public boolean Q;
    public long R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final g4.d f19950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f19951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer.audio.d f19953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f19954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AudioProcessor[] f19955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AudioProcessor[] f19956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConditionVariable f19957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer.audio.b f19958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque<f> f19959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public AudioSink.a f19960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public AudioTrack f19961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public d f19962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f19963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AudioTrack f19964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g4.c f19965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public l0 f19966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l0 f19967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f19968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f19969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public ByteBuffer f19970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f19973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f19974y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f19975z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException(String str) {
            super(str);
        }

        public /* synthetic */ InvalidAudioTrackTimestampException(String str, a aVar) {
            this(str);
        }
    }

    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f19976b;

        public a(AudioTrack audioTrack) {
            this.f19976b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f19976b.flush();
                this.f19976b.release();
            } finally {
                DefaultAudioSink.this.f19957h.open();
            }
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f19978b;

        public b(AudioTrack audioTrack) {
            this.f19978b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f19978b.release();
        }
    }

    public interface c {
        l0 a(l0 l0Var);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long j10);

        long getSkippedOutputFrameCount();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f19980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19986g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f19987h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f19988i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f19989j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AudioProcessor[] f19990k;

        public d(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, AudioProcessor[] audioProcessorArr) {
            this.f19980a = z10;
            this.f19981b = i10;
            this.f19982c = i11;
            this.f19983d = i12;
            this.f19984e = i13;
            this.f19985f = i14;
            this.f19986g = i15;
            this.f19987h = i16 == 0 ? f() : i16;
            this.f19988i = z11;
            this.f19989j = z12;
            this.f19990k = audioProcessorArr;
        }

        public AudioTrack a(boolean z10, g4.c cVar, int i10) throws AudioSink.InitializationException {
            AudioTrack audioTrack;
            if (k0.f3574a >= 21) {
                audioTrack = c(z10, cVar, i10);
            } else {
                int iU = k0.U(cVar.f61936c);
                audioTrack = i10 == 0 ? new AudioTrack(iU, this.f19984e, this.f19985f, this.f19986g, this.f19987h, 1) : new AudioTrack(iU, this.f19984e, this.f19985f, this.f19986g, this.f19987h, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, this.f19984e, this.f19985f, this.f19987h);
        }

        public boolean b(d dVar) {
            return dVar.f19986g == this.f19986g && dVar.f19984e == this.f19984e && dVar.f19985f == this.f19985f;
        }

        @TargetApi(21)
        public final AudioTrack c(boolean z10, g4.c cVar, int i10) {
            AudioAttributes audioAttributesBuild = z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : cVar.a();
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.f19985f).setEncoding(this.f19986g).setSampleRate(this.f19984e).build();
            int i11 = this.f19987h;
            if (i10 == 0) {
                i10 = 0;
            }
            return new AudioTrack(audioAttributesBuild, audioFormatBuild, i11, 1, i10);
        }

        public long d(long j10) {
            return (j10 * ((long) this.f19984e)) / 1000000;
        }

        public long e(long j10) {
            return (j10 * 1000000) / ((long) this.f19984e);
        }

        public final int f() {
            if (this.f19980a) {
                int minBufferSize = AudioTrack.getMinBufferSize(this.f19984e, this.f19985f, this.f19986g);
                a6.a.f(minBufferSize != -2);
                return k0.q(minBufferSize * 4, ((int) d(250000L)) * this.f19983d, (int) Math.max(minBufferSize, d(750000L) * ((long) this.f19983d)));
            }
            int iS = DefaultAudioSink.s(this.f19986g);
            if (this.f19986g == 5) {
                iS *= 2;
            }
            return (int) ((((long) iS) * 250000) / 1000000);
        }

        public long g(long j10) {
            return (j10 * 1000000) / ((long) this.f19982c);
        }
    }

    public static class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f19991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f19992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f19993c;

        public e(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new h(), new i());
        }

        public e(AudioProcessor[] audioProcessorArr, h hVar, i iVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f19991a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f19992b = hVar;
            this.f19993c = iVar;
            audioProcessorArr2[audioProcessorArr.length] = hVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = iVar;
        }

        @Override // com.google.android.exoplayer.audio.DefaultAudioSink.c
        public l0 a(l0 l0Var) {
            this.f19992b.q(l0Var.f60189c);
            return new l0(this.f19993c.d(l0Var.f60187a), this.f19993c.c(l0Var.f60188b), l0Var.f60189c);
        }

        @Override // com.google.android.exoplayer.audio.DefaultAudioSink.c
        public AudioProcessor[] getAudioProcessors() {
            return this.f19991a;
        }

        @Override // com.google.android.exoplayer.audio.DefaultAudioSink.c
        public long getMediaDuration(long j10) {
            return this.f19993c.b(j10);
        }

        @Override // com.google.android.exoplayer.audio.DefaultAudioSink.c
        public long getSkippedOutputFrameCount() {
            return this.f19992b.k();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f19994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19996c;

        public f(l0 l0Var, long j10, long j11) {
            this.f19994a = l0Var;
            this.f19995b = j10;
            this.f19996c = j11;
        }

        public /* synthetic */ f(l0 l0Var, long j10, long j11, a aVar) {
            this(l0Var, j10, j11);
        }
    }

    public final class g implements b.a {
        public g() {
        }

        public /* synthetic */ g(DefaultAudioSink defaultAudioSink, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer.audio.b.a
        public void onInvalidLatency(long j10) {
            a6.m.h("AudioTrack", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.google.android.exoplayer.audio.b.a
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.t() + ", " + DefaultAudioSink.this.u();
            if (DefaultAudioSink.T) {
                throw new InvalidAudioTrackTimestampException(str, null);
            }
            a6.m.h("AudioTrack", str);
        }

        @Override // com.google.android.exoplayer.audio.b.a
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.t() + ", " + DefaultAudioSink.this.u();
            if (DefaultAudioSink.T) {
                throw new InvalidAudioTrackTimestampException(str, null);
            }
            a6.m.h("AudioTrack", str);
        }

        @Override // com.google.android.exoplayer.audio.b.a
        public void onUnderrun(int i10, long j10) {
            if (DefaultAudioSink.this.f19960k != null) {
                DefaultAudioSink.this.f19960k.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.R);
            }
        }
    }

    public DefaultAudioSink(@Nullable g4.d dVar, c cVar, boolean z10) {
        this.f19950a = dVar;
        this.f19951b = (c) a6.a.e(cVar);
        this.f19952c = z10;
        this.f19957h = new ConditionVariable(true);
        this.f19958i = new com.google.android.exoplayer.audio.b(new g(this, null));
        com.google.android.exoplayer.audio.d dVar2 = new com.google.android.exoplayer.audio.d();
        this.f19953d = dVar2;
        j jVar = new j();
        this.f19954e = jVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer.audio.g(), dVar2, jVar);
        Collections.addAll(arrayList, cVar.getAudioProcessors());
        this.f19955f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f19956g = new AudioProcessor[]{new com.google.android.exoplayer.audio.e()};
        this.D = 1.0f;
        this.B = 0;
        this.f19965p = g4.c.f61933f;
        this.O = 0;
        this.P = new m(0, 0.0f);
        this.f19967r = l0.f60186e;
        this.K = -1;
        this.E = new AudioProcessor[0];
        this.F = new ByteBuffer[0];
        this.f19959j = new ArrayDeque<>();
    }

    public DefaultAudioSink(@Nullable g4.d dVar, AudioProcessor[] audioProcessorArr) {
        this(dVar, audioProcessorArr, false);
    }

    public DefaultAudioSink(@Nullable g4.d dVar, AudioProcessor[] audioProcessorArr, boolean z10) {
        this(dVar, new e(audioProcessorArr), z10);
    }

    @TargetApi(21)
    public static void C(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    public static void D(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    @TargetApi(21)
    public static int G(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    public static int q(int i10, boolean z10) {
        int i11 = k0.f3574a;
        if (i11 <= 28 && !z10) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(k0.f3575b) && !z10 && i10 == 1) {
            i10 = 2;
        }
        return k0.B(i10);
    }

    public static int r(int i10, ByteBuffer byteBuffer) {
        if (i10 == 14) {
            int iA = g4.a.a(byteBuffer);
            if (iA == -1) {
                return 0;
            }
            return g4.a.h(byteBuffer, iA) * 16;
        }
        if (i10 == 17) {
            return g4.b.c(byteBuffer);
        }
        if (i10 != 18) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    return n.e(byteBuffer);
                case 9:
                    return q.a(byteBuffer.get(byteBuffer.position()));
                default:
                    throw new IllegalStateException("Unexpected audio encoding: " + i10);
            }
        }
        return g4.a.d(byteBuffer);
    }

    public static int s(int i10) {
        if (i10 == 5) {
            return 80000;
        }
        if (i10 == 6) {
            return 768000;
        }
        if (i10 == 7) {
            return 192000;
        }
        if (i10 == 8) {
            return 2250000;
        }
        if (i10 == 14) {
            return 3062500;
        }
        if (i10 == 17) {
            return 336000;
        }
        if (i10 == 18) {
            return 768000;
        }
        throw new IllegalArgumentException();
    }

    public static AudioTrack w(int i10) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
    }

    public final void A() {
        AudioTrack audioTrack = this.f19961l;
        if (audioTrack == null) {
            return;
        }
        this.f19961l = null;
        new b(audioTrack).start();
    }

    public final void B() {
        if (x()) {
            if (k0.f3574a >= 21) {
                C(this.f19964o, this.D);
            } else {
                D(this.f19964o, this.D);
            }
        }
    }

    public final void E() {
        AudioProcessor[] audioProcessorArr = this.f19963n.f19990k;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.E = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.F = new ByteBuffer[size];
        p();
    }

    public final void F(ByteBuffer byteBuffer, long j10) throws AudioSink.WriteException {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.H;
            int iG = 0;
            if (byteBuffer2 != null) {
                a6.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.H = byteBuffer;
                if (k0.f3574a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.I;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.I = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.I, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.J = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (k0.f3574a < 21) {
                int iC = this.f19958i.c(this.f19974y);
                if (iC > 0) {
                    iG = this.f19964o.write(this.I, this.J, Math.min(iRemaining2, iC));
                    if (iG > 0) {
                        this.J += iG;
                        byteBuffer.position(byteBuffer.position() + iG);
                    }
                }
            } else if (this.Q) {
                a6.a.f(j10 != -9223372036854775807L);
                iG = H(this.f19964o, byteBuffer, iRemaining2, j10);
            } else {
                iG = G(this.f19964o, byteBuffer, iRemaining2);
            }
            this.R = SystemClock.elapsedRealtime();
            if (iG < 0) {
                throw new AudioSink.WriteException(iG);
            }
            boolean z10 = this.f19963n.f19980a;
            if (z10) {
                this.f19974y += (long) iG;
            }
            if (iG == iRemaining2) {
                if (!z10) {
                    this.f19975z += (long) this.A;
                }
                this.H = null;
            }
        }
    }

    @TargetApi(21)
    public final int H(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (k0.f3574a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f19970u == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f19970u = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f19970u.putInt(1431633921);
        }
        if (this.f19971v == 0) {
            this.f19970u.putInt(4, i10);
            this.f19970u.putLong(8, j10 * 1000);
            this.f19970u.position(0);
            this.f19971v = i10;
        }
        int iRemaining = this.f19970u.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f19970u, iRemaining, 1);
            if (iWrite < 0) {
                this.f19971v = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iG = G(audioTrack, byteBuffer, i10);
        if (iG < 0) {
            this.f19971v = 0;
            return iG;
        }
        this.f19971v -= iG;
        return iG;
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void a(AudioSink.a aVar) {
        this.f19960k = aVar;
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void b(l0 l0Var) {
        d dVar = this.f19963n;
        if (dVar != null && !dVar.f19989j) {
            this.f19967r = l0.f60186e;
        } else {
            if (l0Var.equals(getPlaybackParameters())) {
                return;
            }
            if (x()) {
                this.f19966q = l0Var;
            } else {
                this.f19967r = l0Var;
            }
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void c(g4.c cVar) {
        if (this.f19965p.equals(cVar)) {
            return;
        }
        this.f19965p = cVar;
        if (this.Q) {
            return;
        }
        flush();
        this.O = 0;
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void configure(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, int i15) throws AudioSink.ConfigurationException {
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        boolean z10 = false;
        if (k0.f3574a < 21 && i11 == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i19 = 0; i19 < 6; i19++) {
                iArr2[i19] = i19;
            }
        } else {
            iArr2 = iArr;
        }
        boolean zF0 = k0.f0(i10);
        boolean z11 = this.f19952c && d(i11, 4) && k0.e0(i10);
        AudioProcessor[] audioProcessorArr = z11 ? this.f19956g : this.f19955f;
        if (zF0) {
            this.f19954e.j(i14, i15);
            this.f19953d.h(iArr2);
            AudioProcessor.a aVar = new AudioProcessor.a(i12, i11, i10);
            for (AudioProcessor audioProcessor : audioProcessorArr) {
                try {
                    AudioProcessor.a aVarA = audioProcessor.a(aVar);
                    if (audioProcessor.isActive()) {
                        aVar = aVarA;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                    throw new AudioSink.ConfigurationException(e10);
                }
            }
            int i20 = aVar.f19946a;
            i16 = aVar.f19947b;
            i17 = aVar.f19948c;
            i18 = i20;
        } else {
            i16 = i11;
            i17 = i10;
            i18 = i12;
        }
        int iQ = q(i16, zF0);
        if (iQ == 0) {
            throw new AudioSink.ConfigurationException("Unsupported channel count: " + i16);
        }
        int iS = zF0 ? k0.S(i10, i11) : -1;
        int iS2 = zF0 ? k0.S(i17, i16) : -1;
        if (zF0 && !z11) {
            z10 = true;
        }
        d dVar = new d(zF0, iS, i12, iS2, i18, iQ, i17, i13, zF0, z10, audioProcessorArr);
        if (x()) {
            this.f19962m = dVar;
        } else {
            this.f19963n = dVar;
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public boolean d(int i10, int i11) {
        if (k0.f0(i11)) {
            return i11 != 4 || k0.f3574a >= 21;
        }
        g4.d dVar = this.f19950a;
        return dVar != null && dVar.e(i11) && (i10 == -1 || i10 <= this.f19950a.d());
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.Q) {
            this.Q = false;
            this.O = 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void e(m mVar) {
        if (this.P.equals(mVar)) {
            return;
        }
        int i10 = mVar.f61974a;
        float f10 = mVar.f61975b;
        AudioTrack audioTrack = this.f19964o;
        if (audioTrack != null) {
            if (this.P.f61974a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f19964o.setAuxEffectSendLevel(f10);
            }
        }
        this.P = mVar;
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void enableTunnelingV21(int i10) {
        a6.a.f(k0.f3574a >= 21);
        if (this.Q && this.O == i10) {
            return;
        }
        this.Q = true;
        this.O = i10;
        flush();
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void flush() {
        if (x()) {
            this.f19972w = 0L;
            this.f19973x = 0L;
            this.f19974y = 0L;
            this.f19975z = 0L;
            this.A = 0;
            l0 l0Var = this.f19966q;
            if (l0Var != null) {
                this.f19967r = l0Var;
                this.f19966q = null;
            } else if (!this.f19959j.isEmpty()) {
                this.f19967r = this.f19959j.getLast().f19994a;
            }
            this.f19959j.clear();
            this.f19968s = 0L;
            this.f19969t = 0L;
            this.f19954e.i();
            p();
            this.G = null;
            this.H = null;
            this.M = false;
            this.L = false;
            this.K = -1;
            this.f19970u = null;
            this.f19971v = 0;
            this.B = 0;
            if (this.f19958i.i()) {
                this.f19964o.pause();
            }
            AudioTrack audioTrack = this.f19964o;
            this.f19964o = null;
            d dVar = this.f19962m;
            if (dVar != null) {
                this.f19963n = dVar;
                this.f19962m = null;
            }
            this.f19958i.q();
            this.f19957h.close();
            new a(audioTrack).start();
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z10) {
        if (!x() || this.B == 0) {
            return Long.MIN_VALUE;
        }
        return this.C + m(n(Math.min(this.f19958i.d(z10), this.f19963n.e(u()))));
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public l0 getPlaybackParameters() {
        l0 l0Var = this.f19966q;
        return l0Var != null ? l0Var : !this.f19959j.isEmpty() ? this.f19959j.getLast().f19994a : this.f19967r;
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j10) throws AudioSink.InitializationException, AudioSink.WriteException {
        ByteBuffer byteBuffer2 = this.G;
        a6.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f19962m != null) {
            if (!o()) {
                return false;
            }
            if (this.f19962m.b(this.f19963n)) {
                this.f19963n = this.f19962m;
                this.f19962m = null;
            } else {
                y();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            l(this.f19967r, j10);
        }
        if (!x()) {
            v(j10);
            if (this.N) {
                play();
            }
        }
        if (!this.f19958i.k(u())) {
            return false;
        }
        if (this.G == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            d dVar = this.f19963n;
            if (!dVar.f19980a && this.A == 0) {
                int iR = r(dVar.f19986g, byteBuffer);
                this.A = iR;
                if (iR == 0) {
                    return true;
                }
            }
            if (this.f19966q != null) {
                if (!o()) {
                    return false;
                }
                l0 l0Var = this.f19966q;
                this.f19966q = null;
                l(l0Var, j10);
            }
            if (this.B == 0) {
                this.C = Math.max(0L, j10);
                this.B = 1;
            } else {
                long jG = this.C + this.f19963n.g(t() - this.f19954e.h());
                if (this.B == 1 && Math.abs(jG - j10) > 200000) {
                    a6.m.c("AudioTrack", "Discontinuity detected [expected " + jG + ", got " + j10 + C3978d4.j.f31385e);
                    this.B = 2;
                }
                if (this.B == 2) {
                    long j11 = j10 - jG;
                    this.C += j11;
                    this.B = 1;
                    AudioSink.a aVar = this.f19960k;
                    if (aVar != null && j11 != 0) {
                        aVar.onPositionDiscontinuity();
                    }
                }
            }
            if (this.f19963n.f19980a) {
                this.f19972w += (long) byteBuffer.remaining();
            } else {
                this.f19973x += (long) this.A;
            }
            this.G = byteBuffer;
        }
        if (this.f19963n.f19988i) {
            z(j10);
        } else {
            F(this.G, j10);
        }
        if (!this.G.hasRemaining()) {
            this.G = null;
            return true;
        }
        if (!this.f19958i.j(u())) {
            return false;
        }
        a6.m.h("AudioTrack", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        if (this.B == 1) {
            this.B = 2;
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return x() && this.f19958i.h(u());
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public boolean isEnded() {
        return !x() || (this.L && !hasPendingData());
    }

    public final void l(l0 l0Var, long j10) {
        this.f19959j.add(new f(this.f19963n.f19989j ? this.f19951b.a(l0Var) : l0.f60186e, Math.max(0L, j10), this.f19963n.e(u()), null));
        E();
    }

    public final long m(long j10) {
        return j10 + this.f19963n.e(this.f19951b.getSkippedOutputFrameCount());
    }

    public final long n(long j10) {
        long j11;
        long jO;
        f fVarRemove = null;
        while (!this.f19959j.isEmpty() && j10 >= this.f19959j.getFirst().f19996c) {
            fVarRemove = this.f19959j.remove();
        }
        if (fVarRemove != null) {
            this.f19967r = fVarRemove.f19994a;
            this.f19969t = fVarRemove.f19996c;
            this.f19968s = fVarRemove.f19995b - this.C;
        }
        if (this.f19967r.f60187a == 1.0f) {
            return (j10 + this.f19968s) - this.f19969t;
        }
        if (this.f19959j.isEmpty()) {
            j11 = this.f19968s;
            jO = this.f19951b.getMediaDuration(j10 - this.f19969t);
        } else {
            j11 = this.f19968s;
            jO = k0.O(j10 - this.f19969t, this.f19967r.f60187a);
        }
        return j11 + jO;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0034 -> B:9:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o() throws com.google.android.exoplayer.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.K
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L16
            com.google.android.exoplayer.audio.DefaultAudioSink$d r0 = r9.f19963n
            boolean r0 = r0.f19988i
            if (r0 == 0) goto Lf
            r0 = r3
            goto L12
        Lf:
            com.google.android.exoplayer.audio.AudioProcessor[] r0 = r9.E
            int r0 = r0.length
        L12:
            r9.K = r0
        L14:
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            int r4 = r9.K
            com.google.android.exoplayer.audio.AudioProcessor[] r5 = r9.E
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L3a
            r4 = r5[r4]
            if (r0 == 0) goto L2a
            r4.queueEndOfStream()
        L2a:
            r9.z(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L34
            return r3
        L34:
            int r0 = r9.K
            int r0 = r0 + r2
            r9.K = r0
            goto L14
        L3a:
            java.nio.ByteBuffer r0 = r9.H
            if (r0 == 0) goto L46
            r9.F(r0, r7)
            java.nio.ByteBuffer r0 = r9.H
            if (r0 == 0) goto L46
            return r3
        L46:
            r9.K = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.audio.DefaultAudioSink.o():boolean");
    }

    public final void p() {
        int i10 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.E;
            if (i10 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i10];
            audioProcessor.flush();
            this.F[i10] = audioProcessor.getOutput();
            i10++;
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void pause() {
        this.N = false;
        if (x() && this.f19958i.p()) {
            this.f19964o.pause();
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void play() {
        this.N = true;
        if (x()) {
            this.f19958i.t();
            this.f19964o.play();
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.L && x() && o()) {
            y();
            this.L = true;
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        A();
        for (AudioProcessor audioProcessor : this.f19955f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f19956g) {
            audioProcessor2.reset();
        }
        this.O = 0;
        this.N = false;
    }

    @Override // com.google.android.exoplayer.audio.AudioSink
    public void setVolume(float f10) {
        if (this.D != f10) {
            this.D = f10;
            B();
        }
    }

    public final long t() {
        d dVar = this.f19963n;
        return dVar.f19980a ? this.f19972w / ((long) dVar.f19981b) : this.f19973x;
    }

    public final long u() {
        d dVar = this.f19963n;
        return dVar.f19980a ? this.f19974y / ((long) dVar.f19983d) : this.f19975z;
    }

    public final void v(long j10) throws AudioSink.InitializationException {
        this.f19957h.block();
        AudioTrack audioTrackA = ((d) a6.a.e(this.f19963n)).a(this.Q, this.f19965p, this.O);
        this.f19964o = audioTrackA;
        int audioSessionId = audioTrackA.getAudioSessionId();
        if (S && k0.f3574a < 21) {
            AudioTrack audioTrack = this.f19961l;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                A();
            }
            if (this.f19961l == null) {
                this.f19961l = w(audioSessionId);
            }
        }
        if (this.O != audioSessionId) {
            this.O = audioSessionId;
            AudioSink.a aVar = this.f19960k;
            if (aVar != null) {
                aVar.onAudioSessionId(audioSessionId);
            }
        }
        l(this.f19967r, j10);
        com.google.android.exoplayer.audio.b bVar = this.f19958i;
        AudioTrack audioTrack2 = this.f19964o;
        d dVar = this.f19963n;
        bVar.s(audioTrack2, dVar.f19986g, dVar.f19983d, dVar.f19987h);
        B();
        int i10 = this.P.f61974a;
        if (i10 != 0) {
            this.f19964o.attachAuxEffect(i10);
            this.f19964o.setAuxEffectSendLevel(this.P.f61975b);
        }
    }

    public final boolean x() {
        return this.f19964o != null;
    }

    public final void y() {
        if (this.M) {
            return;
        }
        this.M = true;
        this.f19958i.g(u());
        this.f19964o.stop();
        this.f19971v = 0;
    }

    public final void z(long j10) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.E.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.F[i10 - 1];
            } else {
                byteBuffer = this.G;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f19944a;
                }
            }
            if (i10 == length) {
                F(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.E[i10];
                audioProcessor.queueInput(byteBuffer);
                ByteBuffer output = audioProcessor.getOutput();
                this.F[i10] = output;
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
}
