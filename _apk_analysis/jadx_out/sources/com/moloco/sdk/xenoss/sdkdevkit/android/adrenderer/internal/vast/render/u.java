package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50678a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f49887a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f49888b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50678a = iArr;
        }
    }

    public static final void a(@NotNull i0 i0Var, @NotNull a0 a0Var) {
        String strA;
        tn.p.k(i0Var, "<this>");
        tn.p.k(a0Var, "vastResource");
        if (a0Var instanceof a0.c) {
            a0.c cVar = (a0.c) a0Var;
            int i10 = a.f50678a[cVar.a().a().ordinal()];
            if (i10 == 1) {
                strA = "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + cVar.a().b() + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strA = "<script src=\"" + cVar.a().b() + "\"></script>";
            }
        } else if (a0Var instanceof a0.a) {
            strA = ((a0.a) a0Var).a().a();
        } else {
            if (!(a0Var instanceof a0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=100% height=100% src=\"" + ((a0.b) a0Var).a().a() + "\"></iframe>";
        }
        try {
            j0.a(i0Var, i0Var.getHtmlCssFixer().a(strA));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BaseWebView", e10.toString(), e10, false, 8, null);
        }
    }
}
