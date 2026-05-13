package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f49859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f49860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final f f49861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<p> f49862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<String> f49863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<j> f49864f;

    public b(@NotNull String str, @Nullable Boolean bool, @Nullable f fVar, @NotNull List<p> list, @NotNull List<String> list2, @NotNull List<j> list3) {
        tn.p.k(str, "vastAdTagUrl");
        tn.p.k(list, "impressions");
        tn.p.k(list2, "errorUrls");
        tn.p.k(list3, "creatives");
        this.f49859a = str;
        this.f49860b = bool;
        this.f49861c = fVar;
        this.f49862d = list;
        this.f49863e = list2;
        this.f49864f = list3;
    }

    @NotNull
    public final List<j> a() {
        return this.f49864f;
    }

    @NotNull
    public final List<String> b() {
        return this.f49863e;
    }

    @Nullable
    public final Boolean c() {
        return this.f49860b;
    }

    @NotNull
    public final List<p> d() {
        return this.f49862d;
    }

    @NotNull
    public final String e() {
        return this.f49859a;
    }
}
