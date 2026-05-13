package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.f5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f7597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f7598f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f7599g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f7600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f7601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f5 f7602c = new f5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f7603d = new MessagingServiceImpl();

    private void a(String str) {
        if (this.f7601b == null || !o.a()) {
            return;
        }
        this.f7601b.a("AppLovinCommunicator", str);
    }

    public static AppLovinCommunicator getInstance() {
        return getInstance(k.o());
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f7598f) {
            if (f7597e == null) {
                f7597e = new AppLovinCommunicator();
            }
        }
        return f7597e;
    }

    public void a(k kVar) {
        this.f7600a = kVar;
        this.f7601b = kVar.O();
        a("Attached SDK instance: " + kVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f7603d;
    }

    public boolean hasSubscriber(String str) {
        return this.f7602c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f7600a.t().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f7602c.a(appLovinCommunicatorSubscriber, str)) {
                this.f7603d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f7600a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f7602c.b(appLovinCommunicatorSubscriber, str);
        }
    }
}
