package sg.bigo.ads.ad.interstitial.f;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference<InterfaceC0996b> f80917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f80921e;

    public interface a {
        boolean a();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.b$b, reason: collision with other inner class name */
    public interface InterfaceC0996b {
        void a(int i10, int i11, int i12, int i13, int i14);

        boolean a(@NonNull MotionEvent motionEvent, @Nullable a aVar, int i10);

        void a_(int i10);

        void b_(int i10);

        void c(int i10);

        void d(int i10);
    }

    public b(int i10, int i11, int i12, float f10) {
        this.f80918b = i10;
        this.f80919c = i11;
        this.f80920d = i12;
        this.f80921e = f10;
    }

    public static void a(LandingPageStyleConfig landingPageStyleConfig) {
        if (landingPageStyleConfig == null || !landingPageStyleConfig.a() || landingPageStyleConfig.b()) {
            return;
        }
        WeakReference<InterfaceC0996b> weakReference = f80917a;
        InterfaceC0996b interfaceC0996b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0996b != null) {
            interfaceC0996b.a_(landingPageStyleConfig.f83419c);
        }
    }

    public final void a() {
        int i10 = this.f80918b;
        WeakReference<InterfaceC0996b> weakReference = f80917a;
        InterfaceC0996b interfaceC0996b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0996b != null) {
            interfaceC0996b.b_(i10);
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        int i14 = this.f80918b;
        WeakReference<InterfaceC0996b> weakReference = f80917a;
        InterfaceC0996b interfaceC0996b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0996b != null) {
            interfaceC0996b.a(i10, i11, i12, i13, i14);
        }
    }

    public final boolean a(@NonNull MotionEvent motionEvent, a aVar) {
        int i10 = this.f80918b;
        WeakReference<InterfaceC0996b> weakReference = f80917a;
        InterfaceC0996b interfaceC0996b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0996b != null) {
            return interfaceC0996b.a(motionEvent, aVar, i10);
        }
        return false;
    }

    public final void b() {
        int i10 = this.f80918b;
        WeakReference<InterfaceC0996b> weakReference = f80917a;
        InterfaceC0996b interfaceC0996b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0996b != null) {
            interfaceC0996b.c(i10);
        }
    }

    public final void c() {
        int i10 = this.f80918b;
        WeakReference<InterfaceC0996b> weakReference = f80917a;
        InterfaceC0996b interfaceC0996b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0996b != null) {
            interfaceC0996b.d(i10);
        }
    }

    public final int d() {
        return this.f80920d;
    }

    public final float e() {
        return this.f80921e;
    }

    public final boolean f() {
        int i10 = this.f80919c;
        return i10 == 2 || i10 == 4 || i10 == 6;
    }

    public final boolean g() {
        int i10 = this.f80919c;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }
}
