package d6;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: WifiLockManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final WifiManager f59632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WifiManager.WifiLock f59633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59635d;

    public h2(Context context) {
        this.f59632a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z10) {
        if (z10 && this.f59633b == null) {
            WifiManager wifiManager = this.f59632a;
            if (wifiManager == null) {
                s7.q.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f59633b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f59634c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f59635d = z10;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.f59633b;
        if (wifiLock == null) {
            return;
        }
        if (this.f59634c && this.f59635d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
