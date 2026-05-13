package com.bytedance.sdk.component.fkw.lh.ouw;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class lh<K, V> {
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12561le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12562lh;
    private final LinkedHashMap<K, SoftReference<V>> ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f12563ra;
    private int vt;
    private int yu;

    public lh(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f12562lh = i10;
        this.ouw = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.vt + ", maxSize: " + r4);
        r3.vt = 0;
        r3.ouw.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.vt     // Catch: java.lang.Throwable -> L79
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.ouw     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            int r0 = r3.vt     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            goto L52
        L12:
            int r0 = r3.vt     // Catch: java.lang.Throwable -> L79
            if (r0 > r4) goto L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L18:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.ouw     // Catch: java.lang.Throwable -> L79
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L79
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L2c:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L79
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.ouw     // Catch: java.lang.Throwable -> L79
            r2.remove(r1)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L79
            int r2 = r3.vt     // Catch: java.lang.Throwable -> L79
            int r0 = r3.vt(r1, r0)     // Catch: java.lang.Throwable -> L79
            int r2 = r2 - r0
            r3.vt = r2     // Catch: java.lang.Throwable -> L79
        L4a:
            int r0 = r3.f12561le     // Catch: java.lang.Throwable -> L79
            int r0 = r0 + 1
            r3.f12561le = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            goto L0
        L52:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L79
            int r2 = r3.vt     // Catch: java.lang.Throwable -> L79
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            r1.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L79
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r3.vt = r4     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.ouw     // Catch: java.lang.Throwable -> L79
            r4.clear()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.fkw.lh.ouw.lh.ouw(int):void");
    }

    private int vt(K k10, V v10) {
        int iVt = vt(v10);
        if (iVt >= 0) {
            return iVt;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public final V ouw(K k10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            SoftReference<V> softReference = this.ouw.get(k10);
            if (softReference != null) {
                V v10 = softReference.get();
                if (v10 != null) {
                    this.f12563ra++;
                    return v10;
                }
                this.ouw.remove(k10);
            }
            this.pno++;
            return null;
        }
    }

    public final V ouw(K k10, V v10) {
        if (k10 == null || v10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V v11 = null;
        synchronized (this) {
            this.yu++;
            this.vt += vt(k10, v10);
            SoftReference<V> softReferencePut = this.ouw.put(k10, new SoftReference<>(v10));
            if (softReferencePut != null && (v11 = softReferencePut.get()) != null) {
                this.vt -= vt(k10, v11);
            }
        }
        ouw(this.f12562lh);
        return v11;
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f12563ra;
        i11 = this.pno + i10;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f12562lh), Integer.valueOf(this.f12563ra), Integer.valueOf(this.pno), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public int vt(V v10) {
        return 1;
    }
}
