package io.bidmachine.rendering.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.view.e;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.util.ViewUtilsKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdPhaseParams f70368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f70369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f70370c;

    public d(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdPhaseParams adPhaseParams) {
        z zVarA;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "repository");
        tn.p.k(adPhaseParams, "adPhaseParams");
        this.f70368a = adPhaseParams;
        Background background = adPhaseParams.getBackground();
        if (background != null) {
            Context applicationContext = context.getApplicationContext();
            tn.p.j(applicationContext, "context.applicationContext");
            zVarA = a0.a(background, applicationContext, aVar);
        } else {
            zVarA = null;
        }
        this.f70369b = zVarA;
    }

    public final void a() {
        ViewGroup viewGroup = this.f70370c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ViewUtilsKt.removeFromParent(viewGroup);
        }
        this.f70370c = null;
    }

    public final void a(Context context, ViewGroup viewGroup, io.bidmachine.rendering.internal.view.e eVar, List list, c cVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(viewGroup, "rootContainer");
        tn.p.k(eVar, "elementsContainer");
        tn.p.k(list, "adElements");
        tn.p.k(cVar, "adElement");
        View viewK = cVar.k();
        if (viewK == null) {
            return;
        }
        ElementLayoutParams elementLayoutParams = cVar.h().getElementLayoutParams();
        int widthPx = elementLayoutParams.getWidthPx(context);
        int heightPx = elementLayoutParams.getHeightPx(context);
        if (widthPx <= 0) {
            widthPx = -1;
        }
        if (heightPx <= 0) {
            heightPx = -1;
        }
        e.a aVar = new e.a(widthPx, heightPx);
        aVar.a(context, elementLayoutParams, list);
        eVar.addView(viewK, aVar);
        try {
            cVar.a(viewGroup);
        } catch (Throwable th2) {
            o.b(th2);
        }
    }

    public final boolean a(ViewGroup viewGroup, List list, List list2) {
        tn.p.k(viewGroup, "rootContainer");
        tn.p.k(list, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        tn.p.k(list2, "controls");
        Context context = viewGroup.getContext();
        a();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(UiUtils.generateViewId());
        z zVar = this.f70369b;
        if (zVar != null) {
            z.a(zVar, frameLayout, (Integer) null, (Border) null, 6, (Object) null);
        } else {
            ViewUtilsKt.setBackgroundColorSafely(frameLayout, this.f70368a.getBackgroundColor());
        }
        this.f70370c = frameLayout;
        io.bidmachine.rendering.internal.view.e eVar = new io.bidmachine.rendering.internal.view.e(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            tn.p.j(context, GAMConfig.KEY_CONTEXT);
            a(context, viewGroup, eVar, list, cVar);
        }
        ViewGroup viewGroup2 = this.f70370c;
        if (viewGroup2 != null) {
            viewGroup2.addView(eVar, ViewUtils.createMatchParentParams());
        }
        io.bidmachine.rendering.internal.view.e eVar2 = new io.bidmachine.rendering.internal.view.e(context);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c cVar2 = (c) it2.next();
            tn.p.j(context, GAMConfig.KEY_CONTEXT);
            a(context, viewGroup, eVar2, list2, cVar2);
        }
        ViewGroup viewGroup3 = this.f70370c;
        if (viewGroup3 != null) {
            viewGroup3.addView(eVar2, ViewUtils.createMatchParentParams());
        }
        viewGroup.addView(this.f70370c, 0, ViewUtils.createMatchParentParams());
        return true;
    }

    public final AdPhaseParams b() {
        return this.f70368a;
    }

    public final ViewGroup c() {
        return this.f70370c;
    }
}
