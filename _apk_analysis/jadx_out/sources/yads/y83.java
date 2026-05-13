package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class y83 extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f97028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f97029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f97030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f97031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f97032m = ib3.f90742f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f97033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f97034o;

    @Override // yads.Cdo, yads.bl
    public final ByteBuffer a() {
        int i10;
        if (super.isEnded() && (i10 = this.f97033n) > 0) {
            a(i10).put(this.f97032m, 0, this.f97033n).flip();
            this.f97033n = 0;
        }
        ByteBuffer byteBuffer = this.f88926g;
        this.f88926g = bl.f88040a;
        return byteBuffer;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f97031l);
        this.f97034o += (long) (iMin / this.f88921b.f97644d);
        this.f97031l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f97031l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f97033n + i11) - this.f97032m.length;
        ByteBuffer byteBufferA = a(length);
        int i12 = this.f97033n;
        int i13 = ib3.f90737a;
        int iMax = Math.max(0, Math.min(length, i12));
        byteBufferA.put(this.f97032m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i11));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i11 - iMax2;
        int i15 = this.f97033n - iMax;
        this.f97033n = i15;
        byte[] bArr = this.f97032m;
        System.arraycopy(bArr, iMax, bArr, 0, i15);
        byteBuffer.get(this.f97032m, this.f97033n, i14);
        this.f97033n += i14;
        byteBufferA.flip();
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        if (zkVar.f97643c != 2) {
            throw new al(zkVar);
        }
        this.f97030k = true;
        return (this.f97028i == 0 && this.f97029j == 0) ? zk.f97640e : zkVar;
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.f97030k) {
            this.f97030k = false;
            int i10 = this.f97029j;
            int i11 = this.f88921b.f97644d;
            this.f97032m = new byte[i10 * i11];
            this.f97031l = this.f97028i * i11;
        }
        this.f97033n = 0;
    }

    @Override // yads.Cdo
    public final void d() {
        if (this.f97030k) {
            int i10 = this.f97033n;
            if (i10 > 0) {
                this.f97034o += (long) (i10 / this.f88921b.f97644d);
            }
            this.f97033n = 0;
        }
    }

    @Override // yads.Cdo
    public final void e() {
        this.f97032m = ib3.f90742f;
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isEnded() {
        return super.isEnded() && this.f97033n == 0;
    }
}
