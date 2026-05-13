package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5052q3 implements InterfaceC5278z5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5278z5, sn.l
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapC = AbstractC4832hb.c(asString);
        if (Gm.a(mapC)) {
            return mapC;
        }
        AbstractC4814gj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
