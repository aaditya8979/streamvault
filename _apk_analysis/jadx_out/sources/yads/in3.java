package yads;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* JADX INFO: loaded from: classes8.dex */
public final class in3 implements jn3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f90925m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f90926n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq0 f90927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73 f90928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn3 f90929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f90931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f90932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f90933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mx0 f90934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f90935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f90936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f90937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f90938l;

    public in3(pq0 pq0Var, m73 m73Var, mn3 mn3Var) throws ob2 {
        this.f90927a = pq0Var;
        this.f90928b = m73Var;
        this.f90929c = mn3Var;
        int iMax = Math.max(1, mn3Var.f92470b / 10);
        this.f90933g = iMax;
        jb2 jb2Var = new jb2(mn3Var.f92473e);
        jb2Var.h();
        int iH = jb2Var.h();
        this.f90930d = iH;
        int i10 = mn3Var.f92469a;
        int i11 = (((mn3Var.f92471c - (i10 * 4)) * 8) / (mn3Var.f92472d * i10)) + 1;
        if (iH != i11) {
            throw ob2.a("Expected frames per block: " + i11 + "; got: " + iH);
        }
        int iA = ib3.a(iMax, iH);
        this.f90931e = new byte[mn3Var.f92471c * iA];
        this.f90932f = new jb2(a(iH, i10) * iA);
        int i12 = ((mn3Var.f92470b * mn3Var.f92471c) * 8) / iH;
        this.f90934h = new lx0().d("audio/raw").a(i12).e(i12).c(a(iMax, i10)).b(mn3Var.f92469a).g(mn3Var.f92470b).d(2).a();
    }

    public static int a(int i10, int i11) {
        return i10 * 2 * i11;
    }

    @Override // yads.jn3
    public final void a(int i10, long j10) {
        this.f90927a.a(new pn3(this.f90929c, this.f90930d, i10, j10));
        this.f90928b.a(this.f90934h);
    }

    @Override // yads.jn3
    public final void a(long j10) {
        this.f90935i = 0;
        this.f90936j = j10;
        this.f90937k = 0;
        this.f90938l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:11:0x0043). Please report as a decompilation issue!!! */
    @Override // yads.jn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(yads.ld0 r21, long r22) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.in3.a(yads.ld0, long):boolean");
    }
}
