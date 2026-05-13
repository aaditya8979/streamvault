package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5155u7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5080r7 f67773a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5155u7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C5155u7(@NotNull C5080r7 c5080r7) {
        this.f67773a = c5080r7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C5155u7(C5080r7 c5080r7, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new C5080r7(null, 1, 0 == true ? 1 : 0) : c5080r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C5130t7 c5130t7) {
        ContentValues contentValues = new ContentValues();
        Long l10 = c5130t7.f67718a;
        if (l10 != null) {
            contentValues.put("id", Long.valueOf(l10.longValue()));
        }
        Wk wk2 = c5130t7.f67719b;
        if (wk2 != null) {
            contentValues.put("type", Integer.valueOf(wk2.f66139a));
        }
        String str = c5130t7.f67720c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C5080r7 c5080r7 = this.f67773a;
        contentValues.put("session_description", MessageNano.toByteArray(c5080r7.f67607a.fromModel(c5130t7.f67721d)));
        return contentValues;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5130t7 toModel(@NotNull ContentValues contentValues) {
        Wk wk2;
        int iIntValue;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            Integer numValueOf = Integer.valueOf(asInteger.intValue());
            wk2 = Wk.FOREGROUND;
            if (numValueOf != null && (iIntValue = numValueOf.intValue()) != 0 && iIntValue == 1) {
                wk2 = Wk.BACKGROUND;
            }
        } else {
            wk2 = null;
        }
        return new C5130t7(asLong, wk2, contentValues.getAsString("report_request_parameters"), this.f67773a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
