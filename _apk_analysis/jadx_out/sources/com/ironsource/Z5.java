package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class Z5 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Oc> f30774a;

    public Z5(Looper looper) {
        super(looper);
        this.f30774a = new ConcurrentHashMap<>();
    }

    private boolean a(int i10) {
        return i10 == 1016 || i10 == 1015;
    }

    public void a(String str, Oc oc2) {
        if (str == null || oc2 == null) {
            return;
        }
        this.f30774a.put(str, oc2);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C8 c82 = (C8) message.obj;
            String path = c82.getPath();
            Oc oc2 = this.f30774a.get(path);
            if (oc2 == null) {
                return;
            }
            if (a(message.what)) {
                oc2.a(c82);
            } else {
                int i10 = message.what;
                oc2.a(c82, new C4283u8(i10, C4079ig.a(i10)));
            }
            this.f30774a.remove(path);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }
}
