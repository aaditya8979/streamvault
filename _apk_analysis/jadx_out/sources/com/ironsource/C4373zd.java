package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C4373zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f34527a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f34528b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<String> f34529c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f34530d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f34529c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34529c.add(str);
    }

    public ArrayList<String> b() {
        return this.f34528b;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34528b.add(str);
    }

    public ArrayList<String> c() {
        return this.f34530d;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34530d.add(str);
    }

    public ArrayList<String> d() {
        return this.f34527a;
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34527a.add(str);
    }
}
