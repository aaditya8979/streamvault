package com.fyber.inneractive.sdk.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IFyberAdIdentifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClickListener f19475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f19482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Corner f19485k = Corner.BOTTOM_LEFT;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.a f19486l;

    public interface ClickListener {
        void a();
    }

    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public IFyberAdIdentifier(r rVar) {
        this.f19476b = 0;
        this.f19477c = 0;
        this.f19478d = 0;
        this.f19479e = 0;
        this.f19480f = 0;
        this.f19481g = null;
        this.f19482h = "";
        this.f19483i = "";
        this.f19484j = false;
        this.f19486l = com.fyber.inneractive.sdk.config.global.features.b.f16037e;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.b bVar = (com.fyber.inneractive.sdk.config.global.features.b) rVar.a(com.fyber.inneractive.sdk.config.global.features.b.class);
            Integer numA = bVar.a("ad_identifier_text_size_w");
            this.f19476b = numA != null ? numA.intValue() : 110;
            Integer numA2 = bVar.a("ad_identifier_text_size_h");
            this.f19477c = numA2 != null ? numA2.intValue() : 18;
            Integer numA3 = bVar.a("ad_identifier_image_size_w");
            this.f19478d = numA3 != null ? numA3.intValue() : 18;
            Integer numA4 = bVar.a("ad_identifier_image_size_h");
            this.f19479e = numA4 != null ? numA4.intValue() : 18;
            Integer numA5 = bVar.a("ad_identifier_text_size");
            this.f19480f = numA5 != null ? numA5.intValue() : 8;
            this.f19481g = bVar.a("ad_identifier_tint_color", "#75DCDCDC");
            this.f19486l = bVar.c();
            this.f19482h = bVar.a("ad_identifier_text", "Tap for more information");
            this.f19483i = bVar.a("ad_identifier_icon_url", null);
            this.f19484j = true;
        }
    }

    public abstract void a(ViewGroup viewGroup);
}
