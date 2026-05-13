package com.yandex.div.core.view2.errors;

import bn.r;
import cn.w;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: ErrorCollector.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ErrorCollector {

    @NotNull
    private final Set<p<List<? extends Throwable>, List<? extends Throwable>, r>> observers = new LinkedHashSet();

    @NotNull
    private final List<Throwable> runtimeErrors = new ArrayList();

    @NotNull
    private List<? extends Throwable> parsingErrors = w.m();

    @NotNull
    private List<Throwable> warnings = new ArrayList();

    @NotNull
    private List<Throwable> errors = new ArrayList();
    private boolean errorsAreValid = true;

    private void notifyObservers() {
        this.errorsAreValid = false;
        if (this.observers.isEmpty()) {
            return;
        }
        rebuildErrors();
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((p) it.next()).mo2invoke(this.errors, this.warnings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$1(ErrorCollector errorCollector, p pVar) {
        errorCollector.observers.remove(pVar);
    }

    private void rebuildErrors() {
        if (this.errorsAreValid) {
            return;
        }
        this.errors.clear();
        this.errors.addAll(this.parsingErrors);
        this.errors.addAll(this.runtimeErrors);
        this.errorsAreValid = true;
    }

    public void attachParsingErrors(@Nullable DivData divData) {
        List<Exception> listM;
        if (divData == null || (listM = divData.f55087h) == null) {
            listM = w.m();
        }
        this.parsingErrors = listM;
        notifyObservers();
    }

    public void cleanRuntimeWarningsAndErrors() {
        this.warnings.clear();
        this.runtimeErrors.clear();
        notifyObservers();
    }

    @NotNull
    public Iterator<Throwable> getWarnings() {
        return this.warnings.listIterator();
    }

    public void logError(@NotNull Throwable th2) {
        this.runtimeErrors.add(th2);
        notifyObservers();
    }

    public void logWarning(@NotNull Throwable th2) {
        this.warnings.add(th2);
        notifyObservers();
    }

    @NotNull
    public Disposable observeAndGet(@NotNull final p<? super List<? extends Throwable>, ? super List<? extends Throwable>, r> pVar) {
        this.observers.add(pVar);
        rebuildErrors();
        pVar.mo2invoke(this.errors, this.warnings);
        return new Disposable() { // from class: mg.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorCollector.observeAndGet$lambda$1(this.f74243b, pVar);
            }
        };
    }
}
