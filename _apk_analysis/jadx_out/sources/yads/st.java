package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class st extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f94923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f94924j;

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f94924j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f88921b.f97644d) * this.f88922c.f97644d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f88921b.f97644d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        int[] iArr = this.f94923i;
        if (iArr == null) {
            return zk.f97640e;
        }
        if (zkVar.f97643c != 2) {
            throw new al(zkVar);
        }
        boolean z10 = zkVar.f97642b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= zkVar.f97642b) {
                throw new al(zkVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new zk(zkVar.f97641a, iArr.length, 2) : zk.f97640e;
    }

    @Override // yads.Cdo
    public final void c() {
        this.f94924j = this.f94923i;
    }

    @Override // yads.Cdo
    public final void e() {
        this.f94924j = null;
        this.f94923i = null;
    }
}
