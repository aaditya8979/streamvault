package com.bytedance.adsdk.vt;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class ko<K, V> {
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11947le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11948lh = 20;
    private final LinkedHashMap<K, V> ouw = new LinkedHashMap<>(0, 0.75f, true);
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f11949ra;
    private int vt;
    private int yu;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        throw new java.lang.IllegalStateException(com.bytedance.adsdk.vt.ko.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.vt     // Catch: java.lang.Throwable -> L67
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<K, V> r0 = r2.ouw     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L11
            int r0 = r2.vt     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.vt     // Catch: java.lang.Throwable -> L67
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<K, V> r0 = r2.ouw     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.ouw     // Catch: java.lang.Throwable -> L67
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L67
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L67
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L67
            r0.getValue()     // Catch: java.lang.Throwable -> L67
            java.util.LinkedHashMap<K, V> r0 = r2.ouw     // Catch: java.lang.Throwable -> L67
            r0.remove(r1)     // Catch: java.lang.Throwable -> L67
            int r0 = r2.vt     // Catch: java.lang.Throwable -> L67
            int r0 = r0 + (-1)
            r2.vt = r0     // Catch: java.lang.Throwable -> L67
            int r0 = r2.f11947le     // Catch: java.lang.Throwable -> L67
            int r0 = r0 + 1
            r2.f11947le = r0     // Catch: java.lang.Throwable -> L67
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r0.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.Class<com.bytedance.adsdk.vt.ko> r1 = com.bytedance.adsdk.vt.ko.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L67
            r0.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L67
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L67
            throw r3     // Catch: java.lang.Throwable -> L67
        L67:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.ko.ouw(int):void");
    }

    public final V ouw(K k10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v10 = this.ouw.get(k10);
            if (v10 != null) {
                this.f11949ra++;
                return v10;
            }
            this.pno++;
            return null;
        }
    }

    public final V ouw(K k10, V v10) {
        V vPut;
        if (k10 == null || v10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.yu++;
            this.vt++;
            vPut = this.ouw.put(k10, v10);
            if (vPut != null) {
                this.vt--;
            }
        }
        ouw(this.f11948lh);
        return vPut;
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f11949ra;
        i11 = this.pno + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f11948lh), Integer.valueOf(this.f11949ra), Integer.valueOf(this.pno), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
