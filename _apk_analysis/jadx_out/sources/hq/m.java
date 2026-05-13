package hq;

import hq.d;

/* JADX INFO: compiled from: View.java */
/* JADX INFO: loaded from: classes3.dex */
public class m extends hq.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f63608n;

    /* JADX INFO: compiled from: View.java */
    public static class a extends m implements d.a {
        @Override // hq.m, hq.a
        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof d) && ((d) obj).R(this)) || super.equals(obj);
        }
    }

    public m() {
        super(2, true);
    }

    public m(d dVar) {
        super(2, !dVar.Z());
        this.f63608n = dVar.buffer();
        X(dVar.T());
        l0(dVar.getIndex());
        V(dVar.i0());
        this.f63577b = dVar.isReadOnly() ? 1 : 2;
    }

    public m(d dVar, int i10, int i11, int i12, int i13) {
        super(2, !dVar.Z());
        this.f63608n = dVar.buffer();
        X(i12);
        l0(i11);
        V(i10);
        this.f63577b = i13;
    }

    @Override // hq.d
    public void I(int i10, byte b10) {
        this.f63608n.I(i10, b10);
    }

    @Override // hq.d
    public int J(int i10, byte[] bArr, int i11, int i12) {
        return this.f63608n.J(i10, bArr, i11, i12);
    }

    @Override // hq.a, hq.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        return this.f63608n.M(i10, bArr, i11, i12);
    }

    @Override // hq.a, hq.d
    public d N(int i10, int i11) {
        return this.f63608n.N(i10, i11);
    }

    @Override // hq.d
    public byte Q(int i10) {
        return this.f63608n.Q(i10);
    }

    @Override // hq.a, hq.d
    public int U(int i10, d dVar) {
        return this.f63608n.U(i10, dVar);
    }

    @Override // hq.d
    public byte[] W() {
        return this.f63608n.W();
    }

    @Override // hq.a, hq.d
    public d buffer() {
        return this.f63608n.buffer();
    }

    @Override // hq.a, hq.d
    public void c0() {
    }

    @Override // hq.a, hq.d
    public void clear() {
        V(-1);
        l0(0);
        X(this.f63608n.getIndex());
        l0(this.f63608n.getIndex());
    }

    @Override // hq.d
    public int e0() {
        return this.f63608n.e0();
    }

    @Override // hq.a
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof d) && obj.equals(this)) || super.equals(obj);
    }

    @Override // hq.a, hq.d
    public boolean isReadOnly() {
        return this.f63608n.isReadOnly();
    }

    @Override // hq.a, hq.d
    public boolean j0() {
        return true;
    }

    @Override // hq.a
    public String toString() {
        return this.f63608n == null ? "INVALID" : super.toString();
    }

    public void update(int i10, int i11) {
        int i12 = this.f63577b;
        this.f63577b = 2;
        l0(0);
        X(i11);
        l0(i10);
        V(-1);
        this.f63577b = i12;
    }

    public void update(d dVar) {
        this.f63577b = 2;
        this.f63608n = dVar.buffer();
        l0(0);
        X(dVar.T());
        l0(dVar.getIndex());
        V(dVar.i0());
        this.f63577b = dVar.isReadOnly() ? 1 : 2;
    }
}
