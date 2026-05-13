package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiBanner;

/* JADX INFO: renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class HandlerC3347d2 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiBanner f27008a;

    /* JADX WARN: Illegal instructions before constructor call */
    public HandlerC3347d2(InMobiBanner inMobiBanner) {
        tn.p.k(inMobiBanner, "mInmobiBanner");
        Looper mainLooper = Looper.getMainLooper();
        tn.p.j(mainLooper, "getMainLooper(...)");
        tn.p.k(inMobiBanner, "mInmobiBanner");
        tn.p.k(mainLooper, "looper");
        super(mainLooper);
        this.f27008a = inMobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        tn.p.k(message, NotificationCompat.CATEGORY_MESSAGE);
        if (message.what == 1) {
            this.f27008a.refreshBanner$media_release();
        } else {
            tn.p.j("d2", "TAG");
        }
    }
}
