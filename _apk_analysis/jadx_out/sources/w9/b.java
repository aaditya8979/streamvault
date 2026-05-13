package w9;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import xl.k;
import xl.r;

/* JADX INFO: compiled from: ViewClickObservable.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends k<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f86346b;

    /* JADX INFO: compiled from: ViewClickObservable.java */
    public static final class a extends yl.a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f86347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<? super Object> f86348c;

        public a(View view, r<? super Object> rVar) {
            this.f86347b = view;
            this.f86348c = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (isDisposed()) {
                return;
            }
            this.f86348c.onNext(Notification.INSTANCE);
        }

        @Override // yl.a
        public void onDispose() {
            this.f86347b.setOnClickListener(null);
        }
    }

    public b(View view) {
        this.f86346b = view;
    }

    @Override // xl.k
    public void subscribeActual(r<? super Object> rVar) {
        if (v9.b.a(rVar)) {
            a aVar = new a(this.f86346b, rVar);
            rVar.onSubscribe(aVar);
            this.f86346b.setOnClickListener(aVar);
        }
    }
}
