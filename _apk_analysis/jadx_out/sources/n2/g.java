package n2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.ActivityChooserModel;
import bo.a0;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.facebook.internal.x;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CodelessMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0003\u000b\u000f\u0013B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R&\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019RF\u0010\u001f\u001a4\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001bj\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\""}, d2 = {"Ln2/g;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lbn/r;", "e", "h", InneractiveMediationDefs.GENDER_FEMALE, "i", "g", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "uiThreadHandler", "", "b", "Ljava/util/Set;", "activitiesSet", "Ln2/g$c;", "c", "viewMatchers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "d", "Ljava/util/HashSet;", "listenerSet", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "activityToListenerMap", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f75039g = g.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static g f75040h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<Activity> activitiesSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<c> viewMatchers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HashSet<String> listenerSet;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashMap<Integer, HashSet<String>> activityToListenerMap;

    /* JADX INFO: renamed from: n2.g$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Ln2/g$a;", "", "Ln2/g;", "a", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Landroid/os/Bundle;", "b", "", "CURRENT_CLASS_NAME", "Ljava/lang/String;", "PARENT_CLASS_NAME", "kotlin.jvm.PlatformType", "TAG", "codelessMatcher", "Ln2/g;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @NotNull
        public final synchronized g a() {
            g gVarB;
            if (g.b() == null) {
                g.d(new g(null));
            }
            gVarB = g.b();
            if (gVarB == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return gVarB;
        }

        @UiThread
        @NotNull
        public final Bundle b(@Nullable EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
            List<o2.a> listC;
            List<b> listA;
            p.k(rootView, "rootView");
            p.k(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (mapping != null && (listC = mapping.c()) != null) {
                for (o2.a aVar : listC) {
                    if (aVar.getValue() != null) {
                        if (aVar.getValue().length() > 0) {
                            bundle.putString(aVar.getName(), aVar.getValue());
                        }
                    }
                    if (aVar.b().size() > 0) {
                        if (p.f(aVar.getPathType(), "relative")) {
                            c.Companion companion = c.INSTANCE;
                            List<PathComponent> listB = aVar.b();
                            String simpleName = hostView.getClass().getSimpleName();
                            p.j(simpleName, "hostView.javaClass.simpleName");
                            listA = companion.a(mapping, hostView, listB, 0, -1, simpleName);
                        } else {
                            c.Companion companion2 = c.INSTANCE;
                            List<PathComponent> listB2 = aVar.b();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            p.j(simpleName2, "rootView.javaClass.simpleName");
                            listA = companion2.a(mapping, rootView, listB2, 0, -1, simpleName2);
                        }
                        Iterator<b> it = listA.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b next = it.next();
                                if (next.a() != null) {
                                    o2.d dVar = o2.d.f76008a;
                                    String strK = o2.d.k(next.a());
                                    if (strK.length() > 0) {
                                        bundle.putString(aVar.getName(), strK);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Ln2/g$b;", "", "Landroid/view/View;", "a", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "viewMapKey", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final WeakReference<View> view;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String viewMapKey;

        public b(@NotNull View view, @NotNull String str) {
            p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            p.k(str, "viewMapKey");
            this.view = new WeakReference<>(view);
            this.viewMapKey = str;
        }

        @Nullable
        public final View a() {
            WeakReference<View> weakReference = this.view;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getViewMapKey() {
            return this.viewMapKey;
        }
    }

    /* JADX INFO: compiled from: CodelessMatcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0010B9\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e\u0012\u0006\u0010#\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0002J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"¨\u0006&"}, d2 = {"Ln2/g$c;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "Lbn/r;", "run", "onGlobalLayout", "onScrollChanged", "g", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", InneractiveMediationDefs.GENDER_FEMALE, "Ln2/g$b;", "matchedView", "a", "b", "c", "d", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "Ljava/util/List;", "eventBindings", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "e", "Ljava/util/HashSet;", "listenerSet", "Ljava/lang/String;", "activityName", "<init>", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @UiThread
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final WeakReference<View> rootView;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<EventBinding> eventBindings;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Handler handler;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final HashSet<String> listenerSet;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String activityName;

        /* JADX INFO: renamed from: n2.g$c$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: CodelessMatcher.kt */
        @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¨\u0006\u0019"}, d2 = {"Ln2/g$c$a;", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "path", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "index", "", "mapKey", "Ln2/g$b;", "a", "targetView", "pathElement", "", "c", "Landroid/view/ViewGroup;", "viewGroup", "b", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            @NotNull
            public final List<b> a(@Nullable EventBinding mapping, @Nullable View view, @NotNull List<PathComponent> path, int level, int index, @NotNull String mapKey) {
                List<View> listB;
                int size;
                List<View> listB2;
                int size2;
                p.k(path, "path");
                p.k(mapKey, "mapKey");
                String str = mapKey + '.' + index;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (level >= path.size()) {
                    arrayList.add(new b(view, str));
                } else {
                    PathComponent pathComponent = path.get(level);
                    if (p.f(pathComponent.getClassName(), "..")) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size = (listB = b((ViewGroup) parent)).size()) > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                arrayList.addAll(a(mapping, listB.get(i10), path, level + 1, i10, str));
                                if (i11 >= size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        return arrayList;
                    }
                    if (p.f(pathComponent.getClassName(), ".")) {
                        arrayList.add(new b(view, str));
                        return arrayList;
                    }
                    if (!c(view, pathComponent, index)) {
                        return arrayList;
                    }
                    if (level == path.size() - 1) {
                        arrayList.add(new b(view, str));
                    }
                }
                if ((view instanceof ViewGroup) && (size2 = (listB2 = b((ViewGroup) view)).size()) > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        arrayList.addAll(a(mapping, listB2.get(i12), path, level + 1, i12, str));
                        if (i13 >= size2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
                return arrayList;
            }

            public final List<View> b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            p.j(childAt, "child");
                            arrayList.add(childAt);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
            
                if (tn.p.f(r9.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean c(android.view.View r9, com.facebook.appevents.codeless.internal.PathComponent r10, int r11) {
                /*
                    Method dump skipped, instruction units count: 321
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n2.g.c.Companion.c(android.view.View, com.facebook.appevents.codeless.internal.PathComponent, int):boolean");
            }
        }

        public c(@Nullable View view, @NotNull Handler handler, @NotNull HashSet<String> hashSet, @NotNull String str) {
            p.k(handler, "handler");
            p.k(hashSet, "listenerSet");
            p.k(str, "activityName");
            this.rootView = new WeakReference<>(view);
            this.handler = handler;
            this.listenerSet = hashSet;
            this.activityName = str;
            handler.postDelayed(this, 200L);
        }

        public final void a(b bVar, View view, EventBinding eventBinding) {
            if (eventBinding == null) {
                return;
            }
            try {
                View viewA = bVar.a();
                if (viewA == null) {
                    return;
                }
                View viewA2 = o2.d.a(viewA);
                if (viewA2 != null && o2.d.f76008a.p(viewA, viewA2)) {
                    d(bVar, view, eventBinding);
                    return;
                }
                String name = viewA.getClass().getName();
                p.j(name, "view.javaClass.name");
                if (a0.W(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewA instanceof AdapterView)) {
                    b(bVar, view, eventBinding);
                } else if (viewA instanceof ListView) {
                    c(bVar, view, eventBinding);
                }
            } catch (Exception e10) {
                j0 j0Var = j0.f15387a;
                j0.d0(g.c(), e10);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(n2.g.b r4, android.view.View r5, com.facebook.appevents.codeless.internal.EventBinding r6) {
            /*
                r3 = this;
                android.view.View r0 = r4.a()
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.String r4 = r4.getViewMapKey()
                android.view.View$OnClickListener r1 = o2.d.g(r0)
                boolean r2 = r1 instanceof n2.b.a
                if (r2 == 0) goto L27
                if (r1 == 0) goto L1f
                n2.b$a r1 = (n2.b.a) r1
                boolean r1 = r1.getSupportCodelessLogging()
                if (r1 == 0) goto L27
                r1 = 1
                goto L28
            L1f:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener"
                r4.<init>(r5)
                throw r4
            L27:
                r1 = 0
            L28:
                java.util.HashSet<java.lang.String> r2 = r3.listenerSet
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L3e
                if (r1 != 0) goto L3e
                n2.b$a r5 = n2.b.b(r6, r5, r0)
                r0.setOnClickListener(r5)
                java.util.HashSet<java.lang.String> r5 = r3.listenerSet
                r5.add(r4)
            L3e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.g.c.b(n2.g$b, android.view.View, com.facebook.appevents.codeless.internal.EventBinding):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(n2.g.b r4, android.view.View r5, com.facebook.appevents.codeless.internal.EventBinding r6) {
            /*
                r3 = this;
                android.view.View r0 = r4.a()
                android.widget.AdapterView r0 = (android.widget.AdapterView) r0
                if (r0 != 0) goto L9
                return
            L9:
                java.lang.String r4 = r4.getViewMapKey()
                android.widget.AdapterView$OnItemClickListener r1 = r0.getOnItemClickListener()
                boolean r2 = r1 instanceof n2.b.C0893b
                if (r2 == 0) goto L29
                if (r1 == 0) goto L21
                n2.b$b r1 = (n2.b.C0893b) r1
                boolean r1 = r1.getSupportCodelessLogging()
                if (r1 == 0) goto L29
                r1 = 1
                goto L2a
            L21:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener"
                r4.<init>(r5)
                throw r4
            L29:
                r1 = 0
            L2a:
                java.util.HashSet<java.lang.String> r2 = r3.listenerSet
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L40
                if (r1 != 0) goto L40
                n2.b$b r5 = n2.b.c(r6, r5, r0)
                r0.setOnItemClickListener(r5)
                java.util.HashSet<java.lang.String> r5 = r3.listenerSet
                r5.add(r4)
            L40:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.g.c.c(n2.g$b, android.view.View, com.facebook.appevents.codeless.internal.EventBinding):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(n2.g.b r4, android.view.View r5, com.facebook.appevents.codeless.internal.EventBinding r6) {
            /*
                r3 = this;
                android.view.View r0 = r4.a()
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.String r4 = r4.getViewMapKey()
                android.view.View$OnTouchListener r1 = o2.d.h(r0)
                boolean r2 = r1 instanceof n2.h.a
                if (r2 == 0) goto L27
                if (r1 == 0) goto L1f
                n2.h$a r1 = (n2.h.a) r1
                boolean r1 = r1.getSupportCodelessLogging()
                if (r1 == 0) goto L27
                r1 = 1
                goto L28
            L1f:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener"
                r4.<init>(r5)
                throw r4
            L27:
                r1 = 0
            L28:
                java.util.HashSet<java.lang.String> r2 = r3.listenerSet
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L3e
                if (r1 != 0) goto L3e
                n2.h$a r5 = n2.h.a(r6, r5, r0)
                r0.setOnTouchListener(r5)
                java.util.HashSet<java.lang.String> r5 = r3.listenerSet
                r5.add(r4)
            L3e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.g.c.d(n2.g$b, android.view.View, com.facebook.appevents.codeless.internal.EventBinding):void");
        }

        public final void f(EventBinding eventBinding, View view) {
            if (eventBinding == null || view == null) {
                return;
            }
            String activityName = eventBinding.getActivityName();
            if ((activityName == null || activityName.length() == 0) || p.f(eventBinding.getActivityName(), this.activityName)) {
                List<PathComponent> listD = eventBinding.d();
                if (listD.size() > 25) {
                    return;
                }
                Iterator<b> it = INSTANCE.a(eventBinding, view, listD, 0, -1, this.activityName).iterator();
                while (it.hasNext()) {
                    a(it.next(), view, eventBinding);
                }
            }
        }

        public final void g() {
            List<EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null) {
                return;
            }
            int i10 = 0;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                f(list.get(i10), this.rootView.get());
                if (i11 > size) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            g();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (c3.a.d(this)) {
                return;
            }
            try {
                if (c3.a.d(this)) {
                    return;
                }
                try {
                    q qVarF = FetchedAppSettingsManager.f(t.m());
                    if (qVarF != null && qVarF.getCodelessEventsEnabled()) {
                        List<EventBinding> listB = EventBinding.INSTANCE.b(qVarF.getEventBindings());
                        this.eventBindings = listB;
                        if (listB == null || (view = this.rootView.get()) == null) {
                            return;
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        g();
                    }
                } catch (Throwable th2) {
                    c3.a.b(th2, this);
                }
            } catch (Throwable th3) {
                c3.a.b(th3, this);
            }
        }
    }

    public g() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        p.j(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.activitiesSet = setNewSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }

    public /* synthetic */ g(tn.i iVar) {
        this();
    }

    public static final /* synthetic */ g b() {
        if (c3.a.d(g.class)) {
            return null;
        }
        try {
            return f75040h;
        } catch (Throwable th2) {
            c3.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (c3.a.d(g.class)) {
            return null;
        }
        try {
            return f75039g;
        } catch (Throwable th2) {
            c3.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (c3.a.d(g.class)) {
            return;
        }
        try {
            f75040h = gVar;
        } catch (Throwable th2) {
            c3.a.b(th2, g.class);
        }
    }

    public static final void j(g gVar) {
        if (c3.a.d(g.class)) {
            return;
        }
        try {
            p.k(gVar, "this$0");
            gVar.g();
        } catch (Throwable th2) {
            c3.a.b(th2, g.class);
        }
    }

    @UiThread
    public final void e(@NotNull Activity activity) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (x.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.add(activity);
            this.listenerSet.clear();
            HashSet<String> hashSet = this.activityToListenerMap.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.listenerSet = hashSet;
            }
            i();
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    @UiThread
    public final void f(@NotNull Activity activity) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void g() {
        if (c3.a.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.activitiesSet) {
                if (activity != null) {
                    View viewE = s2.g.e(activity);
                    String simpleName = activity.getClass().getSimpleName();
                    Handler handler = this.uiThreadHandler;
                    HashSet<String> hashSet = this.listenerSet;
                    p.j(simpleName, "activityName");
                    this.viewMatchers.add(new c(viewE, handler, hashSet, simpleName));
                }
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    @UiThread
    public final void h(@NotNull Activity activity) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (x.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.remove(activity);
            this.viewMatchers.clear();
            this.activityToListenerMap.put(Integer.valueOf(activity.hashCode()), (HashSet) this.listenerSet.clone());
            this.listenerSet.clear();
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void i() {
        if (c3.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.uiThreadHandler.post(new Runnable() { // from class: n2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.j(this.f75037b);
                    }
                });
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }
}
