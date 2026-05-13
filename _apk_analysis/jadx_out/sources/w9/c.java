package w9;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import java.util.concurrent.Callable;
import xl.k;
import xl.r;

/* JADX INFO: compiled from: ViewLongClickObservable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends k<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f86349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<Boolean> f86350c;

    /* JADX INFO: compiled from: ViewLongClickObservable.java */
    public static final class a extends yl.a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f86351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<? super Object> f86352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Callable<Boolean> f86353d;

        public a(View view, Callable<Boolean> callable, r<? super Object> rVar) {
            this.f86351b = view;
            this.f86352c = rVar;
            this.f86353d = callable;
        }

        @Override // yl.a
        public void onDispose() {
            this.f86351b.setOnLongClickListener(null);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (isDisposed()) {
                return false;
            }
            try {
                if (!this.f86353d.call().booleanValue()) {
                    return false;
                }
                this.f86352c.onNext(Notification.INSTANCE);
                return true;
            } catch (Exception e10) {
                this.f86352c.onError(e10);
                dispose();
                return false;
            }
        }
    }

    public c(View view, Callable<Boolean> callable) {
        this.f86349b = view;
        this.f86350c = callable;
    }

    @Override // xl.k
    public void subscribeActual(r<? super Object> rVar) {
        if (v9.b.a(rVar)) {
            a aVar = new a(this.f86349b, this.f86350c, rVar);
            rVar.onSubscribe(aVar);
            this.f86349b.setOnLongClickListener(aVar);
        }
    }
}
