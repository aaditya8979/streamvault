package androidx.compose.foundation.text;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import cn.w;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\t\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ao\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00030\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a[\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aa\u0010&\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0003j\u0002`%0\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u00020$2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0!H\u0000\"Q\u0010'\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0003j\u0002`%0\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(*:\b\u0002\u0010)\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u00032\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003*\u0018\b\u0002\u0010*\"\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Lkotlin/Function1;", "", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "inlineContents", "InlineChildren", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/TextDelegate;", VideoLookHistoryEntry.CURRNET, "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "updateTextDelegate-x_uQXYA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "updateTextDelegate", "updateTextDelegate-y0k-MQk", "(Landroidx/compose/foundation/text/TextDelegate;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZII)Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/PlaceholderRange;", "resolveInlineContent", "EmptyInlineContent", "Lkotlin/Pair;", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class CoreTextKt {

    @NotNull
    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, r>>>> EmptyInlineContent = new Pair<>(w.m(), w.m());

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(@NotNull final AnnotatedString annotatedString, @NotNull final List<AnnotatedString.Range<q<String, Composer, Integer, r>>> list, @Nullable Composer composer, final int i10) {
        p.k(annotatedString, "text");
        p.k(list, "inlineContents");
        Composer composerStartRestartGroup = composer.startRestartGroup(-110905764);
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            AnnotatedString.Range<q<String, Composer, Integer, r>> range = list.get(i11);
            q<String, Composer, Integer, r> qVarComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list2, long j10) {
                    p.k(measureScope, "$this$Layout");
                    p.k(list2, "children");
                    final ArrayList arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        arrayList.add(list2.get(i12).mo3112measureBRTryo0(j10));
                    }
                    return MeasureScope.layout$default(measureScope, Constraints.m3782getMaxWidthimpl(j10), Constraints.m3781getMaxHeightimpl(j10), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ r invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                            p.k(placementScope, "$this$layout");
                            List<Placeable> list3 = arrayList;
                            int size3 = list3.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, list3.get(i13), 0, 0, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf = LayoutKt.materializerOf(companion);
            int i12 = size;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
            Updater.m1281setimpl(composerM1274constructorimpl, coreTextKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
            Updater.m1281setimpl(composerM1274constructorimpl, density, companion2.getSetDensity());
            Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-72427749);
            qVarComponent1.invoke(annotatedString.subSequence(start, end).getText(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            i11++;
            size = i12;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.foundation.text.CoreTextKt.InlineChildren.2
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

            public final void invoke(@Nullable Composer composer2, int i13) {
                CoreTextKt.InlineChildren(annotatedString, list, composer2, i10 | 1);
            }
        });
    }

    @NotNull
    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, r>>>> resolveInlineContent(@NotNull AnnotatedString annotatedString, @NotNull Map<String, InlineTextContent> map) {
        p.k(annotatedString, "text");
        p.k(map, "inlineContent");
        if (map.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i10);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: updateTextDelegate-x_uQXYA, reason: not valid java name */
    public static final TextDelegate m682updateTextDelegatex_uQXYA(@NotNull TextDelegate textDelegate, @NotNull AnnotatedString annotatedString, @NotNull TextStyle textStyle, @NotNull Density density, @NotNull FontFamily.Resolver resolver, boolean z10, int i10, int i11, @NotNull List<AnnotatedString.Range<Placeholder>> list) {
        p.k(textDelegate, VideoLookHistoryEntry.CURRNET);
        p.k(annotatedString, "text");
        p.k(textStyle, "style");
        p.k(density, "density");
        p.k(resolver, "fontFamilyResolver");
        p.k(list, "placeholders");
        if (p.f(textDelegate.getText(), annotatedString) && p.f(textDelegate.getStyle(), textStyle)) {
            if (textDelegate.getSoftWrap() == z10) {
                if (TextOverflow.m3760equalsimpl0(textDelegate.getOverflow(), i10)) {
                    if (textDelegate.getMaxLines() == i11 && p.f(textDelegate.getDensity(), density) && p.f(textDelegate.getPlaceholders(), list) && textDelegate.getFontFamilyResolver() == resolver) {
                        return textDelegate;
                    }
                }
                return new TextDelegate(annotatedString, textStyle, i11, z10, i10, density, resolver, list, null);
            }
            return new TextDelegate(annotatedString, textStyle, i11, z10, i10, density, resolver, list, null);
        }
        return new TextDelegate(annotatedString, textStyle, i11, z10, i10, density, resolver, list, null);
    }

    @NotNull
    /* JADX INFO: renamed from: updateTextDelegate-y0k-MQk, reason: not valid java name */
    public static final TextDelegate m684updateTextDelegatey0kMQk(@NotNull TextDelegate textDelegate, @NotNull String str, @NotNull TextStyle textStyle, @NotNull Density density, @NotNull FontFamily.Resolver resolver, boolean z10, int i10, int i11) {
        p.k(textDelegate, VideoLookHistoryEntry.CURRNET);
        p.k(str, "text");
        p.k(textStyle, "style");
        p.k(density, "density");
        p.k(resolver, "fontFamilyResolver");
        if (p.f(textDelegate.getText().getText(), str) && p.f(textDelegate.getStyle(), textStyle)) {
            if (textDelegate.getSoftWrap() == z10) {
                if (TextOverflow.m3760equalsimpl0(textDelegate.getOverflow(), i10)) {
                    if (textDelegate.getMaxLines() == i11 && p.f(textDelegate.getDensity(), density) && textDelegate.getFontFamilyResolver() == resolver) {
                        return textDelegate;
                    }
                }
                return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i11, z10, i10, density, resolver, null, 128, null);
            }
            return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i11, z10, i10, density, resolver, null, 128, null);
        }
        return new TextDelegate(new AnnotatedString(str, null, null, 6, null), textStyle, i11, z10, i10, density, resolver, null, 128, null);
    }
}
