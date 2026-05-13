package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private J7 f29594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f29596f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29597a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private J7 f29600d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29598b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f29599c = "POST";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f29601e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ArrayList<Pair<String, String>> f29602f = new ArrayList<>();

        public a(String str) {
            this.f29597a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f29597a = str;
        }

        public a a(Pair<String, String> pair) {
            this.f29602f.add(pair);
            return this;
        }

        public a a(J7 j72) {
            this.f29600d = j72;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f29602f.addAll(list);
            return this;
        }

        public a a(boolean z10) {
            this.f29601e = z10;
            return this;
        }

        public I5 a() {
            return new I5(this);
        }

        public a b() {
            this.f29599c = "GET";
            return this;
        }

        public a b(boolean z10) {
            this.f29598b = z10;
            return this;
        }

        public a c() {
            this.f29599c = "POST";
            return this;
        }
    }

    public I5(a aVar) {
        this.f29595e = false;
        this.f29591a = aVar.f29597a;
        this.f29592b = aVar.f29598b;
        this.f29593c = aVar.f29599c;
        this.f29594d = aVar.f29600d;
        this.f29595e = aVar.f29601e;
        if (aVar.f29602f != null) {
            this.f29596f = new ArrayList<>(aVar.f29602f);
        }
    }

    public boolean a() {
        return this.f29592b;
    }

    public String b() {
        return this.f29591a;
    }

    public J7 c() {
        return this.f29594d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f29596f);
    }

    public String e() {
        return this.f29593c;
    }

    public boolean f() {
        return this.f29595e;
    }
}
