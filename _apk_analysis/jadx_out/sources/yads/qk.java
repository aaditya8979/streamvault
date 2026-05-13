package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes12.dex */
public final class qk extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rk f94054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f94055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk f94056d;

    public qk(sk skVar, Handler handler, wn0 wn0Var) {
        this.f94056d = skVar;
        this.f94055c = handler;
        this.f94054b = wn0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f94055c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f94056d.f94853c) {
            ((wn0) this.f94054b).f96456a.a(-1, 3, false);
        }
    }
}
