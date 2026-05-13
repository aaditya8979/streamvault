package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class FullScreenActivitiesCollection extends ConcurrentHashMap<String, WeakReference<Activity>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f51729b = "FullScreenActivitiesCollection";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Set<WeakReference<Activity>> f51730a = Collections.synchronizedSet(new LinkedHashSet());

    private synchronized void b() {
        Iterator<Map.Entry<String, WeakReference<Activity>>> it = entrySet().iterator();
        while (it.hasNext()) {
            WeakReference<Activity> value = it.next().getValue();
            if (value == null || value.get() == null) {
                this.f51730a.remove(value);
                it.remove();
            }
        }
    }

    public synchronized Activity a(String str) {
        Activity activity;
        Logger.d(f51729b, "get by activity address, viewAddress = " + str);
        if (str != null) {
            Iterator<String> it = keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    activity = null;
                    break;
                }
                WeakReference<Activity> weakReference = get(it.next());
                Logger.d(f51729b, "get by activity address, activity address :  " + weakReference);
                if (weakReference != null && weakReference.get() != null && weakReference.get().toString().endsWith(str)) {
                    Logger.d(f51729b, "get by activity address, found by " + str);
                    activity = weakReference.get();
                    break;
                }
            }
        } else {
            Logger.d(f51729b, "get by activity address, view is null, exiting");
            activity = null;
        }
        return activity;
    }

    synchronized String a() {
        StringBuilder sb2;
        sb2 = new StringBuilder();
        sb2.append("{ items: ").append(keySet()).append(", by order: [");
        Iterator<WeakReference<Activity>> it = this.f51730a.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().get()).append(", ");
        }
        sb2.append("] }");
        return sb2.toString();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized WeakReference<Activity> remove(@NonNull Object obj) {
        Logger.d(f51729b, "remove key = " + obj + " activities : " + keySet());
        this.f51730a.remove(get(obj));
        return (WeakReference) super.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized WeakReference<Activity> put(@NonNull String str, @NonNull WeakReference<Activity> weakReference) {
        WeakReference<Activity> weakReference2;
        Logger.d(f51729b, "put activity = " + weakReference.get() + " activities : " + keySet());
        weakReference2 = (WeakReference) super.put(str, weakReference);
        if (weakReference2 != null) {
            this.f51730a.remove(weakReference2);
        }
        this.f51730a.add(weakReference);
        return weakReference2;
    }

    public synchronized WeakReference<Activity> b(String str) {
        WeakReference<Activity> next;
        Logger.d(f51729b, "get activity ref by sdk , viewAddress = " + str);
        if (str != null) {
            b();
            Iterator<WeakReference<Activity>> it = this.f51730a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next != null && next.get() != null && SdksMapping.getSdkPackageByClass(next.get().getClass().getName()).equals(str)) {
                    Logger.d(f51729b, "get activity ref by sdk, activity found :  " + next.get().toString() + ", activity class name = " + next.get().getClass().getName());
                    break;
                }
            }
        } else {
            Logger.d(f51729b, "get activity ref by sdk, sdk package is null, exiting");
            next = null;
        }
        return next;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object obj, Object obj2) {
        Logger.d(f51729b, "remove activity = " + obj2 + " activities : " + keySet());
        this.f51730a.remove(obj2);
        return super.remove(obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public synchronized String toString() {
        StringBuilder sb2;
        sb2 = new StringBuilder();
        for (String str : keySet()) {
            WeakReference weakReference = (WeakReference) get(str);
            sb2.append(str).append(" - ").append((weakReference == null || weakReference.get() == null) ? "NA" : "alive");
        }
        return sb2.toString();
    }
}
