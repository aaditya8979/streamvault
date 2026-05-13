package ed;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: SoftKeyboardStateWatcher.java */
/* JADX INFO: loaded from: classes11.dex */
public class f0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f61060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f61061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f61062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f61063e;

    /* JADX INFO: compiled from: SoftKeyboardStateWatcher.java */
    public interface a {
        void onSoftKeyboardClosed();

        void onSoftKeyboardOpened(int i10);
    }

    public f0(View view) {
        this(view, false);
    }

    public f0(View view, boolean z10) {
        this.f61060b = new LinkedList();
        this.f61061c = view;
        this.f61063e = z10;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void a(a aVar) {
        this.f61060b.add(aVar);
    }

    public final void b() {
        for (a aVar : this.f61060b) {
            if (aVar != null) {
                aVar.onSoftKeyboardClosed();
            }
        }
    }

    public final void c(int i10) {
        this.f61062d = i10;
        for (a aVar : this.f61060b) {
            if (aVar != null) {
                aVar.onSoftKeyboardOpened(i10);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Rect rect = new Rect();
        this.f61061c.getWindowVisibleDisplayFrame(rect);
        int height = this.f61061c.getRootView().getHeight() - (rect.bottom - rect.top);
        if (!this.f61063e && height > this.f61061c.getRootView().getHeight() / 5) {
            this.f61063e = true;
            c(height);
        } else {
            if (!this.f61063e || height >= this.f61061c.getRootView().getHeight() / 5) {
                return;
            }
            this.f61063e = false;
            b();
        }
    }
}
