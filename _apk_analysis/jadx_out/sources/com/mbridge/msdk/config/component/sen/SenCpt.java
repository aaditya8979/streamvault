package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static b f36337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, a> f36338l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f36340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36341j;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }

    private int g() {
        String str = this.f36340i;
        str.hashCode();
        switch (str) {
            case "magnetic":
                return 2;
            case "rotation":
                return 11;
            case "gyroscope":
                return 4;
            case "accelerometer":
                return 1;
            default:
                return -1;
        }
    }

    private void h() {
        if (f36337k == null) {
            f36337k = new b();
        }
        if (f36338l == null) {
            f36338l = new HashMap();
        }
        a aVar = new a() { // from class: com.mbridge.msdk.config.component.sen.c
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                this.f36346a.c(bVar);
            }
        };
        f36338l.put(this.f36340i, aVar);
        f36337k.a(aVar);
        f36337k.a(g(), this.f36340i, this.f36341j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                key.hashCode();
                switch (key) {
                    case "action":
                        this.f36339h = String.valueOf(entry.getValue());
                        break;
                    case "frequency":
                        double d10 = Double.parseDouble(String.valueOf(entry.getValue()));
                        if (d10 > 0.0d) {
                            this.f36341j = (int) (d10 * 1000.0d * 1000.0d);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "sensor_type":
                        this.f36340i = String.valueOf(entry.getValue());
                        break;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.f36339h.equals("start")) {
            h();
        }
        if (!this.f36339h.equals("end") || f36337k == null || (map = f36338l) == null) {
            return;
        }
        f36337k.b(map.get(this.f36340i));
        f36338l.remove(this.f36340i);
        if (f36338l.isEmpty()) {
            f36337k.a();
            f36337k = null;
        }
    }
}
