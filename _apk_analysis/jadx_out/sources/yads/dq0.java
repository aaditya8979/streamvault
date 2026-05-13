package yads;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class dq0 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f88958c;

    public dq0(int i10, RectF rectF) {
        this.f88957b = i10;
        this.f88958c = rectF;
    }

    @Override // yads.de1
    public final String a() {
        String str;
        tn.x xVar = tn.x.f85368a;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f88957b);
        RectF rectF = this.f88958c;
        if (rectF != null) {
            str = String.format("{x:%s,y:%s,width:%s,height:%s}", Arrays.copyOf(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4));
            tn.p.j(str, "format(...)");
        } else {
            str = null;
        }
        objArr[1] = str;
        String str2 = String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", Arrays.copyOf(objArr, 2));
        tn.p.j(str2, "format(...)");
        return str2;
    }
}
