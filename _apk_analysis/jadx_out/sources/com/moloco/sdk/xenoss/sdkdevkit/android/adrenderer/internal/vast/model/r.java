package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final t f49921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final e f49922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Long f49923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<s> f49924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<y> f49925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final a f49926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<n> f49927g;

    public r(@Nullable t tVar, @Nullable e eVar, @Nullable Long l10, @NotNull List<s> list, @NotNull List<y> list2, @Nullable a aVar, @NotNull List<n> list3) {
        tn.p.k(list, "mediaFiles");
        tn.p.k(list2, "trackingList");
        tn.p.k(list3, "icons");
        this.f49921a = tVar;
        this.f49922b = eVar;
        this.f49923c = l10;
        this.f49924d = list;
        this.f49925e = list2;
        this.f49926f = aVar;
        this.f49927g = list3;
    }

    @Nullable
    public final Long a() {
        return this.f49923c;
    }

    @NotNull
    public final List<n> b() {
        return this.f49927g;
    }

    @NotNull
    public final List<s> c() {
        return this.f49924d;
    }

    @Nullable
    public final t d() {
        return this.f49921a;
    }

    @NotNull
    public final List<y> e() {
        return this.f49925e;
    }

    @Nullable
    public final a f() {
        return this.f49926f;
    }
}
