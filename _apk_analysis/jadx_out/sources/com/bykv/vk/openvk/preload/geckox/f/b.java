package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: SelectChannelVersionLock.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f11490a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantLock f11491b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileLock f11493d;

    private b(String str, FileLock fileLock) {
        this.f11492c = str;
        this.f11493d = fileLock;
    }

    public static b a(String str) throws Exception {
        f11491b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f11490a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f11491b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f11493d.a();
            this.f11493d.b();
            Lock lock = f11490a.get(this.f11492c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f11491b.unlock();
        }
    }
}
