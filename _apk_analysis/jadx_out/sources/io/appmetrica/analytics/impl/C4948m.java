package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4948m implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f67249a = new HashSet();

    public C4948m(@NonNull C4998o c4998o) {
        c4998o.registerListener(this, new ActivityEvent[0]);
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f67249a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C4711cj) ((InterfaceC4923l) it.next())).a(activity);
        }
    }

    public final synchronized void a(@NonNull InterfaceC4923l interfaceC4923l) {
        this.f67249a.add(interfaceC4923l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        C4696c4.l().f66453c.a().execute(new RunnableC4897k(this, activity));
    }
}
