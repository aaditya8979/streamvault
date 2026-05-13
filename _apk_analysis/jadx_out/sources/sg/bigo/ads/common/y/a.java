package sg.bigo.ads.common.y;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f82809a = new AtomicInteger();

    public static int a() {
        return f82809a.incrementAndGet();
    }

    public static void a(int i10) {
        f82809a.set(i10);
    }
}
