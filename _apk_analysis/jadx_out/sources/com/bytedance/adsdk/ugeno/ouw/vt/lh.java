package com.bytedance.adsdk.ugeno.ouw.vt;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ouw.fkw;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lh extends ouw {
    public lh(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, TreeMap<Float, String> treeMap) {
        super(context, lhVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw() {
        if (this.yu == fkw.BACKGROUND_COLOR) {
            this.fkw.add(Keyframe.ofInt(0.0f, this.f11771ra.pd()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw(float f10, String str) {
        this.fkw.add(this.yu == fkw.BACKGROUND_COLOR ? Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.ra.ouw.ouw(str, ViewCompat.MEASURED_STATE_MASK)) : Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.ra.lh.ouw(str, 0)));
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final TypeEvaluator yu() {
        return this.yu == fkw.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }
}
