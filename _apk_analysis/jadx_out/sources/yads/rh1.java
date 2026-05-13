package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class rh1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f94453b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d63 f94452a = new d63();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f94454c = new AtomicBoolean();

    public rh1(Context context) {
        this.f94453b = context.getApplicationContext();
    }

    public final void a() {
        if (ub.a(this.f94453b)) {
            this.f94452a.getClass();
            if (d63.a() || this.f94454c.getAndSet(true)) {
                return;
            }
            lc1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
