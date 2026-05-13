package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C4228r4;
import com.ironsource.V7;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes12.dex */
class t {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AudioManager f33855a;

        public a(AudioManager audioManager) {
            this.f33855a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f33855a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AudioManager f33856a;

        public b(AudioManager audioManager) {
            this.f33856a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.b(this.f33856a);
        }
    }

    public static void a(Activity activity) {
        V7.f30593a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public static void b(Activity activity) {
        V7.f30593a.b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }
}
