package com.yandex.div.core.timer;

import android.os.Handler;
import android.os.Looper;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: FixedRateScheduler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FixedRateScheduler {

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    public final void cancel() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void scheduleAtFixedRate(long j10, final long j11, @NotNull final a<r> aVar) {
        this.handler.postDelayed(new Runnable() { // from class: com.yandex.div.core.timer.FixedRateScheduler.scheduleAtFixedRate.1
            @Override // java.lang.Runnable
            public void run() {
                FixedRateScheduler.this.handler.postDelayed(this, j11);
                aVar.invoke();
            }
        }, j10);
    }
}
