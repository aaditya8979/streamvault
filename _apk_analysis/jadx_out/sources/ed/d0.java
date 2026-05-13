package ed;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RxTimer.java */
/* JADX INFO: loaded from: classes12.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bm.b f61054a;

    /* JADX INFO: compiled from: RxTimer.java */
    public class a implements xl.r<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f61055b;

        public a(b bVar) {
            this.f61055b = bVar;
        }

        @Override // xl.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(@NonNull Long l10) {
            b bVar = this.f61055b;
            if (bVar != null) {
                bVar.a(l10.longValue());
            }
        }

        @Override // xl.r
        public void onComplete() {
        }

        @Override // xl.r
        public void onError(@NonNull Throwable th2) {
        }

        @Override // xl.r
        public void onSubscribe(@NonNull bm.b bVar) {
            d0.this.f61054a = bVar;
        }
    }

    /* JADX INFO: compiled from: RxTimer.java */
    public interface b {
        void a(long j10);
    }

    public void b() {
        bm.b bVar = this.f61054a;
        if (bVar == null || bVar.isDisposed()) {
            return;
        }
        this.f61054a.dispose();
    }

    public void c(long j10, b bVar) {
        xl.k.interval(j10, TimeUnit.MILLISECONDS).observeOn(am.a.a()).subscribe(new a(bVar));
    }
}
