package com.mbridge.msdk.config.component.vc.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: compiled from: RenderViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36424f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public String a() {
        return this.f36419a;
    }

    public void a(int i10) {
        this.f36423e = i10;
    }

    public void a(String str) {
        this.f36419a = str;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get("action");
                if (obj != null) {
                    a(String.valueOf(obj));
                }
                Object obj2 = map.get("hide_status_bar");
                if (obj2 != null) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        b(Integer.valueOf(strValueOf).intValue());
                    }
                }
                Object obj3 = map.get("modal");
                if (obj3 != null) {
                    String strValueOf2 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        c(Integer.valueOf(strValueOf2).intValue());
                    }
                }
                Object obj4 = map.get("width");
                if (obj4 != null) {
                    String strValueOf3 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        e(Integer.valueOf(strValueOf3).intValue());
                    }
                }
                Object obj5 = map.get("height");
                if (obj5 != null) {
                    String strValueOf4 = String.valueOf(obj5);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        a(Integer.valueOf(strValueOf4).intValue());
                    }
                }
                Object obj6 = map.get("orientation");
                int iF = m0.F(c.n().d());
                if (obj6 == null) {
                    d(iF);
                    return;
                }
                String strValueOf5 = String.valueOf(obj6);
                if (TextUtils.isEmpty(strValueOf5) || !strValueOf5.equalsIgnoreCase("null")) {
                    d(iF);
                } else {
                    d(Integer.parseInt(strValueOf5));
                }
            } catch (Exception e10) {
                q0.b("RenderViewModel", e10.getMessage());
            }
        }
    }

    public int b() {
        return this.f36423e;
    }

    public void b(int i10) {
        this.f36420b = i10;
    }

    public int c() {
        return this.f36420b;
    }

    public void c(int i10) {
        this.f36421c = i10;
    }

    public int d() {
        return this.f36421c;
    }

    public void d(int i10) {
        this.f36424f = i10;
    }

    public int e() {
        return this.f36424f;
    }

    public void e(int i10) {
        this.f36422d = i10;
    }

    public int f() {
        return this.f36422d;
    }
}
