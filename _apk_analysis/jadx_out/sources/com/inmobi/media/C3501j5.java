package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.inmobi.media.C3501j5;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3501j5 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f27382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3580m9 f27383b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3501j5(Context context, byte b10, InterfaceC3580m9 interfaceC3580m9) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f27382a = b10;
        this.f27383b = interfaceC3580m9;
        int i10 = b10 == 0 ? 15 : (b10 == 2 || b10 == 3 || b10 == 4 || b10 == 5 || b10 == 6) ? 30 : 0;
        try {
            Integer numA = a(b10);
            if (numA == null) {
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).b("CustomView", "null drawable id while creating button - " + ((int) b10));
                    return;
                }
                return;
            }
            a(numA.intValue(), i10, i10, i10, i10);
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).c("CustomView", "new customView - " + ((int) b10) + " created");
            }
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f27383b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("CustomView", "exception while building customView", e10);
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    public static Integer a(byte b10) {
        if (b10 == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b10 == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b10 == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b10 == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b10 == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b10 == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b10 == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b10 == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b10 == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        return null;
    }

    public static final void a(C3501j5 c3501j5, int i10, int i11, int i12, int i13, Drawable drawable) {
        if (drawable != null) {
            c3501j5.setImageDrawable(drawable);
            c3501j5.setPadding(i10, i11, i12, i13);
            return;
        }
        InterfaceC3580m9 interfaceC3580m9 = c3501j5.f27383b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("CustomView", "drawable for " + ((int) c3501j5.f27382a) + " is null");
        }
    }

    public static final void a(C3501j5 c3501j5, Drawable drawable, int i10, int i11, int i12, int i13) {
        c3501j5.setImageDrawable(drawable);
        c3501j5.setPadding(i10, i11, i12, i13);
    }

    public final void a(int i10, final int i11, final int i12, final int i13, final int i14) {
        C3850x5.f28483a.getClass();
        if (C3850x5.w()) {
            Icon.createWithResource(getContext(), i10).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: n9.c8
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    C3501j5.a(this.f75318a, i11, i12, i13, i14, drawable);
                }
            }, ((Wb) AbstractC3627o6.f27756e.getValue()).f26536a);
        } else {
            p000do.i.d(A9.f25148d, null, null, new C3477i5(this, i10, i11, i12, i13, i14, null), 3, null);
        }
    }

    public final void a(final Drawable drawable, final int i10, final int i11, final int i12, final int i13) {
        post(new Runnable() { // from class: n9.d8
            @Override // java.lang.Runnable
            public final void run() {
                C3501j5.a(this.f75333b, drawable, i10, i11, i12, i13);
            }
        });
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
