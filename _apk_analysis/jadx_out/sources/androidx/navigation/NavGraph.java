package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import ao.r;
import bo.d0;
import cn.f0;
import cn.w;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: NavGraph.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010)\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 B2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001BB\u0017\u0012\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000>¢\u0006\u0004\b@\u0010AJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0001J\u0016\u0010\u0011\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ!\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0015\u001a\u00020\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0086\u0002J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0000J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0001J\u0006\u0010 \u001a\u00020\u0007J\b\u0010!\u001a\u00020\u0014H\u0007J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0014J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0017J\b\u0010%\u001a\u00020\u0017H\u0016J\u0013\u0010'\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010(\u001a\u00020\u0014H\u0016R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010)8G¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010\"\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R.\u00100\u001a\u0004\u0018\u00010\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010/\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00109\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00148G@BX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00102R\u0011\u0010=\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b<\u00102¨\u0006C"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "Lbn/r;", "onInflate", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "node", "addDestination", "", "nodes", "addDestinations", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode", "", "route", "", "searchParents", "", "iterator", "other", "addAll", "remove", "clear", "getStartDestination", "startDestId", "setStartDestination", "startDestRoute", "toString", "", "equals", "hashCode", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "I", "startDestIdName", "Ljava/lang/String;", "startDestinationRoute", "getStartDestinationRoute", "()Ljava/lang/String;", "setStartDestinationRoute", "(Ljava/lang/String;)V", "getStartDestinationId", "()I", "setStartDestinationId", "(I)V", "startDestinationId", "getDisplayName", "displayName", "getStartDestDisplayName", "startDestDisplayName", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", VastTagName.COMPANION, "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public class NavGraph extends NavDestination implements Iterable<NavDestination>, un.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;

    @Nullable
    private String startDestIdName;

    @Nullable
    private String startDestinationRoute;

    /* JADX INFO: compiled from: NavGraph.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "()V", "findStartDestination", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavGraph;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final NavDestination findStartDestination(@NotNull NavGraph navGraph) {
            p.k(navGraph, "<this>");
            return (NavDestination) SequencesKt___SequencesKt.J(r.n(navGraph.findNode(navGraph.getStartDestId()), new l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavGraph$Companion$findStartDestination$1
                @Override // sn.l
                @Nullable
                public final NavDestination invoke(@NotNull NavDestination navDestination) {
                    p.k(navDestination, "it");
                    if (!(navDestination instanceof NavGraph)) {
                        return null;
                    }
                    NavGraph navGraph2 = (NavGraph) navDestination;
                    return navGraph2.findNode(navGraph2.getStartDestId());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraph$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraph.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/navigation/NavGraph$iterator$1", "", "Landroidx/navigation/NavDestination;", "", "hasNext", "next", "Lbn/r;", "remove", "", "index", "I", "wentToNext", "Z", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
    public static final class AnonymousClass1 implements Iterator<NavDestination>, un.a {
        private int index = -1;
        private boolean wentToNext;

        public AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index + 1 < NavGraph.this.getNodes().size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @NotNull
        public NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.wentToNext = true;
            SparseArrayCompat<NavDestination> nodes = NavGraph.this.getNodes();
            int i10 = this.index + 1;
            this.index = i10;
            NavDestination navDestinationValueAt = nodes.valueAt(i10);
            p.j(navDestinationValueAt, "nodes.valueAt(++index)");
            return navDestinationValueAt;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.wentToNext) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            SparseArrayCompat<NavDestination> nodes = NavGraph.this.getNodes();
            nodes.valueAt(this.index).setParent(null);
            nodes.removeAt(this.index);
            this.index--;
            this.wentToNext = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(@NotNull Navigator<? extends NavGraph> navigator) {
        super(navigator);
        p.k(navigator, "navGraphNavigator");
        this.nodes = new SparseArrayCompat<>();
    }

    @NotNull
    public static final NavDestination findStartDestination(@NotNull NavGraph navGraph) {
        return INSTANCE.findStartDestination(navGraph);
    }

    private final void setStartDestinationId(int i10) {
        if (i10 != getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute(null);
            }
            this.startDestId = i10;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void setStartDestinationRoute(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (!(!p.f(str, getRoute()))) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (!(!d0.u0(str))) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            iHashCode = NavDestination.INSTANCE.createRoute(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public final void addAll(@NotNull NavGraph navGraph) {
        p.k(navGraph, "other");
        Iterator<NavDestination> it = navGraph.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination(next);
        }
    }

    public final void addDestination(@NotNull NavDestination navDestination) {
        p.k(navDestination, "node");
        int id2 = navDestination.getId();
        if (!((id2 == 0 && navDestination.getRoute() == null) ? false : true)) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (getRoute() != null && !(!p.f(r1, getRoute()))) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same route as graph " + this).toString());
        }
        if (!(id2 != getId())) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same id as graph " + this).toString());
        }
        NavDestination navDestination2 = this.nodes.get(id2);
        if (navDestination2 == navDestination) {
            return;
        }
        if (!(navDestination.getParent() == null)) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (navDestination2 != null) {
            navDestination2.setParent(null);
        }
        navDestination.setParent(this);
        this.nodes.put(navDestination.getId(), navDestination);
    }

    public final void addDestinations(@NotNull Collection<? extends NavDestination> collection) {
        p.k(collection, "nodes");
        for (NavDestination navDestination : collection) {
            if (navDestination != null) {
                addDestination(navDestination);
            }
        }
    }

    public final void addDestinations(@NotNull NavDestination... nodes) {
        p.k(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            addDestination(navDestination);
        }
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof NavGraph)) {
            return false;
        }
        List listV = SequencesKt___SequencesKt.V(r.g(SparseArrayKt.valueIterator(this.nodes)));
        NavGraph navGraph = (NavGraph) other;
        Iterator itValueIterator = SparseArrayKt.valueIterator(navGraph.nodes);
        while (itValueIterator.hasNext()) {
            listV.remove((NavDestination) itValueIterator.next());
        }
        return super.equals(other) && this.nodes.size() == navGraph.nodes.size() && getStartDestId() == navGraph.getStartDestId() && listV.isEmpty();
    }

    @Nullable
    public final NavDestination findNode(@IdRes int resId) {
        return findNode(resId, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNode(@IdRes int resId, boolean searchParents) {
        NavDestination navDestination = this.nodes.get(resId);
        if (navDestination != null) {
            return navDestination;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        p.h(parent);
        return parent.findNode(resId);
    }

    @Nullable
    public final NavDestination findNode(@Nullable String route) {
        if (route == null || d0.u0(route)) {
            return null;
        }
        return findNode(route, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNode(@NotNull String route, boolean searchParents) {
        p.k(route, "route");
        NavDestination navDestination = this.nodes.get(NavDestination.INSTANCE.createRoute(route).hashCode());
        if (navDestination != null) {
            return navDestination;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        p.h(parent);
        return parent.findNode(route);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getDisplayName() {
        return getId() != 0 ? super.getDisplayName() : "the root navigation";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.nodes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final String getStartDestDisplayName() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        p.h(str);
        return str;
    }

    @IdRes
    public final int getStartDestination() {
        return getStartDestId();
    }

    @IdRes
    /* JADX INFO: renamed from: getStartDestinationId, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    @Nullable
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestId = getStartDestId();
        SparseArrayCompat<NavDestination> sparseArrayCompat = this.nodes;
        int size = sparseArrayCompat.size();
        for (int i10 = 0; i10 < size; i10++) {
            startDestId = (((startDestId * 31) + sparseArrayCompat.keyAt(i10)) * 31) + sparseArrayCompat.valueAt(i10).hashCode();
        }
        return startDestId;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<NavDestination> iterator() {
        return new AnonymousClass1();
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public NavDestination.DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        p.k(navDeepLinkRequest, "navDeepLinkRequest");
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = super.matchDeepLink(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink2 = it.next().matchDeepLink(navDeepLinkRequest);
            if (deepLinkMatchMatchDeepLink2 != null) {
                arrayList.add(deepLinkMatchMatchDeepLink2);
            }
        }
        return (NavDestination.DeepLinkMatch) f0.H0(w.r(deepLinkMatchMatchDeepLink, (NavDestination.DeepLinkMatch) f0.H0(arrayList)));
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(attributeSet, "attrs");
        super.onInflate(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavGraphNavigator);
        p.j(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        setStartDestinationId(typedArrayObtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.startDestIdName = NavDestination.INSTANCE.getDisplayName(context, this.startDestId);
        bn.r rVar = bn.r.f5635a;
        typedArrayObtainAttributes.recycle();
    }

    public final void remove(@NotNull NavDestination navDestination) {
        p.k(navDestination, "node");
        int iIndexOfKey = this.nodes.indexOfKey(navDestination.getId());
        if (iIndexOfKey >= 0) {
            this.nodes.valueAt(iIndexOfKey).setParent(null);
            this.nodes.removeAt(iIndexOfKey);
        }
    }

    public final void setStartDestination(int i10) {
        setStartDestinationId(i10);
    }

    public final void setStartDestination(@NotNull String str) {
        p.k(str, "startDestRoute");
        setStartDestinationRoute(str);
    }

    @Override // androidx.navigation.NavDestination
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        NavDestination navDestinationFindNode = findNode(this.startDestinationRoute);
        if (navDestinationFindNode == null) {
            navDestinationFindNode = findNode(getStartDestId());
        }
        sb2.append(" startDestination=");
        if (navDestinationFindNode == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb2.append(h.f52301d);
            sb2.append(navDestinationFindNode.toString());
            sb2.append(h.f52302e);
        }
        String string = sb2.toString();
        p.j(string, "sb.toString()");
        return string;
    }
}
