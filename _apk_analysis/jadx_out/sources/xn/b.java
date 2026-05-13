package xn;

import java.util.Random;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends xn.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f87007c = new a();

    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // xn.a
    @NotNull
    public Random d() {
        Random random = this.f87007c.get();
        p.j(random, "get(...)");
        return random;
    }
}
