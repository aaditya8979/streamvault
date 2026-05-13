package com.moloco.sdk.acm.db;

import androidx.room.TypeConverter;
import bo.d0;
import cn.f0;
import cn.w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    @TypeConverter
    @NotNull
    public final c a(@NotNull String str) {
        p.k(str, "eventType");
        return c.valueOf(str);
    }

    @TypeConverter
    @NotNull
    public final String b(@NotNull c cVar) {
        p.k(cVar, "eventType");
        return cVar.name();
    }

    @TypeConverter
    @NotNull
    public final String c(@NotNull List<String> list) {
        p.k(list, "tags");
        return f0.D0(list, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    @TypeConverter
    @NotNull
    public final List<String> d(@NotNull String str) {
        p.k(str, "tagsString");
        return str.length() == 0 ? w.m() : d0.U0(str, new String[]{StringUtils.COMMA}, false, 0, 6, null);
    }
}
