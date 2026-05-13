package androidx.compose.animation;

import kotlin.Metadata;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aP\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aj\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "Crossfade", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lsn/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "", "contentKey", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lsn/l;Lsn/q;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 6, 0})
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void Crossfade(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<T> r18, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r19, @org.jetbrains.annotations.Nullable androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r20, @org.jetbrains.annotations.Nullable sn.l<? super T, ? extends java.lang.Object> r21, @org.jetbrains.annotations.NotNull final sn.q<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, sn.l, sn.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void Crossfade(final T r14, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r15, @org.jetbrains.annotations.Nullable androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r16, @org.jetbrains.annotations.NotNull final sn.q<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r17, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            r1 = r14
            r10 = r17
            r11 = r19
            java.lang.String r0 = "content"
            tn.p.k(r10, r0)
            r0 = 523603005(0x1f358c3d, float:3.8444243E-20)
            r2 = r18
            androidx.compose.runtime.Composer r0 = r2.startRestartGroup(r0)
            r2 = r20 & 1
            r3 = 4
            r4 = 2
            if (r2 == 0) goto L1c
            r2 = r11 | 6
            goto L2c
        L1c:
            r2 = r11 & 14
            if (r2 != 0) goto L2b
            boolean r2 = r0.changed(r14)
            if (r2 == 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r4
        L29:
            r2 = r2 | r11
            goto L2c
        L2b:
            r2 = r11
        L2c:
            r5 = r20 & 2
            if (r5 == 0) goto L33
            r2 = r2 | 48
            goto L45
        L33:
            r6 = r11 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L45
            r6 = r15
            boolean r7 = r0.changed(r15)
            if (r7 == 0) goto L41
            r7 = 32
            goto L43
        L41:
            r7 = 16
        L43:
            r2 = r2 | r7
            goto L46
        L45:
            r6 = r15
        L46:
            r7 = r20 & 4
            if (r7 == 0) goto L4c
            r2 = r2 | 128(0x80, float:1.8E-43)
        L4c:
            r8 = r20 & 8
            if (r8 == 0) goto L53
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L63
        L53:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L63
            boolean r8 = r0.changed(r10)
            if (r8 == 0) goto L60
            r8 = 2048(0x800, float:2.87E-42)
            goto L62
        L60:
            r8 = 1024(0x400, float:1.435E-42)
        L62:
            r2 = r2 | r8
        L63:
            if (r7 != r3) goto L79
            r3 = r2 & 5851(0x16db, float:8.199E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r3 != r8) goto L79
            boolean r3 = r0.getSkipping()
            if (r3 != 0) goto L72
            goto L79
        L72:
            r0.skipToGroupEnd()
            r3 = r16
            r2 = r6
            goto Laf
        L79:
            if (r5 == 0) goto L7f
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.INSTANCE
            r12 = r3
            goto L80
        L7f:
            r12 = r6
        L80:
            r3 = 0
            if (r7 == 0) goto L8b
            r5 = 7
            r6 = 0
            androidx.compose.animation.core.TweenSpec r5 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r6, r6, r3, r5, r3)
            r13 = r5
            goto L8d
        L8b:
            r13 = r16
        L8d:
            r5 = r2 & 8
            r6 = r2 & 14
            r5 = r5 | r6
            androidx.compose.animation.core.Transition r3 = androidx.compose.animation.core.TransitionKt.updateTransition(r14, r3, r0, r5, r4)
            r5 = 0
            r4 = r2 & 112(0x70, float:1.57E-43)
            r4 = r4 | 512(0x200, float:7.17E-43)
            r6 = 57344(0xe000, float:8.0356E-41)
            int r2 = r2 << 3
            r2 = r2 & r6
            r8 = r4 | r2
            r9 = 4
            r2 = r3
            r3 = r12
            r4 = r13
            r6 = r17
            r7 = r0
            Crossfade(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r12
            r3 = r13
        Laf:
            androidx.compose.runtime.ScopeUpdateScope r7 = r0.endRestartGroup()
            if (r7 != 0) goto Lb6
            goto Lc6
        Lb6:
            androidx.compose.animation.CrossfadeKt$Crossfade$1 r8 = new androidx.compose.animation.CrossfadeKt$Crossfade$1
            r0 = r8
            r1 = r14
            r4 = r17
            r5 = r19
            r6 = r20
            r0.<init>()
            r7.updateScope(r8)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, sn.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
