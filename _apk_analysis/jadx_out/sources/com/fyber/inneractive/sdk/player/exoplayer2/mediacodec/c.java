package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends com.fyber.inneractive.sdk.player.exoplayer2.a {
    public static final byte[] O;
    public ByteBuffer[] A;
    public long B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public DecoderCounters N;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f18382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f18383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f18384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f18385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f18386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaCodec.BufferInfo f18387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f18388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MediaCodec f18389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f18394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18395u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer[] f18400z;

    static {
        int i10 = z.f18822a;
        byte[] bArr = new byte[38];
        for (int i11 = 0; i11 < 38; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12), 16) << 4));
        }
        O = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, boolean z10) {
        super(i10);
        d dVar = d.f18401a;
        if (z.f18822a < 16) {
            throw new IllegalStateException();
        }
        this.f18382h = dVar;
        this.f18383i = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f18384j = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f18385k = new p();
        this.f18386l = new ArrayList();
        this.f18387m = new MediaCodec.BufferInfo();
        this.G = 0;
        this.H = 0;
    }

    public a a(d dVar, o oVar) {
        String str = oVar.f18453f;
        dVar.getClass();
        return j.a(false, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r17, long r19) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.a(long, long):void");
    }

    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void a(a aVar, MediaCodec mediaCodec, o oVar);

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.o r5) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.o r0 = r4.f18388n
            r4.f18388n = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r5 = r5.f18456i
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r1 = r0.f18456i
        Lc:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(r5, r1)
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == 0) goto L28
            com.fyber.inneractive.sdk.player.exoplayer2.o r5 = r4.f18388n
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r5 = r5.f18456i
            if (r5 != 0) goto L1b
            goto L28
        L1b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = new com.fyber.inneractive.sdk.player.exoplayer2.d
            r0.<init>(r5)
            throw r0
        L28:
            android.media.MediaCodec r5 = r4.f18389o
            if (r5 == 0) goto L51
            boolean r5 = r4.f18390p
            com.fyber.inneractive.sdk.player.exoplayer2.o r2 = r4.f18388n
            boolean r5 = r4.a(r5, r0, r2)
            if (r5 == 0) goto L51
            r4.F = r1
            r4.G = r1
            boolean r5 = r4.f18393s
            if (r5 == 0) goto L4d
            com.fyber.inneractive.sdk.player.exoplayer2.o r5 = r4.f18388n
            int r2 = r5.f18457j
            int r3 = r0.f18457j
            if (r2 != r3) goto L4d
            int r5 = r5.f18458k
            int r0 = r0.f18458k
            if (r5 != r0) goto L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            r4.f18398x = r1
            goto L5e
        L51:
            boolean r5 = r4.I
            if (r5 == 0) goto L58
            r4.H = r1
            goto L5e
        L58:
            r4.o()
            r4.l()
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.a(com.fyber.inneractive.sdk.player.exoplayer2.o):void");
    }

    public abstract void a(String str, long j10, long j11);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.K = false;
        this.L = false;
        if (this.f18389o != null) {
            this.B = -9223372036854775807L;
            this.C = -1;
            this.D = -1;
            this.M = true;
            this.E = false;
            this.f18386l.clear();
            this.f18398x = false;
            this.f18399y = false;
            if (this.f18392r || ((this.f18395u && this.J) || this.H != 0)) {
                o();
                l();
            } else {
                this.f18389o.flush();
                this.I = false;
            }
            if (!this.F || this.f18388n == null) {
                return;
            }
            this.G = 1;
        }
    }

    public abstract boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10);

    public boolean a(boolean z10, o oVar, o oVar2) {
        return false;
    }

    public abstract int b(d dVar, o oVar);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean e() {
        return this.L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean f() {
        if (this.f18388n != null) {
            if ((this.f17238f ? this.f17239g : this.f17236d.isReady()) || this.D >= 0 || (this.B != -9223372036854775807L && SystemClock.elapsedRealtime() < this.B)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        MediaCodec mediaCodec = this.f18389o;
        if (mediaCodec == null || this.H == 2 || this.K) {
            return false;
        }
        if (this.C < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.C = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar = this.f18383i;
            cVar.f17381c = this.f18400z[iDequeueInputBuffer];
            cVar.a();
        }
        if (this.H == 1) {
            if (!this.f18394t) {
                this.J = true;
                this.f18389o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                this.C = -1;
            }
            this.H = 2;
            return false;
        }
        if (this.f18398x) {
            this.f18398x = false;
            ByteBuffer byteBuffer = this.f18383i.f17381c;
            byte[] bArr = O;
            byteBuffer.put(bArr);
            this.f18389o.queueInputBuffer(this.C, 0, bArr.length, 0L, 0);
            this.C = -1;
            this.I = true;
            return true;
        }
        if (this.G == 1) {
            for (int i10 = 0; i10 < this.f18388n.f18455h.size(); i10++) {
                this.f18383i.f17381c.put((byte[]) this.f18388n.f18455h.get(i10));
            }
            this.G = 2;
        }
        int iPosition = this.f18383i.f17381c.position();
        int iA = a(this.f18385k, this.f18383i, false);
        if (iA == -3) {
            return false;
        }
        if (iA == -5) {
            if (this.G == 2) {
                this.f18383i.a();
                this.G = 1;
            }
            a(this.f18385k.f18474a);
            return true;
        }
        if (this.f18383i.b(4)) {
            if (this.G == 2) {
                this.f18383i.a();
                this.G = 1;
            }
            this.K = true;
            if (!this.I) {
                n();
                return false;
            }
            try {
                if (!this.f18394t) {
                    this.J = true;
                    this.f18389o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                    this.C = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
            }
        }
        if (this.M && !this.f18383i.b(1)) {
            this.f18383i.a();
            if (this.G == 2) {
                this.G = 1;
            }
            return true;
        }
        this.M = false;
        boolean zB = this.f18383i.b(1073741824);
        if (this.f18391q && !zB) {
            ByteBuffer byteBuffer2 = this.f18383i.f17381c;
            int iPosition2 = byteBuffer2.position();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                if (i13 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i14 = byteBuffer2.get(i11) & 255;
                if (i12 == 3) {
                    if (i14 == 1 && (byteBuffer2.get(i13) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                        byteBufferDuplicate.position(i11 - 3);
                        byteBufferDuplicate.limit(iPosition2);
                        byteBuffer2.position(0);
                        byteBuffer2.put(byteBufferDuplicate);
                        break;
                    }
                } else if (i14 == 0) {
                    i12++;
                }
                if (i14 != 0) {
                    i12 = 0;
                }
                i11 = i13;
            }
            if (this.f18383i.f17381c.position() == 0) {
                return true;
            }
            this.f18391q = false;
        }
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar2 = this.f18383i;
            long j10 = cVar2.f17382d;
            if (cVar2.b(Integer.MIN_VALUE)) {
                this.f18386l.add(Long.valueOf(j10));
            }
            this.f18383i.f17381c.flip();
            m();
            if (zB) {
                MediaCodec.CryptoInfo cryptoInfo = this.f18383i.f17380b.f17377d;
                if (iPosition != 0) {
                    if (cryptoInfo.numBytesOfClearData == null) {
                        cryptoInfo.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = cryptoInfo.numBytesOfClearData;
                    iArr[0] = iArr[0] + iPosition;
                }
                this.f18389o.queueSecureInputBuffer(this.C, 0, cryptoInfo, j10, 0);
            } else {
                this.f18389o.queueInputBuffer(this.C, 0, this.f18383i.f17381c.limit(), j10, 0);
            }
            this.C = -1;
            this.I = true;
            this.G = 0;
            this.N.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e11) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.l():void");
    }

    public void m() {
    }

    public final void n() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.H == 2) {
            o();
            l();
        } else {
            this.L = true;
            p();
        }
    }

    public final void o() {
        if (this.f18389o != null) {
            this.B = -9223372036854775807L;
            this.C = -1;
            this.D = -1;
            this.E = false;
            this.f18386l.clear();
            this.f18400z = null;
            this.A = null;
            this.F = false;
            this.I = false;
            this.f18390p = false;
            this.f18391q = false;
            this.f18392r = false;
            this.f18393s = false;
            this.f18394t = false;
            this.f18395u = false;
            this.f18397w = false;
            this.f18398x = false;
            this.f18399y = false;
            this.J = false;
            this.G = 0;
            this.H = 0;
            this.N.decoderReleaseCount++;
            this.f18383i.f17381c = null;
            try {
                this.f18389o.stop();
                try {
                    this.f18389o.release();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    this.f18389o.release();
                    throw th2;
                } finally {
                }
            }
        }
    }

    public void p() {
    }

    public boolean q() {
        return this.f18389o == null && this.f18388n != null;
    }
}
