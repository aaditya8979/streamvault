package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MBPreferenceChangeEventPublisher.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f36368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f36369b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.status.a> f36370c = new ArrayList<>(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f36371d = new a();

    /* JADX INFO: compiled from: MBPreferenceChangeEventPublisher.java */
    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f36368a == null || !d.this.f36368a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("AppPreferencesChanged");
            HashMap map = new HashMap();
            try {
                Object obj = d.this.f36368a.getAll().get(str);
                map.put("Key", str);
                map.put("Value", obj);
            } catch (Exception unused) {
                map.put("Key", str);
                map.put("Value", d.this.f36368a.getString(str, ""));
            }
            if (d.this.f36369b.isEmpty()) {
                bVar.a(map);
                d.this.a(bVar);
            } else if (d.this.f36369b.contains(str)) {
                bVar.a(map);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        Context applicationContext = contextD.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f36368a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f36371d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<com.mbridge.msdk.config.component.status.a> it = this.f36370c.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f36370c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f36369b.addAll(list);
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f36370c.remove(aVar);
        }
    }
}
