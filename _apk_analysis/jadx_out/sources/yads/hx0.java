package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw0 f90585a;

    public /* synthetic */ hx0(Context context) {
        this(new hw0(context.getApplicationContext()));
    }

    public hx0(hw0 hw0Var) {
        this.f90585a = hw0Var;
    }

    public final Typeface a(sw0 sw0Var) {
        ConcurrentHashMap concurrentHashMap = ex0.f89397a;
        Typeface typeface = (Typeface) concurrentHashMap.get(sw0Var);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceA = this.f90585a.a(sw0Var);
        if (typefaceA == null) {
            return null;
        }
        concurrentHashMap.put(sw0Var, typefaceA);
        return typefaceA;
    }
}
