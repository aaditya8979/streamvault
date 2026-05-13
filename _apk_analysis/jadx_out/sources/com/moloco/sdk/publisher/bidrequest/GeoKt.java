package com.moloco.sdk.publisher.bidrequest;

import com.moloco.sdk.Init$SDKInitResponse;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public final class GeoKt {
    @NotNull
    public static final Geo toGeo(@NotNull Init$SDKInitResponse.h hVar) {
        p.k(hVar, "<this>");
        return new Geo(hVar.b(), hVar.d(), hVar.c(), hVar.g(), Float.valueOf(hVar.e()), Float.valueOf(hVar.f()));
    }
}
