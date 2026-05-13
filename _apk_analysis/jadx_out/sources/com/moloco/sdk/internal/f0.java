package com.moloco.sdk.internal;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.R$string;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f46033a = ColorKt.Color(4278354171L);

    public static final class a implements sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, ? extends bn.r>, sn.a<? extends bn.r>, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f46034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f46035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f46036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f46037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f46038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f46039g;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.f0$a$a, reason: collision with other inner class name */
        public static final class C0556a implements sn.q<AnimatedVisibilityScope, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sn.l<a.AbstractC0696a.c, bn.r> f46040b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ State<i.a> f46041c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f46042d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f46043e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f46044f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f46045g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ sn.a<bn.r> f46046h;

            /* JADX INFO: renamed from: com.moloco.sdk.internal.f0$a$a$a, reason: collision with other inner class name */
            public static final class C0557a implements sn.q<Modifier, Composer, Integer, bn.r> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f46047b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f46048c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f46049d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f46050e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f46051f;

                public C0557a(String str, String str2, long j10, long j11, sn.a<bn.r> aVar) {
                    this.f46047b = str;
                    this.f46048c = str2;
                    this.f46049d = j10;
                    this.f46050e = j11;
                    this.f46051f = aVar;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void a(Modifier modifier, Composer composer, int i10) {
                    int i11;
                    tn.p.k(modifier, "it");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.changed(modifier) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1938502477, i11, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:72)");
                    }
                    f0.d(modifier, this.f46047b, this.f46048c, this.f46049d, this.f46050e, this.f46051f, composer, i11 & 14, 0);
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

            /* JADX INFO: renamed from: com.moloco.sdk.internal.f0$a$a$b */
            public static final class b implements sn.q<Modifier, Composer, Integer, bn.r> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f46052b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f46053c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f46054d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f46055e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ sn.a<bn.r> f46056f;

                public b(String str, String str2, long j10, long j11, sn.a<bn.r> aVar) {
                    this.f46052b = str;
                    this.f46053c = str2;
                    this.f46054d = j10;
                    this.f46055e = j11;
                    this.f46056f = aVar;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void a(Modifier modifier, Composer composer, int i10) {
                    int i11;
                    tn.p.k(modifier, "it");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.changed(modifier) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-868048676, i11, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:87)");
                    }
                    f0.d(modifier, this.f46052b, this.f46053c, this.f46054d, this.f46055e, this.f46056f, composer, i11 & 14, 0);
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
            public C0556a(sn.l<? super a.AbstractC0696a.c, bn.r> lVar, State<? extends i.a> state, String str, String str2, long j10, long j11, sn.a<bn.r> aVar) {
                this.f46040b = lVar;
                this.f46041c = state;
                this.f46042d = str;
                this.f46043e = str2;
                this.f46044f = j10;
                this.f46045g = j11;
                this.f46046h = aVar;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i10) {
                tn.p.k(animatedVisibilityScope, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-657845797, i10, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous> (MolocoVastCTA.kt:66)");
                }
                i.a aVarC = a.c(this.f46041c);
                if (aVarC instanceof i.a.C0665a) {
                    composer.startReplaceableGroup(-388830153);
                    s0.e(null, a.AbstractC0696a.c.EnumC0698a.f50949g, this.f46040b, ComposableLambdaKt.composableLambda(composer, -1938502477, true, new C0557a(this.f46042d, this.f46043e, this.f46044f, this.f46045g, this.f46046h)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.c) {
                    composer.startReplaceableGroup(-388268681);
                    s0.e(null, a.AbstractC0696a.c.EnumC0698a.f50949g, this.f46040b, ComposableLambdaKt.composableLambda(composer, -868048676, true, new b(this.f46042d, this.f46043e, this.f46044f, this.f46045g, this.f46046h)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.b) {
                    composer.startReplaceableGroup(-387725902);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.d) {
                    composer.startReplaceableGroup(-387668366);
                    composer.endReplaceableGroup();
                } else {
                    if (aVarC != null) {
                        composer.startReplaceableGroup(-843828347);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-387633677);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        public a(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j10, long j11) {
            this.f46034b = alignment;
            this.f46035c = paddingValues;
            this.f46036d = str;
            this.f46037e = str2;
            this.f46038f = j10;
            this.f46039g = j11;
        }

        public static final i.a c(State<? extends i.a> state) {
            return state.getValue();
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void b(BoxScope boxScope, boolean z10, go.u<? extends i.a> uVar, sn.l<? super a.AbstractC0696a.c, bn.r> lVar, sn.a<bn.r> aVar, Composer composer, int i10) {
            tn.p.k(boxScope, "<this>");
            tn.p.k(uVar, "currentAdPartFlow");
            tn.p.k(lVar, "onButtonRendered");
            tn.p.k(aVar, "onCTA");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-927135997, i10, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous> (MolocoVastCTA.kt:48)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z10, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f46034b)), this.f46035c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -657845797, true, new C0556a(lVar, SnapshotStateKt.collectAsState(uVar, null, composer, (i10 >> 6) & 14, 1), this.f46036d, this.f46037e, this.f46038f, this.f46039g, aVar)), composer, ((i10 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.u
        public /* bridge */ /* synthetic */ bn.r invoke(BoxScope boxScope, Boolean bool, go.u<? extends i.a> uVar, sn.l<? super a.AbstractC0696a.c, ? extends bn.r> lVar, sn.a<? extends bn.r> aVar, Composer composer, Integer num) {
            b(boxScope, bool.booleanValue(), uVar, lVar, aVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final long a() {
        return f46033a;
    }

    public static final bn.r b(Modifier modifier, String str, String str2, long j10, long j11, sn.a aVar, int i10, int i11, Composer composer, int i12) {
        d(modifier, str, str2, j10, j11, aVar, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    @Composable
    @NotNull
    public static final sn.u<BoxScope, Boolean, go.u<? extends i.a>, sn.l<? super a.AbstractC0696a.c, bn.r>, sn.a<bn.r>, Composer, Integer, bn.r> c(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, @Nullable String str, long j10, long j11, @Nullable String str2, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(959702933);
        Alignment bottomEnd = (i11 & 1) != 0 ? Alignment.INSTANCE.getBottomEnd() : alignment;
        PaddingValues paddingValuesM404PaddingValues0680j_4 = (i11 & 2) != 0 ? PaddingKt.m404PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        String strStringResource = (i11 & 4) != 0 ? StringResources_androidKt.stringResource(R$string.com_moloco_sdk_xenoss_player_learn_more, composer, 0) : str;
        long jM1656getWhite0d7_KjU = (i11 & 8) != 0 ? Color.INSTANCE.m1656getWhite0d7_KjU() : j10;
        long j12 = (i11 & 16) != 0 ? f46033a : j11;
        String str3 = (i11 & 32) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959702933, i10, -1, "com.moloco.sdk.internal.molocoCTAButton (MolocoVastCTA.kt:47)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -927135997, true, new a(bottomEnd, paddingValuesM404PaddingValues0680j_4, str3, strStringResource, jM1656getWhite0d7_KjU, j12));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0286  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(androidx.compose.ui.Modifier r34, java.lang.String r35, final java.lang.String r36, final long r37, final long r39, final sn.a<bn.r> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.f0.d(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, long, long, sn.a, androidx.compose.runtime.Composer, int, int):void");
    }
}
