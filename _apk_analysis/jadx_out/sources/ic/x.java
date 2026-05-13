package ic;

import androidx.databinding.ObservableBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelectModeEvent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public ObservableBoolean f64071b;

    public x(int i10, @NotNull ObservableBoolean observableBoolean) {
        tn.p.k(observableBoolean, "isSelectMode");
        this.f64070a = i10;
        this.f64071b = observableBoolean;
    }

    public final int a() {
        return this.f64070a;
    }

    @NotNull
    public final ObservableBoolean b() {
        return this.f64071b;
    }
}
