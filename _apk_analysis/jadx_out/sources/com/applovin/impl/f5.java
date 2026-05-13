package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8281a = new HashSet(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8282b = new Object();

    private g5 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (g5 g5Var : this.f8281a) {
            if (str.equals(g5Var.b()) && appLovinCommunicatorSubscriber.equals(g5Var.a())) {
                return g5Var;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber == null || !StringUtils.isValidString(str)) {
            com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
            return false;
        }
        synchronized (this.f8282b) {
            g5 g5VarA = a(str, appLovinCommunicatorSubscriber);
            if (g5VarA == null) {
                g5 g5Var = new g5(str, appLovinCommunicatorSubscriber);
                this.f8281a.add(g5Var);
                AppLovinBroadcastManager.registerReceiver(g5Var, new IntentFilter(str));
                return true;
            }
            com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
            if (!g5VarA.c()) {
                g5VarA.a(true);
                AppLovinBroadcastManager.registerReceiver(g5VarA, new IntentFilter(str));
            }
            return true;
        }
    }

    public boolean a(String str) {
        synchronized (this.f8282b) {
            Iterator it = this.f8281a.iterator();
            while (it.hasNext()) {
                if (str.equals(((g5) it.next()).b())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        g5 g5VarA;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f8282b) {
                g5VarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (g5VarA != null) {
                g5VarA.a(false);
                AppLovinBroadcastManager.unregisterReceiver(g5VarA);
            }
        }
    }
}
