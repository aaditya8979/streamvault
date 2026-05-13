package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import bn.r;
import com.ironsource.C3978d4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aR\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a$\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a8\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a \u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/geometry/Offset;", C3978d4.i.L, "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "SelectionHandle-8fL75-g", "(JZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "SelectionHandle", "DefaultSelectionHandle", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/runtime/Composer;I)V", "drawSelectionHandle", "Landroidx/compose/ui/draw/CacheDrawScope;", "", "radius", "Landroidx/compose/ui/graphics/ImageBitmap;", "createHandleImage", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "handleReferencePoint", "HandlePopup-ULxng0E", "(JLandroidx/compose/foundation/text/selection/HandleReferencePoint;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "HandlePopup", "isLeft", "areHandlesCrossed", "isHandleLtrDirection", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class AndroidSelectionHandles_androidKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultSelectionHandle(@NotNull final Modifier modifier, final boolean z10, @NotNull final ResolvedTextDirection resolvedTextDirection, final boolean z11, @Nullable Composer composer, final int i10) {
        int i11;
        p.k(modifier, "modifier");
        p.k(resolvedTextDirection, "direction");
        Composer composerStartRestartGroup = composer.startRestartGroup(47957398);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(resolvedTextDirection) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m454sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), z10, resolvedTextDirection, z11), composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.DefaultSelectionHandle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                AndroidSelectionHandles_androidKt.DefaultSelectionHandle(modifier, z10, resolvedTextDirection, z11, composer2, i10 | 1);
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: HandlePopup-ULxng0E, reason: not valid java name */
    public static final void m768HandlePopupULxng0E(final long j10, @NotNull final HandleReferencePoint handleReferencePoint, @NotNull final sn.p<? super Composer, ? super Integer, r> pVar, @Nullable Composer composer, final int i10) {
        int i11;
        p.k(handleReferencePoint, "handleReferencePoint");
        p.k(pVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1409050158);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(handleReferencePoint) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(pVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            long jIntOffset = IntOffsetKt.IntOffset(c.d(Offset.m1383getXimpl(j10)), c.d(Offset.m1384getYimpl(j10)));
            IntOffset intOffsetM3935boximpl = IntOffset.m3935boximpl(jIntOffset);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(intOffsetM3935boximpl) | composerStartRestartGroup.changed(handleReferencePoint);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new HandlePositionProvider(handleReferencePoint, jIntOffset, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup((HandlePositionProvider) objRememberedValue, null, new PopupProperties(false, false, false, null, true, false, 15, null), pVar, composerStartRestartGroup, (i11 << 3) & 7168, 2);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                AndroidSelectionHandles_androidKt.m768HandlePopupULxng0E(j10, handleReferencePoint, pVar, composer2, i10 | 1);
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: SelectionHandle-8fL75-g, reason: not valid java name */
    public static final void m769SelectionHandle8fL75g(final long j10, final boolean z10, @NotNull final ResolvedTextDirection resolvedTextDirection, final boolean z11, @NotNull final Modifier modifier, @Nullable final sn.p<? super Composer, ? super Integer, r> pVar, @Nullable Composer composer, final int i10) {
        int i11;
        p.k(resolvedTextDirection, "direction");
        p.k(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-616295642);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(resolvedTextDirection) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(pVar) ? 131072 : 65536;
        }
        final int i12 = i11;
        if ((i12 & 374491) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            m768HandlePopupULxng0E(j10, isLeft(z10, resolvedTextDirection, z11) ? HandleReferencePoint.TopRight : HandleReferencePoint.TopLeft, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 732099485, true, new sn.p<Composer, Integer, r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i13) {
                    if ((i13 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (pVar != null) {
                        composer2.startReplaceableGroup(386444465);
                        pVar.mo2invoke(composer2, Integer.valueOf((i12 >> 15) & 14));
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.startReplaceableGroup(386443790);
                    Modifier modifier2 = modifier;
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    Offset offsetM1372boximpl = Offset.m1372boximpl(j10);
                    final boolean z12 = z10;
                    final long j11 = j10;
                    composer2.startReplaceableGroup(511388516);
                    boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(offsetM1372boximpl);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // sn.l
                            public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                p.k(semanticsPropertyReceiver, "$this$semantics");
                                semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(z12 ? Handle.SelectionStart : Handle.SelectionEnd, j11, null));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier2, false, (l) objRememberedValue, 1, null);
                    boolean z13 = z10;
                    ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
                    boolean z14 = z11;
                    int i14 = i12;
                    AndroidSelectionHandles_androidKt.DefaultSelectionHandle(modifierSemantics$default, z13, resolvedTextDirection2, z14, composer2, (i14 & 112) | (i14 & 896) | (i14 & 7168));
                    composer2.endReplaceableGroup();
                }
            }), composerStartRestartGroup, (i12 & 14) | 384);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
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

            public final void invoke(@Nullable Composer composer2, int i13) {
                AndroidSelectionHandles_androidKt.m769SelectionHandle8fL75g(j10, z10, resolvedTextDirection, z11, modifier, pVar, composer2, i10 | 1);
            }
        });
    }

    @NotNull
    public static final ImageBitmap createHandleImage(@NotNull CacheDrawScope cacheDrawScope, float f10) {
        p.k(cacheDrawScope, "<this>");
        int iCeil = ((int) Math.ceil(f10)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || iCeil > imageBitmap.getWidth() || iCeil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m1810ImageBitmapx__hDU$default(iCeil, iCeil, ImageBitmapConfig.INSTANCE.m1804getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long jSize = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap2.getWidth(), imageBitmap2.getHeight());
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m2037setSizeuvyYCjk(jSize);
        canvas2.save();
        DrawScope.m2108drawRectnJ9OG0$default(canvasDrawScope2, Color.INSTANCE.m1645getBlack0d7_KjU(), 0L, canvasDrawScope2.mo2113getSizeNHjbRc(), 0.0f, null, null, BlendMode.INSTANCE.m1536getClear0nO6VwU(), 58, null);
        DrawScope.m2108drawRectnJ9OG0$default(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.INSTANCE.m1399getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(f10, f10), 0.0f, null, null, 0, 120, null);
        DrawScope.m2095drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f10, OffsetKt.Offset(f10, f10), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m2037setSizeuvyYCjk(size);
        return imageBitmap2;
    }

    @NotNull
    public static final Modifier drawSelectionHandle(@NotNull Modifier modifier, final boolean z10, @NotNull final ResolvedTextDirection resolvedTextDirection, final boolean z11) {
        p.k(modifier, "<this>");
        p.k(resolvedTextDirection, "direction");
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(-1538687176);
                final long selectionHandleColor = ((SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionHandleColor();
                Modifier.Companion companion = Modifier.INSTANCE;
                final boolean z12 = z10;
                final ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
                final boolean z13 = z11;
                Modifier modifierThen = modifier2.then(DrawModifierKt.drawWithCache(companion, new l<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope cacheDrawScope) {
                        p.k(cacheDrawScope, "$this$drawWithCache");
                        final ImageBitmap imageBitmapCreateHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, Size.m1452getWidthimpl(cacheDrawScope.m1306getSizeNHjbRc()) / 2.0f);
                        final ColorFilter colorFilterM1660tintxETnrds$default = ColorFilter.Companion.m1660tintxETnrds$default(ColorFilter.INSTANCE, selectionHandleColor, 0, 2, null);
                        final boolean z14 = z12;
                        final ResolvedTextDirection resolvedTextDirection3 = resolvedTextDirection2;
                        final boolean z15 = z13;
                        return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // sn.l
                            public /* bridge */ /* synthetic */ r invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                                p.k(contentDrawScope, "$this$onDrawWithContent");
                                contentDrawScope.drawContent();
                                if (!AndroidSelectionHandles_androidKt.isLeft(z14, resolvedTextDirection3, z15)) {
                                    DrawScope.m2098drawImagegbVJVH8$default(contentDrawScope, imageBitmapCreateHandleImage, 0L, 0.0f, null, colorFilterM1660tintxETnrds$default, 0, 46, null);
                                    return;
                                }
                                ImageBitmap imageBitmap = imageBitmapCreateHandleImage;
                                ColorFilter colorFilter = colorFilterM1660tintxETnrds$default;
                                long jMo2112getCenterF1C5BW0 = contentDrawScope.mo2112getCenterF1C5BW0();
                                DrawContext drawContext = contentDrawScope.getDrawContext();
                                long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
                                drawContext.getCanvas().save();
                                drawContext.getTransform().mo2045scale0AR0LA0(-1.0f, 1.0f, jMo2112getCenterF1C5BW0);
                                DrawScope.m2098drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
                            }
                        });
                    }
                }));
                composer.endReplaceableGroup();
                return modifierThen;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    public static final boolean isHandleLtrDirection(@NotNull ResolvedTextDirection resolvedTextDirection, boolean z10) {
        p.k(resolvedTextDirection, "direction");
        return (resolvedTextDirection == ResolvedTextDirection.Ltr && !z10) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLeft(boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        return z10 ? isHandleLtrDirection(resolvedTextDirection, z11) : !isHandleLtrDirection(resolvedTextDirection, z11);
    }
}
