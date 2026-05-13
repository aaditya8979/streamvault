package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4662am extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f66396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f66397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f66398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f66399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<String> f66400e;

    public C4662am() {
        this(null, null, null, false, null);
    }

    public C4662am(@NonNull I3 i32) {
        this(i32.a().c(), i32.a().d(), i32.a().a(), i32.a().h(), i32.a().b());
    }

    public C4662am(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, boolean z10, @Nullable List<String> list) {
        this.f66396a = str;
        this.f66397b = str2;
        this.f66398c = map;
        this.f66399d = z10;
        this.f66400e = list;
    }

    public final boolean a(@NonNull C4662am c4662am) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4662am mergeFrom(@NonNull C4662am c4662am) {
        return new C4662am((String) WrapUtils.getOrDefaultNullable(this.f66396a, c4662am.f66396a), (String) WrapUtils.getOrDefaultNullable(this.f66397b, c4662am.f66397b), (Map) WrapUtils.getOrDefaultNullable(this.f66398c, c4662am.f66398c), this.f66399d || c4662am.f66399d, c4662am.f66399d ? c4662am.f66400e : this.f66400e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f66396a + "', installReferrerSource='" + this.f66397b + "', clientClids=" + this.f66398c + ", hasNewCustomHosts=" + this.f66399d + ", newCustomHosts=" + this.f66400e + '}';
    }
}
