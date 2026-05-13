package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: ChannelUpdateLock.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f11487a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLock f11488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11489c;

    private a(String str, FileLock fileLock) {
        this.f11489c = str;
        this.f11488b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f11487a;
        synchronized (map) {
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            if (!reentrantLock.tryLock()) {
                return null;
            }
            try {
                FileLock fileLockC = FileLock.c(str);
                if (fileLockC == null) {
                    reentrantLock.unlock();
                    return null;
                }
                return new a(str, fileLockC);
            } catch (Exception e10) {
                reentrantLock.lock();
                com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e10));
                return null;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f11487a;
        synchronized (map) {
            try {
                this.f11488b.a();
                this.f11488b.b();
                map.get(this.f11489c).unlock();
            } catch (Throwable th2) {
                f11487a.get(this.f11489c).unlock();
                throw th2;
            }
        }
    }
}
