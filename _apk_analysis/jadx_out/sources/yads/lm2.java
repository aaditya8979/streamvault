package yads;

import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class lm2 implements wn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f92035a;

    public lm2(Object obj) {
        this.f92035a = new WeakReference(obj);
    }

    @Override // wn.d
    public final Object getValue(Object obj, KProperty kProperty) {
        return this.f92035a.get();
    }

    @Override // wn.d
    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        this.f92035a = new WeakReference(obj2);
    }
}
