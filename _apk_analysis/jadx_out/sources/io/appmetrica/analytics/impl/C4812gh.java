package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4812gh extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f66829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f66833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f66834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f66835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f66836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f66837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f66838j;

    public C4812gh(@NonNull C5028p4 c5028p4) {
        this(c5028p4.f67490a, c5028p4.f67491b, c5028p4.f67493d, c5028p4.f67494e, c5028p4.f67495f, c5028p4.f67496g, c5028p4.f67497h, c5028p4.f67498i, c5028p4.f67499j, c5028p4.f67500k);
    }

    public C4812gh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f66829a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f66830b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f66831c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f66832d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f66833e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f66834f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f66835g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f66836h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f66837i = map;
        this.f66838j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    public static C4812gh a() {
        return new C4812gh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(@NonNull C5028p4 c5028p4) {
        Map<String, String> map;
        String str;
        Boolean bool = c5028p4.f67491b;
        if (bool != null && this.f66830b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c5028p4.f67493d;
        if (bool2 != null && this.f66831c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c5028p4.f67494e;
        if (num != null && this.f66832d != num.intValue()) {
            return false;
        }
        Integer num2 = c5028p4.f67495f;
        if (num2 != null && this.f66833e != num2.intValue()) {
            return false;
        }
        Integer num3 = c5028p4.f67496g;
        if (num3 != null && this.f66834f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c5028p4.f67497h;
        if (bool3 != null && this.f66835g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c5028p4.f67498i;
        if (bool4 != null && this.f66836h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c5028p4.f67490a;
        if (str2 != null && ((str = this.f66829a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c5028p4.f67499j;
        if (map2 != null && ((map = this.f66837i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c5028p4.f67500k;
        return num4 == null || this.f66838j == num4.intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4812gh mergeFrom(@NonNull C5028p4 c5028p4) {
        return new C4812gh((String) WrapUtils.getOrDefaultNullable(c5028p4.f67490a, this.f66829a), (Boolean) WrapUtils.getOrDefaultNullable(c5028p4.f67491b, Boolean.valueOf(this.f66830b)), (Boolean) WrapUtils.getOrDefaultNullable(c5028p4.f67493d, Boolean.valueOf(this.f66831c)), (Integer) WrapUtils.getOrDefaultNullable(c5028p4.f67494e, Integer.valueOf(this.f66832d)), (Integer) WrapUtils.getOrDefaultNullable(c5028p4.f67495f, Integer.valueOf(this.f66833e)), (Integer) WrapUtils.getOrDefaultNullable(c5028p4.f67496g, Integer.valueOf(this.f66834f)), (Boolean) WrapUtils.getOrDefaultNullable(c5028p4.f67497h, Boolean.valueOf(this.f66835g)), (Boolean) WrapUtils.getOrDefaultNullable(c5028p4.f67498i, Boolean.valueOf(this.f66836h)), (Map) WrapUtils.getOrDefaultNullable(c5028p4.f67499j, this.f66837i), (Integer) WrapUtils.getOrDefaultNullable(c5028p4.f67500k, Integer.valueOf(this.f66838j)));
    }
}
