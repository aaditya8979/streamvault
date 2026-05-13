package io.bidmachine.rendering.internal.animation;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.internal.animation.h;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationFunctionType;
import io.bidmachine.rendering.model.AnimationParams;
import java.util.Map;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f70112a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70113a;

        static {
            int[] iArr = new int[AnimationFunctionType.values().length];
            try {
                iArr[AnimationFunctionType.EaseIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationFunctionType.EaseOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationFunctionType.EaseInOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70113a = iArr;
        }
    }

    public h(Map map) {
        p.k(map, "params");
        this.f70112a = map;
    }

    private final TimeInterpolator a(AnimationFunctionType animationFunctionType) {
        int i10 = animationFunctionType == null ? -1 : a.f70113a[animationFunctionType.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? new LinearInterpolator() : new AccelerateDecelerateInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    public final ViewPropertyAnimator a(View view, AnimationEventType animationEventType, e eVar) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(animationEventType, "eventType");
        p.k(eVar, "targetValues");
        AnimationParams animationParams = (AnimationParams) this.f70112a.get(animationEventType);
        if (animationParams == null) {
            return null;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = view.animate().alpha(eVar.a()).translationX(eVar.b()).translationY(eVar.c()).setDuration(animationParams.getDuration()).withStartAction(new Runnable() { // from class: kk.c
            @Override // java.lang.Runnable
            public final void run() {
                h.a();
            }
        });
        viewPropertyAnimatorWithStartAction.setInterpolator(a(animationParams.getFunction()));
        return viewPropertyAnimatorWithStartAction;
    }
}
