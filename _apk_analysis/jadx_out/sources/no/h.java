package no;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PeekSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r f75919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f75920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public m f75921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f75924g;

    public h(@NotNull r rVar) {
        tn.p.k(rVar, "upstream");
        this.f75919b = rVar;
        a buffer = rVar.getBuffer();
        this.f75920c = buffer;
        this.f75921d = buffer.m();
        m mVarM = buffer.m();
        this.f75922e = mVarM != null ? mVarM.f() : -1;
    }

    @Override // no.j, java.lang.AutoCloseable
    public void close() {
        this.f75923f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // no.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s(@org.jetbrains.annotations.NotNull no.a r8, long r9) {
        /*
            r7 = this;
            java.lang.String r0 = "sink"
            tn.p.k(r8, r0)
            boolean r0 = r7.f75923f
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto Lb7
            r2 = 0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r4 = 0
            if (r0 < 0) goto L14
            r5 = r1
            goto L15
        L14:
            r5 = r4
        L15:
            if (r5 == 0) goto L97
            no.m r5 = r7.f75921d
            if (r5 == 0) goto L36
            no.a r6 = r7.f75920c
            no.m r6 = r6.m()
            if (r5 != r6) goto L35
            int r5 = r7.f75922e
            no.a r6 = r7.f75920c
            no.m r6 = r6.m()
            tn.p.h(r6)
            int r6 = r6.f()
            if (r5 != r6) goto L35
            goto L36
        L35:
            r1 = r4
        L36:
            if (r1 == 0) goto L8b
            if (r0 != 0) goto L3b
            return r2
        L3b:
            no.r r0 = r7.f75919b
            long r1 = r7.f75924g
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L4b
            r8 = -1
            return r8
        L4b:
            no.m r0 = r7.f75921d
            if (r0 != 0) goto L6e
            no.a r0 = r7.f75920c
            no.m r0 = r0.m()
            if (r0 == 0) goto L6e
            no.a r0 = r7.f75920c
            no.m r0 = r0.m()
            r7.f75921d = r0
            no.a r0 = r7.f75920c
            no.m r0 = r0.m()
            tn.p.h(r0)
            int r0 = r0.f()
            r7.f75922e = r0
        L6e:
            no.a r0 = r7.f75920c
            long r0 = r0.n()
            long r2 = r7.f75924g
            long r0 = r0 - r2
            long r9 = java.lang.Math.min(r9, r0)
            no.a r0 = r7.f75920c
            long r2 = r7.f75924g
            long r4 = r2 + r9
            r1 = r8
            r0.k(r1, r2, r4)
            long r0 = r7.f75924g
            long r0 = r0 + r9
            r7.f75924g = r0
            return r9
        L8b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L97:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "byteCount ("
            r8.append(r0)
            r8.append(r9)
            java.lang.String r9 = ") < 0"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        Lb7:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Source is closed."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: no.h.s(no.a, long):long");
    }
}
