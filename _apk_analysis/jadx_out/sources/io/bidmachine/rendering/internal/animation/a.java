package io.bidmachine.rendering.internal.animation;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.util.Tag;
import io.bidmachine.util.ViewUtilsKt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f70098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f70099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f70100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f70101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f70102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f70103f;

    public a(Tag tag, h hVar, f fVar) {
        p.k(tag, "tag");
        p.k(hVar, "animatorFactory");
        p.k(fVar, "valuesCalculator");
        this.f70098a = tag;
        this.f70099b = hVar;
        this.f70100c = fVar;
        this.f70102e = new AtomicBoolean(false);
        AnimationEventType animationEventType = AnimationEventType.Appear;
        Boolean bool = Boolean.FALSE;
        this.f70103f = kotlin.collections.a.o(bn.h.a(animationEventType, bool), bn.h.a(AnimationEventType.Disappear, bool));
    }

    private final void a(View view, e eVar) {
        view.setAlpha(eVar.a());
        view.setTranslationX(eVar.b());
        view.setTranslationY(eVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar) {
        p.k(aVar, "this$0");
        aVar.f70102e.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, Runnable runnable) {
        p.k(aVar, "this$0");
        aVar.f70102e.set(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void a() {
        o.b(this.f70098a, "Cancel animation", new Object[0]);
        this.f70102e.set(false);
        ViewPropertyAnimator viewPropertyAnimator = this.f70101d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            viewPropertyAnimator.setListener(null);
            viewPropertyAnimator.setUpdateListener(null);
        }
        this.f70101d = null;
    }

    public final void a(View view, AnimationEventType animationEventType) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(animationEventType, "eventType");
        e eVarB = this.f70100c.b(view, animationEventType);
        a(view, eVarB);
        o.b(this.f70098a, "Prepare animation for event: " + animationEventType + "; initial values: " + eVarB, new Object[0]);
    }

    public final void a(View view, AnimationEventType animationEventType, Runnable runnable, final Runnable runnable2) {
        p.k(animationEventType, "eventType");
        o.b(this.f70098a, "Starting animation for event: " + animationEventType, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
        if (view == null || !ViewUtilsKt.isViewVisible(view) || b()) {
            o.b(this.f70098a, "Animation not started for event: " + animationEventType + "; isAnimating: " + b(), new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        e eVarA = this.f70100c.a(view, animationEventType);
        ViewPropertyAnimator viewPropertyAnimatorA = this.f70099b.a(view, animationEventType, eVarA);
        if (viewPropertyAnimatorA == null) {
            a(view, eVarA);
            o.b(this.f70098a, "Apply values without animation for event: " + animationEventType + "; target values: " + eVarA, new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        o.b(this.f70098a, "Start animation for event: " + animationEventType + "; target values: " + eVarA, new Object[0]);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = viewPropertyAnimatorA.withStartAction(new Runnable() { // from class: kk.a
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.rendering.internal.animation.a.a(this.f73152b);
            }
        }).withEndAction(new Runnable() { // from class: kk.b
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.rendering.internal.animation.a.a(this.f73153b, runnable2);
            }
        });
        viewPropertyAnimatorWithEndAction.start();
        this.f70101d = viewPropertyAnimatorWithEndAction;
        this.f70103f.put(animationEventType, Boolean.TRUE);
    }

    public final boolean b() {
        return this.f70102e.get();
    }
}
