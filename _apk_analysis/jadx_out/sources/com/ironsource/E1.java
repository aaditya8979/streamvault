package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class E1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29223d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29225f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashSet<String> f29221b = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29220a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29224e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f29226g = true;

    public int a() {
        return this.f29225f;
    }

    public void a(int i10) {
        this.f29225f = i10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29221b.add(str);
    }

    public void a(boolean z10) {
        this.f29220a = z10;
    }

    public HashSet<String> b() {
        return this.f29221b;
    }

    public void b(String str) {
        this.f29223d = str;
    }

    public void b(boolean z10) {
        this.f29226g = z10;
    }

    public String c() {
        return this.f29223d;
    }

    public void c(String str) {
        this.f29222c = str;
    }

    public void c(boolean z10) {
        this.f29224e = z10;
    }

    public String d() {
        return this.f29222c;
    }

    public boolean e() {
        return this.f29224e;
    }

    public boolean f() {
        return this.f29220a;
    }

    public boolean g() {
        return this.f29226g;
    }
}
