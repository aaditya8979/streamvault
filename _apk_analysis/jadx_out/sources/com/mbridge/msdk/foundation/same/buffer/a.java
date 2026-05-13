package com.mbridge.msdk.foundation.same.buffer;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: LruReplaceTempCache.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f37720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37722c;

    public a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f37721b = i10;
        this.f37720a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f37722c     // Catch: java.lang.Throwable -> L72
            if (r0 < 0) goto L53
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f37720a     // Catch: java.lang.Throwable -> L72
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L11
            int r0 = r3.f37722c     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L53
        L11:
            int r0 = r3.f37722c     // Catch: java.lang.Throwable -> L72
            if (r0 <= r4) goto L51
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f37720a     // Catch: java.lang.Throwable -> L72
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L1e
            goto L51
        L1e:
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f37720a     // Catch: java.lang.Throwable -> L72
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L72
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L32
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
            goto L52
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L72
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L72
            int r0 = r3.b(r1, r0)     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r2 = r3.f37720a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L4f
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L4f
            int r1 = r3.f37722c     // Catch: java.lang.Throwable -> L4f
            int r1 = r1 - r0
            r3.f37722c = r1     // Catch: java.lang.Throwable -> L4f
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
            goto L0
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
        L52:
            return
        L53:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r0.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L72
            r0.append(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L72
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L72
            throw r4     // Catch: java.lang.Throwable -> L72
        L72:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.buffer.a.a(int):void");
    }

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f37720a.keySet());
        }
        return hashSet;
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            jSONObject = this.f37720a.get(str);
        }
        return jSONObject;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f37722c += b(str, jSONObject);
            JSONObject jSONObjectPut = this.f37720a.put(str, jSONObject);
            if (jSONObjectPut != null) {
                this.f37722c -= b(str, jSONObjectPut);
            }
        }
        a(this.f37721b);
        return true;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f37721b));
    }
}
