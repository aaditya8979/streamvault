package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.TextUnit;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    public static final class a implements sn.q<z, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f49266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f49267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f49268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f49269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f49270f;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y$a$a, reason: collision with other inner class name */
        public static final class C0649a implements sn.q<RowScope, Composer, Integer, bn.r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f49271b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f49272c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TextStyle f49273d;

            public C0649a(z zVar, long j10, TextStyle textStyle) {
                this.f49271b = zVar;
                this.f49272c = j10;
                this.f49273d = textStyle;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(RowScope rowScope, Composer composer, int i10) {
                tn.p.k(rowScope, "$this$TextButton");
                if ((i10 & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(412998526, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous>.<anonymous> (CountdownButton.kt:87)");
                }
                TextKt.m1234TextfLXpl1I(((z.c) this.f49271b).a(), null, 0L, this.f49272c, null, null, null, 0L, null, TextAlign.m3727boximpl(TextAlign.INSTANCE.m3734getCentere0LSkKk()), 0L, 0, false, 1, null, this.f49273d, composer, 0, 3072, 24054);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ bn.r invoke(RowScope rowScope, Composer composer, Integer num) {
                a(rowScope, composer, num.intValue());
                return bn.r.f5635a;
            }
        }

        public a(sn.a<bn.r> aVar, boolean z10, long j10, long j11, long j12) {
            this.f49266b = aVar;
            this.f49267c = z10;
            this.f49268d = j10;
            this.f49269e = j11;
            this.f49270f = j12;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(z zVar, Composer composer, int i10) {
            int i11;
            tn.p.k(zVar, "buttonPart");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.changed(zVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052010049, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous> (CountdownButton.kt:59)");
            }
            TextStyle h62 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH6();
            if (zVar instanceof z.a) {
                composer.startReplaceableGroup(1000266506);
                composer.endReplaceableGroup();
            } else if (zVar instanceof z.b) {
                composer.startReplaceableGroup(1000608622);
                z.b bVar = (z.b) zVar;
                f0.b(bVar.e(), this.f49266b, null, this.f49267c, bVar.c(), this.f49268d, this.f49269e, bVar.d(), bVar.b(), bVar.a(), composer, 0, 4);
                composer.endReplaceableGroup();
            } else if (zVar instanceof z.c) {
                composer.startReplaceableGroup(-1491723097);
                sn.a<bn.r> aVar = this.f49266b;
                boolean z10 = this.f49267c;
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                long j10 = this.f49268d;
                ButtonKt.TextButton(aVar, null, z10, null, null, null, null, buttonDefaults.m926textButtonColorsRGew2ao(0L, j10, j10, composer, ButtonDefaults.$stable << 9, 1), null, ComposableLambdaKt.composableLambda(composer, 412998526, true, new C0649a(zVar, this.f49270f, h62)), composer, 805306368, 378);
                composer.endReplaceableGroup();
            } else {
                if (!(zVar instanceof z.d)) {
                    composer.startReplaceableGroup(-1491754012);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1001871283);
                z.d dVar = (z.d) zVar;
                long jD = TextUnit.m4004equalsimpl0(dVar.d(), TextUnit.INSTANCE.m4018getUnspecifiedXSAIIZE()) ? this.f49270f : dVar.d();
                o0.b(dVar.h(), dVar.g(), dVar.c(), dVar.f(), dVar.b(), dVar.a(), DpKt.m3848DpSizeYgX7TsA(Dp.m3826constructorimpl(120), Dp.m3826constructorimpl(20)), dVar.e(), dVar.i(), dVar.j(), jD, this.f49266b, composer, 1572864, 0, 0);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ bn.r invoke(z zVar, Composer composer, Integer num) {
            a(zVar, composer, num.intValue());
            return bn.r.f5635a;
        }
    }

    public static final bn.r a(z zVar, Modifier modifier, sn.a aVar, boolean z10, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.k kVar, sn.a aVar2, int i10, int i11, Composer composer, int i12) {
        b(zVar, modifier, aVar, z10, j10, j11, j12, kVar, aVar2, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r27, final boolean r28, long r29, long r31, long r33, @org.jetbrains.annotations.Nullable final com.moloco.sdk.internal.ortb.model.k r35, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z, androidx.compose.ui.Modifier, sn.a, boolean, long, long, long, com.moloco.sdk.internal.ortb.model.k, sn.a, androidx.compose.runtime.Composer, int, int):void");
    }
}
