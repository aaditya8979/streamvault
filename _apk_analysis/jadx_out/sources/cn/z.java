package cn;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes10.dex */
public class z extends y {
    @NotNull
    public static final <T> Iterator<h0<T>> B(@NotNull Iterator<? extends T> it) {
        tn.p.k(it, "<this>");
        return new j0(it);
    }
}
