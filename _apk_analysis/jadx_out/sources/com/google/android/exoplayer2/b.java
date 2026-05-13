package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import s7.m0;

/* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f21365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21366c;

    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC0299b f21367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f21368c;

        public a(Handler handler, InterfaceC0299b interfaceC0299b) {
            this.f21368c = handler;
            this.f21367b = interfaceC0299b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f21368c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f21366c) {
                this.f21367b.onAudioBecomingNoisy();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public interface InterfaceC0299b {
        void onAudioBecomingNoisy();
    }

    public b(Context context, Handler handler, InterfaceC0299b interfaceC0299b) {
        this.f21364a = context.getApplicationContext();
        this.f21365b = new a(handler, interfaceC0299b);
    }

    public void b(boolean z10) {
        if (z10 && !this.f21366c) {
            m0.E0(this.f21364a, this.f21365b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f21366c = true;
        } else {
            if (z10 || !this.f21366c) {
                return;
            }
            this.f21364a.unregisterReceiver(this.f21365b);
            this.f21366c = false;
        }
    }
}
