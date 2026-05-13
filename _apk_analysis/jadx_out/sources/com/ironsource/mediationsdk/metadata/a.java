package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32676a = "do_not_sell";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f32677b = "is_child_directed";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f32678c = "is_deviceid_optout";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f32679d = "google_family_self_certified_sdks";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f32680e = "iiqf";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f32681f = "is_test_suite";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f32682g = "true";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f32683h = "false";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f32684i = "google_water_mark";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f32685j = "enable";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set<String> f32686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set<String> f32687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set<String> f32688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f32689n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f32677b, f32678c, f32681f, f32679d, f32680e));
        f32686k = hashSet;
        f32687l = new HashSet(Arrays.asList(f32678c, f32679d, f32681f, f32680e));
        HashSet hashSet2 = new HashSet(hashSet);
        f32688m = hashSet2;
        hashSet2.add(f32676a);
    }
}
