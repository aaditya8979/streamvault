package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJñ\u0001\u0010#\u001a\u00020 2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"Jñ\u0001\u0010)\u001a\u00020 2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "", "expanded", "Lkotlin/Function0;", "Lbn/r;", "onIconClick", "TrailingIcon", "(ZLsn/a;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "Landroidx/compose/material/TextFieldColors;", "textFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-DlUQjxs", "outlinedTextFieldColors", "<init>", "()V", "material_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalMaterialApi
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TrailingIcon(final boolean r13, @org.jetbrains.annotations.Nullable sn.a<bn.r> r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, final int r16, final int r17) {
        /*
            r12 = this;
            r2 = r13
            r0 = 876077373(0x3437e13d, float:1.7125144E-7)
            r1 = r15
            androidx.compose.runtime.Composer r0 = r15.startRestartGroup(r0)
            r1 = r17 & 1
            if (r1 == 0) goto L10
            r1 = r16 | 6
            goto L22
        L10:
            r1 = r16 & 14
            if (r1 != 0) goto L20
            boolean r1 = r0.changed(r13)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = 2
        L1d:
            r1 = r16 | r1
            goto L22
        L20:
            r1 = r16
        L22:
            r3 = r17 & 2
            if (r3 == 0) goto L29
            r1 = r1 | 48
            goto L3b
        L29:
            r4 = r16 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L3b
            r4 = r14
            boolean r5 = r0.changed(r14)
            if (r5 == 0) goto L37
            r5 = 32
            goto L39
        L37:
            r5 = 16
        L39:
            r1 = r1 | r5
            goto L3c
        L3b:
            r4 = r14
        L3c:
            r5 = r1 & 91
            r6 = 18
            if (r5 != r6) goto L4e
            boolean r5 = r0.getSkipping()
            if (r5 != 0) goto L49
            goto L4e
        L49:
            r0.skipToGroupEnd()
            r3 = r4
            goto L79
        L4e:
            if (r3 == 0) goto L54
            androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1 r3 = new sn.a<bn.r>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.1
                static {
                    /*
                        androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1 r0 = new androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1) androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.1.INSTANCE androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.AnonymousClass1.<init>():void");
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ bn.r invoke() {
                    /*
                        r1 = this;
                        r1.invoke2()
                        bn.r r0 = bn.r.f5635a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.AnonymousClass1.invoke():java.lang.Object");
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.AnonymousClass1.invoke2():void");
                }
            }
            r11 = r3
            goto L55
        L54:
            r11 = r4
        L55:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.INSTANCE
            androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2 r4 = new sn.l<androidx.compose.ui.semantics.SemanticsPropertyReceiver, bn.r>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.2
                static {
                    /*
                        androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2 r0 = new androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2) androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.2.INSTANCE androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.AnonymousClass2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.AnonymousClass2.<init>():void");
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ bn.r invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver r1) {
                    /*
                        r0 = this;
                        androidx.compose.ui.semantics.SemanticsPropertyReceiver r1 = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) r1
                        r0.invoke2(r1)
                        bn.r r1 = bn.r.f5635a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.AnonymousClass2.invoke(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.ui.semantics.SemanticsPropertyReceiver r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "$this$clearAndSetSemantics"
                        tn.p.k(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.AnonymousClass2.invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver):void");
                }
            }
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(r3, r4)
            r5 = 0
            r6 = 0
            r3 = 726122713(0x2b47c0d9, float:7.096663E-13)
            androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3 r7 = new androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
            r7.<init>()
            r8 = 1
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r0, r3, r8, r7)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r9 = r1 | 24576(0x6000, float:3.4438E-41)
            r10 = 12
            r3 = r11
            r8 = r0
            androidx.compose.material.IconButtonKt.IconButton(r3, r4, r5, r6, r7, r8, r9, r10)
        L79:
            androidx.compose.runtime.ScopeUpdateScope r6 = r0.endRestartGroup()
            if (r6 != 0) goto L80
            goto L8f
        L80:
            androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4 r7 = new androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4
            r0 = r7
            r1 = r12
            r2 = r13
            r4 = r16
            r5 = r17
            r0.<init>()
            r6.updateScope(r7)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon(boolean, sn.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1037outlinedTextFieldColorsDlUQjxs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        composer.startReplaceableGroup(1162641182);
        long jM1618copywmQWz5c$default = (i13 & 1) != 0 ? Color.m1618copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1629unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM1618copywmQWz5c$default2 = (i13 & 2) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1654getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.INSTANCE.m1654getTransparent0d7_KjU() : j12;
        long jM967getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU() : j13;
        long jM961getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j14;
        long jM1618copywmQWz5c$default3 = (i13 & 32) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1618copywmQWz5c$default4 = (i13 & 64) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM1618copywmQWz5c$default5 = (i13 & 128) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM961getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j18;
        long jM1618copywmQWz5c$default6 = (i13 & 512) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long jM1618copywmQWz5c$default7 = (i13 & 1024) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long j32 = (i13 & 2048) != 0 ? jM1618copywmQWz5c$default6 : j21;
        long jM1618copywmQWz5c$default8 = (i13 & 4096) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM1618copywmQWz5c$default9 = (i13 & 8192) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long jM1618copywmQWz5c$default10 = (i13 & 16384) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long jM961getError0d7_KjU3 = (32768 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j25;
        long jM1618copywmQWz5c$default11 = (65536 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jM1618copywmQWz5c$default12 = (131072 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long jM1618copywmQWz5c$default13 = (262144 & i13) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long jM961getError0d7_KjU4 = (524288 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j29;
        long jM1618copywmQWz5c$default14 = (1048576 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jM1618copywmQWz5c$default, jM1618copywmQWz5c$default2, jM967getPrimary0d7_KjU, jM961getError0d7_KjU, jM1618copywmQWz5c$default3, jM1618copywmQWz5c$default4, jM961getError0d7_KjU2, jM1618copywmQWz5c$default5, jM1618copywmQWz5c$default6, jM1618copywmQWz5c$default7, j32, jM1618copywmQWz5c$default8, jM1618copywmQWz5c$default9, jM1618copywmQWz5c$default10, jM961getError0d7_KjU3, jM1654getTransparent0d7_KjU, jM1618copywmQWz5c$default11, jM1618copywmQWz5c$default12, jM1618copywmQWz5c$default13, jM961getError0d7_KjU4, jM1618copywmQWz5c$default14, (i13 & 2097152) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j31, null);
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1038textFieldColorsDlUQjxs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        composer.startReplaceableGroup(1208167904);
        long jM1618copywmQWz5c$default = (i13 & 1) != 0 ? Color.m1618copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1629unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM1618copywmQWz5c$default2 = (i13 & 2) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1618copywmQWz5c$default3 = (i13 & 4) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM967getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU() : j13;
        long jM961getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j14;
        long jM1618copywmQWz5c$default4 = (i13 & 32) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1618copywmQWz5c$default5 = (i13 & 64) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM1618copywmQWz5c$default6 = (i13 & 128) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM961getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j18;
        long jM1618copywmQWz5c$default7 = (i13 & 512) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long jM1618copywmQWz5c$default8 = (i13 & 1024) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long j32 = (i13 & 2048) != 0 ? jM1618copywmQWz5c$default7 : j21;
        long jM1618copywmQWz5c$default9 = (i13 & 4096) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM1618copywmQWz5c$default10 = (i13 & 8192) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long jM1618copywmQWz5c$default11 = (i13 & 16384) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long jM961getError0d7_KjU3 = (32768 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j25;
        long jM1618copywmQWz5c$default12 = (65536 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jM1618copywmQWz5c$default13 = (131072 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long jM1618copywmQWz5c$default14 = (262144 & i13) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long jM961getError0d7_KjU4 = (524288 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j29;
        long jM1618copywmQWz5c$default15 = (1048576 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jM1618copywmQWz5c$default, jM1618copywmQWz5c$default2, jM967getPrimary0d7_KjU, jM961getError0d7_KjU, jM1618copywmQWz5c$default4, jM1618copywmQWz5c$default5, jM961getError0d7_KjU2, jM1618copywmQWz5c$default6, jM1618copywmQWz5c$default7, jM1618copywmQWz5c$default8, j32, jM1618copywmQWz5c$default9, jM1618copywmQWz5c$default10, jM1618copywmQWz5c$default11, jM961getError0d7_KjU3, jM1618copywmQWz5c$default3, jM1618copywmQWz5c$default12, jM1618copywmQWz5c$default13, jM1618copywmQWz5c$default14, jM961getError0d7_KjU4, jM1618copywmQWz5c$default15, (i13 & 2097152) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j31, null);
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
