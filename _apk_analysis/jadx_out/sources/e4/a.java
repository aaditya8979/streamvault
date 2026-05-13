package e4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableC0738a f60030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60031c;

    /* JADX INFO: renamed from: e4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public final class RunnableC0738a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f60032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f60033c;

        public RunnableC0738a(Handler handler, b bVar) {
            this.f60033c = handler;
            this.f60032b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f60033c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f60031c) {
                this.f60032b.onAudioBecomingNoisy();
            }
        }
    }

    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public interface b {
        void onAudioBecomingNoisy();
    }

    public a(Context context, Handler handler, b bVar) {
        this.f60029a = context.getApplicationContext();
        this.f60030b = new RunnableC0738a(handler, bVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f60031c) {
            this.f60029a.registerReceiver(this.f60030b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f60031c = true;
        } else {
            if (z10 || !this.f60031c) {
                return;
            }
            this.f60029a.unregisterReceiver(this.f60030b);
            this.f60031c = false;
        }
    }
}
