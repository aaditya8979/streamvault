package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class InterstitialInfoCollection extends ConcurrentHashMap<String, n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f51798a = "InterstitialInfoCollection";

    protected int a(boolean z10) {
        int i10 = 0;
        if (!z10) {
            return size();
        }
        synchronized (this) {
            Iterator<n> it = values().iterator();
            while (it.hasNext()) {
                n next = it.next();
                i10 = (next == null || next.f52701am != null) ? i10 : i10 + 1;
            }
        }
        return i10;
    }

    public n a(String str, boolean z10) {
        Logger.d(f51798a, "get by view address, viewAddress = " + str);
        if (str == null) {
            Logger.d(f51798a, "get by view address, view is null, exiting");
            return null;
        }
        if (str.contains("@")) {
            str = str.substring(str.indexOf(64) + 1);
            Logger.d(f51798a, "get by view address, viewAddress cut to " + str);
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                n nVar = get(it.next());
                if (nVar != null) {
                    if (z10 && nVar.U) {
                        Logger.d(f51798a, "get by view address - skipping ad that was already finished with event id - " + nVar.w());
                    } else {
                        Logger.d(f51798a, "get by view address, searching by viewAddress " + str + ", view hierarchy : " + nVar.x());
                        if (nVar.K != null && nVar.K.equals(str)) {
                            Logger.d(f51798a, "get by view address, found. viewAddress = " + str + " with event id: " + nVar.w());
                            return nVar;
                        }
                        if (nVar.x() != null && nVar.x().contains(str)) {
                            Logger.d(f51798a, "get by view address, found in views hierarchy . viewAddress = " + str + " with event id: " + nVar.w());
                            return nVar;
                        }
                    }
                }
            }
            return null;
        }
    }

    public List<n> a(String str) {
        Logger.d(f51798a, "get items by sdk package started, sdk: " + str);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (String str2 : keySet()) {
                n nVar = (n) get(str2);
                Logger.d(f51798a, "get items by sdk package, key: " + str2);
                if (nVar != null && !nVar.U && nVar.c() != null && nVar.c().equals(str)) {
                    Logger.d(f51798a, "get items by sdk package, adding " + nVar);
                    arrayList.add(nVar);
                }
            }
        }
        return arrayList;
    }

    public boolean a() {
        Iterator<n> it = values().iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            z10 = z10 && it.next().f52702an;
        }
        return z10;
    }

    public n b(String str) {
        n nVar;
        Logger.d(f51798a, "get by activity address, viewAddress = " + str);
        if (str == null) {
            Logger.d(f51798a, "get by activity address, view is null, exiting");
            return null;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    nVar = null;
                    break;
                }
                nVar = get(it.next());
                if (nVar != null && nVar.f52691ac != null && nVar.f52691ac.endsWith(str)) {
                    Logger.d(f51798a, "get by activity address, found by " + nVar.f52691ac);
                    break;
                }
            }
        }
        return nVar;
    }

    public String b() {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            Iterator<n> it = values().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().c());
            }
        }
        return hashSet.toString();
    }

    public synchronized List<n> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (n nVar : values()) {
            if (nVar != null && nVar.f52701am == null) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    public boolean c(String str) {
        boolean z10;
        Logger.d(f51798a, "contains activity address, viewAddress = " + str + ", keys = " + keySet());
        if (str == null) {
            Logger.d(f51798a, "contains activity address, view is null, exiting");
            return false;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                n nVar = get(it.next());
                if (nVar != null && nVar.f52691ac != null && nVar.f52691ac.endsWith(str)) {
                    Logger.d(f51798a, "contains activity address, found by " + nVar.f52691ac);
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    public n d(String str) {
        if (str == null) {
            Logger.d(f51798a, "get by eventId, eventId is null, exiting");
            return null;
        }
        if (!containsKey(str)) {
            return null;
        }
        Logger.d(f51798a, "get by eventId, found by eventId " + str);
        return get(str);
    }

    public n e(String str) {
        n nVar;
        if (str == null) {
            Logger.d(f51798a, "get by adId, adId is null, exiting");
            return null;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    nVar = null;
                    break;
                }
                nVar = get(it.next());
                if (nVar != null && nVar.i() != null && nVar.i().L().equals(str)) {
                    Logger.d(f51798a, "get by adId, found by adid " + str);
                    break;
                }
            }
        }
        return nVar;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public int size() {
        return -1;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("InterstitialInfoCollection : ");
        synchronized (this) {
            for (n nVar : values()) {
                sb2.append("[ ");
                if (nVar != null) {
                    if (nVar.f51889v != null) {
                        sb2.append("maxSdk=").append(nVar.f51889v);
                    }
                    if (nVar.L != null) {
                        sb2.append(",eventId=").append(nVar.L);
                    }
                    if (nVar.f52701am != null) {
                        sb2.append(",interstitialActivity=").append(nVar.f52701am.toString());
                    }
                    if (nVar.K != null) {
                        sb2.append(",viewAddress=").append(nVar.K);
                    }
                    sb2.append(",isAdFinished=").append(nVar.U);
                }
                sb2.append(" ] ");
            }
        }
        return sb2.toString();
    }
}
