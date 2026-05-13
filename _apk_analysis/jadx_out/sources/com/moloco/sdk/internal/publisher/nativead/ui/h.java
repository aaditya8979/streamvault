package com.moloco.sdk.internal.publisher.nativead.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import bn.r;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import sn.u;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    @Composable
    @NotNull
    public static final u<BoxScope, Boolean, Boolean, p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, r>, l<? super Boolean, r>, Composer, Integer, r> a(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1062465295);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062465295, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.nativeVideoMuteButton (NativeVideoMuteButton.kt:11)");
        }
        u<BoxScope, Boolean, Boolean, p<? super a.AbstractC0696a.c, ? super a.AbstractC0696a.c.EnumC0698a, r>, l<? super Boolean, r>, Composer, Integer, r> uVarG = n.g(0L, 0L, null, 0L, Alignment.INSTANCE.getTopStart(), null, Color.INSTANCE.m1656getWhite0d7_KjU(), PainterResources_androidKt.painterResource(R$drawable.moloco_twotone_volume_off_24, composer, 0), PainterResources_androidKt.painterResource(R$drawable.moloco_twotone_volume_up_24, composer, 0), null, composer, 1597440, 559);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return uVarG;
    }
}
