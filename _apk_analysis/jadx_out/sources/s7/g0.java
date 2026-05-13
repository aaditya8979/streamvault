package s7;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes10.dex */
public class g0 implements d {
    @Override // s7.d
    public m createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new h0(new Handler(looper, callback));
    }

    @Override // s7.d
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // s7.d
    public void onThreadBlocked() {
    }

    @Override // s7.d
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
