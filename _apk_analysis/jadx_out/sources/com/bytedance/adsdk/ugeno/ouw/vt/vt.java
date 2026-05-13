package com.bytedance.adsdk.ugeno.ouw.vt;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ouw.fkw;
import com.bytedance.adsdk.ugeno.ra.ra;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public final class vt extends ouw {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ouw.vt.vt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[fkw.values().length];
            ouw = iArr;
            try {
                iArr[fkw.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[fkw.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[fkw.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[fkw.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[fkw.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[fkw.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[fkw.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ouw[fkw.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ouw[fkw.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public vt(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, TreeMap<Float, String> treeMap) {
        super(context, lhVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw() {
        float fCf;
        switch (AnonymousClass1.ouw[this.yu.ordinal()]) {
            case 1:
                fCf = this.f11771ra.cf();
                break;
            case 2:
                fCf = this.f11771ra.ryl();
                break;
            case 3:
                fCf = this.f11771ra.mwh();
                break;
            case 4:
                fCf = this.f11771ra.jg();
                break;
            case 5:
                fCf = this.f11771ra.ko();
                T t10 = this.f11771ra.fkw;
                if (t10 != 0) {
                    t10.setCameraDistance(10000.0f);
                }
                break;
            case 6:
                fCf = this.f11771ra.rn();
                T t11 = this.f11771ra.fkw;
                if (t11 != 0) {
                    t11.setCameraDistance(10000.0f);
                }
                break;
            case 7:
                fCf = this.f11771ra.zih();
                break;
            case 8:
                fCf = this.f11771ra.vm();
                break;
            case 9:
                fCf = this.f11771ra.ux;
                break;
            default:
                fCf = 0.0f;
                break;
        }
        this.fkw.add(Keyframe.ofFloat(0.0f, fCf));
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw(float f10, String str) {
        this.fkw.add(Keyframe.ofFloat(f10, (this.vt.startsWith(fkw.TRANSLATE.f11738ko) || this.yu == fkw.BORDER_RADIUS) ? ra.ouw(this.ouw, com.bytedance.adsdk.ugeno.ra.lh.ouw(str, 0.0f)) : com.bytedance.adsdk.ugeno.ra.lh.ouw(str, 0.0f)));
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final TypeEvaluator yu() {
        return new FloatEvaluator();
    }
}
