package androidx.navigation;

import androidx.annotation.IdRes;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a8\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000\u001a8\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Landroidx/navigation/NavHost;", "", "id", "startDestination", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Lbn/r;", "builder", "Landroidx/navigation/NavGraph;", "createGraph", "", "route", "navigation-runtime_release"}, k = 2, mv = {1, 6, 0})
public final class NavHostKt {
    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost, @IdRes int i10, @IdRes int i11, @NotNull l<? super NavGraphBuilder, r> lVar) {
        p.k(navHost, "<this>");
        p.k(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().get_navigatorProvider(), i10, i11);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost, @NotNull String str, @Nullable String str2, @NotNull l<? super NavGraphBuilder, r> lVar) {
        p.k(navHost, "<this>");
        p.k(str, "startDestination");
        p.k(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().get_navigatorProvider(), str, str2);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i10, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        p.k(navHost, "<this>");
        p.k(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().get_navigatorProvider(), i10, i11);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, String str, String str2, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        p.k(navHost, "<this>");
        p.k(str, "startDestination");
        p.k(lVar, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().get_navigatorProvider(), str, str2);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
