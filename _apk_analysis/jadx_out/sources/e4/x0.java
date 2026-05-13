package e4;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: WifiLockManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final WifiManager f60330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WifiManager.WifiLock f60331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60333d;

    public x0(Context context) {
        this.f60330a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z10) {
        this.f60333d = z10;
        b();
    }

    public final void b() {
        WifiManager.WifiLock wifiLock = this.f60331b;
        if (wifiLock == null) {
            return;
        }
        if (this.f60332c && this.f60333d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
