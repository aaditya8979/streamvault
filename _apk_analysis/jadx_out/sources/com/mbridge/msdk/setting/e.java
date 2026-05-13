package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: MBDNSManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f39699b;

    /* JADX INFO: compiled from: MBDNSManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f39700a = new e();
    }

    private e() {
        this.f39698a = 6;
        this.f39699b = new HashMap<>();
    }

    public static e a() {
        return b.f39700a;
    }

    public int a(String str) {
        HashMap<String, f> map;
        f fVar;
        if (TextUtils.isEmpty(str) || (map = this.f39699b) == null || !map.containsKey(str) || (fVar = this.f39699b.get(str)) == null) {
            return 0;
        }
        int i10 = fVar.b() ? 1 : fVar.a() >= this.f39698a ? 2 : 0;
        fVar.a(false);
        return i10;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f39699b == null) {
                this.f39699b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f39699b.put(next, fVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
