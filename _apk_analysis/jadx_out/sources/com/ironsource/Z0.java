package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public class Z0 extends C4042ge {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f30742h = "type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f30743i = "numOfAdUnits";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f30744j = "firstCampaignCredits";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f30745k = "totalNumberCredits";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f30746l = "productType";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30752g;

    public Z0(String str) {
        super(str);
        if (a(f30742h)) {
            k(d(f30742h));
        }
        if (a(f30743i)) {
            h(d(f30743i));
            a(true);
        } else {
            a(false);
        }
        if (a(f30744j)) {
            g(d(f30744j));
        }
        if (a(f30745k)) {
            j(d(f30745k));
        }
        if (a(f30746l)) {
            i(d(f30746l));
        }
    }

    private void a(boolean z10) {
        this.f30752g = z10;
    }

    public String b() {
        return this.f30750e;
    }

    public String c() {
        return this.f30749d;
    }

    public String d() {
        return this.f30748c;
    }

    public String e() {
        return this.f30751f;
    }

    public String f() {
        return this.f30747b;
    }

    public void g(String str) {
        this.f30750e = str;
    }

    public boolean g() {
        return this.f30752g;
    }

    public void h(String str) {
        this.f30749d = str;
    }

    public void i(String str) {
        this.f30748c = str;
    }

    public void j(String str) {
        this.f30751f = str;
    }

    public void k(String str) {
        this.f30747b = str;
    }
}
