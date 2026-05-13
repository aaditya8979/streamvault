package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3978d4;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    public long A;
    public boolean B;
    public long C;
    public Method D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public float P;
    public c[] Q;
    public ByteBuffer[] R;
    public ByteBuffer S;
    public ByteBuffer T;
    public byte[] U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f17281a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f17282a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f17283b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f17284b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c[] f17285c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f17286c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f17287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConditionVariable f17288e = new ConditionVariable(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f17289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f17290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f17291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AudioTrack f17292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f17300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f17301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f17302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f17303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17304u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ByteBuffer f17305v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17308y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f17309z;

    public r(c[] cVarArr, u uVar) {
        this.f17287d = uVar;
        if (z.f18822a >= 18) {
            try {
                this.D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (z.f18822a >= 19) {
            this.f17290g = new l();
        } else {
            this.f17290g = new k();
        }
        s sVar = new s();
        this.f17281a = sVar;
        x xVar = new x();
        this.f17283b = xVar;
        c[] cVarArr2 = new c[cVarArr.length + 3];
        this.f17285c = cVarArr2;
        cVarArr2[0] = new v();
        cVarArr2[1] = sVar;
        System.arraycopy(cVarArr, 0, cVarArr2, 2, cVarArr.length);
        cVarArr2[cVarArr.length + 2] = xVar;
        this.f17289f = new long[10];
        this.P = 1.0f;
        this.L = 0;
        this.f17297n = 3;
        this.Z = 0;
        this.f17302s = com.fyber.inneractive.sdk.player.exoplayer2.s.f18475d;
        this.W = -1;
        this.Q = new c[0];
        this.R = new ByteBuffer[0];
        this.f17291h = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r23) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a(boolean):long");
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f17298o) {
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar2 = com.fyber.inneractive.sdk.player.exoplayer2.s.f18475d;
            this.f17302s = sVar2;
            return sVar2;
        }
        x xVar = this.f17283b;
        float f10 = sVar.f18476a;
        xVar.getClass();
        int i10 = z.f18822a;
        float fMax = Math.max(0.1f, Math.min(f10, 8.0f));
        xVar.f17355e = fMax;
        x xVar2 = this.f17283b;
        float f11 = sVar.f18477b;
        xVar2.getClass();
        xVar2.f17356f = Math.max(0.1f, Math.min(f11, 8.0f));
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.s(fMax, f11);
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar4 = this.f17301r;
        if (sVar4 == null) {
            sVar4 = !this.f17291h.isEmpty() ? ((p) this.f17291h.getLast()).f17278a : this.f17302s;
        }
        if (!sVar3.equals(sVar4)) {
            if (d()) {
                this.f17301r = sVar3;
            } else {
                this.f17302s = sVar3;
            }
        }
        return this.f17302s;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, int r10, int r11, int[] r12) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.m {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a(int, int, int, int[]):void");
    }

    public final void a(long j10) throws q {
        ByteBuffer byteBuffer;
        int length = this.Q.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.R[i10 - 1];
            } else {
                byteBuffer = this.S;
                if (byteBuffer == null) {
                    byteBuffer = c.f17246a;
                }
            }
            if (i10 == length) {
                b(byteBuffer, j10);
            } else {
                c cVar = this.Q[i10];
                cVar.a(byteBuffer);
                ByteBuffer byteBufferA = cVar.a();
                this.R[i10] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() throws com.fyber.inneractive.sdk.player.exoplayer2.audio.q {
        /*
            r9 = this;
            int r0 = r9.W
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.f17298o
            if (r0 == 0) goto Lf
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r0 = r9.Q
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r3
        L10:
            r9.W = r0
        L12:
            r0 = r2
            goto L15
        L14:
            r0 = r3
        L15:
            int r4 = r9.W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r5 = r9.Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.b()
        L28:
            r9.a(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.W
            int r0 = r0 + r2
            r9.W = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.W = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a():boolean");
    }

    public final boolean a(ByteBuffer byteBuffer, long j10) throws q, n {
        int i10;
        int i11;
        ByteBuffer byteBuffer2 = this.S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (!d()) {
            this.f17288e.block();
            if (this.f17282a0) {
                this.f17292i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f17294k).setEncoding(this.f17296m).setSampleRate(this.f17293j).build(), this.f17299p, 1, this.Z);
            } else if (this.Z == 0) {
                this.f17292i = new AudioTrack(this.f17297n, this.f17293j, this.f17294k, this.f17296m, this.f17299p, 1);
            } else {
                this.f17292i = new AudioTrack(this.f17297n, this.f17293j, this.f17294k, this.f17296m, this.f17299p, 1, this.Z);
            }
            int state = this.f17292i.getState();
            if (state != 1) {
                try {
                    this.f17292i.release();
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    this.f17292i = null;
                    throw th2;
                }
                this.f17292i = null;
                throw new n(state, this.f17293j, this.f17294k, this.f17299p);
            }
            int audioSessionId = this.f17292i.getAudioSessionId();
            if (this.Z != audioSessionId) {
                this.Z = audioSessionId;
                u uVar = (u) this.f17287d;
                uVar.f17321a.P.audioSessionId(audioSessionId);
                uVar.f17321a.getClass();
            }
            this.f17290g.a(this.f17292i, e());
            i();
            this.f17284b0 = false;
            if (this.Y) {
                f();
            }
        }
        if (e()) {
            if (this.f17292i.getPlayState() == 2) {
                this.f17284b0 = false;
                return false;
            }
            if (this.f17292i.getPlayState() == 1 && this.f17290g.a() != 0) {
                return false;
            }
        }
        boolean z10 = this.f17284b0;
        boolean zC = c();
        this.f17284b0 = zC;
        if (z10 && !zC && this.f17292i.getPlayState() != 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f17286c0;
            u uVar2 = (u) this.f17287d;
            uVar2.f17321a.P.audioTrackUnderrun(this.f17299p, com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f17300q), jElapsedRealtime);
            uVar2.f17321a.getClass();
        }
        if (this.S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f17298o && this.K == 0) {
                int i12 = this.f17296m;
                if (i12 == 7 || i12 == 8) {
                    int iPosition = byteBuffer.position();
                    i11 = ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) * 32;
                } else if (i12 == 5) {
                    i11 = 1536;
                } else {
                    if (i12 != 6) {
                        throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected audio encoding: ", i12));
                    }
                    i11 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a.f17240a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                }
                this.K = i11;
            }
            if (this.f17301r != null) {
                if (!a()) {
                    return false;
                }
                this.f17291h.add(new p(this.f17301r, Math.max(0L, j10), (b() * 1000000) / ((long) this.f17293j)));
                this.f17301r = null;
                h();
            }
            int i13 = this.L;
            if (i13 == 0) {
                this.M = Math.max(0L, j10);
                this.L = 1;
            } else {
                long j11 = (((this.f17298o ? this.G : this.F / ((long) this.E)) * 1000000) / ((long) this.f17293j)) + this.M;
                if (i13 != 1 || Math.abs(j11 - j10) <= 200000) {
                    i10 = 2;
                } else {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + j11 + ", got " + j10 + C3978d4.j.f31385e);
                    i10 = 2;
                    this.L = 2;
                }
                if (this.L == i10) {
                    this.M = (j10 - j11) + this.M;
                    this.L = 1;
                    u uVar3 = (u) this.f17287d;
                    uVar3.f17321a.getClass();
                    uVar3.f17321a.V = true;
                }
            }
            if (this.f17298o) {
                this.G += (long) this.K;
            } else {
                this.F += (long) byteBuffer.remaining();
            }
            this.S = byteBuffer;
        }
        if (this.f17298o) {
            b(this.S, j10);
        } else {
            a(j10);
        }
        if (this.S.hasRemaining()) {
            return false;
        }
        this.S = null;
        return true;
    }

    public final long b() {
        return this.f17298o ? this.J : this.I / ((long) this.H);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.nio.ByteBuffer r8, long r9) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.q {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.b(java.nio.ByteBuffer, long):void");
    }

    public final boolean c() {
        return d() && (b() > this.f17290g.a() || (e() && this.f17292i.getPlayState() == 2 && this.f17292i.getPlaybackHeadPosition() == 0));
    }

    public final boolean d() {
        return this.f17292i != null;
    }

    public final boolean e() {
        int i10;
        return z.f18822a < 23 && ((i10 = this.f17296m) == 5 || i10 == 6);
    }

    public final void f() {
        this.Y = true;
        if (d()) {
            this.N = System.nanoTime() / 1000;
            this.f17292i.play();
        }
    }

    public final void g() {
        if (d()) {
            this.F = 0L;
            this.G = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f17301r;
            if (sVar != null) {
                this.f17302s = sVar;
                this.f17301r = null;
            } else if (!this.f17291h.isEmpty()) {
                this.f17302s = ((p) this.f17291h.getLast()).f17278a;
            }
            this.f17291h.clear();
            this.f17303t = 0L;
            this.f17304u = 0L;
            this.S = null;
            this.T = null;
            int i10 = 0;
            while (true) {
                c[] cVarArr = this.Q;
                if (i10 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i10];
                cVar.flush();
                this.R[i10] = cVar.a();
                i10++;
            }
            this.X = false;
            this.W = -1;
            this.f17305v = null;
            this.f17306w = 0;
            this.L = 0;
            this.O = 0L;
            this.f17309z = 0L;
            this.f17308y = 0;
            this.f17307x = 0;
            this.A = 0L;
            this.B = false;
            this.C = 0L;
            if (this.f17292i.getPlayState() == 3) {
                this.f17292i.pause();
            }
            AudioTrack audioTrack = this.f17292i;
            this.f17292i = null;
            this.f17290g.a(null, false);
            this.f17288e.close();
            new j(this, audioTrack).start();
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f17285c) {
            if (cVar.d()) {
                arrayList.add(cVar);
            } else {
                cVar.flush();
            }
        }
        int size = arrayList.size();
        this.Q = (c[]) arrayList.toArray(new c[size]);
        this.R = new ByteBuffer[size];
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = this.Q[i10];
            cVar2.flush();
            this.R[i10] = cVar2.a();
        }
    }

    public final void i() {
        if (d()) {
            if (z.f18822a >= 21) {
                this.f17292i.setVolume(this.P);
                return;
            }
            AudioTrack audioTrack = this.f17292i;
            float f10 = this.P;
            audioTrack.setStereoVolume(f10, f10);
        }
    }
}
