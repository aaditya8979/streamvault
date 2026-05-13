package io.bidmachine.rendering.internal.animation;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f70109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f70110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f70111c;

    public e(float f10, float f11, float f12) {
        this.f70109a = f10;
        this.f70110b = f11;
        this.f70111c = f12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(View view) {
        this(view.getAlpha(), view.getTranslationX(), view.getTranslationY());
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    public final float a() {
        return this.f70109a;
    }

    public final float b() {
        return this.f70110b;
    }

    public final float c() {
        return this.f70111c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f70109a, eVar.f70109a) == 0 && Float.compare(this.f70110b, eVar.f70110b) == 0 && Float.compare(this.f70111c, eVar.f70111c) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f70109a) * 31) + Float.hashCode(this.f70110b)) * 31) + Float.hashCode(this.f70111c);
    }

    public String toString() {
        return "AdAnimationValues(alpha=" + this.f70109a + ", translationX=" + this.f70110b + ", translationY=" + this.f70111c + ')';
    }
}
