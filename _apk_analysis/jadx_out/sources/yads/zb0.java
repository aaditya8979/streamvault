package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class zb0 implements jl {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public bl[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public ql X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk f97452a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f97453a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb0 f97454b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f97455b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final st f97457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y83 f97458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bl[] f97459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bl[] f97460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vy f97461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ol f97462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque f97463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f97464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f97465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public yb0 f97466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vb0 f97467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vb0 f97468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bc0 f97469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ye2 f97470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gl f97471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public rb0 f97472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public rb0 f97473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AudioTrack f97474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public pk f97475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ub0 f97476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ub0 f97477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ee2 f97478y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer f97479z;

    public zb0(qb0 qb0Var) {
        this.f97452a = qb0Var.f93967a;
        sb0 sb0Var = qb0Var.f93968b;
        this.f97454b = sb0Var;
        int i10 = ib3.f90737a;
        this.f97456c = i10 >= 21 && qb0Var.f93969c;
        this.f97464k = i10 >= 23 && qb0Var.f93970d;
        this.f97465l = i10 >= 29 ? qb0Var.f93971e : 0;
        this.f97469p = qb0Var.f93972f;
        vy vyVar = new vy(0);
        this.f97461h = vyVar;
        vyVar.d();
        this.f97462i = new ol(new wb0(this));
        st stVar = new st();
        this.f97457d = stVar;
        y83 y83Var = new y83();
        this.f97458e = y83Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new rp2(), stVar, y83Var);
        Collections.addAll(arrayList, sb0Var.a());
        this.f97459f = (bl[]) arrayList.toArray(new bl[0]);
        this.f97460g = new bl[]{new ew0()};
        this.J = 1.0f;
        this.f97475v = pk.f93612h;
        this.W = 0;
        this.X = new ql();
        ee2 ee2Var = ee2.f89220e;
        this.f97477x = new ub0(ee2Var, false, 0L, 0L);
        this.f97478y = ee2Var;
        this.R = -1;
        this.K = new bl[0];
        this.L = new ByteBuffer[0];
        this.f97463j = new ArrayDeque();
        this.f97467n = new vb0();
        this.f97468o = new vb0();
    }

    public static boolean a(AudioTrack audioTrack) {
        return ib3.f90737a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final int a(mx0 mx0Var) {
        if (!"audio/raw".equals(mx0Var.f92610m)) {
            return ((this.f97453a0 || !a(mx0Var, this.f97475v)) && this.f97452a.a(mx0Var) == null) ? 0 : 2;
        }
        if (ib3.e(mx0Var.B)) {
            int i10 = mx0Var.B;
            return (i10 == 2 || (this.f97456c && i10 == 4)) ? 2 : 1;
        }
        ih1.d("DefaultAudioSink", "Invalid PCM encoding: " + mx0Var.B);
        return 0;
    }

    public final long a(boolean z10) {
        long j10;
        long jA;
        if (!f() || this.H) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f97462i.a(z10), (d() * 1000000) / ((long) this.f97473t.f94350e));
        while (!this.f97463j.isEmpty() && jMin >= ((ub0) this.f97463j.getFirst()).f95591d) {
            this.f97477x = (ub0) this.f97463j.remove();
        }
        ub0 ub0Var = this.f97477x;
        long j11 = jMin - ub0Var.f95591d;
        if (ub0Var.f95588a.equals(ee2.f89220e)) {
            j10 = this.f97477x.f95590c + j11;
        } else if (this.f97463j.isEmpty()) {
            d23 d23Var = this.f97454b.f94758c;
            if (d23Var.f88718o >= 1024) {
                long j12 = d23Var.f88717n;
                c23 c23Var = d23Var.f88713j;
                c23Var.getClass();
                long j13 = j12 - ((long) ((c23Var.f88294k * c23Var.f88285b) * 2));
                int i10 = d23Var.f88711h.f97641a;
                int i11 = d23Var.f88710g.f97641a;
                jA = i10 == i11 ? ib3.a(j11, j13, d23Var.f88718o) : ib3.a(j11, j13 * ((long) i10), d23Var.f88718o * ((long) i11));
            } else {
                jA = (long) (((double) d23Var.f88706c) * j11);
            }
            j10 = jA + this.f97477x.f95590c;
        } else {
            ub0 ub0Var2 = (ub0) this.f97463j.getFirst();
            long jRound = ub0Var2.f95591d - jMin;
            float f10 = this.f97477x.f95588a.f89221b;
            int i12 = ib3.f90737a;
            if (f10 != 1.0f) {
                jRound = Math.round(jRound * ((double) f10));
            }
            j10 = ub0Var2.f95590c - jRound;
        }
        return ((this.f97454b.f94757b.f95434t * 1000000) / ((long) this.f97473t.f94350e)) + j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r14) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r12, long r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a(java.nio.ByteBuffer, long):void");
    }

    public final void a(ee2 ee2Var) {
        if (f()) {
            try {
                this.f97474u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(ee2Var.f89221b).setPitch(ee2Var.f89222c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                ih1.d("DefaultAudioSink", ih1.a("Failed to set playback params", e10));
            }
            ee2Var = new ee2(this.f97474u.getPlaybackParams().getSpeed(), this.f97474u.getPlaybackParams().getPitch());
            ol olVar = this.f97462i;
            olVar.f93260j = ee2Var.f89221b;
            ml mlVar = olVar.f93256f;
            if (mlVar != null) {
                mlVar.a();
            }
        }
        this.f97478y = ee2Var;
    }

    public final void a(ek1 ek1Var) {
        this.f97471r = ek1Var;
    }

    public final void a(mx0 mx0Var, int[] iArr) throws el {
        int iIntValue;
        bl[] blVarArr;
        int i10;
        int iB;
        int i11;
        int iB2;
        bl[] blVarArr2;
        int i12;
        int i13;
        int iMax;
        int i14;
        int i15;
        int[] iArr2;
        int i16 = -1;
        if (!"audio/raw".equals(mx0Var.f92610m)) {
            bl[] blVarArr3 = new bl[0];
            int i17 = mx0Var.A;
            if (a(mx0Var, this.f97475v)) {
                String str = mx0Var.f92610m;
                str.getClass();
                blVarArr = blVarArr3;
                i10 = 1;
                iB = ht1.b(str, mx0Var.f92607j);
                iIntValue = ib3.a(mx0Var.f92623z);
            } else {
                Pair pairA = this.f97452a.a(mx0Var);
                if (pairA == null) {
                    throw new el("Unable to configure passthrough for: " + mx0Var, mx0Var);
                }
                int iIntValue2 = ((Integer) pairA.first).intValue();
                iIntValue = ((Integer) pairA.second).intValue();
                blVarArr = blVarArr3;
                i10 = 2;
                iB = iIntValue2;
            }
            i11 = i17;
            iB2 = -1;
        } else {
            if (!ib3.e(mx0Var.B)) {
                throw new IllegalArgumentException();
            }
            int iB3 = ib3.b(mx0Var.B, mx0Var.f92623z);
            int i18 = mx0Var.B;
            bl[] blVarArr4 = (this.f97456c && (i18 == 536870912 || i18 == 805306368 || i18 == 4)) ? this.f97460g : this.f97459f;
            y83 y83Var = this.f97458e;
            int i19 = mx0Var.C;
            int i20 = mx0Var.D;
            y83Var.f97028i = i19;
            y83Var.f97029j = i20;
            if (ib3.f90737a < 21 && mx0Var.f92623z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i21 = 0; i21 < 6; i21++) {
                    iArr2[i21] = i21;
                }
            } else {
                iArr2 = iArr;
            }
            this.f97457d.f94923i = iArr2;
            zk zkVar = new zk(mx0Var.A, mx0Var.f92623z, mx0Var.B);
            for (bl blVar : blVarArr4) {
                try {
                    zk zkVarA = blVar.a(zkVar);
                    if (blVar.isActive()) {
                        zkVar = zkVarA;
                    }
                } catch (al e10) {
                    throw new el(e10, mx0Var);
                }
            }
            int i22 = zkVar.f97643c;
            i11 = zkVar.f97641a;
            int iA = ib3.a(zkVar.f97642b);
            iB2 = ib3.b(i22, zkVar.f97642b);
            blVarArr = blVarArr4;
            i16 = iB3;
            i10 = 0;
            iB = i22;
            iIntValue = iA;
        }
        bc0 bc0Var = this.f97469p;
        int minBufferSize = AudioTrack.getMinBufferSize(i11, iIntValue, iB);
        if (minBufferSize == -2) {
            throw new IllegalStateException();
        }
        double d10 = this.f97464k ? 8.0d : 1.0d;
        bc0Var.getClass();
        if (i10 != 0) {
            if (i10 == 1) {
                switch (iB) {
                    case 5:
                        i14 = 80000;
                        break;
                    case 6:
                    case 18:
                        i14 = 768000;
                        break;
                    case 7:
                        i14 = 192000;
                        break;
                    case 8:
                        i14 = 2250000;
                        break;
                    case 9:
                        i14 = 40000;
                        break;
                    case 10:
                        i14 = 100000;
                        break;
                    case 11:
                        i14 = 16000;
                        break;
                    case 12:
                        i14 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i14 = 3062500;
                        break;
                    case 15:
                        i14 = 8000;
                        break;
                    case 16:
                        i14 = 256000;
                        break;
                    case 17:
                        i14 = 336000;
                        break;
                }
                iMax = td1.a((((long) 50000000) * ((long) i14)) / 1000000);
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                int i23 = iB == 5 ? 500000 : 250000;
                switch (iB) {
                    case 5:
                        i15 = 80000;
                        break;
                    case 6:
                    case 18:
                        i15 = 768000;
                        break;
                    case 7:
                        i15 = 192000;
                        break;
                    case 8:
                        i15 = 2250000;
                        break;
                    case 9:
                        i15 = 40000;
                        break;
                    case 10:
                        i15 = 100000;
                        break;
                    case 11:
                        i15 = 16000;
                        break;
                    case 12:
                        i15 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i15 = 3062500;
                        break;
                    case 15:
                        i15 = 8000;
                        break;
                    case 16:
                        i15 = 256000;
                        break;
                    case 17:
                        i15 = 336000;
                        break;
                }
                iMax = td1.a((((long) i23) * ((long) i15)) / 1000000);
            }
            i13 = i10;
            i12 = i16;
            blVarArr2 = blVarArr;
        } else {
            blVarArr2 = blVarArr;
            long j10 = i11;
            i12 = i16;
            long j11 = iB2;
            int iA2 = td1.a(((((long) 250000) * j10) * j11) / 1000000);
            i13 = i10;
            int iA3 = td1.a(((((long) 750000) * j10) * j11) / 1000000);
            int i24 = ib3.f90737a;
            iMax = Math.max(iA2, Math.min(minBufferSize * 4, iA3));
        }
        int iMax2 = (((Math.max(minBufferSize, (int) (((double) iMax) * d10)) + iB2) - 1) / iB2) * iB2;
        if (iB == 0) {
            throw new el("Invalid output encoding (mode=" + i13 + ") for: " + mx0Var, mx0Var);
        }
        if (iIntValue == 0) {
            throw new el("Invalid output channel config (mode=" + i13 + ") for: " + mx0Var, mx0Var);
        }
        this.f97453a0 = false;
        rb0 rb0Var = new rb0(mx0Var, i12, i13, iB2, i11, iIntValue, iB, iMax2, blVarArr2);
        if (f()) {
            this.f97472s = rb0Var;
        } else {
            this.f97473t = rb0Var;
        }
    }

    public final void a(ql qlVar) {
        if (this.X.equals(qlVar)) {
            return;
        }
        qlVar.getClass();
        if (this.f97474u != null) {
            this.X.getClass();
        }
        this.X = qlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.R = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.R
            yads.bl[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.b()
        L1f:
            r9.b(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.R
            int r0 = r0 + r2
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x011d, code lost:
    
        if (r5.a() == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.nio.ByteBuffer r23, long r24, int r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean a(mx0 mx0Var, pk pkVar) {
        int iA;
        int i10 = ib3.f90737a;
        if (i10 < 29 || this.f97465l == 0) {
            return false;
        }
        String str = mx0Var.f92610m;
        str.getClass();
        int iB = ht1.b(str, mx0Var.f92607j);
        if (iB == 0 || (iA = ib3.a(mx0Var.f92623z)) == 0) {
            return false;
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(mx0Var.A).setChannelMask(iA).setEncoding(iB).build();
        if (pkVar.f93618g == null) {
            pkVar.f93618g = new ok(pkVar);
        }
        AudioAttributes audioAttributes = pkVar.f93618g.f93242a;
        int playbackOffloadSupport = i10 >= 31 ? AudioManager.getPlaybackOffloadSupport(audioFormatBuild, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, audioAttributes) ? 0 : (i10 == 30 && ib3.f90740d.startsWith("Pixel")) ? 2 : 1;
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((mx0Var.C != 0 || mx0Var.D != 0) && (this.f97465l == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        if (f()) {
            j();
            AudioTrack audioTrack = this.f97462i.f93253c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f97474u.pause();
            }
            if (a(this.f97474u)) {
                yb0 yb0Var = this.f97466m;
                yb0Var.getClass();
                yb0Var.b(this.f97474u);
            }
            AudioTrack audioTrack2 = this.f97474u;
            this.f97474u = null;
            if (ib3.f90737a < 21 && !this.V) {
                this.W = 0;
            }
            rb0 rb0Var = this.f97472s;
            if (rb0Var != null) {
                this.f97473t = rb0Var;
                this.f97472s = null;
            }
            ol olVar = this.f97462i;
            olVar.f93262l = 0L;
            olVar.f93273w = 0;
            olVar.f93272v = 0;
            olVar.f93263m = 0L;
            olVar.C = 0L;
            olVar.F = 0L;
            olVar.f93261k = false;
            olVar.f93253c = null;
            olVar.f93256f = null;
            vy vyVar = this.f97461h;
            synchronized (vyVar) {
                vyVar.f96222a = false;
            }
            new nb0(this, audioTrack2).start();
        }
        this.f97468o.f96053a = null;
        this.f97467n.f96053a = null;
    }

    public final void b(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = bl.f88040a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j10);
            } else {
                bl blVar = this.K[i10];
                if (i10 > this.R) {
                    blVar.a(byteBuffer);
                }
                ByteBuffer byteBufferA = blVar.a();
                this.L[i10] = byteBufferA;
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

    public final ub0 c() {
        ub0 ub0Var = this.f97476w;
        return ub0Var != null ? ub0Var : !this.f97463j.isEmpty() ? (ub0) this.f97463j.getLast() : this.f97477x;
    }

    public final long d() {
        rb0 rb0Var = this.f97473t;
        return rb0Var.f94348c == 0 ? this.D / ((long) rb0Var.f94349d) : this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws yads.fl {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.e():boolean");
    }

    public final boolean f() {
        return this.f97474u != null;
    }

    public final void g() {
        this.U = false;
        if (f()) {
            ol olVar = this.f97462i;
            olVar.f93262l = 0L;
            olVar.f93273w = 0;
            olVar.f93272v = 0;
            olVar.f93263m = 0L;
            olVar.C = 0L;
            olVar.F = 0L;
            olVar.f93261k = false;
            if (olVar.f93274x == -9223372036854775807L) {
                ml mlVar = olVar.f93256f;
                mlVar.getClass();
                mlVar.a();
                this.f97474u.pause();
            }
        }
    }

    public final void h() {
        this.U = true;
        if (f()) {
            ml mlVar = this.f97462i.f93256f;
            mlVar.getClass();
            mlVar.a();
            this.f97474u.play();
        }
    }

    public final void i() {
        if (this.T) {
            return;
        }
        this.T = true;
        ol olVar = this.f97462i;
        long jD = d();
        olVar.f93276z = olVar.a();
        olVar.f93274x = SystemClock.elapsedRealtime() * 1000;
        olVar.A = jD;
        this.f97474u.stop();
        this.A = 0;
    }

    public final void j() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.f97455b0 = false;
        this.F = 0;
        this.f97477x = new ub0(c().f95588a, c().f95589b, 0L, 0L);
        this.I = 0L;
        this.f97476w = null;
        this.f97463j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f97479z = null;
        this.A = 0;
        this.f97458e.f97034o = 0L;
        while (true) {
            bl[] blVarArr = this.K;
            if (i10 >= blVarArr.length) {
                return;
            }
            bl blVar = blVarArr[i10];
            blVar.flush();
            this.L[i10] = blVar.a();
            i10++;
        }
    }

    public final void k() {
        if (f()) {
            if (ib3.f90737a >= 21) {
                this.f97474u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.f97474u;
            float f10 = this.J;
            audioTrack.setStereoVolume(f10, f10);
        }
    }
}
