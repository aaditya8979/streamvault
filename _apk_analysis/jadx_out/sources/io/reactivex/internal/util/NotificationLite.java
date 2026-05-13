package io.reactivex.internal.util;

import bm.b;
import com.ironsource.C3978d4;
import fm.a;
import java.io.Serializable;
import ms.c;
import xl.r;

/* JADX INFO: loaded from: classes6.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        public final b upstream;

        public DisposableNotification(b bVar) {
            this.upstream = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + C3978d4.j.f31385e;
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Throwable f71698e;

        public ErrorNotification(Throwable th2) {
            this.f71698e = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return a.c(this.f71698e, ((ErrorNotification) obj).f71698e);
            }
            return false;
        }

        public int hashCode() {
            return this.f71698e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f71698e + C3978d4.j.f31385e;
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        public final c upstream;

        public SubscriptionNotification(c cVar) {
            this.upstream = cVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + C3978d4.j.f31385e;
        }
    }

    public static <T> boolean accept(Object obj, ms.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            bVar.onError(((ErrorNotification) obj).f71698e);
            return true;
        }
        bVar.onNext(obj);
        return false;
    }

    public static <T> boolean accept(Object obj, r<? super T> rVar) {
        if (obj == COMPLETE) {
            rVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            rVar.onError(((ErrorNotification) obj).f71698e);
            return true;
        }
        rVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, ms.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            bVar.onError(((ErrorNotification) obj).f71698e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            bVar.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        bVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, r<? super T> rVar) {
        if (obj == COMPLETE) {
            rVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            rVar.onError(((ErrorNotification) obj).f71698e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            rVar.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        rVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(b bVar) {
        return new DisposableNotification(bVar);
    }

    public static Object error(Throwable th2) {
        return new ErrorNotification(th2);
    }

    public static b getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f71698e;
    }

    public static c getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t10) {
        return t10;
    }

    public static Object subscription(c cVar) {
        return new SubscriptionNotification(cVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
