package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class po3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f93688c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f93686a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f93687b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93689d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f93690e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f93691f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f93692g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f93693h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f93694i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f93695j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f93696k = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.n20 a() {
        /*
            r13 = this;
            float r0 = r13.f93693h
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L11
            goto L1c
        L11:
            int r0 = r13.f93689d
            if (r0 == r6) goto L1b
            if (r0 == r5) goto L19
            r0 = r3
            goto L1c
        L19:
            r0 = r7
            goto L1c
        L1b:
            r0 = r4
        L1c:
            int r2 = r13.f93694i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r2 == r8) goto L26
            goto L35
        L26:
            int r2 = r13.f93689d
            if (r2 == r11) goto L34
            if (r2 == r9) goto L32
            if (r2 == r6) goto L34
            if (r2 == r5) goto L32
            r2 = r11
            goto L35
        L32:
            r2 = r10
            goto L35
        L34:
            r2 = 0
        L35:
            yads.n20 r8 = new yads.n20
            r8.<init>()
            int r12 = r13.f93689d
            if (r12 == r11) goto L55
            if (r12 == r10) goto L52
            if (r12 == r9) goto L4f
            if (r12 == r6) goto L55
            if (r12 == r5) goto L4f
            java.lang.String r5 = "Unknown textAlignment: "
            java.lang.String r6 = "WebvttCueParser"
            yads.kf1.a(r5, r12, r6)
            r5 = 0
            goto L57
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L57
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L57
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L57:
            r8.f92696c = r5
            float r5 = r13.f93690e
            int r6 = r13.f93691f
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 == 0) goto L6c
            if (r6 != 0) goto L6c
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 < 0) goto L72
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L6c
            goto L72
        L6c:
            if (r9 == 0) goto L70
            r1 = r5
            goto L73
        L70:
            if (r6 != 0) goto L73
        L72:
            r1 = r7
        L73:
            r8.f92698e = r1
            r8.f92699f = r6
            int r1 = r13.f93692g
            r8.f92700g = r1
            r8.f92701h = r0
            r8.f92702i = r2
            float r1 = r13.f93695j
            if (r2 == 0) goto L9e
            if (r2 == r11) goto L92
            if (r2 != r10) goto L88
            goto La0
        L88:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            throw r0
        L92:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 > 0) goto L9a
            float r0 = r0 * r3
            goto La0
        L9a:
            float r7 = r7 - r0
            float r0 = r7 * r3
            goto La0
        L9e:
            float r0 = r7 - r0
        La0:
            float r0 = java.lang.Math.min(r1, r0)
            r8.f92705l = r0
            int r0 = r13.f93696k
            r8.f92709p = r0
            java.lang.CharSequence r0 = r13.f93688c
            if (r0 == 0) goto Lb0
            r8.f92694a = r0
        Lb0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.po3.a():yads.n20");
    }
}
