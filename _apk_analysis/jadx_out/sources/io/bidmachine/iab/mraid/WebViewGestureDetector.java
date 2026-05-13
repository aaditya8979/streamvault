package io.bidmachine.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewGestureDetector extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f69342a;

    public static class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f69343a = false;

        public boolean a() {
            return this.f69343a;
        }

        public void b() {
            this.f69343a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f69343a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public WebViewGestureDetector(@NonNull Context context) {
        this(context, new a());
    }

    private WebViewGestureDetector(Context context, @NonNull a aVar) {
        super(context, aVar);
        this.f69342a = aVar;
        setIsLongpressEnabled(false);
    }

    public boolean isClicked() {
        return this.f69342a.a();
    }

    public void resetClick() {
        this.f69342a.b();
    }
}
