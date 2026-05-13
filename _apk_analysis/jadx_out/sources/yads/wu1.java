package yads;

import com.ironsource.Z7;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f96497a = new AtomicBoolean(false);

    public static final void a() {
        if (f96497a.compareAndSet(false, true)) {
            lc1.b("Yandex Mobile Ads" + Z7.f30794r + "7.18.1 initialized successfully", new Object[0]);
        }
    }
}
