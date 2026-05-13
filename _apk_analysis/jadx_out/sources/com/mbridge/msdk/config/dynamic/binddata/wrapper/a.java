package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: ObservableMap.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<b<String>>> f36664a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f36665b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(String str) {
        return new CopyOnWriteArrayList();
    }

    private void a(final String str, final Object obj, String str2) {
        List<b<String>> list;
        if (this.f36664a.containsKey(str) && (list = this.f36664a.get(str)) != null) {
            for (final b<String> bVar : list) {
                if (bVar instanceof c) {
                    View viewA = ((c) bVar).a();
                    if (viewA == null) {
                        bVar.a(str, obj);
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
                        bVar.a(str, obj);
                    } else {
                        viewA.post(new Runnable() { // from class: jb.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                bVar.a(str, obj);
                            }
                        });
                    }
                } else {
                    bVar.a(str, obj);
                }
            }
        }
    }

    public Integer a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.f36665b.put(str, obj);
            a(str, obj, str);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", e10.getMessage(), e10);
            return 0;
        }
    }

    public Integer a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.f36665b.put(str2, obj);
            a(str, obj, str2);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to notify map observers: " + e10.getMessage(), e10);
            return 0;
        }
    }

    @NonNull
    public Set<Map.Entry<String, Object>> a() {
        return this.f36665b.entrySet();
    }

    public void a(String str, b<String> bVar) {
        try {
            this.f36664a.computeIfAbsent(str, new Function() { // from class: jb.b
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return com.mbridge.msdk.config.dynamic.binddata.wrapper.a.a((String) obj);
                }
            }).add(bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to add map observer: " + e10.getMessage(), e10);
        }
    }

    public void a(@NonNull Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public boolean a(@Nullable Object obj) {
        return this.f36665b.containsKey(obj);
    }

    @Nullable
    public Object b(@Nullable Object obj) {
        return this.f36665b.get(obj);
    }

    public Map<String, Object> b() {
        return this.f36665b;
    }

    public void b(String str, b<String> bVar) {
        try {
            a(str, bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to pre-register map observer: " + e10.getMessage(), e10);
        }
    }

    public void b(Map<String, List<b<String>>> map) {
        this.f36664a.clear();
        this.f36664a.putAll(map);
    }

    @Nullable
    public Object c(@Nullable Object obj) {
        return this.f36665b.remove(obj);
    }

    public Map<String, List<b<String>>> c() {
        return this.f36664a;
    }

    public boolean d() {
        return this.f36665b.isEmpty();
    }

    public int e() {
        return this.f36665b.size();
    }

    @NonNull
    public String toString() {
        return this.f36665b.toString();
    }
}
