package yads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class vw3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f96212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f96213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f96214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ov3 f96215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jx3 f96216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f96217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f96218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f96219h;

    public vw3(Handler handler, Context context, ov3 ov3Var, jx3 jx3Var) {
        super(handler);
        this.f96217f = new AtomicReference(Float.valueOf(-1.0f));
        this.f96218g = new AtomicBoolean(false);
        this.f96219h = Executors.newSingleThreadExecutor();
        this.f96212a = handler;
        this.f96213b = context;
        this.f96214c = (AudioManager) context.getSystemService("audio");
        this.f96215d = ov3Var;
        this.f96216e = jx3Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        if (this.f96218g.getAndSet(true)) {
            return;
        }
        this.f96219h.submit(new qw3(this));
    }
}
