package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSize;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f49253a = new c();

    public final float a(int i10) {
        return i10 / Resources.getSystem().getDisplayMetrics().density;
    }

    @NotNull
    public final a.AbstractC0696a.c b(@NotNull LayoutCoordinates layoutCoordinates, @NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        p.k(layoutCoordinates, "<this>");
        p.k(enumC0698a, "buttonType");
        return new a.AbstractC0696a.c(enumC0698a, d(layoutCoordinates), f(layoutCoordinates));
    }

    @NotNull
    public final a.AbstractC0696a.f c(long j10) {
        return new a.AbstractC0696a.f(a((int) Offset.m1383getXimpl(j10)), a((int) Offset.m1384getYimpl(j10)));
    }

    @NotNull
    public final a.AbstractC0696a.f d(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, "<this>");
        return new a.AbstractC0696a.f(a((int) Offset.m1383getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))), a((int) Offset.m1384getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))));
    }

    public final boolean e(@NotNull a.AbstractC0696a.c cVar) {
        p.k(cVar, "<this>");
        return cVar.e().a() > 0.0f && cVar.e().b() > 0.0f;
    }

    @NotNull
    public final a.AbstractC0696a.g f(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, "<this>");
        return new a.AbstractC0696a.g(a(IntSize.m3986getWidthimpl(layoutCoordinates.mo3114getSizeYbymL2g())), a(IntSize.m3985getHeightimpl(layoutCoordinates.mo3114getSizeYbymL2g())));
    }
}
