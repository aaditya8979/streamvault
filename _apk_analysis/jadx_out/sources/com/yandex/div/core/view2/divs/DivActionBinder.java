package com.yandex.div.core.view2.divs;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.PopupMenu;
import bn.r;
import cn.v;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAnimation;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: DivActionBinder.kt */
/* JADX INFO: loaded from: classes6.dex */
public class DivActionBinder {

    @NotNull
    private final DivActionHandler actionHandler;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final Div2Logger logger;
    private final boolean longtapActionsPassToChild;

    @NotNull
    private final l<View, Boolean> passToParentLongClickListener = new l<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$passToParentLongClickListener$1
        @Override // sn.l
        @NotNull
        public final Boolean invoke(@NotNull View view) {
            boolean zPerformLongClick = false;
            do {
                ViewParent parent = view.getParent();
                view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (view == null || view.getParent() == null) {
                    break;
                }
                zPerformLongClick = view.performLongClick();
            } while (!zPerformLongClick);
            return Boolean.valueOf(zPerformLongClick);
        }
    };
    private final boolean shouldIgnoreActionMenuItems;

    /* JADX INFO: compiled from: DivActionBinder.kt */
    public final class MenuWrapperListener extends OverflowMenuWrapper.Listener.Simple {

        @NotNull
        private final BindingContext context;

        @NotNull
        private final List<DivAction.MenuItem> items;

        public MenuWrapperListener(@NotNull BindingContext bindingContext, @NotNull List<DivAction.MenuItem> list) {
            this.context = bindingContext;
            this.items = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onMenuCreated$lambda$0(final Div2View div2View, final DivAction.MenuItem menuItem, final ExpressionResolver expressionResolver, final DivActionBinder divActionBinder, final int i10, MenuItem menuItem2) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            div2View.bulkActions$div_release(new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$MenuWrapperListener$onMenuCreated$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    List<DivAction> list = menuItem.f54190b;
                    List<DivAction> listE = null;
                    if (list == null || list.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        DivAction divAction = menuItem.f54189a;
                        if (divAction != null) {
                            listE = v.e(divAction);
                        }
                    } else {
                        listE = list;
                    }
                    if (listE == null || listE.isEmpty()) {
                        KAssert kAssert = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Menu item does not have any action");
                            return;
                        }
                        return;
                    }
                    List<DivAction> listOnlyEnabled = DivActionBinderKt.onlyEnabled(listE, expressionResolver);
                    DivActionBinder divActionBinder2 = divActionBinder;
                    Div2View div2View2 = div2View;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    int i11 = i10;
                    DivAction.MenuItem menuItem3 = menuItem;
                    for (DivAction divAction2 : listOnlyEnabled) {
                        divActionBinder2.logger.logPopupMenuItemClick(div2View2, expressionResolver2, i11, menuItem3.f54191c.evaluate(expressionResolver2), divAction2);
                        divActionBinder2.divActionBeaconSender.sendTapActionBeacon(divAction2, expressionResolver2);
                        DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder2, div2View2, expressionResolver2, divAction2, "menu", null, null, 48, null);
                        menuItem3 = menuItem3;
                    }
                    ref$BooleanRef.element = true;
                }
            });
            return ref$BooleanRef.element;
        }

        @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
        public void onMenuCreated(@NotNull PopupMenu popupMenu) {
            final Div2View divView = this.context.getDivView();
            final ExpressionResolver expressionResolver = this.context.getExpressionResolver();
            Menu menu = popupMenu.getMenu();
            for (final DivAction.MenuItem menuItem : this.items) {
                final int size = menu.size();
                MenuItem menuItemAdd = menu.add(menuItem.f54191c.evaluate(expressionResolver));
                final DivActionBinder divActionBinder = DivActionBinder.this;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.a
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        return DivActionBinder.MenuWrapperListener.onMenuCreated$lambda$0(divView, menuItem, expressionResolver, divActionBinder, size, menuItem2);
                    }
                });
            }
        }
    }

    public DivActionBinder(@NotNull DivActionHandler divActionHandler, @NotNull Div2Logger div2Logger, @NotNull DivActionBeaconSender divActionBeaconSender, boolean z10, boolean z11) {
        this.actionHandler = divActionHandler;
        this.logger = div2Logger;
        this.divActionBeaconSender = divActionBeaconSender;
        this.longtapActionsPassToChild = z10;
        this.shouldIgnoreActionMenuItems = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDivActions(BindingContext bindingContext, View view, List<DivAction> list, List<DivAction> list2, List<DivAction> list3, List<DivAction> list4, List<DivAction> list5, List<DivAction> list6, List<DivAction> list7, DivAnimation divAnimation, Expression<Boolean> expression) {
        DivGestureListener divGestureListener = new DivGestureListener((list2.isEmpty() ^ true) || DivActionBinderKt.parentIsLongClickable(view));
        bindLongTapActions(bindingContext, view, list2, list.isEmpty(), expression);
        bindDoubleTapActions(bindingContext, view, divGestureListener, list3, expression);
        bindTapActions(bindingContext, view, divGestureListener, list, this.shouldIgnoreActionMenuItems, expression, (list2.isEmpty() ^ true) || (list3.isEmpty() ^ true));
        p<View, MotionEvent, Boolean> pVarCreateAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, !CollectionsKt.allIsNullOrEmpty(list, list2, list3) ? divAnimation : null, divGestureListener);
        p<View, MotionEvent, Boolean> pVarCreatePressTouchListener = createPressTouchListener(bindingContext, view, list6, list7);
        bindHoverActions(bindingContext, view, list4, list5);
        attachTouchListeners(view, pVarCreateAnimatedTouchListener, pVarCreatePressTouchListener);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void attachTouchListeners(View view, p<? super View, ? super MotionEvent, Boolean>... pVarArr) {
        final List listS = cn.r.S(pVarArr);
        if (!listS.isEmpty()) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: kg.g
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return DivActionBinder.attachTouchListeners$lambda$17(listS, view2, motionEvent);
                }
            });
        } else {
            view.setOnTouchListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachTouchListeners$lambda$17(List list, View view, MotionEvent motionEvent) {
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (((Boolean) ((p) it.next()).mo2invoke(view, motionEvent)).booleanValue() || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    private void bindDoubleTapActions(final BindingContext bindingContext, final View view, DivGestureListener divGestureListener, final List<DivAction> list, final Expression<Boolean> expression) {
        Object obj = null;
        if (list.isEmpty()) {
            divGestureListener.setOnDoubleTapListener(null);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<DivAction.MenuItem> list2 = ((DivAction) next).f54179e;
            boolean z10 = false;
            if (!(list2 == null || list2.isEmpty()) && !this.shouldIgnoreActionMenuItems) {
                z10 = true;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            divGestureListener.setOnDoubleTapListener(new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder.bindDoubleTapActions.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DivActionBinderKt.captureFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
                    this.handleBulkActions$div_release(bindingContext, view, list, "double_click");
                }
            });
            return;
        }
        List<DivAction.MenuItem> list3 = divAction.f54179e;
        if (list3 != null) {
            final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
            divGestureListener.setOnDoubleTapListener(new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.logger.logDoubleClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, divAction);
                    this.this$0.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
                    DivActionBinderKt.captureFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
                    overflowMenuWrapperOverflowGravity.getOnMenuClickListener().onClick(view);
                }
            });
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + divAction.f54177c);
        }
    }

    private void bindHoverActions(final BindingContext bindingContext, final View view, final List<DivAction> list, final List<DivAction> list2) {
        if ((!list.isEmpty()) || (!list2.isEmpty())) {
            view.setOnHoverListener(new View.OnHoverListener() { // from class: kg.d
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    return DivActionBinder.bindHoverActions$lambda$15(this.f73122b, bindingContext, view, list, list2, view2, motionEvent);
                }
            });
        } else {
            view.setOnHoverListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindHoverActions$lambda$15(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, List list2, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 9) {
            divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "hover");
            return false;
        }
        if (action != 10) {
            return false;
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list2, "unhover");
        return false;
    }

    private void bindLongTapActions(final BindingContext bindingContext, final View view, final List<DivAction> list, boolean z10, final Expression<Boolean> expression) {
        Object next;
        if (list.isEmpty()) {
            clearLongClickListener(view, this.longtapActionsPassToChild, z10);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<DivAction.MenuItem> list2 = ((DivAction) next).f54179e;
            boolean z11 = false;
            if (!(list2 == null || list2.isEmpty()) && !this.shouldIgnoreActionMenuItems) {
                z11 = true;
            }
            if (z11) {
                break;
            }
        }
        final DivAction divAction = (DivAction) next;
        if (divAction != null) {
            List<DivAction.MenuItem> list3 = divAction.f54179e;
            if (list3 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + divAction.f54177c);
                }
            } else {
                final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
                Div2View divView = bindingContext.getDivView();
                divView.clearSubscriptions();
                divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: kg.e
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        return DivActionBinder.bindLongTapActions$lambda$10$lambda$9(this.f73127b, divAction, bindingContext, expression, overflowMenuWrapperOverflowGravity, view, list, view2);
                    }
                });
            }
        } else {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: kg.f
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return DivActionBinder.bindLongTapActions$lambda$11(expression, bindingContext, this, view, list, view2);
                }
            });
        }
        if (this.longtapActionsPassToChild) {
            DivActionBinderKt.setPenetratingLongClickable$default(view, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$10$lambda$9(DivActionBinder divActionBinder, DivAction divAction, BindingContext bindingContext, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view, List list, View view2) {
        String string = UUID.randomUUID().toString();
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            divActionBinder.logger.logLongClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, (DivAction) it.next(), string);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$11(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "long_click");
        return true;
    }

    private void bindTapActions(final BindingContext bindingContext, final View view, DivGestureListener divGestureListener, final List<DivAction> list, boolean z10, final Expression<Boolean> expression, boolean z11) {
        Object obj = null;
        if (list.isEmpty()) {
            if (z11) {
                bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: kg.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DivActionBinder.bindTapActions$lambda$2(expression, bindingContext, view2);
                    }
                });
                return;
            }
            divGestureListener.setOnSingleTapListener(null);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<DivAction.MenuItem> list2 = ((DivAction) next).f54179e;
            boolean z12 = true;
            if ((list2 == null || list2.isEmpty()) || z10) {
                z12 = false;
            }
            if (z12) {
                obj = next;
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: kg.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DivActionBinder.bindTapActions$lambda$6(expression, bindingContext, this, view, list, view2);
                }
            });
            return;
        }
        List<DivAction.MenuItem> list3 = divAction.f54179e;
        if (list3 != null) {
            final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
            bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: kg.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DivActionBinder.bindTapActions$lambda$5$lambda$4(this.f73111b, bindingContext, view, divAction, expression, overflowMenuWrapperOverflowGravity, view2);
                }
            });
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + divAction.f54177c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$2(Expression expression, BindingContext bindingContext, View view) {
        DivActionBinderKt.clearFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$5$lambda$4(DivActionBinder divActionBinder, BindingContext bindingContext, View view, DivAction divAction, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view2) {
        divActionBinder.logger.logClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, divAction);
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$6(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        handleBulkActions$div_release$default(divActionBinder, bindingContext, view, list, null, 8, null);
    }

    private static final void bindTapActions$setTapListener(DivGestureListener divGestureListener, final View view, final View.OnClickListener onClickListener) {
        if (divGestureListener.getOnDoubleTapListener() != null) {
            divGestureListener.setOnSingleTapListener(new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindTapActions$setTapListener$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onClickListener.onClick(view);
                }
            });
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    private void clearLongClickListener(View view, boolean z10, boolean z11) {
        if (!z10 || z11) {
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
        } else if (DivActionBinderKt.parentIsLongClickable(view)) {
            final l<View, Boolean> lVar = this.passToParentLongClickListener;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: kg.h
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return DivActionBinder.clearLongClickListener$lambda$12(lVar, view2);
                }
            });
            DivActionBinderKt.setPenetratingLongClickable$default(view, null, 1, null);
        } else {
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            DivActionBinderKt.setPenetratingLongClickable(view, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearLongClickListener$lambda$12(l lVar, View view) {
        return ((Boolean) lVar.invoke(view)).booleanValue();
    }

    private p<View, MotionEvent, Boolean> createPressTouchListener(final BindingContext bindingContext, final View view, final List<DivAction> list, final List<DivAction> list2) {
        if ((!list.isEmpty()) || (!list2.isEmpty())) {
            return new p<View, MotionEvent, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder.createPressTouchListener.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Boolean mo2invoke(@NotNull View view2, @NotNull MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    boolean z10 = true;
                    if (action == 0) {
                        DivActionBinder.this.handleBulkActions$div_release(bindingContext, view, list, "press");
                    } else if (action == 1 || action == 3) {
                        DivActionBinder.this.handleBulkActions$div_release(bindingContext, view, list2, "release");
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            };
        }
        return null;
    }

    public static /* synthetic */ boolean handleAction$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler, int i10, Object obj) {
        DivActionHandler actionHandler;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAction");
        }
        String str3 = (i10 & 16) != 0 ? null : str2;
        if ((i10 & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            actionHandler = div2View != null ? div2View.getActionHandler() : null;
        } else {
            actionHandler = divActionHandler;
        }
        return divActionBinder.handleAction$div_release(divViewFacade, expressionResolver, divAction, str, str3, actionHandler);
    }

    public static /* synthetic */ boolean handleActionWithoutEnableCheck$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler, int i10, Object obj) {
        DivActionHandler actionHandler;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActionWithoutEnableCheck");
        }
        String str3 = (i10 & 16) != 0 ? null : str2;
        if ((i10 & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            actionHandler = div2View != null ? div2View.getActionHandler() : null;
        } else {
            actionHandler = divActionHandler;
        }
        return divActionBinder.handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, divAction, str, str3, actionHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleActions$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, List list, String str, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActions");
        }
        if ((i10 & 16) != 0) {
            lVar = null;
        }
        divActionBinder.handleActions$div_release(divViewFacade, expressionResolver, list, str, lVar);
    }

    public static /* synthetic */ void handleBulkActions$div_release$default(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleBulkActions");
        }
        if ((i10 & 8) != 0) {
            str = "click";
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toDivActionReason(java.lang.String r12) {
        /*
            r11 = this;
            int r0 = r12.hashCode()
            java.lang.String r1 = "double_click"
            java.lang.String r2 = "release"
            java.lang.String r3 = "press"
            java.lang.String r4 = "hover"
            java.lang.String r5 = "focus"
            java.lang.String r6 = "enter"
            java.lang.String r7 = "click"
            java.lang.String r8 = "blur"
            java.lang.String r9 = "unhover"
            java.lang.String r10 = "long_click"
            switch(r0) {
                case -338877947: goto L6f;
                case -287575485: goto L66;
                case 3027047: goto L5d;
                case 94750088: goto L54;
                case 96667352: goto L4b;
                case 97604824: goto L42;
                case 99469628: goto L39;
                case 106931267: goto L30;
                case 1090594823: goto L25;
                case 1374143386: goto L1d;
                default: goto L1b;
            }
        L1b:
            goto L78
        L1d:
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L7a
            goto L78
        L25:
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L2d
            goto L78
        L2d:
            r1 = r2
            goto L7a
        L30:
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L37
            goto L78
        L37:
            r1 = r3
            goto L7a
        L39:
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L40
            goto L78
        L40:
            r1 = r4
            goto L7a
        L42:
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L49
            goto L78
        L49:
            r1 = r5
            goto L7a
        L4b:
            boolean r12 = r12.equals(r6)
            if (r12 != 0) goto L52
            goto L78
        L52:
            r1 = r6
            goto L7a
        L54:
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L5b
            goto L78
        L5b:
            r1 = r7
            goto L7a
        L5d:
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L64
            goto L78
        L64:
            r1 = r8
            goto L7a
        L66:
            boolean r12 = r12.equals(r9)
            if (r12 != 0) goto L6d
            goto L78
        L6d:
            r1 = r9
            goto L7a
        L6f:
            boolean r12 = r12.equals(r10)
            if (r12 != 0) goto L76
            goto L78
        L76:
            r1 = r10
            goto L7a
        L78:
            java.lang.String r1 = "external"
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivActionBinder.toDivActionReason(java.lang.String):java.lang.String");
    }

    public void bindDivActions(@NotNull final BindingContext bindingContext, @NotNull final View view, @Nullable final List<DivAction> list, @Nullable final List<DivAction> list2, @Nullable final List<DivAction> list3, @Nullable final List<DivAction> list4, @Nullable final List<DivAction> list5, @Nullable final List<DivAction> list6, @Nullable final List<DivAction> list7, @NotNull final DivAnimation divAnimation, @NotNull final Expression<Boolean> expression) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final sn.a<r> aVar = new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$onApply$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List listOnlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
                List listOnlyEnabled2 = DivActionBinderKt.onlyEnabled(list3, expressionResolver);
                this.applyDivActions(bindingContext, view, listOnlyEnabled, DivActionBinderKt.onlyEnabled(list2, expressionResolver), listOnlyEnabled2, DivActionBinderKt.onlyEnabled(list4, expressionResolver), DivActionBinderKt.onlyEnabled(list5, expressionResolver), DivActionBinderKt.onlyEnabled(list6, expressionResolver), DivActionBinderKt.onlyEnabled(list7, expressionResolver), divAnimation, expression);
            }
        };
        DivActionBinderKt.observe(view, (List<DivAction>) list, expressionResolver, (l<Object, r>) new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                aVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (List<DivAction>) list2, expressionResolver, (l<Object, r>) new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                aVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (List<DivAction>) list3, expressionResolver, (l<Object, r>) new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                aVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (Expression<Boolean>) expression, expressionResolver, (l<Object, r>) new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                aVar.invoke();
            }
        });
        aVar.invoke();
    }

    public boolean handleAction$div_release(@NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver, @NotNull DivAction divAction, @NotNull String str, @Nullable String str2, @Nullable DivActionHandler divActionHandler) {
        if (divAction.f54176b.evaluate(expressionResolver).booleanValue()) {
            return handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, divAction, str, str2, divActionHandler);
        }
        return false;
    }

    @VisibleForTesting
    public boolean handleActionWithoutEnableCheck$div_release(@NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver, @NotNull DivAction divAction, @NotNull String str, @Nullable String str2, @Nullable DivActionHandler divActionHandler) {
        boolean z10 = false;
        if (!this.actionHandler.getUseActionUid() || str2 == null) {
            if (divActionHandler != null && divActionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str)) {
                z10 = true;
            }
            if (z10) {
                return true;
            }
            return this.actionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str);
        }
        if (divActionHandler != null && divActionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str2, str)) {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return this.actionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str2, str);
    }

    public void handleActions$div_release(@NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver, @Nullable List<DivAction> list, @NotNull String str, @Nullable l<? super DivAction, r> lVar) {
        if (list == null) {
            return;
        }
        for (DivAction divAction : DivActionBinderKt.onlyEnabled(list, expressionResolver)) {
            handleActionWithoutEnableCheck$div_release$default(this, divViewFacade, expressionResolver, divAction, str, null, null, 48, null);
            if (lVar != null) {
                lVar.invoke(divAction);
            }
        }
    }

    public void handleBulkActions$div_release(@NotNull BindingContext bindingContext, @NotNull final View view, @NotNull final List<DivAction> list, @NotNull final String str) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divView.bulkActions$div_release(new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$handleBulkActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2() {
                /*
                    Method dump skipped, instruction units count: 360
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivActionBinder$handleBulkActions$1.invoke2():void");
            }
        });
    }

    public void handleTapClick$div_release(@NotNull BindingContext bindingContext, @NotNull View view, @NotNull List<DivAction> list) {
        Object next;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List listOnlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
        Iterator it = listOnlyEnabled.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<DivAction.MenuItem> list2 = ((DivAction) next).f54179e;
            if (!(list2 == null || list2.isEmpty())) {
                break;
            }
        }
        DivAction divAction = (DivAction) next;
        if (divAction == null) {
            handleBulkActions$div_release$default(this, bindingContext, view, listOnlyEnabled, null, 8, null);
            return;
        }
        List<DivAction.MenuItem> list3 = divAction.f54179e;
        if (list3 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to bind empty menu action: " + divAction.f54177c);
                return;
            }
            return;
        }
        OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
        Div2View divView = bindingContext.getDivView();
        divView.clearSubscriptions();
        divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
        this.logger.logClick(bindingContext.getDivView(), expressionResolver, view, divAction);
        this.divActionBeaconSender.sendTapActionBeacon(divAction, expressionResolver);
        overflowMenuWrapperOverflowGravity.getOnMenuClickListener().onClick(view);
    }
}
