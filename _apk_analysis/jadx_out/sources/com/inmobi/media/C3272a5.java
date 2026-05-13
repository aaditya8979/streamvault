package com.inmobi.media;

import android.net.Network;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3272a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Network f26737a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f26738b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f26739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f26740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f26741e = new AtomicBoolean(false);

    public static AdConfig.CustomNetworkValidation a() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f26611a.a(AdConfig.class)).getCustomNwValidation();
    }
}
