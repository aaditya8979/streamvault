package io.bidmachine.iab.mraid;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import io.bidmachine.iab.utils.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class ViewOnScreenObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewOnScreenObserverRequest f69332a;

    public static class ViewOnScreenObserverRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View[] f69333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f69334b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f69335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f69336d;

        public class a implements Runnable {

            /* JADX INFO: renamed from: io.bidmachine.iab.mraid.ViewOnScreenObserver$ViewOnScreenObserverRequest$a$a, reason: collision with other inner class name */
            public class ViewTreeObserverOnPreDrawListenerC0802a implements ViewTreeObserver.OnPreDrawListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f69338a;

                public ViewTreeObserverOnPreDrawListenerC0802a(View view) {
                    this.f69338a = view;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    this.f69338a.getViewTreeObserver().removeOnPreDrawListener(this);
                    ViewOnScreenObserverRequest.this.b();
                    return true;
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                for (View view : ViewOnScreenObserverRequest.this.f69333a) {
                    if (view.getHeight() > 0 || view.getWidth() > 0) {
                        ViewOnScreenObserverRequest.this.b();
                    } else {
                        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0802a(view));
                    }
                }
            }
        }

        public ViewOnScreenObserverRequest(@NonNull View[] viewArr) {
            this.f69333a = viewArr;
        }

        public void a() {
            Utils.cancelOnUiThread(this.f69334b);
            this.f69335c = null;
        }

        public void b() {
            Runnable runnable;
            int i10 = this.f69336d - 1;
            this.f69336d = i10;
            if (i10 != 0 || (runnable = this.f69335c) == null) {
                return;
            }
            runnable.run();
            this.f69335c = null;
        }

        public void start(@NonNull Runnable runnable) {
            this.f69335c = runnable;
            this.f69336d = this.f69333a.length;
            Utils.postOnUiThread(this.f69334b);
        }
    }

    public void cancelLastRequest() {
        ViewOnScreenObserverRequest viewOnScreenObserverRequest = this.f69332a;
        if (viewOnScreenObserverRequest != null) {
            viewOnScreenObserverRequest.a();
            this.f69332a = null;
        }
    }

    @NonNull
    public ViewOnScreenObserverRequest wait(@NonNull View... viewArr) {
        cancelLastRequest();
        ViewOnScreenObserverRequest viewOnScreenObserverRequest = new ViewOnScreenObserverRequest(viewArr);
        this.f69332a = viewOnScreenObserverRequest;
        return viewOnScreenObserverRequest;
    }
}
