package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.constraintlayout.motion.widget.Key;
import bn.r;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: VectorCompose.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a©\u0001\u0010'\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "name", "", Key.ROTATION, "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Group", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lsn/p;Landroidx/compose/runtime/Composer;II)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", VastAttributes.FILL_COLOR, "fillAlpha", VastAttributes.STROKE_COLOR, "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "Path", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    @androidx.compose.ui.graphics.vector.VectorComposable
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Group(@org.jetbrains.annotations.Nullable java.lang.String r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> r27, @org.jetbrains.annotations.NotNull final sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.Group(java.lang.String, float, float, float, float, float, float, float, java.util.List, sn.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @VectorComposable
    @Composable
    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m2216Path9cdaXJ4(@NotNull final List<? extends PathNode> list, int i10, @Nullable String str, @Nullable Brush brush, float f10, @Nullable Brush brush2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, @Nullable Composer composer, final int i13, final int i14, final int i15) {
        p.k(list, "pathData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478270750);
        final int defaultFillType = (i15 & 2) != 0 ? VectorKt.getDefaultFillType() : i10;
        final String str2 = (i15 & 4) != 0 ? "" : str;
        final Brush brush3 = (i15 & 8) != 0 ? null : brush;
        float f17 = (i15 & 16) != 0 ? 1.0f : f10;
        Brush brush4 = (i15 & 32) != 0 ? null : brush2;
        float f18 = (i15 & 64) != 0 ? 1.0f : f11;
        float f19 = (i15 & 128) != 0 ? 0.0f : f12;
        int defaultStrokeLineCap = (i15 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i11;
        int defaultStrokeLineJoin = (i15 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i12;
        float f20 = (i15 & 1024) != 0 ? 4.0f : f13;
        float f21 = (i15 & 2048) != 0 ? 0.0f : f14;
        float f22 = (i15 & 4096) != 0 ? 1.0f : f15;
        float f23 = (i15 & 8192) != 0 ? 0.0f : f16;
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new a<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final PathComponent invoke() {
                return new PathComponent();
            }
        };
        composerStartRestartGroup.startReplaceableGroup(1886828752);
        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new a<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final PathComponent invoke() {
                    return vectorComposeKt$Path$1.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
        Updater.m1281setimpl(composerM1274constructorimpl, str2, new sn.p<PathComponent, String, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, String str3) {
                invoke2(pathComponent, str3);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @NotNull String str3) {
                p.k(pathComponent, "$this$set");
                p.k(str3, "it");
                pathComponent.setName(str3);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, list, new sn.p<PathComponent, List<? extends PathNode>, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                invoke2(pathComponent, list2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @NotNull List<? extends PathNode> list2) {
                p.k(pathComponent, "$this$set");
                p.k(list2, "it");
                pathComponent.setPathData(list2);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, PathFillType.m1855boximpl(defaultFillType), new sn.p<PathComponent, PathFillType, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, PathFillType pathFillType) {
                m2218invokepweu1eQ(pathComponent, pathFillType.getValue());
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m2218invokepweu1eQ(@NotNull PathComponent pathComponent, int i16) {
                p.k(pathComponent, "$this$set");
                pathComponent.m2201setPathFillTypeoQ8Xj4U(i16);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, brush3, new sn.p<PathComponent, Brush, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @Nullable Brush brush5) {
                p.k(pathComponent, "$this$set");
                pathComponent.setFill(brush5);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, Float.valueOf(f17), new sn.p<PathComponent, Float, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Float f24) {
                invoke(pathComponent, f24.floatValue());
                return r.f5635a;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f24) {
                p.k(pathComponent, "$this$set");
                pathComponent.setFillAlpha(f24);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, brush4, new sn.p<PathComponent, Brush, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @Nullable Brush brush5) {
                p.k(pathComponent, "$this$set");
                pathComponent.setStroke(brush5);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, Float.valueOf(f18), new sn.p<PathComponent, Float, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Float f24) {
                invoke(pathComponent, f24.floatValue());
                return r.f5635a;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f24) {
                p.k(pathComponent, "$this$set");
                pathComponent.setStrokeAlpha(f24);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, Float.valueOf(f19), new sn.p<PathComponent, Float, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Float f24) {
                invoke(pathComponent, f24.floatValue());
                return r.f5635a;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f24) {
                p.k(pathComponent, "$this$set");
                pathComponent.setStrokeLineWidth(f24);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, StrokeJoin.m1926boximpl(defaultStrokeLineJoin), new sn.p<PathComponent, StrokeJoin, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                m2219invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m2219invokekLtJ_vA(@NotNull PathComponent pathComponent, int i16) {
                p.k(pathComponent, "$this$set");
                pathComponent.m2203setStrokeLineJoinWw9F2mQ(i16);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, StrokeCap.m1916boximpl(defaultStrokeLineCap), new sn.p<PathComponent, StrokeCap, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                m2217invokeCSYIeUk(pathComponent, strokeCap.getValue());
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m2217invokeCSYIeUk(@NotNull PathComponent pathComponent, int i16) {
                p.k(pathComponent, "$this$set");
                pathComponent.m2202setStrokeLineCapBeK7IIE(i16);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, Float.valueOf(f20), new sn.p<PathComponent, Float, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Float f24) {
                invoke(pathComponent, f24.floatValue());
                return r.f5635a;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f24) {
                p.k(pathComponent, "$this$set");
                pathComponent.setStrokeLineMiter(f24);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, Float.valueOf(f21), new sn.p<PathComponent, Float, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Float f24) {
                invoke(pathComponent, f24.floatValue());
                return r.f5635a;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f24) {
                p.k(pathComponent, "$this$set");
                pathComponent.setTrimPathStart(f24);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, Float.valueOf(f22), new sn.p<PathComponent, Float, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Float f24) {
                invoke(pathComponent, f24.floatValue());
                return r.f5635a;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f24) {
                p.k(pathComponent, "$this$set");
                pathComponent.setTrimPathEnd(f24);
            }
        });
        Updater.m1281setimpl(composerM1274constructorimpl, Float.valueOf(f23), new sn.p<PathComponent, Float, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(PathComponent pathComponent, Float f24) {
                invoke(pathComponent, f24.floatValue());
                return r.f5635a;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f24) {
                p.k(pathComponent, "$this$set");
                pathComponent.setTrimPathOffset(f24);
            }
        });
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final float f24 = f17;
        final Brush brush5 = brush4;
        final float f25 = f18;
        final float f26 = f19;
        final int i16 = defaultStrokeLineCap;
        final int i17 = defaultStrokeLineJoin;
        final float f27 = f20;
        final float f28 = f21;
        final float f29 = f22;
        final float f30 = f23;
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i18) {
                VectorComposeKt.m2216Path9cdaXJ4(list, defaultFillType, str2, brush3, f24, brush5, f25, f26, i16, i17, f27, f28, f29, f30, composer2, i13 | 1, i14, i15);
            }
        });
    }
}
