package e4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: WakeLockManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final PowerManager f60325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f60326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60328d;

    public w0(Context context) {
        this.f60325a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z10) {
        this.f60328d = z10;
        b();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void b() {
        PowerManager.WakeLock wakeLock = this.f60326b;
        if (wakeLock == null) {
            return;
        }
        if (this.f60327c && this.f60328d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
