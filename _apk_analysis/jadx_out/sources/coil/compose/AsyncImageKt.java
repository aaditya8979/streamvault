package coil.compose;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import j0.f;
import java.util.List;
import k0.Size;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import z.a;
import z.c;

/* JADX INFO: compiled from: AsyncImage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009d\u0001\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aK\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0016\u0010!\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003\u001a\u001b\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"", "model", "", "contentDescription", "Lcoil/ImageLoader;", "imageLoader", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$b;", "transform", "Lbn/r;", "onState", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "a", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lsn/l;Lsn/l;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;I)V", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, InneractiveMediationDefs.GENDER_FEMALE, "(Lj0/f;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lj0/f;", "d", "Landroidx/compose/ui/unit/Constraints;", "Lk0/g;", "e", "(J)Lk0/g;", "coil-compose-base_release"}, k = 2, mv = {1, 7, 1})
public final class AsyncImageKt {
    @Composable
    public static final void a(@Nullable final Object obj, @Nullable final String str, @NotNull final ImageLoader imageLoader, @Nullable Modifier modifier, @Nullable l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, @Nullable l<? super AsyncImagePainter.b, r> lVar2, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f10, @Nullable ColorFilter colorFilter, int i10, @Nullable Composer composer, final int i11, final int i12, final int i13) {
        final int iM2115getDefaultFilterQualityfv9h1I;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2030202961);
        final Modifier modifier2 = (i13 & 8) != 0 ? Modifier.INSTANCE : modifier;
        final l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVarA = (i13 & 16) != 0 ? AsyncImagePainter.INSTANCE.a() : lVar;
        final l<? super AsyncImagePainter.b, r> lVar3 = (i13 & 32) != 0 ? null : lVar2;
        final Alignment center = (i13 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        final ContentScale fit = (i13 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        final float f11 = (i13 & 256) != 0 ? 1.0f : f10;
        final ColorFilter colorFilter2 = (i13 & 512) != 0 ? null : colorFilter;
        if ((i13 & 1024) != 0) {
            i14 = i12 & (-15);
            iM2115getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2115getDefaultFilterQualityfv9h1I();
        } else {
            iM2115getDefaultFilterQualityfv9h1I = i10;
            i14 = i12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i11, i14, "coil.compose.AsyncImage (AsyncImage.kt:116)");
        }
        f fVarF = f(c.d(obj, composerStartRestartGroup, 8), fit, composerStartRestartGroup, 8 | ((i11 >> 18) & 112));
        int i15 = i11 >> 6;
        int i16 = i11 >> 9;
        int i17 = 57344 & i16;
        l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar4 = lVarA;
        l<? super AsyncImagePainter.b, r> lVar5 = lVar3;
        ContentScale contentScale2 = fit;
        int i18 = iM2115getDefaultFilterQualityfv9h1I;
        AsyncImagePainter asyncImagePainterD = a.d(fVarF, imageLoader, lVar4, lVar5, contentScale2, i18, composerStartRestartGroup, ((i14 << 15) & 458752) | (i15 & 7168) | (i15 & 896) | 72 | i17, 0);
        h sizeResolver = fVarF.getSizeResolver();
        b(sizeResolver instanceof ConstraintsSizeResolver ? modifier2.then((Modifier) sizeResolver) : modifier2, asyncImagePainterD, str, center, fit, f11, colorFilter2, composerStartRestartGroup, (i16 & 3670016) | (i16 & 7168) | ((i11 << 3) & 896) | i17 | (i16 & 458752));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: coil.compose.AsyncImageKt$AsyncImage$2
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

            public final void invoke(@Nullable Composer composer2, int i19) {
                AsyncImageKt.a(obj, str, imageLoader, modifier2, lVarA, lVar3, center, fit, f11, colorFilter2, iM2115getDefaultFilterQualityfv9h1I, composer2, i11 | 1, i12, i13);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final Modifier modifier, @NotNull final Painter painter, @Nullable final String str, @NotNull final Alignment alignment, @NotNull final ContentScale contentScale, final float f10, @Nullable final ColorFilter colorFilter, @Nullable Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(10290533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10290533, i10, -1, "coil.compose.Content (AsyncImage.kt:154)");
        }
        Modifier modifierThen = ClipKt.clipToBounds(d(modifier, str)).then(new ContentPainterModifier(painter, alignment, contentScale, f10, colorFilter));
        AsyncImageKt$Content$1 asyncImageKt$Content$1 = new MeasurePolicy() { // from class: coil.compose.AsyncImageKt$Content$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j10) {
                return MeasureScope.layout$default(measureScope, Constraints.m3784getMinWidthimpl(j10), Constraints.m3783getMinHeightimpl(j10), null, new l<Placeable.PlacementScope, r>() { // from class: coil.compose.AsyncImageKt$Content$1$measure$1
                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                    }
                }, 4, null);
            }
        };
        composerStartRestartGroup.startReplaceableGroup(544976794);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, modifierThen);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        final sn.a<ComposeUiNode> constructor = companion.getConstructor();
        composerStartRestartGroup.startReplaceableGroup(1405779621);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new sn.a<ComposeUiNode>() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                @Override // sn.a
                @NotNull
                public final ComposeUiNode invoke() {
                    return constructor.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
        Updater.m1281setimpl(composerM1274constructorimpl, asyncImageKt$Content$1, companion.getSetMeasurePolicy());
        Updater.m1281setimpl(composerM1274constructorimpl, density, companion.getSetDensity());
        Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m1281setimpl(composerM1274constructorimpl, modifierMaterialize, companion.getSetModifier());
        composerStartRestartGroup.enableReusing();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: coil.compose.AsyncImageKt$Content$2
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

            public final void invoke(@Nullable Composer composer2, int i11) {
                AsyncImageKt.b(modifier, painter, str, alignment, contentScale, f10, colorFilter, composer2, i10 | 1);
            }
        });
    }

    @Stable
    public static final Modifier d(Modifier modifier, final String str) {
        return str != null ? SemanticsModifierKt.semantics$default(modifier, false, new l<SemanticsPropertyReceiver, r>() { // from class: coil.compose.AsyncImageKt$contentDescription$1
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
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.m3385setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m3374getImageo7Vup1c());
            }
        }, 1, null) : modifier;
    }

    @Stable
    public static final Size e(long j10) {
        if (Constraints.m3786isZeroimpl(j10)) {
            return null;
        }
        return new Size(Constraints.m3778getHasBoundedWidthimpl(j10) ? k0.a.a(Constraints.m3782getMaxWidthimpl(j10)) : c.b.f72682a, Constraints.m3777getHasBoundedHeightimpl(j10) ? k0.a.a(Constraints.m3781getMaxHeightimpl(j10)) : c.b.f72682a);
    }

    @Composable
    @NotNull
    public static final f f(@NotNull f fVar, @NotNull ContentScale contentScale, @Nullable Composer composer, int i10) {
        h hVarA;
        composer.startReplaceableGroup(402368983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402368983, i10, -1, "coil.compose.updateRequest (AsyncImage.kt:181)");
        }
        if (fVar.getDefined().getSizeResolver() == null) {
            if (tn.p.f(contentScale, ContentScale.INSTANCE.getNone())) {
                hVarA = i.a(Size.f72688d);
            } else {
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ConstraintsSizeResolver();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                hVarA = (h) objRememberedValue;
            }
            fVar = f.Q(fVar, null, 1, null).k(hVarA).a();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fVar;
    }
}
