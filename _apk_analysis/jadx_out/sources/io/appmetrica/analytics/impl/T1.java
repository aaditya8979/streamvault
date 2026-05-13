package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class T1 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f65902a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C5280z7 f65903b = null;

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f65902a);
        this.f65902a.clear();
        return arrayList;
    }

    public final void a(@NonNull C5280z7 c5280z7) {
        ArrayList arrayListA;
        synchronized (this) {
            this.f65903b = c5280z7;
            arrayListA = a();
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((InterfaceC4680be) it.next()).consume(c5280z7);
        }
    }

    public final void b() {
        C4696c4.l().f66455e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C4696c4.l().f66455e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", ActivityChooserModel.ATTRIBUTE_ACTIVITY, new R1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        S1 s12 = new S1(dataString);
        synchronized (this) {
            C5280z7 c5280z7 = this.f65903b;
            if (c5280z7 == null) {
                this.f65902a.add(s12);
            } else {
                ((A9) C4696c4.l().f66453c.a()).f64970b.post(new Q1(s12, c5280z7));
            }
        }
    }
}
