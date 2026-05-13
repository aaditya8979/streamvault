package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class bt extends ro {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sa0 f88131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jb2 f88132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f88133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public at f88134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f88135r;

    public bt() {
        super(6);
        this.f88131n = new sa0(1);
        this.f88132o = new jb2();
    }

    @Override // yads.ro
    public final int a(mx0 mx0Var) {
        return "application/x-camera-motion".equals(mx0Var.f92610m) ? ro.a(4, 0, 0) : ro.a(0, 0, 0);
    }

    @Override // yads.ro
    public final void a(long j10, long j11) {
        while (!e() && this.f88135r < 100000 + j10) {
            this.f88131n.b();
            nx0 nx0Var = this.f94536c;
            float[] fArr = null;
            nx0Var.f93034a = null;
            nx0Var.f93035b = null;
            if (a(nx0Var, this.f88131n, 0) != -4 || this.f88131n.b(4)) {
                return;
            }
            sa0 sa0Var = this.f88131n;
            this.f88135r = sa0Var.f94751f;
            if (this.f88134q != null && !sa0Var.b(Integer.MIN_VALUE)) {
                this.f88131n.c();
                ByteBuffer byteBuffer = this.f88131n.f94749d;
                int i10 = ib3.f90737a;
                if (byteBuffer.remaining() == 16) {
                    jb2 jb2Var = this.f88132o;
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    jb2Var.f91147a = bArrArray;
                    jb2Var.f91149c = iLimit;
                    jb2Var.f91148b = 0;
                    this.f88132o.e(byteBuffer.arrayOffset() + 4);
                    fArr = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr[i11] = Float.intBitsToFloat(this.f88132o.d());
                    }
                }
                if (fArr != null) {
                    this.f88134q.onCameraMotion(this.f88135r - this.f88133p, fArr);
                }
            }
        }
    }

    @Override // yads.ro
    public final void a(long j10, boolean z10) {
        this.f88135r = Long.MIN_VALUE;
        at atVar = this.f88134q;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }

    @Override // yads.ro
    public final void a(mx0[] mx0VarArr, long j10, long j11) {
        this.f88133p = j11;
    }

    @Override // yads.ro
    public final String d() {
        return "CameraMotionRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return e();
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        at atVar = this.f88134q;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }

    @Override // yads.ro, yads.af2
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f88134q = (at) obj;
        }
    }
}
