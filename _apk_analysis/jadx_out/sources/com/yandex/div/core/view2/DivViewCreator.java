package com.yandex.div.core.view2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import p000do.h;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivViewCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
public class DivViewCreator extends DivVisitor<View> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String[] TAGS = {"DIV2.TEXT_VIEW", "DIV2.IMAGE_VIEW", "DIV2.IMAGE_GIF_VIEW", "DIV2.OVERLAP_CONTAINER_VIEW", "DIV2.LINEAR_CONTAINER_VIEW", "DIV2.WRAP_CONTAINER_VIEW", "DIV2.GRID_VIEW", "DIV2.GALLERY_VIEW", "DIV2.PAGER_VIEW", "DIV2.TAB_VIEW", "DIV2.STATE", "DIV2.CUSTOM", "DIV2.INDICATOR", "DIV2.SLIDER", "DIV2.INPUT", "DIV2.SELECT", "DIV2.VIDEO", "DIV2.SWITCH"};

    @NotNull
    private final Context context;

    @NotNull
    private final DivValidator validator;

    @NotNull
    private final ViewPool viewPool;

    @NotNull
    private ViewPreCreationProfile viewPreCreationProfile;

    /* JADX INFO: compiled from: DivViewCreator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTag(Div div, ExpressionResolver expressionResolver) {
            if (div instanceof Div.b) {
                Div.b bVar = (Div.b) div;
                return DivUtilKt.isWrapContainer(bVar.c(), expressionResolver) ? "DIV2.WRAP_CONTAINER_VIEW" : bVar.c().I.evaluate(expressionResolver) == DivContainer.Orientation.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
            }
            if (div instanceof Div.c) {
                return "DIV2.CUSTOM";
            }
            if (div instanceof Div.d) {
                return "DIV2.GALLERY_VIEW";
            }
            if (div instanceof Div.e) {
                return "DIV2.IMAGE_GIF_VIEW";
            }
            if (div instanceof Div.f) {
                return "DIV2.GRID_VIEW";
            }
            if (div instanceof Div.g) {
                return "DIV2.IMAGE_VIEW";
            }
            if (div instanceof Div.h) {
                return "DIV2.INDICATOR";
            }
            if (div instanceof Div.i) {
                return "DIV2.INPUT";
            }
            if (div instanceof Div.j) {
                return "DIV2.PAGER_VIEW";
            }
            if (div instanceof Div.k) {
                return "DIV2.SELECT";
            }
            if (div instanceof Div.m) {
                return "DIV2.SLIDER";
            }
            if (div instanceof Div.o) {
                return "DIV2.SWITCH";
            }
            if (div instanceof Div.n) {
                return "DIV2.STATE";
            }
            if (div instanceof Div.p) {
                return "DIV2.TAB_VIEW";
            }
            if (div instanceof Div.q) {
                return "DIV2.TEXT_VIEW";
            }
            if (div instanceof Div.r) {
                return "DIV2.VIDEO";
            }
            if (div instanceof Div.l) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public DivViewCreator(@NotNull Context context, @NotNull ViewPool viewPool, @NotNull DivValidator divValidator, @NotNull ViewPreCreationProfile viewPreCreationProfile, @NotNull ViewPreCreationProfileRepository viewPreCreationProfileRepository) {
        ViewPreCreationProfile viewPreCreationProfile2;
        this.context = context;
        this.viewPool = viewPool;
        this.validator = divValidator;
        String id2 = viewPreCreationProfile.getId();
        if (id2 != null && (viewPreCreationProfile2 = (ViewPreCreationProfile) h.b(null, new DivViewCreator$viewPreCreationProfile$1$1(viewPreCreationProfileRepository, id2, null), 1, null)) != null) {
            viewPreCreationProfile = viewPreCreationProfile2;
        }
        this.viewPreCreationProfile = viewPreCreationProfile;
        ViewPreCreationProfile viewPreCreationProfile3 = getViewPreCreationProfile();
        viewPool.register("DIV2.TEXT_VIEW", new ViewFactory() { // from class: ig.c
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$3(this.f64207a);
            }
        }, viewPreCreationProfile3.getText().getCapacity());
        viewPool.register("DIV2.IMAGE_VIEW", new ViewFactory() { // from class: ig.t
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$4(this.f64224a);
            }
        }, viewPreCreationProfile3.getImage().getCapacity());
        viewPool.register("DIV2.IMAGE_GIF_VIEW", new ViewFactory() { // from class: ig.d
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$5(this.f64208a);
            }
        }, viewPreCreationProfile3.getGifImage().getCapacity());
        viewPool.register("DIV2.OVERLAP_CONTAINER_VIEW", new ViewFactory() { // from class: ig.e
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$6(this.f64209a);
            }
        }, viewPreCreationProfile3.getOverlapContainer().getCapacity());
        viewPool.register("DIV2.LINEAR_CONTAINER_VIEW", new ViewFactory() { // from class: ig.f
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$7(this.f64210a);
            }
        }, viewPreCreationProfile3.getLinearContainer().getCapacity());
        viewPool.register("DIV2.WRAP_CONTAINER_VIEW", new ViewFactory() { // from class: ig.g
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$8(this.f64211a);
            }
        }, viewPreCreationProfile3.getWrapContainer().getCapacity());
        viewPool.register("DIV2.GRID_VIEW", new ViewFactory() { // from class: ig.h
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$9(this.f64212a);
            }
        }, viewPreCreationProfile3.getGrid().getCapacity());
        viewPool.register("DIV2.GALLERY_VIEW", new ViewFactory() { // from class: ig.i
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$10(this.f64213a);
            }
        }, viewPreCreationProfile3.getGallery().getCapacity());
        viewPool.register("DIV2.PAGER_VIEW", new ViewFactory() { // from class: ig.j
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$11(this.f64214a);
            }
        }, viewPreCreationProfile3.getPager().getCapacity());
        viewPool.register("DIV2.TAB_VIEW", new ViewFactory() { // from class: ig.k
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$12(this.f64215a);
            }
        }, viewPreCreationProfile3.getTab().getCapacity());
        viewPool.register("DIV2.STATE", new ViewFactory() { // from class: ig.l
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$13(this.f64216a);
            }
        }, viewPreCreationProfile3.getState().getCapacity());
        viewPool.register("DIV2.CUSTOM", new ViewFactory() { // from class: ig.m
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$14(this.f64217a);
            }
        }, viewPreCreationProfile3.getCustom().getCapacity());
        viewPool.register("DIV2.INDICATOR", new ViewFactory() { // from class: ig.n
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$15(this.f64218a);
            }
        }, viewPreCreationProfile3.getIndicator().getCapacity());
        viewPool.register("DIV2.SLIDER", new ViewFactory() { // from class: ig.o
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$16(this.f64219a);
            }
        }, viewPreCreationProfile3.getSlider().getCapacity());
        viewPool.register("DIV2.INPUT", new ViewFactory() { // from class: ig.p
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$17(this.f64220a);
            }
        }, viewPreCreationProfile3.getInput().getCapacity());
        viewPool.register("DIV2.SELECT", new ViewFactory() { // from class: ig.q
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$18(this.f64221a);
            }
        }, viewPreCreationProfile3.getSelect().getCapacity());
        viewPool.register("DIV2.VIDEO", new ViewFactory() { // from class: ig.r
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$19(this.f64222a);
            }
        }, viewPreCreationProfile3.getVideo().getCapacity());
        viewPool.register("DIV2.SWITCH", new ViewFactory() { // from class: ig.s
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$20(this.f64223a);
            }
        }, viewPreCreationProfile3.getSwitch().getCapacity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivRecyclerView lambda$22$lambda$21$lambda$10(DivViewCreator divViewCreator) {
        return new DivRecyclerView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivPagerView lambda$22$lambda$21$lambda$11(DivViewCreator divViewCreator) {
        return new DivPagerView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DivTabsLayout lambda$22$lambda$21$lambda$12(DivViewCreator divViewCreator) {
        return new DivTabsLayout(divViewCreator.context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivStateLayout lambda$22$lambda$21$lambda$13(DivViewCreator divViewCreator) {
        return new DivStateLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivCustomWrapper lambda$22$lambda$21$lambda$14(DivViewCreator divViewCreator) {
        return new DivCustomWrapper(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivPagerIndicatorView lambda$22$lambda$21$lambda$15(DivViewCreator divViewCreator) {
        return new DivPagerIndicatorView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSliderView lambda$22$lambda$21$lambda$16(DivViewCreator divViewCreator) {
        return new DivSliderView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivInputView lambda$22$lambda$21$lambda$17(DivViewCreator divViewCreator) {
        return new DivInputView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSelectView lambda$22$lambda$21$lambda$18(DivViewCreator divViewCreator) {
        return new DivSelectView(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivVideoView lambda$22$lambda$21$lambda$19(DivViewCreator divViewCreator) {
        return new DivVideoView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSwitchView lambda$22$lambda$21$lambda$20(DivViewCreator divViewCreator) {
        return new DivSwitchView(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivLineHeightTextView lambda$22$lambda$21$lambda$3(DivViewCreator divViewCreator) {
        return new DivLineHeightTextView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivImageView lambda$22$lambda$21$lambda$4(DivViewCreator divViewCreator) {
        return new DivImageView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivGifImageView lambda$22$lambda$21$lambda$5(DivViewCreator divViewCreator) {
        return new DivGifImageView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivFrameLayout lambda$22$lambda$21$lambda$6(DivViewCreator divViewCreator) {
        return new DivFrameLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivLinearLayout lambda$22$lambda$21$lambda$7(DivViewCreator divViewCreator) {
        return new DivLinearLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivWrapLayout lambda$22$lambda$21$lambda$8(DivViewCreator divViewCreator) {
        return new DivWrapLayout(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivGridLayout lambda$22$lambda$21$lambda$9(DivViewCreator divViewCreator) {
        return new DivGridLayout(divViewCreator.context, null, 0, 6, null);
    }

    @NotNull
    public View create(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        if (!this.validator.validate(div, expressionResolver)) {
            return new Space(this.context);
        }
        View viewVisit = visit(div, expressionResolver);
        viewVisit.setBackground(NoOpDrawable.INSTANCE);
        return viewVisit;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View defaultVisit(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        return this.viewPool.obtain(Companion.getTag(div, expressionResolver));
    }

    @NotNull
    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.viewPreCreationProfile;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View visit(@NotNull Div.f fVar, @NotNull ExpressionResolver expressionResolver) {
        View viewDefaultVisit = defaultVisit((Div) fVar, expressionResolver);
        p.i(viewDefaultVisit, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewDefaultVisit;
        Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(fVar.c()).iterator();
        while (it.hasNext()) {
            viewGroup.addView(create((Div) it.next(), expressionResolver));
        }
        return viewGroup;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View visit(@NotNull Div.l lVar, @NotNull ExpressionResolver expressionResolver) {
        return new DivSeparatorView(this.context, null, 0, 6, null);
    }
}
