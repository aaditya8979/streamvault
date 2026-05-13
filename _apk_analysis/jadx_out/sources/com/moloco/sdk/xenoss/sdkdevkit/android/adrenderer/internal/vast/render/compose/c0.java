package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import coil.compose.SingletonAsyncImageKt;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f50154a = Dp.m3826constructorimpl(4);

    public static final class a implements sn.q<RowScope, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f50155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f50156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f50157d;

        public a(String str, String str2, long j10) {
            this.f50155b = str;
            this.f50156c = str2;
            this.f50157d = j10;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(RowScope rowScope, Composer composer, int i10) {
            tn.p.k(rowScope, "$this$OutlinedButton");
            if ((i10 & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1553541117, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTA.<anonymous> (VastCTA.kt:38)");
            }
            String str = this.f50155b;
            composer.startReplaceableGroup(-1632172008);
            if (str != null) {
                String str2 = this.f50155b;
                Modifier.Companion companion = Modifier.INSTANCE;
                SingletonAsyncImageKt.a(str2, null, SizeKt.m452size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m661RoundedCornerShape0680j_4(c0.f50154a)), Dp.m3826constructorimpl(36)), null, null, null, null, 0.0f, null, 0, composer, 48, 1016);
                SpacerKt.Spacer(SizeKt.m457width3ABfNKs(companion, c0.f50154a), composer, 6);
                bn.r rVar = bn.r.f5635a;
            }
            composer.endReplaceableGroup();
            TextKt.m1234TextfLXpl1I(this.f50156c, null, this.f50157d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, composer, 0, 3072, 57338);
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

    public static final bn.r b(Modifier modifier, String str, String str2, long j10, sn.a aVar, int i10, int i11, Composer composer, int i12) {
        c(modifier, str, str2, j10, aVar, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r23, @org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.NotNull final java.lang.String r25, long r26, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c0.c(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, long, sn.a, androidx.compose.runtime.Composer, int, int):void");
    }
}
