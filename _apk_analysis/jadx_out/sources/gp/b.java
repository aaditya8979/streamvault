package gp;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import fp.m;
import gp.a;

/* JADX INFO: compiled from: BaseCacheStuffer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public abstract void a();

    public boolean b(fp.c cVar, Canvas canvas, float f10, float f11, Paint paint, TextPaint textPaint) {
        g gVar;
        m<?> mVarE = cVar.e();
        if (mVarE == null || (gVar = (g) mVarE.get()) == null) {
            return false;
        }
        return gVar.b(canvas, f10, f11, paint);
    }

    public abstract void c(fp.c cVar, Canvas canvas, float f10, float f11, boolean z10, a.C0773a c0773a);

    public abstract void d(fp.c cVar, TextPaint textPaint, boolean z10);

    public void e(fp.c cVar, boolean z10) {
    }

    public void f(fp.c cVar) {
    }
}
