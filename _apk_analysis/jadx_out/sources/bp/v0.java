package bp;

import com.applovin.mediation.MaxAd;
import com.yk.e.util.AdLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile v0 f5876b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5877a = new ConcurrentHashMap();

    public static v0 a() {
        if (f5876b == null) {
            synchronized (f.class) {
                if (f5876b == null) {
                    f5876b = new v0();
                }
            }
        }
        return f5876b;
    }

    public final synchronized void b(String str, MaxAd maxAd) {
        try {
            this.f5877a.putIfAbsent(str, maxAd);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
