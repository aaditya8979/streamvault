package fp;

/* JADX INFO: compiled from: R2LDanmaku.java */
/* JADX INFO: loaded from: classes4.dex */
public class o extends c {
    public int N;
    public float P;
    public long Q;
    public float L = 0.0f;
    public float M = -1.0f;
    public float[] O = null;

    public o(f fVar) {
        this.f61790q = fVar;
    }

    public float D(l lVar, long j10) {
        long jB = j10 - b();
        return jB >= this.f61790q.f61804d ? -this.f61788o : lVar.getWidth() - (jB * this.P);
    }

    @Override // fp.c
    public float d() {
        return this.M + this.f61789p;
    }

    @Override // fp.c
    public float g() {
        return this.L;
    }

    @Override // fp.c
    public int getType() {
        return 1;
    }

    @Override // fp.c
    public float[] h(l lVar, long j10) {
        if (!p()) {
            return null;
        }
        float fD = D(lVar, j10);
        if (this.O == null) {
            this.O = new float[4];
        }
        float[] fArr = this.O;
        fArr[0] = fD;
        float f10 = this.M;
        fArr[1] = f10;
        fArr[2] = fD + this.f61788o;
        fArr[3] = f10 + this.f61789p;
        return fArr;
    }

    @Override // fp.c
    public float i() {
        return this.L + this.f61788o;
    }

    @Override // fp.c
    public float l() {
        return this.M;
    }

    @Override // fp.c
    public void x(l lVar, float f10, float f11) {
        e eVar = this.D;
        if (eVar != null) {
            long j10 = eVar.f61800a;
            long jB = j10 - b();
            if (jB > 0 && jB < this.f61790q.f61804d) {
                this.L = D(lVar, j10);
                if (!u()) {
                    this.M = f11;
                    C(true);
                }
                this.Q = j10;
                return;
            }
            this.Q = j10;
        }
        C(false);
    }

    @Override // fp.c
    public void y(l lVar, boolean z10) {
        super.y(lVar, z10);
        int width = (int) (lVar.getWidth() + this.f61788o);
        this.N = width;
        this.P = width / this.f61790q.f61804d;
    }
}
