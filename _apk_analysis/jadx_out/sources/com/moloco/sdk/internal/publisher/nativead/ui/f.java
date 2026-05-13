package com.moloco.sdk.internal.publisher.nativead.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
@SuppressLint({"ViewConstructor"})
public final class f extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f46915b = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, @NotNull Uri uri, @NotNull e0 e0Var, @Nullable final sn.a<r> aVar, @NotNull w0 w0Var, @NotNull final s sVar) {
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(uri, "imageUri");
        p.k(e0Var, "watermark");
        p.k(w0Var, "externalLinkHandler");
        p.k(sVar, "buttonTracker");
        ImageView imageView = new ImageView(context);
        imageView.setImageURI(uri);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.b(aVar, view);
            }
        });
        j jVar = new j(w0Var, context, null, 0, 12, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        jVar.setPadding(16, 0, 0, 16);
        jVar.setOnButtonRenderedListener(new l() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.e
            @Override // sn.l
            public final Object invoke(Object obj) {
                return f.a(sVar, (a.AbstractC0696a.c) obj);
            }
        });
        jVar.setLayoutParams(layoutParams);
        e0Var.a(imageView);
        addView(imageView);
        addView(jVar);
    }

    public /* synthetic */ f(Context context, Uri uri, e0 e0Var, sn.a aVar, w0 w0Var, s sVar, int i10, tn.i iVar) {
        this(context, uri, e0Var, aVar, (i10 & 16) != 0 ? b.h.f47664a.f() : w0Var, (i10 & 32) != 0 ? w.a() : sVar);
    }

    public static final r a(s sVar, a.AbstractC0696a.c cVar) {
        p.k(cVar, "button");
        sVar.l(cVar);
        return r.f5635a;
    }

    public static final void b(sn.a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
