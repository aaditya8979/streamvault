package d6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: WakeLockManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final PowerManager f59611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f59612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59614d;

    public g2(Context context) {
        this.f59611a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z10) {
        if (z10 && this.f59612b == null) {
            PowerManager powerManager = this.f59611a;
            if (powerManager == null) {
                s7.q.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f59612b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f59613c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f59614d = z10;
        c();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void c() {
        PowerManager.WakeLock wakeLock = this.f59612b;
        if (wakeLock == null) {
            return;
        }
        if (this.f59613c && this.f59614d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
