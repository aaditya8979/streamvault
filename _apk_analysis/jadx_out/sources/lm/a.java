package lm;

import a.h;
import dm.o;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;
import xl.b;
import xl.c;
import xl.i;
import xl.r;
import xl.v;

/* JADX INFO: compiled from: ScalarXMapZHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static <T> boolean a(Object obj, o<? super T, ? extends c> oVar, b bVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) obj).call();
            c cVar = hVar != null ? (c) fm.a.e(oVar.apply(hVar), "The mapper returned a null CompletableSource") : null;
            if (cVar == null) {
                EmptyDisposable.complete(bVar);
            } else {
                cVar.b(bVar);
            }
            return true;
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, bVar);
            return true;
        }
    }

    public static <T, R> boolean b(Object obj, o<? super T, ? extends i<? extends R>> oVar, r<? super R> rVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) obj).call();
            i iVar = hVar != null ? (i) fm.a.e(oVar.apply(hVar), "The mapper returned a null MaybeSource") : null;
            if (iVar == null) {
                EmptyDisposable.complete(rVar);
            } else {
                iVar.b(MaybeToObservable.b(rVar));
            }
            return true;
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
            return true;
        }
    }

    public static <T, R> boolean c(Object obj, o<? super T, ? extends v<? extends R>> oVar, r<? super R> rVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) obj).call();
            v vVar = hVar != null ? (v) fm.a.e(oVar.apply(hVar), "The mapper returned a null SingleSource") : null;
            if (vVar == null) {
                EmptyDisposable.complete(rVar);
            } else {
                vVar.c(SingleToObservable.b(rVar));
            }
            return true;
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
            return true;
        }
    }
}
