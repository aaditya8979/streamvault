package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.U;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.g;

/* JADX INFO: loaded from: classes10.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f26389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f26390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f26392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3580m9 f26393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f26394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L f26395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E6 f26396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p000do.l0 f26397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f26398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kotlinx.coroutines.g f26399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xo f26400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O f26401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f26402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T f26403o;

    public U(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Set set, long j10, N n10, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "adView");
        tn.p.k(set, "friendlyViews");
        tn.p.k(n10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26389a = gestureDetectorOnGestureListenerC3337ci;
        this.f26390b = set;
        this.f26391c = j10;
        this.f26392d = n10;
        this.f26393e = interfaceC3580m9;
        this.f26394f = gestureDetectorOnGestureListenerC3337ci.getContext();
        this.f26397i = A9.f25148d;
        this.f26398j = new AtomicBoolean(false);
        this.f26401m = new O(this);
        this.f26403o = new T(this);
    }

    public static final M a(U u10) {
        Pair pair;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        u10.getClass();
        Rect rect = new Rect();
        if (u10.f26389a.getRootView() == null || u10.f26389a.getVisibility() != 0 || !u10.f26402n || !u10.f26389a.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = u10.f26394f;
        tn.p.j(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(context, "<this>");
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } catch (Exception unused) {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        Rect rect2 = new Rect();
        if (!u10.f26389a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        View rootView = u10.f26389a.getRootView();
        Set set = u10.f26390b;
        if (rootView instanceof ViewGroup) {
            ArrayList arrayList2 = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(rootView);
            boolean z10 = false;
            while (!arrayDeque.isEmpty()) {
                View view = (View) arrayDeque.pop();
                if (view.getVisibility() == 0) {
                    if (tn.p.f(view, u10.f26389a)) {
                        z10 = true;
                    } else if (!set.contains(view)) {
                        Rect rect3 = new Rect();
                        if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                            Rect rect4 = new Rect();
                            boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                            if (tn.p.f(view, u10.f26389a) || (globalVisibleRect && rect4.intersect(rect))) {
                                C3850x5.f28483a.getClass();
                                boolean z11 = !C3850x5.w() || view.getZ() >= u10.f26389a.getZ();
                                if (z10 && z11) {
                                    arrayList2.add(rect4);
                                }
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) view;
                                    for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                        arrayDeque.push(viewGroup.getChildAt(childCount));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            L l10 = u10.f26395g;
            if (l10 != null && (rectF4 = l10.f25828b) != null) {
                a(rect, arrayList2, rectF4);
            }
            L l11 = u10.f26395g;
            if (l11 != null && (rectF3 = l11.f25828b) != null) {
                a(rect, arrayList2, rectF3);
            }
            L l12 = u10.f26395g;
            if (l12 != null && (rectF2 = l12.f25829c) != null) {
                a(rect, arrayList2, rectF2);
            }
            L l13 = u10.f26395g;
            if (l13 != null && (rectF = l13.f25830d) != null) {
                a(rect, arrayList2, rectF);
            }
            if (arrayList2.size() == 1) {
                arrayList.add(new RectF((Rect) arrayList2.get(0)));
            } else {
                Region region = new Region();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    region.op((Rect) it.next(), Region.Op.UNION);
                }
                RegionIterator regionIterator = new RegionIterator(region);
                Rect rect5 = new Rect();
                while (regionIterator.next(rect5)) {
                    arrayList.add(new RectF(rect5));
                }
            }
        }
        return new M(new RectF(rect2), arrayList, iIntValue, iIntValue2);
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(F3.b(rectF.left), F3.b(rectF.top), F3.b(rectF.right), F3.b(rectF.bottom)));
        }
    }

    public static final bn.r b(U u10) {
        u10.getClass();
        C3850x5.f28483a.getClass();
        if (C3850x5.s()) {
            u10.f26400l = new xo(u10.f26389a, u10.f26403o, u10.f26393e);
        } else {
            InterfaceC3580m9 interfaceC3580m9 = u10.f26393e;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        u10.f26399k = F3.a(u10.f26397i, 0L, u10.f26391c, new S(u10, null));
        return bn.r.f5635a;
    }

    public static final bn.r c(U u10) {
        kotlinx.coroutines.g gVar = u10.f26399k;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        xo xoVar = u10.f26400l;
        if (xoVar != null) {
            xoVar.a();
        }
        u10.f26400l = null;
        u10.f26399k = null;
        E6 e62 = new E6(0.0f, null, null);
        if (!tn.p.f(e62, u10.f26396h)) {
            ((Sh) u10.f26392d).a(e62);
            u10.f26396h = e62;
        }
        return bn.r.f5635a;
    }

    public final void a() {
        if (!this.f26398j.compareAndSet(false, true)) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26393e;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).c("AdExposureTracker", "Exposure tracking is already started");
                return;
            }
            return;
        }
        Object objA = H3.a(new sn.a() { // from class: n9.j4
            @Override // sn.a
            public final Object invoke() {
                return U.b(this.f75442b);
            }
        });
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objA);
        if (thM7537exceptionOrNullimpl != null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26393e;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).b("AdExposureTracker", "Error starting exposure tracking - " + thM7537exceptionOrNullimpl.getMessage());
            }
            this.f26398j.set(false);
            bn.g gVar = P9.f26117a;
            P9.a(new L2(thM7537exceptionOrNullimpl));
        }
        Result.m7533boximpl(objA);
    }

    public final void a(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3580m9 interfaceC3580m9 = this.f26393e;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.f26390b.add(view);
    }

    public final void a(Throwable th2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26393e;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("AdExposureTracker", "Error calculating exposure metrics - " + th2.getMessage());
        }
    }

    public final void b() {
        InterfaceC3580m9 interfaceC3580m9;
        if (!this.f26398j.compareAndSet(true, false)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26393e;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).c("AdExposureTracker", "Exposure tracking is already stopped");
                return;
            }
            return;
        }
        Object objA = H3.a(new sn.a() { // from class: n9.k4
            @Override // sn.a
            public final Object invoke() {
                return U.c(this.f75458b);
            }
        });
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objA);
        if (thM7537exceptionOrNullimpl != null && (interfaceC3580m9 = this.f26393e) != null) {
            ((C3605n9) interfaceC3580m9).b("AdExposureTracker", "Error stopping exposure tracking - " + thM7537exceptionOrNullimpl.getMessage());
        }
        Result.m7533boximpl(objA);
    }

    public final void b(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3580m9 interfaceC3580m9 = this.f26393e;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.f26390b.remove(view);
    }
}
