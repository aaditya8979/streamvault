package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: DownloadRequestQueue.java */
/* JADX INFO: loaded from: classes11.dex */
public class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, d<T>> f36104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<d<T>>> f36105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f36106c;

    /* JADX INFO: compiled from: DownloadRequestQueue.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f36107a = new f();
    }

    private f() {
        this.f36104a = new ConcurrentHashMap<>();
        this.f36106c = new AtomicInteger();
        this.f36105b = new ConcurrentHashMap<>();
    }

    public static f a() {
        return b.f36107a;
    }

    private void a(d dVar, String str) {
        if (dVar != null) {
            dVar.a(dVar.d());
            this.f36104a.remove(str);
        }
    }

    private int b() {
        return this.f36106c.incrementAndGet();
    }

    public synchronized void a(d<T> dVar) {
        String strF = dVar.f();
        dVar.a(b());
        if (this.f36104a.containsKey(strF)) {
            com.mbridge.msdk.config.component.load.downloader.e eVarJ = dVar.j();
            com.mbridge.msdk.config.component.load.downloader.e eVar = com.mbridge.msdk.config.component.load.downloader.e.RETRY;
            if (eVarJ != eVar) {
                eVar = com.mbridge.msdk.config.component.load.downloader.e.DELAY;
            }
            dVar.a(eVar);
            if (this.f36105b.containsKey(strF)) {
                CopyOnWriteArrayList<d<T>> copyOnWriteArrayList = this.f36105b.get(strF);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(dVar);
                    this.f36105b.remove(strF);
                    this.f36105b.put(strF, copyOnWriteArrayList);
                }
            } else {
                CopyOnWriteArrayList<d<T>> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(dVar);
                this.f36105b.put(strF, copyOnWriteArrayList2);
            }
        } else {
            com.mbridge.msdk.config.component.load.downloader.e eVarJ2 = dVar.j();
            com.mbridge.msdk.config.component.load.downloader.e eVar2 = com.mbridge.msdk.config.component.load.downloader.e.RETRY;
            if (eVarJ2 != eVar2) {
                eVar2 = com.mbridge.msdk.config.component.load.downloader.e.QUEUED;
            }
            dVar.a(eVar2);
            this.f36104a.put(strF, dVar);
            dVar.a(i.b().a().getDownloadTasks().submit(new h(dVar)));
        }
    }

    public synchronized void a(String str) {
        CopyOnWriteArrayList<d<T>> copyOnWriteArrayList;
        if (!TextUtils.isEmpty(str) && this.f36105b.containsKey(str) && (copyOnWriteArrayList = this.f36105b.get(str)) != null && copyOnWriteArrayList.size() > 0) {
            for (d<T> dVar : copyOnWriteArrayList) {
                copyOnWriteArrayList.remove(dVar);
                dVar.b(dVar.d());
            }
            if (copyOnWriteArrayList.size() > 0) {
                this.f36105b.remove(str);
                this.f36105b.put(str, copyOnWriteArrayList);
            } else {
                this.f36105b.remove(str);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            a(this.f36104a.get(str), str);
        }
    }

    public synchronized void b(d dVar) {
        CopyOnWriteArrayList<d<T>> copyOnWriteArrayListRemove;
        String strF = dVar.f();
        this.f36104a.remove(strF);
        if (this.f36105b.containsKey(strF) && (copyOnWriteArrayListRemove = this.f36105b.remove(strF)) != null && copyOnWriteArrayListRemove.size() > 0) {
            d<T> dVarRemove = copyOnWriteArrayListRemove.remove(0);
            dVarRemove.a(com.mbridge.msdk.config.component.load.downloader.e.QUEUED);
            this.f36104a.put(strF, dVarRemove);
            dVarRemove.a(i.b().a().getDownloadTasks().submit(new h(dVarRemove)));
            if (copyOnWriteArrayListRemove.size() > 0) {
                this.f36105b.put(strF, copyOnWriteArrayListRemove);
            }
        }
    }

    public void c() {
    }
}
