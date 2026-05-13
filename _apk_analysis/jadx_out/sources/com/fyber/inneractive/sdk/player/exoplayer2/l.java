package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Handler.Callback, com.fyber.inneractive.sdk.player.exoplayer2.source.r, com.fyber.inneractive.sdk.player.exoplayer2.source.t {
    public h A;
    public h B;
    public x C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f18351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f18352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f18353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f18354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.u f18355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f18356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HandlerThread f18357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f18358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f18359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f18360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f18361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f18362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f18363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.h f18364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u f18365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a[] f18366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f18370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18371u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f18372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f18374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f18375y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f18376z;

    public l(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar, boolean z10, f fVar, i iVar, g gVar) {
        this.f18351a = aVarArr;
        this.f18353c = dVar;
        this.f18354d = cVar;
        this.f18368r = z10;
        this.f18358h = fVar;
        this.f18361k = iVar;
        this.f18352b = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            aVar.getClass();
            this.f18352b[i10] = aVar;
        }
        this.f18355e = new com.fyber.inneractive.sdk.player.exoplayer2.util.u();
        this.f18366p = new a[0];
        this.f18359i = new w();
        this.f18360j = new v();
        this.f18362l = s.f18475d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f18357g = handlerThread;
        handlerThread.start();
        this.f18356f = new Handler(handlerThread.getLooper(), this);
    }

    public static void a(a aVar) {
        int i10 = aVar.f17235c;
        if (i10 == 2) {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            aVar.f17235c = 1;
            aVar.j();
        }
    }

    public final long a(int i10, long j10) throws d {
        h hVar;
        g();
        this.f18369s = false;
        a(2);
        h hVar2 = this.B;
        if (hVar2 == null) {
            h hVar3 = this.f18376z;
            if (hVar3 != null) {
                hVar3.a();
            }
            hVar = null;
        } else {
            hVar = null;
            while (hVar2 != null) {
                if (hVar2.f18327f == i10 && hVar2.f18330i) {
                    hVar = hVar2;
                } else {
                    hVar2.a();
                }
                hVar2 = hVar2.f18332k;
            }
        }
        h hVar4 = this.B;
        if (hVar4 != hVar || hVar4 != this.A) {
            for (a aVar : this.f18366p) {
                aVar.c();
            }
            this.f18366p = new a[0];
            this.f18364n = null;
            this.f18363m = null;
            this.B = null;
        }
        if (hVar != null) {
            hVar.f18332k = null;
            this.f18376z = hVar;
            this.A = hVar;
            a(hVar);
            h hVar5 = this.B;
            if (hVar5.f18331j) {
                j10 = hVar5.f18322a.a(j10);
            }
            a(j10);
            b();
        } else {
            this.f18376z = null;
            this.A = null;
            this.B = null;
            a(j10);
        }
        this.f18356f.sendEmptyMessage(2);
        return j10;
    }

    public final Pair a(j jVar) {
        x xVar = jVar.f18344a;
        if (xVar.c()) {
            xVar = this.C;
        }
        try {
            Pair pairA = a(xVar, jVar.f18345b, jVar.f18346c, 0L);
            x xVar2 = this.C;
            if (xVar2 == xVar) {
                return pairA;
            }
            int iA = xVar2.a(xVar.a(((Integer) pairA.first).intValue(), this.f18360j, true).f18831b);
            if (iA != -1) {
                return Pair.create(Integer.valueOf(iA), (Long) pairA.second);
            }
            int iIntValue = ((Integer) pairA.first).intValue();
            x xVar3 = this.C;
            int iA2 = -1;
            while (iA2 == -1 && iIntValue < xVar.a() - 1) {
                iIntValue++;
                iA2 = xVar3.a(xVar.a(iIntValue, this.f18360j, true).f18831b);
            }
            if (iA2 == -1) {
                return null;
            }
            int i10 = this.C.a(iA2, this.f18360j, false).f18832c;
            return a(this.C, 0, -9223372036854775807L, 0L);
        } catch (IndexOutOfBoundsException unused) {
            throw new q();
        }
    }

    public final Pair a(x xVar, int i10, long j10, long j11) {
        int iB = xVar.b();
        if (i10 < 0 || i10 >= iB) {
            throw new IndexOutOfBoundsException();
        }
        xVar.a(i10, this.f18359i, j11);
        if (j10 == -9223372036854775807L) {
            j10 = this.f18359i.f18908e;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        w wVar = this.f18359i;
        int i11 = wVar.f18906c;
        long j12 = wVar.f18910g + j10;
        long j13 = xVar.a(i11, this.f18360j, false).f18833d;
        while (j13 != -9223372036854775807L && j12 >= j13 && i11 < this.f18359i.f18907d) {
            j12 -= j13;
            i11++;
            j13 = xVar.a(i11, this.f18360j, false).f18833d;
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(j12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181 A[LOOP:3: B:71:0x0181->B:75:0x0191, LOOP_START] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instruction units count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.l.a():void");
    }

    public final void a(int i10) {
        if (this.f18371u != i10) {
            this.f18371u = i10;
            this.f18358h.obtainMessage(1, i10, 0).sendToTarget();
        }
    }

    public final void a(long j10) {
        h hVar = this.B;
        long j11 = hVar == null ? j10 + 60000000 : j10 + (hVar.f18326e - hVar.f18328g);
        this.f18375y = j11;
        this.f18355e.a(j11);
        for (a aVar : this.f18366p) {
            long j12 = this.f18375y;
            aVar.f17239g = false;
            aVar.f17238f = false;
            aVar.a(false, j12);
        }
    }

    public final void a(long j10, long j11) {
        this.f18356f.removeMessages(2);
        long jElapsedRealtime = (j10 + j11) - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            this.f18356f.sendEmptyMessage(2);
        } else {
            this.f18356f.sendEmptyMessageDelayed(2, jElapsedRealtime);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.util.Pair r17) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.l.a(android.util.Pair):void");
    }

    public final void a(h hVar) throws d {
        if (this.B == hVar) {
            return;
        }
        boolean[] zArr = new boolean[this.f18351a.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f18351a;
            if (i10 >= aVarArr.length) {
                this.B = hVar;
                this.f18358h.obtainMessage(3, hVar.f18334m).sendToTarget();
                a(zArr, i11);
                return;
            }
            a aVar = aVarArr[i10];
            boolean z10 = aVar.f17235c != 0;
            zArr[i10] = z10;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f18334m.f18598b.f18595b[i10];
            if (bVar != null) {
                i11++;
            }
            if (z10 && (bVar == null || (aVar.f17239g && aVar.f17236d == this.B.f18324c[i10]))) {
                if (aVar == this.f18363m) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f18355e;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar2 = this.f18364n;
                    uVar.getClass();
                    uVar.a(hVar2.b());
                    uVar.f18817d = hVar2.a();
                    this.f18364n = null;
                    this.f18363m = null;
                }
                a(aVar);
                aVar.c();
            }
            i10++;
        }
    }

    public final void a(s sVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar = this.f18364n;
        s sVarA = hVar != null ? hVar.a(sVar) : this.f18355e.a(sVar);
        this.f18362l = sVarA;
        this.f18358h.obtainMessage(7, sVarA).sendToTarget();
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar2;
        h hVar = this.f18376z;
        if (hVar == null || (sVar2 = hVar.f18322a) != sVar) {
            return;
        }
        hVar.f18330i = true;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f18337p.a(hVar.f18336o, sVar2.a());
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f18340s;
        if (jVar == null) {
            hVar.f18334m = jVarA;
            break;
        }
        for (int i10 = 0; i10 < jVarA.f18598b.f18594a; i10++) {
            if (!jVarA.a(jVar, i10)) {
                hVar.f18334m = jVarA;
                break;
            }
        }
        hVar.f18328g = hVar.a(hVar.f18328g, false, new boolean[hVar.f18335n.length]);
        if (this.B == null) {
            h hVar2 = this.f18376z;
            this.A = hVar2;
            a(hVar2.f18328g);
            a(this.A);
        }
        b();
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, boolean z10) {
        this.f18358h.sendEmptyMessage(0);
        a(true);
        this.f18354d.a(false);
        if (z10) {
            this.f18361k = new i(0, -9223372036854775807L);
        }
        this.f18365o = uVar;
        uVar.a(this);
        a(2);
        this.f18356f.sendEmptyMessage(2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        this.f18356f.obtainMessage(7, Pair.create(xVar, gVar)).sendToTarget();
    }

    public final void a(boolean z10) {
        this.f18356f.removeMessages(2);
        this.f18369s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f18355e;
        if (uVar.f18814a) {
            uVar.a(uVar.b());
            uVar.f18814a = false;
        }
        this.f18364n = null;
        this.f18363m = null;
        this.f18375y = 60000000L;
        for (a aVar : this.f18366p) {
            try {
                a(aVar);
                aVar.c();
            } catch (d | RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e10);
            }
        }
        this.f18366p = new a[0];
        h hVar = this.B;
        if (hVar == null) {
            hVar = this.f18376z;
        }
        while (hVar != null) {
            hVar.a();
            hVar = hVar.f18332k;
        }
        this.f18376z = null;
        this.A = null;
        this.B = null;
        b(false);
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar2 = this.f18365o;
            if (uVar2 != null) {
                uVar2.b();
                this.f18365o = null;
            }
            this.C = null;
        }
    }

    public final void a(e[] eVarArr) {
        try {
            for (e eVar : eVarArr) {
                eVar.f17392a.a(eVar.f17393b, eVar.f17394c);
            }
            if (this.f18365o != null) {
                this.f18356f.sendEmptyMessage(2);
            }
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th2) {
            synchronized (this) {
                notifyAll();
                throw th2;
            }
        }
    }

    public final void a(boolean[] zArr, int i10) throws d {
        int i11;
        this.f18366p = new a[i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            a[] aVarArr = this.f18351a;
            if (i12 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i12];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = this.B.f18334m;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar.f18598b.f18595b[i12];
            if (bVar != null) {
                int i14 = i13 + 1;
                this.f18366p[i13] = aVar;
                if (aVar.f17235c == 0) {
                    t tVar = jVar.f18600d[i12];
                    boolean z10 = this.f18368r && this.f18371u == 3;
                    boolean z11 = !zArr[i12] && z10;
                    int length = bVar.f18587c.length;
                    o[] oVarArr = new o[length];
                    for (int i15 = 0; i15 < length; i15++) {
                        oVarArr[i15] = bVar.f18588d[i15];
                    }
                    h hVar = this.B;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = hVar.f18324c[i12];
                    long j10 = this.f18375y;
                    i11 = i12;
                    long j11 = hVar.f18326e - hVar.f18328g;
                    if (aVar.f17235c != 0) {
                        throw new IllegalStateException();
                    }
                    aVar.f17234b = tVar;
                    aVar.f17235c = 1;
                    aVar.h();
                    if (!(!aVar.f17239g)) {
                        throw new IllegalStateException();
                    }
                    aVar.f17236d = vVar;
                    aVar.f17238f = false;
                    aVar.f17237e = j11;
                    aVar.a(oVarArr);
                    aVar.a(z11, j10);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVarD = aVar.d();
                    if (hVarD != null) {
                        if (this.f18364n != null) {
                            throw new d(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.f18364n = hVarD;
                        this.f18363m = aVar;
                        ((MediaCodecAudioRenderer) hVarD).Q.a(this.f18362l);
                    }
                    if (z10) {
                        if (aVar.f17235c != 1) {
                            throw new IllegalStateException();
                        }
                        aVar.f17235c = 2;
                        aVar.i();
                    }
                } else {
                    i11 = i12;
                }
                i13 = i14;
            } else {
                i11 = i12;
            }
            i12 = i11 + 1;
        }
    }

    public final void b() {
        int i10;
        h hVar = this.f18376z;
        long jF = !hVar.f18330i ? 0L : hVar.f18322a.f();
        if (jF == Long.MIN_VALUE) {
            b(false);
            return;
        }
        h hVar2 = this.f18376z;
        long jAbs = Math.abs(this.f18375y - (hVar2.f18326e - hVar2.f18328g));
        long j10 = jF - jAbs;
        c cVar = this.f18354d;
        char c10 = j10 > cVar.f17367c ? (char) 0 : j10 < cVar.f17366b ? (char) 2 : (char) 1;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = cVar.f17365a;
        synchronized (lVar) {
            i10 = lVar.f18704c * 65536;
        }
        boolean z10 = c10 == 2 || (c10 == 1 && cVar.f17371g && !(i10 >= cVar.f17370f));
        cVar.f17371g = z10;
        b(z10);
        if (!z10) {
            this.f18376z.f18333l = true;
            return;
        }
        h hVar3 = this.f18376z;
        hVar3.f18333l = false;
        hVar3.f18322a.b(jAbs);
    }

    public final void b(j jVar) {
        if (this.C == null) {
            this.f18373w++;
            this.f18374x = jVar;
            return;
        }
        Pair pairA = a(jVar);
        if (pairA == null) {
            i iVar = new i(0, 0L);
            this.f18361k = iVar;
            this.f18358h.obtainMessage(4, 1, 0, iVar).sendToTarget();
            this.f18361k = new i(0, -9223372036854775807L);
            a(4);
            a(false);
            return;
        }
        int i10 = jVar.f18346c == -9223372036854775807L ? 1 : 0;
        int iIntValue = ((Integer) pairA.first).intValue();
        long jLongValue = ((Long) pairA.second).longValue();
        try {
            i iVar2 = this.f18361k;
            if (iIntValue == iVar2.f18341a && jLongValue / 1000 == iVar2.f18343c / 1000) {
                return;
            }
            long jA = a(iIntValue, jLongValue);
            int i11 = i10 | (jLongValue == jA ? 0 : 1);
            i iVar3 = new i(iIntValue, jA);
            this.f18361k = iVar3;
            this.f18358h.obtainMessage(4, i11, 0, iVar3).sendToTarget();
        } finally {
            i iVar4 = new i(iIntValue, jLongValue);
            this.f18361k = iVar4;
            this.f18358h.obtainMessage(4, i10, 0, iVar4).sendToTarget();
        }
    }

    public final void b(boolean z10) {
        if (this.f18370t != z10) {
            this.f18370t = z10;
            this.f18358h.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void c() {
        h hVar = this.f18376z;
        if (hVar == null || hVar.f18330i) {
            return;
        }
        h hVar2 = this.A;
        if (hVar2 == null || hVar2.f18332k == hVar) {
            for (a aVar : this.f18366p) {
                if (!aVar.f17238f) {
                    return;
                }
            }
            this.f18376z.f18322a.d();
        }
    }

    public final void c(boolean z10) {
        this.f18369s = false;
        this.f18368r = z10;
        if (!z10) {
            g();
            h();
            a(false);
            return;
        }
        int i10 = this.f18371u;
        if (i10 != 3) {
            if (i10 == 2) {
                this.f18356f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f18369s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f18355e;
        if (!uVar.f18814a) {
            uVar.f18816c = SystemClock.elapsedRealtime();
            uVar.f18814a = true;
        }
        for (a aVar : this.f18366p) {
            if (aVar.f17235c != 1) {
                throw new IllegalStateException();
            }
            aVar.f17235c = 2;
            aVar.i();
        }
        this.f18356f.sendEmptyMessage(2);
    }

    public final synchronized void d() {
        if (this.f18367q) {
            return;
        }
        this.f18356f.sendEmptyMessage(6);
        while (!this.f18367q) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f18357g.quit();
    }

    public final void e() {
        a(true);
        this.f18354d.a(true);
        a(1);
        synchronized (this) {
            this.f18367q = true;
            notifyAll();
        }
    }

    public final void f() throws d {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        boolean z10 = true;
        while (hVar != null && hVar.f18330i) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f18337p.a(hVar.f18336o, hVar.f18322a.a());
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f18340s;
            if (jVar != null) {
                for (int i10 = 0; i10 < jVarA.f18598b.f18594a; i10++) {
                    if (jVarA.a(jVar, i10)) {
                    }
                }
                if (hVar == this.A) {
                    z10 = false;
                }
                hVar = hVar.f18332k;
            }
            hVar.f18334m = jVarA;
            if (z10) {
                h hVar2 = this.A;
                h hVar3 = this.B;
                boolean z11 = hVar2 != hVar3;
                for (h hVar4 = hVar3.f18332k; hVar4 != null; hVar4 = hVar4.f18332k) {
                    hVar4.a();
                }
                h hVar5 = this.B;
                hVar5.f18332k = null;
                this.f18376z = hVar5;
                this.A = hVar5;
                boolean[] zArr = new boolean[this.f18351a.length];
                long jA = hVar5.a(this.f18361k.f18343c, z11, zArr);
                if (jA != this.f18361k.f18343c) {
                    this.f18361k.f18343c = jA;
                    a(jA);
                }
                boolean[] zArr2 = new boolean[this.f18351a.length];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    a[] aVarArr = this.f18351a;
                    if (i11 >= aVarArr.length) {
                        break;
                    }
                    a aVar = aVarArr[i11];
                    boolean z12 = aVar.f17235c != 0;
                    zArr2[i11] = z12;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.B.f18324c[i11];
                    if (vVar != null) {
                        i12++;
                    }
                    if (z12) {
                        if (vVar != aVar.f17236d) {
                            if (aVar == this.f18363m) {
                                if (vVar == null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f18355e;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar6 = this.f18364n;
                                    uVar.getClass();
                                    uVar.a(hVar6.b());
                                    uVar.f18817d = hVar6.a();
                                }
                                this.f18364n = null;
                                this.f18363m = null;
                            }
                            a(aVar);
                            aVar.c();
                        } else if (zArr[i11]) {
                            long j10 = this.f18375y;
                            aVar.f17239g = false;
                            aVar.f17238f = false;
                            aVar.a(false, j10);
                        }
                    }
                    i11++;
                }
                this.f18358h.obtainMessage(3, hVar.f18334m).sendToTarget();
                a(zArr2, i12);
            } else {
                this.f18376z = hVar;
                for (h hVar7 = hVar.f18332k; hVar7 != null; hVar7 = hVar7.f18332k) {
                    hVar7.a();
                }
                h hVar8 = this.f18376z;
                hVar8.f18332k = null;
                if (hVar8.f18330i) {
                    long j11 = hVar8.f18328g;
                    long jMax = Math.max(j11, Math.abs(this.f18375y - (hVar8.f18326e - j11)));
                    h hVar9 = this.f18376z;
                    hVar9.a(jMax, false, new boolean[hVar9.f18335n.length]);
                }
            }
            b();
            h();
            this.f18356f.sendEmptyMessage(2);
            return;
        }
    }

    public final void g() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f18355e;
        if (uVar.f18814a) {
            uVar.a(uVar.b());
            uVar.f18814a = false;
        }
        for (a aVar : this.f18366p) {
            a(aVar);
        }
    }

    public final void h() {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        long jG = hVar.f18322a.g();
        if (jG != -9223372036854775807L) {
            a(jG);
        } else {
            a aVar = this.f18363m;
            if (aVar == null || aVar.e()) {
                this.f18375y = this.f18355e.b();
            } else {
                long jB = this.f18364n.b();
                this.f18375y = jB;
                this.f18355e.a(jB);
            }
            h hVar2 = this.B;
            jG = Math.abs(this.f18375y - (hVar2.f18326e - hVar2.f18328g));
        }
        this.f18361k.f18343c = jG;
        this.f18372v = SystemClock.elapsedRealtime() * 1000;
        long jC = this.f18366p.length == 0 ? Long.MIN_VALUE : this.B.f18322a.c();
        i iVar = this.f18361k;
        if (jC == Long.MIN_VALUE) {
            long j10 = this.C.a(this.B.f18327f, this.f18360j, false).f18833d;
        }
        iVar.getClass();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.u) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    c(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((j) message.obj);
                    return true;
                case 4:
                    a((s) message.obj);
                    return true;
                case 5:
                    a(true);
                    this.f18354d.a(true);
                    a(1);
                    return true;
                case 6:
                    e();
                    return true;
                case 7:
                    a((Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj;
                    h hVar = this.f18376z;
                    if (hVar != null && hVar.f18322a == sVar) {
                        b();
                    }
                    return true;
                case 10:
                    f();
                    return true;
                case 11:
                    a((e[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (d e10) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e10);
            this.f18358h.obtainMessage(8, e10).sendToTarget();
            a(true);
            this.f18354d.a(true);
            a(1);
            return true;
        } catch (IOException e11) {
            Log.e("ExoPlayerImplInternal", "Source error.", e11);
            this.f18358h.obtainMessage(8, new d(e11)).sendToTarget();
            a(true);
            this.f18354d.a(true);
            a(1);
            return true;
        } catch (RuntimeException e12) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e12);
            this.f18358h.obtainMessage(8, new d(e12)).sendToTarget();
            a(true);
            this.f18354d.a(true);
            a(1);
            return true;
        }
    }
}
