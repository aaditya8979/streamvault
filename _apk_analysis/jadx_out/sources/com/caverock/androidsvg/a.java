package com.caverock.androidsvg;

import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVG;

/* JADX INFO: compiled from: RenderOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CSSParser.n f14884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PreserveAspectRatio f14885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SVG.b f14887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SVG.b f14889f;

    public a() {
        this.f14884a = null;
        this.f14885b = null;
        this.f14886c = null;
        this.f14887d = null;
        this.f14888e = null;
        this.f14889f = null;
    }

    public a(a aVar) {
        this.f14884a = null;
        this.f14885b = null;
        this.f14886c = null;
        this.f14887d = null;
        this.f14888e = null;
        this.f14889f = null;
        if (aVar == null) {
            return;
        }
        this.f14884a = aVar.f14884a;
        this.f14885b = aVar.f14885b;
        this.f14887d = aVar.f14887d;
        this.f14888e = aVar.f14888e;
        this.f14889f = aVar.f14889f;
    }

    public a a(String str) {
        this.f14884a = new CSSParser(CSSParser.Source.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        CSSParser.n nVar = this.f14884a;
        return nVar != null && nVar.f() > 0;
    }

    public boolean c() {
        return this.f14885b != null;
    }

    public boolean d() {
        return this.f14886c != null;
    }

    public boolean e() {
        return this.f14888e != null;
    }

    public boolean f() {
        return this.f14887d != null;
    }

    public boolean g() {
        return this.f14889f != null;
    }

    public a h(float f10, float f11, float f12, float f13) {
        this.f14889f = new SVG.b(f10, f11, f12, f13);
        return this;
    }
}
