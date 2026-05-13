package fp;

/* JADX INFO: compiled from: L2RDanmaku.java */
/* JADX INFO: loaded from: classes4.dex */
public class n extends o {
    public n(f fVar) {
        super(fVar);
    }

    @Override // fp.o
    public float D(l lVar, long j10) {
        long jB = j10 - b();
        return jB >= this.f61790q.f61804d ? lVar.getWidth() : (this.P * jB) - this.f61788o;
    }

    @Override // fp.o, fp.c
    public float d() {
        return this.M + this.f61789p;
    }

    @Override // fp.o, fp.c
    public float g() {
        return this.L;
    }

    @Override // fp.o, fp.c
    public int getType() {
        return 6;
    }

    @Override // fp.o, fp.c
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

    @Override // fp.o, fp.c
    public float i() {
        return this.L + this.f61788o;
    }

    @Override // fp.o, fp.c
    public float l() {
        return this.M;
    }

    @Override // fp.o, fp.c
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
}
