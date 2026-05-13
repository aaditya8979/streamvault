package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4802g7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4725d7 f66811a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4802g7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C4802g7(@NotNull C4725d7 c4725d7) {
        this.f66811a = c4725d7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4802g7(C4725d7 c4725d7, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new C4725d7(null, 1, 0 == true ? 1 : 0) : c4725d7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C4776f7 c4776f7) {
        ContentValues contentValues = new ContentValues();
        Long l10 = c4776f7.f66730a;
        if (l10 != null) {
            contentValues.put("session_id", Long.valueOf(l10.longValue()));
        }
        Wk wk2 = c4776f7.f66731b;
        if (wk2 != null) {
            contentValues.put("session_type", Integer.valueOf(wk2.f66139a));
        }
        Long l11 = c4776f7.f66732c;
        if (l11 != null) {
            contentValues.put("number_in_session", Long.valueOf(l11.longValue()));
        }
        EnumC4703cb enumC4703cb = c4776f7.f66733d;
        if (enumC4703cb != null) {
            contentValues.put("type", Integer.valueOf(enumC4703cb.f66524a));
        }
        Long l12 = c4776f7.f66734e;
        if (l12 != null) {
            contentValues.put("global_number", Long.valueOf(l12.longValue()));
        }
        Long l13 = c4776f7.f66735f;
        if (l13 != null) {
            contentValues.put("time", Long.valueOf(l13.longValue()));
        }
        C4725d7 c4725d7 = this.f66811a;
        contentValues.put("event_description", MessageNano.toByteArray(c4725d7.f66588a.fromModel(c4776f7.f66736g)));
        return contentValues;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4776f7 toModel(@NotNull ContentValues contentValues) {
        Wk wk2;
        int iIntValue;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            Integer numValueOf = Integer.valueOf(asInteger.intValue());
            wk2 = Wk.FOREGROUND;
            if (numValueOf != null && (iIntValue = numValueOf.intValue()) != 0 && iIntValue == 1) {
                wk2 = Wk.BACKGROUND;
            }
        } else {
            wk2 = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C4776f7(asLong, wk2, asLong2, asInteger2 != null ? EnumC4703cb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f66811a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
