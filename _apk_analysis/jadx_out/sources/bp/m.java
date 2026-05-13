package bp;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile m f5812b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5813a = new ConcurrentHashMap();

    public static m a() {
        if (f5812b == null) {
            synchronized (m.class) {
                if (f5812b == null) {
                    f5812b = new m();
                }
            }
        }
        return f5812b;
    }
}
