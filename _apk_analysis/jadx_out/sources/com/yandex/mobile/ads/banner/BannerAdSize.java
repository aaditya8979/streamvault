package com.yandex.mobile.ads.banner;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import yads.a03;
import yads.nv0;
import yads.wi2;
import yads.zz2;

/* JADX INFO: loaded from: classes11.dex */
public final class BannerAdSize extends wi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59102a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a03 f59103b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final BannerAdSize fixedSize(@NotNull Context context, int i10, int i11) {
            return new BannerAdSize(new nv0(i10, i11, zz2.f97845c, null));
        }

        @NotNull
        public final BannerAdSize inlineSize(@NotNull Context context, int i10, int i11) {
            return new BannerAdSize(new nv0(i10, i11, zz2.f97846d, null));
        }
    }

    public BannerAdSize(@NotNull a03 a03Var) {
        this.f59103b = a03Var;
    }

    @NotNull
    public static final BannerAdSize fixedSize(@NotNull Context context, int i10, int i11) {
        return f59102a.fixedSize(context, i10, i11);
    }

    @NotNull
    public static final BannerAdSize inlineSize(@NotNull Context context, int i10, int i11) {
        return f59102a.inlineSize(context, i10, i11);
    }

    public final a03 a() {
        return this.f59103b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.f(BannerAdSize.class, obj.getClass())) {
            return false;
        }
        return p.f(this.f59103b, ((BannerAdSize) obj).f59103b);
    }

    public final int getHeight() {
        return this.f59103b.getHeight();
    }

    public final int getWidth() {
        return this.f59103b.getWidth();
    }

    public int hashCode() {
        return this.f59103b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f59103b.toString();
    }
}
