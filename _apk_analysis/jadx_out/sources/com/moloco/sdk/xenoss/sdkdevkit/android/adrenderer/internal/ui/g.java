package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.annotation.SuppressLint;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    public static final class a implements sn.s<BoxScope, sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, go.u<? extends i.a>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f48927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.l<String, bn.r> f48929d;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g$a$a, reason: collision with other inner class name */
        public static final class C0640a implements sn.q<Modifier, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Modifier f48930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f48931c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ sn.l<String, bn.r> f48932d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0640a(Modifier modifier, String str, sn.l<? super String, bn.r> lVar) {
                this.f48930b = modifier;
                this.f48931c = str;
                this.f48932d = lVar;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Modifier modifier, Composer composer, int i10) {
                tn.p.k(modifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(modifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1901554514, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous>.<anonymous>.<anonymous> (AdBadge.kt:89)");
                }
                g.d(this.f48930b.then(modifier), this.f48931c, this.f48932d, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(Modifier modifier, Composer composer, Integer num) {
                a(modifier, composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        public static final class b implements sn.q<Modifier, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Modifier f48933b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f48934c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ sn.l<String, bn.r> f48935d;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Modifier modifier, String str, sn.l<? super String, bn.r> lVar) {
                this.f48933b = modifier;
                this.f48934c = str;
                this.f48935d = lVar;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Modifier modifier, Composer composer, int i10) {
                tn.p.k(modifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(modifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1149096507, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous>.<anonymous>.<anonymous> (AdBadge.kt:101)");
                }
                g.d(this.f48933b.then(modifier), this.f48934c, this.f48935d, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(Modifier modifier, Composer composer, Integer num) {
                a(modifier, composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, String str, sn.l<? super String, bn.r> lVar) {
            this.f48927b = modifier;
            this.f48928c = str;
            this.f48929d = lVar;
        }

        public static final i.a a(State<? extends i.a> state) {
            return state.getValue();
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void b(BoxScope boxScope, sn.l<? super a.AbstractC0696a.c, bn.r> lVar, go.u<? extends i.a> uVar, Composer composer, int i10) {
            tn.p.k(boxScope, "<this>");
            tn.p.k(lVar, "onButtonRendered");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(781429248, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous> (AdBadge.kt:81)");
            }
            if (uVar != null) {
                Modifier modifier = this.f48927b;
                String str = this.f48928c;
                sn.l<String, bn.r> lVar2 = this.f48929d;
                i.a aVarA = a(SnapshotStateKt.collectAsState(uVar, null, composer, 0, 1));
                if (aVarA instanceof i.a.c) {
                    composer.startReplaceableGroup(-784868645);
                    s0.e(null, a.AbstractC0696a.c.EnumC0698a.f50951i, lVar, ComposableLambdaKt.composableLambda(composer, 1901554514, true, new C0640a(modifier, str, lVar2)), composer, ((i10 << 3) & 896) | 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarA instanceof i.a.C0665a) {
                    composer.startReplaceableGroup(-784421253);
                    s0.e(null, a.AbstractC0696a.c.EnumC0698a.f50951i, lVar, ComposableLambdaKt.composableLambda(composer, 1149096507, true, new b(modifier, str, lVar2)), composer, ((i10 << 3) & 896) | 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarA instanceof i.a.b) {
                    composer.startReplaceableGroup(-783991872);
                    composer.endReplaceableGroup();
                } else if (aVarA instanceof i.a.d) {
                    composer.startReplaceableGroup(-783934336);
                    composer.endReplaceableGroup();
                } else {
                    if (aVarA != null) {
                        composer.startReplaceableGroup(-1687887796);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-783899616);
                    composer.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.s
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, sn.l<? super a.AbstractC0696a.c, ? extends bn.r> lVar, go.u<? extends i.a> uVar, Composer composer, Integer num) {
            b(boxScope, lVar, uVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final class b implements sn.r<BoxScope, sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f48936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sn.l<String, bn.r> f48938d;

        public static final class a implements sn.q<Modifier, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Modifier f48939b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f48940c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ sn.l<String, bn.r> f48941d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Modifier modifier, String str, sn.l<? super String, bn.r> lVar) {
                this.f48939b = modifier;
                this.f48940c = str;
                this.f48941d = lVar;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Modifier modifier, Composer composer, int i10) {
                tn.p.k(modifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(modifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(592042825, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous>.<anonymous> (AdBadge.kt:136)");
                }
                g.d(this.f48939b.then(modifier), this.f48940c, this.f48941d, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(Modifier modifier, Composer composer, Integer num) {
                a(modifier, composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, String str, sn.l<? super String, bn.r> lVar) {
            this.f48936b = modifier;
            this.f48937c = str;
            this.f48938d = lVar;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(BoxScope boxScope, sn.l<? super a.AbstractC0696a.c, bn.r> lVar, Composer composer, int i10) {
            tn.p.k(boxScope, "<this>");
            tn.p.k(lVar, "onButtonRendered");
            if ((i10 & 48) == 0) {
                i10 |= composer.changed(lVar) ? 32 : 16;
            }
            if ((i10 & 145) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652534615, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous> (AdBadge.kt:132)");
            }
            s0.e(null, a.AbstractC0696a.c.EnumC0698a.f50951i, lVar, ComposableLambdaKt.composableLambda(composer, 592042825, true, new a(this.f48936b, this.f48937c, this.f48938d)), composer, ((i10 << 3) & 896) | 3120, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.r
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, sn.l<? super a.AbstractC0696a.c, ? extends bn.r> lVar, Composer composer, Integer num) {
            a(boxScope, lVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final bn.r a(Modifier modifier, String str, sn.l lVar, int i10, int i11, Composer composer, int i12) {
        d(modifier, str, lVar, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    public static final bn.r b(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
        return bn.r.f5635a;
    }

    public static final bn.r c(sn.l lVar, String str) {
        lVar.invoke(str);
        return bn.r.f5635a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@Nullable Modifier modifier, @NotNull final String str, @NotNull final sn.l<? super String, bn.r> lVar, @Nullable Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Modifier modifier3;
        tn.p.k(str, "clickUrl");
        tn.p.k(lVar, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1037954372);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(lVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037954372, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadge (AdBadge.kt:43)");
            }
            final String str2 = "Ad Badge";
            composerStartRestartGroup.startReplaceableGroup(-363689698);
            boolean zChanged = composerStartRestartGroup.changed("Ad Badge");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return g.b(str2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM444requiredSize3ABfNKs = SizeKt.m444requiredSize3ABfNKs(SemanticsModifierKt.semantics$default(modifier3, false, (sn.l) objRememberedValue, 1, null), Dp.m3826constructorimpl(12));
            composerStartRestartGroup.startReplaceableGroup(-363682862);
            boolean zChanged2 = composerStartRestartGroup.changed(lVar) | composerStartRestartGroup.changed(str);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d
                    @Override // sn.a
                    public final Object invoke() {
                        return g.c(lVar, str);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            IconKt.m1064Iconww6aTOc(PainterResources_androidKt.painterResource(R$drawable.info_badge, composerStartRestartGroup, 0), "Ad Badge", ClickableKt.m183clickableXHw0xAI$default(modifierM444requiredSize3ABfNKs, false, null, null, (sn.a) objRememberedValue2, 7, null), Color.INSTANCE.m1655getUnspecified0d7_KjU(), composerStartRestartGroup, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return g.a(modifier4, str, lVar, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final bn.r e(w0 w0Var, String str, String str2) {
        tn.p.k(str2, "it");
        w0Var.a(str);
        return bn.r.f5635a;
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @NotNull
    public static final sn.s<BoxScope, sn.l<? super a.AbstractC0696a.c, bn.r>, go.u<? extends i.a>, Composer, Integer, bn.r> f(@Nullable Modifier modifier, @Nullable final String str, @Nullable final w0 w0Var, @Nullable sn.l<? super String, bn.r> lVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1665380566);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            str = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";
        }
        if ((i11 & 4) != 0) {
            w0Var = b.h.f47664a.f();
        }
        if ((i11 & 8) != 0) {
            composer.startReplaceableGroup(-819746537);
            boolean zChanged = composer.changed(w0Var) | composer.changed(str);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return g.e(w0Var, str, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (sn.l) objRememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665380566, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge (AdBadge.kt:80)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 781429248, true, new a(modifier, str, lVar));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final bn.r g(w0 w0Var, String str, String str2) {
        tn.p.k(str2, "it");
        w0Var.a(str);
        return bn.r.f5635a;
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @NotNull
    public static final sn.r<BoxScope, sn.l<? super a.AbstractC0696a.c, bn.r>, Composer, Integer, bn.r> h(@Nullable Modifier modifier, @Nullable final String str, @Nullable final w0 w0Var, @Nullable sn.l<? super String, bn.r> lVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1806921710);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            str = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";
        }
        if ((i11 & 4) != 0) {
            w0Var = b.h.f47664a.f();
        }
        if ((i11 & 8) != 0) {
            composer.startReplaceableGroup(-763782202);
            boolean zChanged = composer.changed(w0Var) | composer.changed(str);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sn.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return g.g(w0Var, str, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (sn.l) objRememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1806921710, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge (AdBadge.kt:131)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -652534615, true, new b(modifier, str, lVar));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
