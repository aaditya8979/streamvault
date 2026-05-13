package xl;

import com.ironsource.C3978d4;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: compiled from: Notification.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j<Object> f86984b = new j<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f86985a;

    public j(Object obj) {
        this.f86985a = obj;
    }

    public static <T> j<T> a() {
        return (j<T>) f86984b;
    }

    public static <T> j<T> b(Throwable th2) {
        fm.a.e(th2, "error is null");
        return new j<>(NotificationLite.error(th2));
    }

    public static <T> j<T> c(T t10) {
        fm.a.e(t10, "value is null");
        return new j<>(t10);
    }

    public Throwable d() {
        Object obj = this.f86985a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    public T e() {
        Object obj = this.f86985a;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.f86985a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return fm.a.c(this.f86985a, ((j) obj).f86985a);
        }
        return false;
    }

    public boolean f() {
        return this.f86985a == null;
    }

    public boolean g() {
        return NotificationLite.isError(this.f86985a);
    }

    public boolean h() {
        Object obj = this.f86985a;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f86985a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f86985a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + C3978d4.j.f31385e;
        }
        return "OnNextNotification[" + this.f86985a + C3978d4.j.f31385e;
    }
}
