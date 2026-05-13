package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes7.dex */
public final class C1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(Looper looper) {
        super(looper);
        tn.p.k(looper, "looper");
        this.f25240a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        tn.p.k(message, NotificationCompat.CATEGORY_MESSAGE);
        int i10 = message.what;
        if (i10 == 1001 && this.f25240a) {
            this.f25240a = false;
            E1.a(false);
            tn.p.j("E1", "access$getTAG$p(...)");
        } else {
            if (i10 != 1002 || this.f25240a) {
                return;
            }
            this.f25240a = true;
            E1.a(true);
            tn.p.j("E1", "access$getTAG$p(...)");
        }
    }
}
