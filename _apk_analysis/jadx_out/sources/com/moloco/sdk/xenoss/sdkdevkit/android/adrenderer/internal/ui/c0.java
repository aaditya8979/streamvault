package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f48888a = ColorKt.Color$default(71, 118, 238, 0, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f48889b = Color.INSTANCE.m1656getWhite0d7_KjU();

    public static final class a implements sn.q<RowScope, Composer, Integer, bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f48890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f48891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f48892d;

        public a(String str, Integer num, long j10) {
            this.f48890b = str;
            this.f48891c = num;
            this.f48892d = j10;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(RowScope rowScope, Composer composer, int i10) {
            tn.p.k(rowScope, "$this$Button");
            if ((i10 & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-469621531, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton.<anonymous> (DEC.kt:232)");
            }
            String str = this.f48890b;
            if (str == null) {
                str = "";
            }
            Integer num = this.f48891c;
            TextUnit textUnitM3997boximpl = num != null ? TextUnit.m3997boximpl(TextUnitKt.getSp(num.intValue())) : null;
            composer.startReplaceableGroup(-1245054604);
            long jM3491getFontSizeXSAIIZE = textUnitM3997boximpl == null ? MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getButton().m3491getFontSizeXSAIIZE() : textUnitM3997boximpl.getPackedValue();
            composer.endReplaceableGroup();
            TextKt.m1234TextfLXpl1I(str, null, this.f48892d, jM3491getFontSizeXSAIIZE, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m3768getEllipsisgIe3tQ8(), false, 1, null, null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55250);
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

    public static final float a(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final bn.r b(Modifier modifier, String str, sn.a aVar, v0 v0Var, int i10, int i11, Composer composer, int i12) {
        d(modifier, str, aVar, v0Var, composer, i10 | 1, i11);
        return bn.r.f5635a;
    }

    public static final bn.r c(String str, sn.a aVar, Integer num, Integer num2, List list, boolean z10, long j10, long j11, int i10, boolean z11, int i11, int i12, Composer composer, int i13) {
        e(str, aVar, num, num2, list, z10, j10, j11, i10, z11, composer, i11 | 1, i12);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r36, @org.jetbrains.annotations.Nullable final java.lang.String r37, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r38, @org.jetbrains.annotations.NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v0 r39, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 1549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c0.d(androidx.compose.ui.Modifier, java.lang.String, sn.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@org.jetbrains.annotations.Nullable final java.lang.String r41, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r42, @org.jetbrains.annotations.Nullable final java.lang.Integer r43, @org.jetbrains.annotations.Nullable final java.lang.Integer r44, @org.jetbrains.annotations.Nullable final java.util.List<java.lang.String> r45, final boolean r46, final long r47, final long r49, final int r51, boolean r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, final int r54, final int r55) {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c0.e(java.lang.String, sn.a, java.lang.Integer, java.lang.Integer, java.util.List, boolean, long, long, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
