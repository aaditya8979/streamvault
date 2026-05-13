package bp;

import android.app.Activity;
import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f5771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainParams f5772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Runnable f5774f;

    public g1(int i10, Activity activity, MainParams mainParams, String str, Runnable runnable) {
        this.f5770b = i10;
        this.f5771c = activity;
        this.f5772d = mainParams;
        this.f5773e = str;
        this.f5774f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdLog.d("forceAdClick adType " + this.f5770b);
        if (c.f5737b == null) {
            c.f5737b = new c();
        }
        c.f5737b.a(this.f5771c, this.f5770b, this.f5772d, this.f5773e, false);
        Runnable runnable = this.f5774f;
        if (runnable != null) {
            runnable.run();
        }
    }
}
