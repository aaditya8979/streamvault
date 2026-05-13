package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class w83 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = x83.f96667i;
        if (handler != null) {
            handler.post(x83.f96668j);
            x83.f96667i.postDelayed(x83.f96669k, 200L);
        }
    }
}
