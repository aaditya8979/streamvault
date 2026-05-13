package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq0 f88590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mq0 f88591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ld0 f88592c;

    public cr(rq0 rq0Var) {
        this.f88590a = rq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (r7.f88591b != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
    
        r11 = new java.lang.StringBuilder("None of the available extractors (");
        r12 = yads.ib3.f90737a;
        r12 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (r14 >= r8.length) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        r12.append(r8[r14].getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        if (r14 >= (r8.length - 1)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        r12.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
    
        r11.append(r12.toString());
        r11.append(") could read the stream.");
        r8 = r11.toString();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        throw new yads.ka3(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.p30 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, yads.pq0 r15) throws yads.ka3 {
        /*
            r7 = this;
            yads.ld0 r6 = new yads.ld0
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f88592c = r6
            yads.mq0 r8 = r7.f88591b
            if (r8 == 0) goto L10
            return
        L10:
            yads.rq0 r8 = r7.f88590a
            yads.mq0[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            r13 = 1
            r14 = 0
            if (r10 != r13) goto L21
            r8 = r8[r14]
            r7.f88591b = r8
            goto Lb5
        L21:
            int r10 = r8.length
            r0 = r14
        L23:
            if (r0 >= r10) goto L6e
            r1 = r8[r0]
            boolean r2 = r1.a(r6)     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            if (r2 == 0) goto L32
            r7.f88591b = r1     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            r6.f91940f = r14
            goto L6e
        L32:
            yads.mq0 r1 = r7.f88591b
            if (r1 != 0) goto L69
            long r1 = r6.f91938d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L3d
            goto L69
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L43:
            r8 = move-exception
            yads.mq0 r9 = r7.f88591b
            if (r9 != 0) goto L55
            long r9 = r6.f91938d
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L4f
            goto L55
        L4f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L55:
            r6.f91940f = r14
            throw r8
        L58:
            yads.mq0 r1 = r7.f88591b
            if (r1 != 0) goto L69
            long r1 = r6.f91938d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L63
            goto L69
        L63:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L69:
            r6.f91940f = r14
            int r0 = r0 + 1
            goto L23
        L6e:
            yads.mq0 r10 = r7.f88591b
            if (r10 != 0) goto Lb5
            yads.ka3 r10 = new yads.ka3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            int r12 = yads.ib3.f90737a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L82:
            int r15 = r8.length
            if (r14 >= r15) goto L9e
            r15 = r8[r14]
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getSimpleName()
            r12.append(r15)
            int r15 = r8.length
            int r15 = r15 - r13
            if (r14 >= r15) goto L9b
            java.lang.String r15 = ", "
            r12.append(r15)
        L9b:
            int r14 = r14 + 1
            goto L82
        L9e:
            java.lang.String r8 = r12.toString()
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lb5:
            yads.mq0 r8 = r7.f88591b
            r8.a(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cr.a(yads.p30, android.net.Uri, java.util.Map, long, long, yads.pq0):void");
    }
}
