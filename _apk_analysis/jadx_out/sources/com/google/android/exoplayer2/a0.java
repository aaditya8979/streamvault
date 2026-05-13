package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import s7.m0;

/* JADX INFO: compiled from: StreamVolumeManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f21183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f21184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f21185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public c f21186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21189h;

    /* JADX INFO: compiled from: StreamVolumeManager.java */
    public interface b {
        void onStreamTypeChanged(int i10);

        void onStreamVolumeChanged(int i10, boolean z10);
    }

    /* JADX INFO: compiled from: StreamVolumeManager.java */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = a0.this.f21183b;
            final a0 a0Var = a0.this;
            handler.post(new Runnable() { // from class: d6.z1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.a0.b(a0Var);
                }
            });
        }
    }

    public a0(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21182a = applicationContext;
        this.f21183b = handler;
        this.f21184c = bVar;
        AudioManager audioManager = (AudioManager) s7.a.i((AudioManager) applicationContext.getSystemService("audio"));
        this.f21185d = audioManager;
        this.f21187f = 3;
        this.f21188g = f(audioManager, 3);
        this.f21189h = e(audioManager, this.f21187f);
        c cVar = new c();
        try {
            m0.E0(applicationContext, cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f21186e = cVar;
        } catch (RuntimeException e10) {
            s7.q.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static /* synthetic */ void b(a0 a0Var) {
        a0Var.i();
    }

    public static boolean e(AudioManager audioManager, int i10) {
        return m0.f79487a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            s7.q.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public int c() {
        return this.f21185d.getStreamMaxVolume(this.f21187f);
    }

    public int d() {
        if (m0.f79487a >= 28) {
            return this.f21185d.getStreamMinVolume(this.f21187f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f21186e;
        if (cVar != null) {
            try {
                this.f21182a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                s7.q.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f21186e = null;
        }
    }

    public void h(int i10) {
        if (this.f21187f == i10) {
            return;
        }
        this.f21187f = i10;
        i();
        this.f21184c.onStreamTypeChanged(i10);
    }

    public final void i() {
        int iF = f(this.f21185d, this.f21187f);
        boolean zE = e(this.f21185d, this.f21187f);
        if (this.f21188g == iF && this.f21189h == zE) {
            return;
        }
        this.f21188g = iF;
        this.f21189h = zE;
        this.f21184c.onStreamVolumeChanged(iF, zE);
    }
}
