package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ty2 extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f95423i = 150000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f95424j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f95425k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f95426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f95427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f95428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f95429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f95430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f95431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f95432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f95433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f95434t;

    public ty2(int i10) {
        byte[] bArr = ib3.f90742f;
        this.f95428n = bArr;
        this.f95429o = bArr;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int iLimit2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f88926g.hasRemaining()) {
            int i10 = this.f95430p;
            if (i10 == 0) {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f95428n.length));
                int iLimit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit4)) > this.f95425k) {
                            int i11 = this.f95426l;
                            iPosition = ((iLimit4 / i11) * i11) + i11;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f95430p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f95433s = true;
                    }
                }
                byteBuffer.limit(iLimit3);
            } else if (i10 == 1) {
                int iLimit5 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position();
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition2)) > this.f95425k) {
                            int i12 = this.f95426l;
                            iLimit2 = (iPosition2 / i12) * i12;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                byte[] bArr = this.f95428n;
                int length = bArr.length;
                int i13 = this.f95431q;
                int i14 = length - i13;
                if (iLimit2 >= iLimit5 || iPosition3 >= i14) {
                    int iMin = Math.min(iPosition3, i14);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f95428n, this.f95431q, iMin);
                    int i15 = this.f95431q + iMin;
                    this.f95431q = i15;
                    byte[] bArr2 = this.f95428n;
                    if (i15 == bArr2.length) {
                        if (this.f95433s) {
                            int i16 = this.f95432r;
                            a(i16).put(bArr2, 0, i16).flip();
                            if (i16 > 0) {
                                this.f95433s = true;
                            }
                            this.f95434t += (long) ((this.f95431q - (this.f95432r * 2)) / this.f95426l);
                        } else {
                            this.f95434t += (long) ((i15 - this.f95432r) / this.f95426l);
                        }
                        byte[] bArr3 = this.f95428n;
                        int i17 = this.f95431q;
                        int iMin2 = Math.min(byteBuffer.remaining(), this.f95432r);
                        int i18 = this.f95432r - iMin2;
                        System.arraycopy(bArr3, i17 - i18, this.f95429o, 0, i18);
                        byteBuffer.position(byteBuffer.limit() - iMin2);
                        byteBuffer.get(this.f95429o, i18, iMin2);
                        this.f95431q = 0;
                        this.f95430p = 2;
                    }
                    byteBuffer.limit(iLimit5);
                } else {
                    a(i13).put(bArr, 0, i13).flip();
                    if (i13 > 0) {
                        this.f95433s = true;
                    }
                    this.f95431q = 0;
                    this.f95430p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit6 = byteBuffer.limit();
                int iPosition4 = byteBuffer.position();
                while (true) {
                    if (iPosition4 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition4)) > this.f95425k) {
                            int i19 = this.f95426l;
                            iLimit = (iPosition4 / i19) * i19;
                            break;
                        }
                        iPosition4 += 2;
                    }
                }
                byteBuffer.limit(iLimit);
                this.f95434t += (long) (byteBuffer.remaining() / this.f95426l);
                byte[] bArr4 = this.f95429o;
                int i20 = this.f95432r;
                int iMin3 = Math.min(byteBuffer.remaining(), this.f95432r);
                int i21 = this.f95432r - iMin3;
                System.arraycopy(bArr4, i20 - i21, this.f95429o, 0, i21);
                byteBuffer.position(byteBuffer.limit() - iMin3);
                byteBuffer.get(this.f95429o, i21, iMin3);
                if (iLimit < iLimit6) {
                    byte[] bArr5 = this.f95429o;
                    int i22 = this.f95432r;
                    a(i22).put(bArr5, 0, i22).flip();
                    if (i22 > 0) {
                        this.f95433s = true;
                    }
                    this.f95430p = 0;
                    byteBuffer.limit(iLimit6);
                }
            }
        }
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        if (zkVar.f97643c == 2) {
            return this.f95427m ? zkVar : zk.f97640e;
        }
        throw new al(zkVar);
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.f95427m) {
            zk zkVar = this.f88921b;
            int i10 = zkVar.f97644d;
            this.f95426l = i10;
            long j10 = this.f95423i;
            long j11 = zkVar.f97641a;
            int i11 = ((int) ((j10 * j11) / 1000000)) * i10;
            if (this.f95428n.length != i11) {
                this.f95428n = new byte[i11];
            }
            int i12 = ((int) ((this.f95424j * j11) / 1000000)) * i10;
            this.f95432r = i12;
            if (this.f95429o.length != i12) {
                this.f95429o = new byte[i12];
            }
        }
        this.f95430p = 0;
        this.f95434t = 0L;
        this.f95431q = 0;
        this.f95433s = false;
    }

    @Override // yads.Cdo
    public final void d() {
        int i10 = this.f95431q;
        if (i10 > 0) {
            a(i10).put(this.f95428n, 0, i10).flip();
            if (i10 > 0) {
                this.f95433s = true;
            }
        }
        if (this.f95433s) {
            return;
        }
        this.f95434t += (long) (this.f95432r / this.f95426l);
    }

    @Override // yads.Cdo
    public final void e() {
        this.f95427m = false;
        this.f95432r = 0;
        byte[] bArr = ib3.f90742f;
        this.f95428n = bArr;
        this.f95429o = bArr;
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isActive() {
        return this.f95427m;
    }
}
