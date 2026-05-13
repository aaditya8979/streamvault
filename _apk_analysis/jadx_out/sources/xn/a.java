package xn;

import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends Random {
    @NotNull
    public abstract java.util.Random d();

    @Override // kotlin.random.Random
    public int nextBits(int i10) {
        return d.g(d().nextInt(), i10);
    }

    @Override // kotlin.random.Random
    public boolean nextBoolean() {
        return d().nextBoolean();
    }

    @Override // kotlin.random.Random
    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr) {
        p.k(bArr, "array");
        d().nextBytes(bArr);
        return bArr;
    }

    @Override // kotlin.random.Random
    public double nextDouble() {
        return d().nextDouble();
    }

    @Override // kotlin.random.Random
    public float nextFloat() {
        return d().nextFloat();
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        return d().nextInt();
    }

    @Override // kotlin.random.Random
    public int nextInt(int i10) {
        return d().nextInt(i10);
    }

    @Override // kotlin.random.Random
    public long nextLong() {
        return d().nextLong();
    }
}
