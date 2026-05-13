package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import com.inmobi.media.AbstractC3763ti;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3763ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f28193a = kotlin.b.b(new sn.a() { // from class: n9.ga
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3763ti.a();
        }
    });

    public static final vo a() {
        return new vo(0, 0, 0, 0);
    }

    public static final vo a(WindowInsets windowInsets) {
        tn.p.k(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (vo) f28193a.getValue());
    }

    public static final vo a(vo voVar, vo voVar2, vo voVar3, vo voVar4) {
        tn.p.k(voVar, "area");
        tn.p.k(voVar2, "display");
        tn.p.k(voVar3, "roundedCorner");
        tn.p.k(voVar4, "navigationBar");
        return new vo(fn.c.h(voVar.f28393a, voVar2.f28393a, voVar3.f28393a, voVar4.f28393a), fn.c.h(voVar.f28394b, voVar2.f28394b, voVar3.f28394b, voVar4.f28394b), fn.c.h(voVar.f28395c, voVar2.f28395c, voVar3.f28395c, voVar4.f28395c), fn.c.h(voVar.f28396d, voVar2.f28396d, voVar3.f28396d, voVar4.f28396d));
    }

    public static final JSONObject a(String str, int i10) throws JSONException {
        JSONObject jSONObjectA = Si.a(str, "targetViewId", "id", str);
        jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        return jSONObjectA;
    }

    public static final vo b(WindowInsets windowInsets) {
        tn.p.k(windowInsets, "<this>");
        vo voVarE = e(windowInsets);
        vo voVarC = c(windowInsets);
        vo voVarD = d(windowInsets);
        tn.p.k(windowInsets, "<this>");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.navigationBars());
        tn.p.j(insets, "getInsets(...)");
        return a(voVarE, voVarC, voVarD, new vo(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final vo c(WindowInsets windowInsets) {
        tn.p.k(windowInsets, "<this>");
        C3850x5.f28483a.getClass();
        if (C3850x5.r()) {
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout());
            tn.p.j(insets, "getInsets(...)");
            return new vo(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!C3850x5.p()) {
            return (vo) f28193a.getValue();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new vo(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final vo d(WindowInsets windowInsets) {
        int iSin;
        int iSin2;
        int iSin3;
        tn.p.k(windowInsets, "<this>");
        C3850x5.f28483a.getClass();
        if (!C3850x5.s()) {
            return (vo) f28193a.getValue();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int iSin4 = 0;
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            iSin = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner.getRadius()));
        } else {
            iSin = 0;
        }
        if (roundedCorner2 != null) {
            iSin2 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner2.getRadius()));
        } else {
            iSin2 = 0;
        }
        if (roundedCorner3 != null) {
            iSin3 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner3.getRadius()));
        } else {
            iSin3 = 0;
        }
        if (roundedCorner4 != null) {
            iSin4 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner4.getRadius()));
        }
        return new vo(Math.max(iSin, iSin2), Math.max(iSin2, iSin3), Math.max(iSin4, iSin3), Math.max(iSin, iSin4));
    }

    public static final vo e(WindowInsets windowInsets) {
        tn.p.k(windowInsets, "<this>");
        C3850x5.f28483a.getClass();
        if (!C3850x5.r()) {
            return C3850x5.q() ? new vo(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (vo) f28193a.getValue();
        }
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemGestures());
        tn.p.j(insets, "getInsets(...)");
        return new vo(insets.left, insets.top, insets.right, insets.bottom);
    }
}
