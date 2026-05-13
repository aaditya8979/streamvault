package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes12.dex */
public final class c43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f88339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f88340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a43 f88341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f88342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b43 f88343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HandlerThread f88344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f88347i;

    public c43(Context context, Handler handler, wn0 wn0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f88339a = applicationContext;
        this.f88340b = handler;
        this.f88341c = wn0Var;
        AudioManager audioManager = (AudioManager) ni.a((AudioManager) applicationContext.getSystemService("audio"));
        this.f88342d = audioManager;
        this.f88345g = 3;
        this.f88346h = b(audioManager, 3);
        this.f88347i = a(audioManager, this.f88345g);
        b43 b43Var = new b43(this);
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            HandlerThread handlerThread = new HandlerThread("StreamVolumeReceiver");
            this.f88344f = handlerThread;
            handlerThread.start();
            applicationContext.registerReceiver(b43Var, intentFilter, null, new Handler(this.f88344f.getLooper()));
            this.f88343e = b43Var;
        } catch (RuntimeException e10) {
            ih1.a(e10);
            HandlerThread handlerThread2 = this.f88344f;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.f88344f = null;
            }
        }
    }

    public static boolean a(AudioManager audioManager, int i10) {
        return ib3.f90737a >= 23 ? audioManager.isStreamMute(i10) : b(audioManager, i10) == 0;
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            ih1.d("StreamVolumeManager", ih1.a("Could not retrieve stream volume for stream type " + i10, e10));
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final int a() {
        if (ib3.f90737a >= 28) {
            return this.f88342d.getStreamMinVolume(this.f88345g);
        }
        return 0;
    }

    public final void a(int i10) {
        if (this.f88345g == i10) {
            return;
        }
        this.f88345g = i10;
        int iB = b(this.f88342d, i10);
        boolean zA = a(this.f88342d, this.f88345g);
        if (this.f88346h != iB || this.f88347i != zA) {
            this.f88346h = iB;
            this.f88347i = zA;
            ((wn0) this.f88341c).a(zA, iB);
        }
        ((wn0) this.f88341c).a();
    }

    public final void b() {
        b43 b43Var = this.f88343e;
        if (b43Var != null) {
            try {
                this.f88339a.unregisterReceiver(b43Var);
            } catch (RuntimeException e10) {
                ih1.d("StreamVolumeManager", ih1.a("Error unregistering stream volume receiver", e10));
            }
            this.f88343e = null;
        }
        HandlerThread handlerThread = this.f88344f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f88344f = null;
        }
    }
}
