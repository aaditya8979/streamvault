package wd;

import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ViewPageHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f86367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f86368b;

    public b(ViewPager viewPager) {
        this.f86367a = viewPager;
        b();
    }

    public a a() {
        return this.f86368b;
    }

    public final void b() {
        this.f86368b = new a(this.f86367a.getContext());
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f86367a, this.f86368b);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
        }
    }
}
