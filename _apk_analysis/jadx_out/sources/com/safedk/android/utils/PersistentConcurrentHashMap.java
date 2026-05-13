package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Build;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoAndCountPair;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class PersistentConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53056a = "SafeDKCache";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f53057d = "PersistentConcurrentHashMap";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f53058b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinkedHashSet<K> f53063h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f53060e = d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f53061f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53062g = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53059c = true;

    public PersistentConcurrentHashMap() {
    }

    private PersistentConcurrentHashMap(int i10) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int i10, float f10) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int i10, float f10, int i11) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    public PersistentConcurrentHashMap(String str) {
        a(str, -1);
    }

    public PersistentConcurrentHashMap(String str, int i10) {
        a(str, i10);
    }

    private PersistentConcurrentHashMap(Map map) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r4.length() == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void a(java.lang.String r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto Lb
            if (r4 == 0) goto L16
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L16
        Lb:
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "argument sharePrefsKey cannot be empty"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r0     // Catch: java.lang.Throwable -> L13
        L13:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L16:
            r3.f53058b = r4     // Catch: java.lang.Throwable -> L13
            r3.f53062g = r5     // Catch: java.lang.Throwable -> L13
            r0 = -1
            if (r5 <= r0) goto L4c
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L13
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L13
            r3.f53063h = r0     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "PersistentConcurrentHashMap"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "PersistentConcurrentHashMap filename = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r3.f()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = ", capacity limit = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L13
        L4c:
            java.lang.String r0 = "PersistentConcurrentHashMap"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "PersistentConcurrentHashMap instance created, filename = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r3.f()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L13
            r3.i()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.PersistentConcurrentHashMap.a(java.lang.String, int):void");
    }

    private boolean a(CreativeInfo creativeInfo) {
        if (SafeDK.getInstance().S().contains(creativeInfo.Q())) {
            return creativeInfo.Y() == null || !creativeInfo.Y().before(new Timestamp(System.currentTimeMillis()));
        }
        return false;
    }

    public static String d() {
        try {
            String str = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod(Build.VERSION.SDK_INT >= 18 ? "currentProcessName" : "currentPackageName", new Class[0]).invoke(null, new Object[0]);
            Logger.d(f53057d, "getProcessName : " + str);
            return str;
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private synchronized void e() {
        if (this.f53062g > -1 && size() > this.f53062g) {
            K kB = b();
            if (kB != null) {
                remove(kB);
                Logger.d(f53057d, "removeOldestEntryIfNecessary filename = " + f() + ", removed key " + kB);
            } else {
                Logger.d(f53057d, "removeOldestEntryIfNecessary filename = " + f() + ", first item is null");
            }
        }
    }

    private String f() {
        return "SafeDKCache_" + this.f53058b;
    }

    private synchronized void g() {
        Logger.d(f53057d, "saveMap started, map key=" + f() + ", size before filtering=" + entrySet().size());
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().l().getSharedPreferences(f(), 0);
            if (sharedPreferences != null) {
                String strA = h.a(h());
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (sharedPreferences.contains(this.f53058b)) {
                    editorEdit.remove(this.f53058b).apply();
                }
                editorEdit.putString(this.f53058b, strA);
                editorEdit.apply();
                Logger.v(f53057d, "Map saved, key=" + f() + ", content length=" + (strA != null ? Integer.valueOf(strA.length()) : "null"));
            } else {
                Logger.d(f53057d, "saveMap cannot get share prefs object");
            }
        } catch (Exception e10) {
            Logger.d(f53057d, "Exception while saving map data", e10);
        }
    }

    private ConcurrentHashMap<K, V> h() {
        Logger.d(f53057d, "filtering items for saving started, key=" + this.f53058b + ", max items=" + SafeDK.getInstance().R());
        ConcurrentHashMap<K, V> concurrentHashMap = new ConcurrentHashMap<>();
        synchronized (concurrentHashMap) {
            if (concurrentHashMap.size() <= SafeDK.getInstance().R()) {
                for (Map.Entry<K, V> entry : entrySet()) {
                    if (entry.getValue() instanceof CreativeInfo) {
                        if (a((CreativeInfo) entry.getValue())) {
                            concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else if (entry.getValue() instanceof CreativeInfoAndCountPair) {
                        CreativeInfoAndCountPair creativeInfoAndCountPair = (CreativeInfoAndCountPair) entry.getValue();
                        if (creativeInfoAndCountPair != null && a(creativeInfoAndCountPair.a())) {
                            concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else {
                        concurrentHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        Logger.d(f53057d, "filtering items for saving " + f() + " Filtered map contains " + concurrentHashMap.size());
        return concurrentHashMap;
    }

    private void i() {
        Logger.d(f53057d, "loadMap started, map key=" + f());
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().l().getSharedPreferences(f(), 0);
            new ConcurrentHashMap();
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(this.f53058b, null);
                if (string != null) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h.a(string);
                    Logger.d(f53057d, "loadMap (" + f() + ") content length = " + string.length() + ", concurrentHashMap size = " + concurrentHashMap.size());
                    this.f53059c = false;
                    for (Map.Entry<K, V> entry : concurrentHashMap.entrySet()) {
                        if (entry.getValue() instanceof CreativeInfo) {
                            CreativeInfo creativeInfo = (CreativeInfo) entry.getValue();
                            if (creativeInfo != null) {
                                Logger.d(f53057d, "loadMap including item " + creativeInfo.L() + " ,AdType is " + creativeInfo.K().name() + ", persistentContentSize(" + f() + "):" + string.length());
                                creativeInfo.a(ImpressionLog.f51733c, new ImpressionLog.a[0]);
                                creativeInfo.ac();
                                put(entry.getKey(), entry.getValue());
                                if (this.f53063h != null) {
                                    this.f53063h.add(entry.getKey());
                                }
                            }
                        } else if (entry.getValue() instanceof CreativeInfoAndCountPair) {
                            CreativeInfoAndCountPair creativeInfoAndCountPair = (CreativeInfoAndCountPair) entry.getValue();
                            if (creativeInfoAndCountPair != null && creativeInfoAndCountPair.a() != null) {
                                CreativeInfo creativeInfoA = creativeInfoAndCountPair.a();
                                Logger.d(f53057d, "loadMap including item " + creativeInfoA.L() + " ,AdType is " + creativeInfoA.K().name() + ", persistentContentSize(" + f() + "):" + string.length());
                                creativeInfoA.a(ImpressionLog.f51733c, new ImpressionLog.a[0]);
                                creativeInfoA.ac();
                                put(entry.getKey(), entry.getValue());
                                if (this.f53063h != null) {
                                    this.f53063h.add(entry.getKey());
                                }
                            }
                        } else if (entry.getValue() instanceof Boolean) {
                            put(entry.getKey(), entry.getValue());
                            if (this.f53063h != null) {
                                this.f53063h.add(entry.getKey());
                            }
                        } else if (entry.getValue() instanceof StatsEvent) {
                            put(entry.getKey(), entry.getValue());
                            if (this.f53063h != null) {
                                this.f53063h.add(entry.getKey());
                            }
                        } else if (entry.getValue() instanceof RedirectData) {
                            Logger.d(f53057d, "loadMap item key: " + entry.getKey() + ", value: " + entry.getValue());
                            put(entry.getKey(), entry.getValue());
                            if (this.f53063h != null) {
                                this.f53063h.add(entry.getKey());
                            }
                        }
                    }
                } else {
                    Logger.d(f53057d, "loadMap map is empty");
                }
                Logger.d(f53057d, "loadMap loaded map " + f() + " : " + size() + " items");
            }
        } catch (InvalidClassException e10) {
            Logger.d(f53057d, "loadMap Exception loading Map from file : " + e10.getMessage(), e10);
            g();
        } catch (IllegalArgumentException e11) {
            Logger.d(f53057d, "loadMap Data mismatch exception loading Map from file : " + e11.getMessage(), e11);
            g();
        } catch (Throwable th2) {
            Logger.e(f53057d, "loadMap Error loading Map from file", th2);
            g();
        } finally {
            this.f53059c = true;
        }
    }

    public String a() {
        return this.f53061f;
    }

    public void a(String str) {
        this.f53061f += ImpressionLog.Q + str;
        Logger.d(f53057d, "sdk_null_check added value " + str);
    }

    public void a(boolean z10) {
        this.f53059c = z10;
        if (this.f53059c) {
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized K b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.LinkedHashSet<K> r0 = r4.f53063h     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L41
            java.util.LinkedHashSet<K> r0 = r4.f53063h     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L43
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L41
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "PersistentConcurrentHashMap"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "instance created, filename = "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r4.f()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "getFirst returned key "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L43
            com.safedk.android.utils.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L43
        L3f:
            monitor-exit(r4)
            return r0
        L41:
            r0 = 0
            goto L3f
        L43:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.PersistentConcurrentHashMap.b():java.lang.Object");
    }

    public boolean c() {
        return this.f53059c;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
        g();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K k10, V v10) {
        if (keySet().contains(k10)) {
            super.remove(k10);
            if (this.f53063h != null) {
                this.f53063h.remove(k10);
            }
            Logger.d(f53057d, "put filename = " + f() + ", removed existing key " + k10);
        }
        super.put(k10, v10);
        e();
        if (this.f53063h != null) {
            this.f53063h.add(k10);
        }
        Logger.d(f53057d, "put filename = " + f() + ", added key " + k10);
        if (this.f53059c) {
            g();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void putAll(Map map) {
        Logger.v(f53057d, "putAll started");
        for (K k10 : map.keySet()) {
            put(k10, map.get(k10));
            if (this.f53063h != null) {
                this.f53063h.add(k10);
            }
        }
        if (this.f53059c) {
            g();
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        V v10;
        if (obj == null) {
            Logger.d(f53057d, "remove filename = " + f() + ", key is null, skipping");
            v10 = null;
        } else {
            v10 = (V) super.remove(obj);
            if (this.f53063h != null) {
                this.f53063h.remove(obj);
            }
            Logger.v(f53057d, "remove filename=" + f() + ", removed key " + obj);
            if (this.f53059c) {
                g();
            }
        }
        return v10;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object obj, Object obj2) {
        V vRemove;
        vRemove = remove(obj);
        if (this.f53063h != null) {
            this.f53063h.remove(obj);
        }
        Logger.d(f53057d, "remove filename = " + f() + ", removed key " + vRemove);
        return vRemove != null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized V replace(K k10, V v10) {
        V v11;
        v11 = (V) super.replace(k10, v10);
        Logger.d(f53057d, "replace filename = " + f() + ", replace key " + k10.toString());
        if (this.f53059c) {
            g();
        }
        return v11;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean replace(K k10, V v10, V v11) {
        boolean zReplace;
        zReplace = super.replace(k10, v10, v11);
        Logger.d(f53057d, "replace filename = " + f() + ", replace key " + k10.toString());
        if (this.f53059c) {
            g();
        }
        return zReplace;
    }
}
