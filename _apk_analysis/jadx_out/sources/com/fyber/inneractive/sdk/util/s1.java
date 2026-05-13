package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.ironsource.Q6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19563a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f19564b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f19565c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f19566d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f19567e = new p1(this);

    public final String a() {
        if (!TextUtils.isEmpty(this.f19564b)) {
            return this.f19564b;
        }
        if (this.f19567e != null && this.f19563a.get()) {
            Handler handler = r.f19556b;
            handler.removeCallbacks(this.f19567e);
            handler.postDelayed(this.f19567e, 50L);
        }
        return System.getProperty("http.agent");
    }

    public final void b() {
        if (this.f19565c == null || !TextUtils.isEmpty(this.f19564b)) {
            return;
        }
        this.f19564b = this.f19565c.getSharedPreferences("fyber.ua", 0).getString(Q6.f30218d0, null);
        if (!TextUtils.isEmpty(this.f19564b)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.f19566d.compareAndSet(false, true);
        }
        r.f19555a.execute(new r1(this));
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void c() {
        Context context = this.f19565c;
        if (context != null) {
            String defaultUserAgent = null;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                this.f19563a.set(false);
            }
            if (TextUtils.isEmpty(defaultUserAgent)) {
                return;
            }
            this.f19564b = defaultUserAgent;
            if (!TextUtils.isEmpty(this.f19564b)) {
                IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.f19566d.compareAndSet(false, true);
            }
            r.f19555a.execute(new q1(this, defaultUserAgent));
        }
    }
}
