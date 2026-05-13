package com.mgs.carparking.shorttk;

import java.util.List;

/* JADX INFO: compiled from: FormatData.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<C0538a> f44528b;

    /* JADX INFO: renamed from: com.mgs.carparking.shorttk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FormatData.java */
    public static class C0538a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f44531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LinkType f44532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f44533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f44534f;

        public C0538a(int i10, int i11, String str, LinkType linkType) {
            this.f44529a = i10;
            this.f44530b = i11;
            this.f44531c = str;
            this.f44532d = linkType;
        }

        public C0538a(int i10, int i11, String str, String str2, LinkType linkType) {
            this.f44529a = i10;
            this.f44530b = i11;
            this.f44533e = str;
            this.f44534f = str2;
            this.f44532d = linkType;
        }

        public int a() {
            return this.f44530b;
        }

        public String b() {
            return this.f44533e;
        }

        public String c() {
            return this.f44534f;
        }

        public int d() {
            return this.f44529a;
        }

        public String e() {
            return this.f44531c;
        }

        public LinkType getType() {
            return this.f44532d;
        }
    }

    public String a() {
        return this.f44527a;
    }

    public List<C0538a> b() {
        return this.f44528b;
    }

    public void c(String str) {
        this.f44527a = str;
    }

    public void d(List<C0538a> list) {
        this.f44528b = list;
    }
}
