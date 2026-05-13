package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers;

import android.annotation.SuppressLint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import bn.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    @SuppressLint({"ModifierFactoryExtensionFunction"})
    @NotNull
    public static final Modifier a(@NotNull Modifier modifier, @NotNull final a.AbstractC0696a.c cVar, @NotNull final l<? super a.AbstractC0696a.c, r> lVar) {
        p.k(modifier, "modifier");
        p.k(cVar, "savedStateButton");
        p.k(lVar, "updateButtonState");
        return OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a
            @Override // sn.l
            public final Object invoke(Object obj) {
                return b.b(cVar, lVar, (LayoutCoordinates) obj);
            }
        });
    }

    public static final r b(a.AbstractC0696a.c cVar, l lVar, LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, "it");
        c cVar2 = c.f49253a;
        a.AbstractC0696a.c cVarB = cVar2.b(layoutCoordinates, cVar.c());
        if (cVar2.e(cVarB) && !p.f(cVarB, cVar)) {
            lVar.invoke(cVarB);
        }
        return r.f5635a;
    }
}
