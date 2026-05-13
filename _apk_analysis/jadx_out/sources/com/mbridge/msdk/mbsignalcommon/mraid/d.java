package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static double f38880f = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f38882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38883c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f38884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f38885e;

    /* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<d> f38886a;

        public a(d dVar) {
            this.f38886a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (dVar = this.f38886a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    /* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f38881a = context;
        this.f38882b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public double a() {
        AudioManager audioManager = this.f38882b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f38882b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f38880f = streamVolume;
        return streamVolume;
    }

    public void a(b bVar) {
        this.f38884d = bVar;
    }

    public b b() {
        return this.f38884d;
    }

    public void c() {
        if (this.f38881a != null) {
            this.f38885e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f38881a.registerReceiver(this.f38885e, intentFilter);
            this.f38883c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f38883c || (context = this.f38881a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f38885e);
            this.f38884d = null;
            this.f38883c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
