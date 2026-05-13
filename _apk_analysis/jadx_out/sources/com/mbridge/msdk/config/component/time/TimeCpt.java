package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, Object> f36395h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, Object> f36396i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f36397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f36398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f36400m;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36401a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f36402b;

        public a(boolean z10) {
            this.f36402b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            int i10 = this.f36401a;
            this.f36401a = i10 + 1;
            map.put("triggered_count", Integer.valueOf(i10));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", map));
            if (this.f36402b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f36395h.get(timeCpt2.f36397j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f36398k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get("componentConfig");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("name");
                if (obj2 instanceof String) {
                    return this.f36397j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get("name");
        if (obj != null) {
            this.f36397j = String.valueOf(obj);
        }
        Object obj2 = map.get("duration");
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f36398k = ((long) Integer.parseInt(strValueOf)) * 1000;
            }
        }
        Object obj3 = map.get("repeat");
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.f36399l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get("action");
        if (obj4 != null) {
            this.f36400m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        super.d();
        if (this.f36395h.containsKey(this.f36397j)) {
            handler = (Handler) this.f36395h.get(this.f36397j);
        } else {
            handler = new Handler();
            this.f36395h.put(this.f36397j, handler);
        }
        if (this.f36396i.containsKey(this.f36397j)) {
            aVar = (Runnable) this.f36396i.get(this.f36397j);
        } else {
            aVar = new a(this.f36399l == 1);
            this.f36396i.put(this.f36397j, aVar);
        }
        if (handler == null || aVar == null) {
            return;
        }
        String str = this.f36400m;
        str.hashCode();
        switch (str) {
            case "resume":
            case "start":
                handler.postDelayed(aVar, this.f36398k);
                break;
            case "stop":
                handler.removeCallbacks(aVar);
                this.f36395h.remove(this.f36397j);
                break;
            case "pause":
                handler.removeCallbacks(aVar);
                break;
        }
    }
}
