package io.bidmachine.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets$Type;
import androidx.annotation.RequiresApi;
import bn.r;
import com.ironsource.C4089j8;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.util.ViewUtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ViewUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J#\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0007J$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0007J$\u0010 \u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J1\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010!*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0007¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J$\u0010)\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0'H\u0007J\b\u0010*\u001a\u00020\u001eH\u0007¨\u0006-"}, d2 = {"Lio/bidmachine/util/ViewUtils;", "", "", "generateViewId", "Landroid/view/View;", "child", "Landroid/view/ViewGroup;", "parent", "", "belongTo", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lbn/r;", "showViewSafely", "hideViewSafely", "color", "setBackgroundColorSafely", "(Landroid/view/View;Ljava/lang/Integer;)V", "removeFromParent", "(Landroid/view/View;)Lbn/r;", C4089j8.f32057n, "visibility", "", "visibilityToString", "Landroid/graphics/Rect;", "getLocationInWindow", "isViewTransparent", "setInsetsChanger", "typeInsets", "container", "addViewSafely", "Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "addSingleViewSafely", "T", "Ljava/lang/Class;", "viewClass", "findViewByClassName", "(Landroid/view/ViewGroup;Ljava/lang/Class;)Landroid/view/View;", "findContentOrRootView", "Lkotlin/Function1;", "action", "doOnLayout", "createMatchParentParams", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class ViewUtils {

    @NotNull
    public static final ViewUtils INSTANCE = new ViewUtils();

    private ViewUtils() {
    }

    public static final void addSingleViewSafely(@NotNull ViewGroup viewGroup, @NotNull View view) {
        p.k(viewGroup, "container");
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        addSingleViewSafely(viewGroup, view, null);
    }

    public static final void addSingleViewSafely(@NotNull ViewGroup viewGroup, @NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        p.k(viewGroup, "container");
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ViewUtilsKt.addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static /* synthetic */ void addSingleViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static final void addViewSafely(@NotNull ViewGroup viewGroup, @NotNull View view) {
        p.k(viewGroup, "container");
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        addViewSafely(viewGroup, view, null);
    }

    public static final void addViewSafely(@NotNull ViewGroup viewGroup, @NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        p.k(viewGroup, "container");
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ViewUtilsKt.addViewSafely(viewGroup, view, layoutParams);
    }

    public static /* synthetic */ void addViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        addViewSafely(viewGroup, view, layoutParams);
    }

    public static final boolean belongTo(@NotNull View child, @NotNull ViewGroup parent) {
        p.k(child, "child");
        p.k(parent, "parent");
        return ViewUtilsKt.belongTo(child, parent);
    }

    @NotNull
    public static final ViewGroup.LayoutParams createMatchParentParams() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final void doOnLayout(@NotNull View view, @NotNull l<? super View, r> lVar) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(lVar, "action");
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewUtilsKt.AnonymousClass1(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    @Nullable
    public static final View findContentOrRootView(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.findContentOrRootView(view);
    }

    @Nullable
    public static final <T extends View> T findViewByClassName(@NotNull ViewGroup parent, @NotNull Class<T> viewClass) {
        p.k(parent, "parent");
        p.k(viewClass, "viewClass");
        return (T) ViewUtilsKt.findViewByClassName(parent, viewClass);
    }

    public static final int generateViewId() {
        return View.generateViewId();
    }

    @NotNull
    public static final Rect getLocationInWindow(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.getLocationInWindow(view);
    }

    public static final void hideViewSafely(@Nullable View view) {
        ViewUtilsKt.hideViewSafely(view);
    }

    public static final boolean isViewTransparent(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.isViewTransparent(view);
    }

    public static final boolean isViewVisible(int visibility) {
        return visibility == 0;
    }

    public static final boolean isViewVisible(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.isViewVisible(view);
    }

    @Nullable
    public static final r removeFromParent(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.removeFromParent(view);
    }

    public static final void setBackgroundColorSafely(@Nullable View view, @Nullable Integer color) {
        ViewUtilsKt.setBackgroundColorSafely(view, color);
    }

    @RequiresApi(api = 30)
    public static final void setInsetsChanger(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        setInsetsChanger(view, WindowInsets$Type.systemBars() | WindowInsets$Type.displayCutout());
    }

    @RequiresApi(api = 30)
    public static final void setInsetsChanger(@NotNull View view, int i10) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ViewUtilsKt.setInsetsChanger(view, i10);
    }

    public static /* synthetic */ void setInsetsChanger$default(View view, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = WindowInsets$Type.systemBars() | WindowInsets$Type.displayCutout();
        }
        setInsetsChanger(view, i10);
    }

    public static final void showViewSafely(@Nullable View view) {
        ViewUtilsKt.showViewSafely(view);
    }

    @NotNull
    public static final String visibilityToString(int visibility) {
        return visibility != 0 ? visibility != 4 ? visibility != 8 ? "unknown" : "GONE" : "INVISIBLE" : "VISIBLE";
    }
}
