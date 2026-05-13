package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes7.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f9696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpannedString f9698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpannedString f9699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9708m;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f9709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SpannedString f9711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SpannedString f9712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f9714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9715g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9716h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9717i = ViewCompat.MEASURED_STATE_MASK;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9718j = ViewCompat.MEASURED_STATE_MASK;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9719k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f9720l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f9721m;

        public b(c cVar) {
            this.f9709a = cVar;
        }

        public b a(int i10) {
            this.f9716h = i10;
            return this;
        }

        public b a(Context context) {
            this.f9716h = R.drawable.applovin_ic_disclosure_arrow;
            this.f9720l = m0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public b a(SpannedString spannedString) {
            this.f9712d = spannedString;
            return this;
        }

        public b a(String str) {
            this.f9714f = str;
            return this;
        }

        public b a(boolean z10) {
            this.f9710b = z10;
            return this;
        }

        public r2 a() {
            return new r2(this);
        }

        public b b(int i10) {
            this.f9720l = i10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f9711c = spannedString;
            return this;
        }

        public b b(String str) {
            this.f9713e = str;
            return this;
        }

        public b b(boolean z10) {
            this.f9721m = z10;
            return this;
        }

        public b c(int i10) {
            this.f9718j = i10;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(int i10) {
            this.f9717i = i10;
            return this;
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9729a;

        c(int i10) {
            this.f9729a = i10;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f9729a;
        }
    }

    private r2(b bVar) {
        this.f9702g = 0;
        this.f9703h = 0;
        this.f9704i = ViewCompat.MEASURED_STATE_MASK;
        this.f9705j = ViewCompat.MEASURED_STATE_MASK;
        this.f9706k = 0;
        this.f9707l = 0;
        this.f9696a = bVar.f9709a;
        this.f9697b = bVar.f9710b;
        this.f9698c = bVar.f9711c;
        this.f9699d = bVar.f9712d;
        this.f9700e = bVar.f9713e;
        this.f9701f = bVar.f9714f;
        this.f9702g = bVar.f9715g;
        this.f9703h = bVar.f9716h;
        this.f9704i = bVar.f9717i;
        this.f9705j = bVar.f9718j;
        this.f9706k = bVar.f9719k;
        this.f9707l = bVar.f9720l;
        this.f9708m = bVar.f9721m;
    }

    public r2(c cVar) {
        this.f9702g = 0;
        this.f9703h = 0;
        this.f9704i = ViewCompat.MEASURED_STATE_MASK;
        this.f9705j = ViewCompat.MEASURED_STATE_MASK;
        this.f9706k = 0;
        this.f9707l = 0;
        this.f9696a = cVar;
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f9701f;
    }

    public String c() {
        return this.f9700e;
    }

    public int d() {
        return this.f9703h;
    }

    public int e() {
        return this.f9707l;
    }

    public SpannedString f() {
        return this.f9699d;
    }

    public int g() {
        return this.f9705j;
    }

    public int h() {
        return this.f9702g;
    }

    public int i() {
        return this.f9706k;
    }

    public int j() {
        return this.f9696a.b();
    }

    public SpannedString k() {
        return this.f9698c;
    }

    public int l() {
        return this.f9704i;
    }

    public int m() {
        return this.f9696a.c();
    }

    public boolean o() {
        return this.f9697b;
    }

    public boolean p() {
        return this.f9708m;
    }
}
