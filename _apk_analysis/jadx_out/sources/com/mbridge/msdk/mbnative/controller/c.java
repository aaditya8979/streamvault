package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ImpressionTracker.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f38704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f38705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f38706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f38707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f38708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38710g;

    /* JADX INFO: compiled from: ImpressionTracker.java */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.b();
            return true;
        }
    }

    /* JADX INFO: compiled from: ImpressionTracker.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImpressionTracker.java */
    public class RunnableC0465c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f38713a;

        public RunnableC0465c(View view) {
            this.f38713a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f38713a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                c.this.f38704a = new WeakReference(viewTreeObserver);
                if (c.this.f38706c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f38706c);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ImpressionTracker.java */
    public interface d {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, d dVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f38705b = arrayList;
        this.f38706c = null;
        this.f38707d = dVar;
        this.f38708e = handler;
        this.f38710g = i10;
        if (list != null) {
            this.f38705b = list;
        } else {
            arrayList.clear();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f38709f) {
            return;
        }
        Handler handler = this.f38708e;
        if (handler != null) {
            if (this.f38710g == 1) {
                d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f38709f = true;
    }

    private boolean b(View view) {
        return !e1.a(view, this.f38710g);
    }

    private void c() {
        try {
            b();
        } catch (Throwable th2) {
            q0.b("ImpressionTracker", th2.getMessage(), th2);
        }
        try {
            this.f38706c = new a();
        } catch (Throwable th3) {
            q0.b("ImpressionTracker", th3.getMessage(), th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f38709f = false;
            List<View> list = this.f38705b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f38705b.size(); i10++) {
                View view = this.f38705b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f38707d;
            if (dVar != null) {
                dVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    public void a() {
        try {
            this.f38709f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f38704a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f38704a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f38706c);
                }
                this.f38704a.clear();
            }
            this.f38707d = null;
            this.f38706c = null;
            List<View> list = this.f38705b;
            if (list != null) {
                list.clear();
            }
            this.f38705b = null;
        } catch (Throwable unused) {
        }
    }

    public void a(View view) {
        View view2;
        View viewA = null;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.f38705b.add(view);
        } else {
            List<View> list = this.f38705b;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f38705b.size() && ((view2 = this.f38705b.get(i10)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i10++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new RunnableC0465c(viewA));
    }
}
