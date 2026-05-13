package io.bidmachine.rendering.internal.animation;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AnimationDirectionType;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationParams;
import io.bidmachine.rendering.model.AnimationStyleType;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.SideType;
import kotlin.NoWhenBranchMatchedException;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdElementParams f70184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f70185b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f70187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f70188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f70189d;

        static {
            int[] iArr = new int[AnimationEventType.values().length];
            try {
                iArr[AnimationEventType.Appear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationEventType.Disappear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70186a = iArr;
            int[] iArr2 = new int[AnimationStyleType.values().length];
            try {
                iArr2[AnimationStyleType.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AnimationStyleType.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f70187b = iArr2;
            int[] iArr3 = new int[SideType.values().length];
            try {
                iArr3[SideType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[SideType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SideType.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SideType.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f70188c = iArr3;
            int[] iArr4 = new int[AnimationDirectionType.values().length];
            try {
                iArr4[AnimationDirectionType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[AnimationDirectionType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[AnimationDirectionType.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[AnimationDirectionType.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f70189d = iArr4;
        }
    }

    public j(AdElementParams adElementParams, boolean z10) {
        p.k(adElementParams, "params");
        this.f70184a = adElementParams;
        this.f70185b = z10;
    }

    private final e a(View view) {
        return new e(this.f70185b ? 0.0f : view.getAlpha(), view.getTranslationX(), view.getTranslationY());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final io.bidmachine.rendering.internal.animation.e a(android.view.View r12, io.bidmachine.rendering.model.ElementLayoutParams r13, io.bidmachine.rendering.model.AnimationDirectionType r14) {
        /*
            r11 = this;
            android.content.Context r0 = r12.getContext()
            java.lang.String r1 = "context"
            tn.p.j(r0, r1)
            int r1 = r13.getMarginLeftPx(r0)
            float r1 = (float) r1
            int r2 = r13.getMarginRightPx(r0)
            float r2 = (float) r2
            int r3 = r13.getMarginTopPx(r0)
            float r3 = (float) r3
            int r4 = r13.getMarginBottomPx(r0)
            float r4 = (float) r4
            int r5 = r13.getWidthPx(r0)
            float r5 = (float) r5
            int r0 = r13.getHeightPx(r0)
            float r0 = (float) r0
            int[] r6 = io.bidmachine.rendering.internal.animation.j.a.f70189d
            int r7 = r14.ordinal()
            r7 = r6[r7]
            r8 = 2
            r9 = 1
            r10 = -1
            if (r7 == r9) goto L52
            if (r7 == r8) goto L37
            goto L66
        L37:
            io.bidmachine.rendering.model.SideType r2 = io.bidmachine.rendering.internal.animation.g.a(r13)
            if (r2 != 0) goto L3f
            r2 = r10
            goto L47
        L3f:
            int[] r7 = io.bidmachine.rendering.internal.animation.j.a.f70188c
            int r2 = r2.ordinal()
            r2 = r7[r2]
        L47:
            if (r2 == r9) goto L4e
            if (r2 == r8) goto L4c
            goto L66
        L4c:
            float r5 = r5 - r1
            goto L70
        L4e:
            float r2 = -r5
            float r5 = r2 - r1
            goto L70
        L52:
            io.bidmachine.rendering.model.SideType r1 = io.bidmachine.rendering.internal.animation.g.a(r13)
            if (r1 != 0) goto L5a
            r1 = r10
            goto L62
        L5a:
            int[] r7 = io.bidmachine.rendering.internal.animation.j.a.f70188c
            int r1 = r1.ordinal()
            r1 = r7[r1]
        L62:
            if (r1 == r9) goto L6d
            if (r1 == r8) goto L6b
        L66:
            float r5 = r12.getTranslationX()
            goto L70
        L6b:
            float r5 = r5 - r2
            goto L70
        L6d:
            float r1 = -r5
            float r5 = r1 - r2
        L70:
            int r14 = r14.ordinal()
            r14 = r6[r14]
            r1 = 4
            r2 = 3
            if (r14 == r2) goto L94
            if (r14 == r1) goto L7d
            goto La7
        L7d:
            io.bidmachine.rendering.model.SideType r13 = io.bidmachine.rendering.internal.animation.g.b(r13)
            if (r13 != 0) goto L84
            goto L8c
        L84:
            int[] r14 = io.bidmachine.rendering.internal.animation.j.a.f70188c
            int r13 = r13.ordinal()
            r10 = r14[r13]
        L8c:
            if (r10 == r2) goto L91
            if (r10 == r1) goto L91
            goto La7
        L91:
            float r13 = -r0
            float r13 = r13 - r3
            goto Lae
        L94:
            io.bidmachine.rendering.model.SideType r13 = io.bidmachine.rendering.internal.animation.g.b(r13)
            if (r13 != 0) goto L9b
            goto La3
        L9b:
            int[] r14 = io.bidmachine.rendering.internal.animation.j.a.f70188c
            int r13 = r13.ordinal()
            r10 = r14[r13]
        La3:
            if (r10 == r2) goto Lac
            if (r10 == r1) goto Lac
        La7:
            float r13 = r12.getTranslationY()
            goto Lae
        Lac:
            float r13 = r0 - r4
        Lae:
            io.bidmachine.rendering.internal.animation.e r14 = new io.bidmachine.rendering.internal.animation.e
            float r12 = r12.getAlpha()
            r14.<init>(r12, r5, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.rendering.internal.animation.j.a(android.view.View, io.bidmachine.rendering.model.ElementLayoutParams, io.bidmachine.rendering.model.AnimationDirectionType):io.bidmachine.rendering.internal.animation.e");
    }

    private final e a(View view, ElementLayoutParams elementLayoutParams, AnimationStyleType animationStyleType, AnimationDirectionType animationDirectionType) {
        e eVarA;
        int i10 = animationStyleType == null ? -1 : a.f70187b[animationStyleType.ordinal()];
        return i10 != 1 ? (i10 != 2 || animationDirectionType == null || (eVarA = a(view, elementLayoutParams, animationDirectionType)) == null) ? a(view) : eVarA : new e(0.0f, view.getTranslationX(), view.getTranslationY());
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e a(View view, AnimationEventType animationEventType) {
        AnimationDirectionType directionOrDefault;
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(animationEventType, "eventType");
        ElementLayoutParams elementLayoutParams = this.f70184a.getElementLayoutParams();
        int i10 = a.f70186a[animationEventType.ordinal()];
        if (i10 == 1) {
            Float f10 = this.f70184a.getAppearanceParams().getIo.bidmachine.iab.vast.tags.VastAttributes.OPACITY java.lang.String();
            float fFloatValue = f10 != null ? f10.floatValue() : 1.0f;
            p.j(view.getContext(), GAMConfig.KEY_CONTEXT);
            return new e(fFloatValue, elementLayoutParams.getTranslationXPx(r4), elementLayoutParams.getTranslationYPx(r4));
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        AnimationParams animationParams = this.f70184a.getAnimationParams().get(animationEventType);
        AnimationDirectionType animationDirectionTypeInverted = null;
        AnimationStyleType style = animationParams != null ? animationParams.getStyle() : null;
        if (animationParams != null && (directionOrDefault = animationParams.getDirectionOrDefault()) != null) {
            animationDirectionTypeInverted = directionOrDefault.inverted();
        }
        return a(view, elementLayoutParams, style, animationDirectionTypeInverted);
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e b(View view, AnimationEventType animationEventType) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(animationEventType, "eventType");
        int i10 = a.f70186a[animationEventType.ordinal()];
        if (i10 == 1) {
            AnimationParams animationParams = this.f70184a.getAnimationParams().get(animationEventType);
            return a(view, this.f70184a.getElementLayoutParams(), animationParams != null ? animationParams.getStyle() : null, animationParams != null ? animationParams.getDirectionOrDefault() : null);
        }
        if (i10 == 2) {
            return a(view);
        }
        throw new NoWhenBranchMatchedException();
    }
}
