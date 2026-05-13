package com.inmobi.media;

import android.view.OrientationEventListener;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.ironsource.C3978d4;
import java.util.HashSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final class O8 extends OrientationEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f26072d = {tn.t.f(new MutablePropertyReference1Impl(O8.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdActivity f26073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f26074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N8 f26075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8(InMobiAdActivity inMobiAdActivity) {
        super(inMobiAdActivity);
        tn.p.k(inMobiAdActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26073a = inMobiAdActivity;
        this.f26074b = new HashSet();
        wn.a aVar = wn.a.f86472a;
        this.f26075c = new N8(Ef.a(J5.g()), this);
    }

    public final void a() {
        if (this.f26074b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }

    public final void a(Ff ff2) {
        tn.p.k(ff2, "orientationProperties");
        try {
            if (ff2.f25440a) {
                this.f26073a.setRequestedOrientation(13);
                return;
            }
            String str = ff2.f25441b;
            if (tn.p.f(str, C3978d4.i.C)) {
                this.f26073a.setRequestedOrientation(6);
            } else if (tn.p.f(str, C3978d4.i.D)) {
                this.f26073a.setRequestedOrientation(7);
            } else {
                this.f26073a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i10 = this.f26073a.getResources().getConfiguration().orientation;
        byte bG = J5.g();
        int i11 = 2;
        if (bG == 1 || bG == 2 || (bG != 3 && bG != 4)) {
            i11 = 1;
        }
        if (i10 == i11) {
            this.f26075c.setValue(this, f26072d[0], Ef.a(J5.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        b();
    }
}
