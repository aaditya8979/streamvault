package yads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class rz2 implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f94658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz2 f94659d;

    public rz2(tz2 tz2Var) {
        this.f94659d = tz2Var;
    }

    @Override // yads.ns2
    public final int a(long j10) {
        if (!this.f94658c) {
            tz2 tz2Var = this.f94659d;
            bn1 bn1Var = tz2Var.f95447f;
            bn1Var.a(new hm1(1, ht1.d(tz2Var.f95452k.f92610m), this.f94659d.f95452k, 0, null, bn1Var.a(0L), -9223372036854775807L));
            this.f94658c = true;
        }
        if (j10 <= 0 || this.f94657b == 2) {
            return 0;
        }
        this.f94657b = 2;
        return 1;
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        if (!this.f94658c) {
            tz2 tz2Var = this.f94659d;
            bn1 bn1Var = tz2Var.f95447f;
            bn1Var.a(new hm1(1, ht1.d(tz2Var.f95452k.f92610m), this.f94659d.f95452k, 0, null, bn1Var.a(0L), -9223372036854775807L));
            this.f94658c = true;
        }
        tz2 tz2Var2 = this.f94659d;
        boolean z10 = tz2Var2.f95454m;
        if (z10 && tz2Var2.f95455n == null) {
            this.f94657b = 2;
        }
        int i11 = this.f94657b;
        if (i11 == 2) {
            sa0Var.f94912b |= 4;
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            nx0Var.f93035b = tz2Var2.f95452k;
            this.f94657b = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        tz2Var2.f95455n.getClass();
        sa0Var.f94912b |= 1;
        sa0Var.f94751f = 0L;
        if ((i10 & 4) == 0) {
            sa0Var.c(this.f94659d.f95456o);
            ByteBuffer byteBuffer = sa0Var.f94749d;
            tz2 tz2Var3 = this.f94659d;
            byteBuffer.put(tz2Var3.f95455n, 0, tz2Var3.f95456o);
        }
        if ((i10 & 1) == 0) {
            this.f94657b = 2;
        }
        return -4;
    }

    @Override // yads.ns2
    public final void a() throws IOException {
        tz2 tz2Var = this.f94659d;
        if (tz2Var.f95453l) {
            return;
        }
        tz2Var.f95451j.a(Integer.MIN_VALUE);
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return this.f94659d.f95454m;
    }
}
