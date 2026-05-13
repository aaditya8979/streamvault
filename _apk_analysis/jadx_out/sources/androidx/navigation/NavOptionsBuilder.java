package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavOptions;
import bn.r;
import bo.d0;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: NavOptionsBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u00102J&\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J$\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u001a\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0016\u0010.\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0017R*\u0010\b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028F@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b1\u00102\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&¨\u00064"}, d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/PopUpToBuilder;", "Lbn/r;", "popUpToBuilder", "popUpTo", "", "route", "Landroidx/navigation/AnimBuilder;", "animBuilder", "anim", "Landroidx/navigation/NavOptions;", "build$navigation_common_release", "()Landroidx/navigation/NavOptions;", BillingClientBuilderBridgeCommon.buildMethodName, "Landroidx/navigation/NavOptions$Builder;", "builder", "Landroidx/navigation/NavOptions$Builder;", "", "launchSingleTop", "Z", "getLaunchSingleTop", "()Z", "setLaunchSingleTop", "(Z)V", "<set-?>", "restoreState", "getRestoreState", "setRestoreState", "value", "popUpToId", "I", "getPopUpToId", "()I", "setPopUpToId$navigation_common_release", "(I)V", "popUpToRoute", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "setPopUpToRoute", "(Ljava/lang/String;)V", "inclusive", "saveState", "getPopUpTo", "setPopUpTo", "getPopUpTo$annotations", "()V", "<init>", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
@NavOptionsDsl
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;

    @Nullable
    private String popUpToRoute;
    private boolean restoreState;
    private boolean saveState;

    @NotNull
    private final NavOptions.Builder builder = new NavOptions.Builder();

    @IdRes
    private int popUpToId = -1;

    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i10, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new l<PopUpToBuilder, r>() { // from class: androidx.navigation.NavOptionsBuilder.popUpTo.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(PopUpToBuilder popUpToBuilder) {
                    invoke2(popUpToBuilder);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PopUpToBuilder popUpToBuilder) {
                    p.k(popUpToBuilder, "$this$null");
                }
            };
        }
        navOptionsBuilder.popUpTo(i10, (l<? super PopUpToBuilder, r>) lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = new l<PopUpToBuilder, r>() { // from class: androidx.navigation.NavOptionsBuilder.popUpTo.2
                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(PopUpToBuilder popUpToBuilder) {
                    invoke2(popUpToBuilder);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PopUpToBuilder popUpToBuilder) {
                    p.k(popUpToBuilder, "$this$null");
                }
            };
        }
        navOptionsBuilder.popUpTo(str, (l<? super PopUpToBuilder, r>) lVar);
    }

    private final void setPopUpToRoute(String str) {
        if (str != null) {
            if (!(!d0.u0(str))) {
                throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    public final void anim(@NotNull l<? super AnimBuilder, r> lVar) {
        p.k(lVar, "animBuilder");
        AnimBuilder animBuilder = new AnimBuilder();
        lVar.invoke(animBuilder);
        this.builder.setEnterAnim(animBuilder.getEnter()).setExitAnim(animBuilder.getExit()).setPopEnterAnim(animBuilder.getPopEnter()).setPopExitAnim(animBuilder.getPopExit());
    }

    @NotNull
    public final NavOptions build$navigation_common_release() {
        NavOptions.Builder builder = this.builder;
        builder.setLaunchSingleTop(this.launchSingleTop);
        builder.setRestoreState(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            builder.setPopUpTo(str, this.inclusive, this.saveState);
        } else {
            builder.setPopUpTo(this.popUpToId, this.inclusive, this.saveState);
        }
        return builder.build();
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    /* JADX INFO: renamed from: getPopUpTo, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    @Nullable
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void popUpTo(@IdRes int i10, @NotNull l<? super PopUpToBuilder, r> lVar) {
        p.k(lVar, "popUpToBuilder");
        setPopUpToId$navigation_common_release(i10);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        lVar.invoke(popUpToBuilder);
        this.inclusive = popUpToBuilder.getInclusive();
        this.saveState = popUpToBuilder.getSaveState();
    }

    public final void popUpTo(@NotNull String str, @NotNull l<? super PopUpToBuilder, r> lVar) {
        p.k(str, "route");
        p.k(lVar, "popUpToBuilder");
        setPopUpToRoute(str);
        setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        lVar.invoke(popUpToBuilder);
        this.inclusive = popUpToBuilder.getInclusive();
        this.saveState = popUpToBuilder.getSaveState();
    }

    public final void setLaunchSingleTop(boolean z10) {
        this.launchSingleTop = z10;
    }

    public final void setPopUpTo(int i10) {
        popUpTo$default(this, i10, (l) null, 2, (Object) null);
    }

    public final void setPopUpToId$navigation_common_release(int i10) {
        this.popUpToId = i10;
        this.inclusive = false;
    }

    public final void setRestoreState(boolean z10) {
        this.restoreState = z10;
    }
}
