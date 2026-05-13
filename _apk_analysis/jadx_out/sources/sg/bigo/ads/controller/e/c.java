package sg.bigo.ads.controller.e;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f83287c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Map<String, Long> f83288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f83289b = new AtomicInteger(0);

    private c() {
    }

    public static c a() {
        return f83287c;
    }

    public static boolean a(Map<String, Long> map, String str) {
        Long l10;
        return map == null || str == null || (l10 = map.get(str)) == null || SystemClock.elapsedRealtime() - l10.longValue() > 600000;
    }

    public final boolean a(@Nullable String str) {
        return a(this.f83288a, str);
    }

    public final void b() {
        Map<String, Long> map = this.f83288a;
        if (map != null) {
            map.clear();
        }
        this.f83289b.set(1);
    }
}
