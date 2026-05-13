package bp;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile x f5885c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5886a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5887b = "OktMaxInterstitialCacheUtil";

    public static x a() {
        if (f5885c == null) {
            synchronized (x.class) {
                f5885c = new x();
            }
        }
        return f5885c;
    }
}
