package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class lx3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lx3 f92168d = new lx3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f92169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f92170b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f92171c = false;

    public final void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f92169a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f92170b, zIsDeviceLocked);
        this.f92171c = zIsDeviceLocked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f92171c || this.f92170b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(nw3.f93027c.f93028a).iterator();
        while (it.hasNext()) {
            ka kaVar = ((wv3) it.next()).f96536e;
            boolean z12 = z11 || z10;
            if (kaVar.f91524b.get() != 0) {
                ix3.f91031a.a((WebView) kaVar.f91524b.get(), "setDeviceLockState", z12 ? "locked" : "unlocked");
            }
        }
    }
}
