package com.yandex.mobile.ads.common;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class AdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSize f59112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f59114d;

    public AdInfo(@NotNull String str, @Nullable AdSize adSize, @Nullable String str2, @NotNull List<Creative> list) {
        this.f59111a = str;
        this.f59112b = adSize;
        this.f59113c = str2;
        this.f59114d = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(AdInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.common.AdInfo");
        AdInfo adInfo = (AdInfo) obj;
        return p.f(this.f59111a, adInfo.f59111a) && p.f(this.f59112b, adInfo.f59112b) && p.f(this.f59113c, adInfo.f59113c) && p.f(this.f59114d, adInfo.f59114d);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f59111a;
    }

    public int hashCode() {
        int iHashCode = this.f59111a.hashCode() * 31;
        AdSize adSize = this.f59112b;
        int iHashCode2 = (iHashCode + (adSize != null ? adSize.hashCode() : 0)) * 31;
        String str = this.f59113c;
        return this.f59114d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.f59111a;
        AdSize adSize = this.f59112b;
        String string = adSize != null ? adSize.toString() : null;
        if (string == null) {
            string = "";
        }
        String str2 = this.f59113c;
        return "AdSize (adUnitId: " + str + ", adSize: " + string + ", data: " + (str2 != null ? str2 : "") + ", creatives: " + this.f59114d.size() + ")";
    }
}
